import java.util.Scanner;

public class Caso109 {

  public static void main(String[] args) {

    Scanner jm = new Scanner(System.in);

    // Caso 109. Cine de Animación: Control de Continuidad y Saturación Lumínica En la post-producción de un cortometraje animado, 
    // se analiza la colorimetría de una secuencia crítica de 1 segundo (grabada a 60 cuadros por segundo). La matriz de [60][24] 
    // registra la intensidad lumínica en 24 zonas específicas de cada fotograma. El programa debe: 1. Detectar "saltos" bruscos 
    // de iluminación entre fotogramas consecutivos que puedan causar fatiga visual o errores de raccord. 2. Calcular el brillo 
    // promedio de la secuencia para asegurar que cumple con los estándares de emisión televisiva. 3. Identificar si alguna zona 
    // de la pantalla (columna) permanece subexpuesta (oscura) durante toda la secuencia, lo que indicaría un error en el 
    // renderizado de las sombras.

    System.err.println("\n===== Inicio del sistema de cine de animacion =====");
     double[][] luz = new double[60][24]; 

        double sumaTotal = 0; 

        for (int i = 0; i < luz.length; i++) { 
            System.out.println("\nFotograma #" + (i + 1));

            for (int j = 0; j < luz[i].length; j++) { 
                System.out.print("Zona " + (j + 1) + " intensidad: ");
                luz[i][j] = jm.nextDouble();

                sumaTotal += luz[i][j]; 
            }
        }

        for (int i = 0; i < luz.length - 1; i++) {
            for (int j = 0; j < luz[i].length; j++) {

                double diferencia = Math.abs(luz[i][j] - luz[i + 1][j]); 
                // valor absoluto de x (quitar el signo negativo), Sirve para medir distancia, no dirección.

                if (diferencia > 40) { // Umbral de salto brusco
                    System.out.println("Salto brusco entre fotograma "
                            + (i + 1) + " y " + (i + 2)
                            + " en zona " + (j + 1));
                }
            }
        }

        double promedio = sumaTotal / (60 * 24);

        System.out.println("\nZonas subexpuestas durante toda la secuencia:");

        for (int j = 0; j < luz[0].length; j++) { 
            boolean siempreOscura = true;

            for (int i = 0; i < luz.length; i++) { 
                if (luz[i][j] > 15) { 
                    siempreOscura = false;
                    break;
                }
            }

            if (siempreOscura) {
                System.out.println("Zona " + (j + 1) + " estuvo oscura todo el tiempo.");
            }
        }

        System.out.println("\nBrillo promedio de la secuencia: " + promedio);

        System.err.println("\n===== Fin del sistema de cine de animacion =====");

        jm.close();
  }
}
