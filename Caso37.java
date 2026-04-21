import java.util.Scanner;

public class Caso37 {

  public static void main(String[] args) {

    Scanner jm = new Scanner(System.in);

    // Caso 37: Gestión Forestal: Diámetro de Árboles en Reforestación Se mide el diámetro del tronco de 40 árboles 
    // en una zona de reforestación. El ingeniero forestal quiere clasificar el crecimiento: "Plántula" (< 5 cm), 
    // "Joven" (5-15 cm) y "Adulto" (> 15 cm). El aprendiz debe contar cuántos hay en cada categoría y calcular el 
    // diámetro promedio para estimar la captura de CO2 de la zona.

    System.out.println("\n===== Inicio del sistema de gestion forestal =====");

    double[] gestion = new double[40];
    int Plantula = 0;
    int jovenes = 0;
    int adultos = 0;
    int suma = 0;

    for (int i = 0; i < gestion.length; i++) {
        System.out.println("\nIngrese el diametro del arbol # " + (i + 1) + " en cm: ");
        gestion[i] = jm.nextDouble();

        suma += gestion[i];

        if (gestion[i] < 5) {
            Plantula++;
        } else if (gestion[i] <= 15) {
            jovenes++;
        } else {
            adultos++;
        }
    }

    double promedio = suma / gestion.length;

    System.out.println("\n===================================");
    System.out.println(" ===== Resumen de resultados =====");
    System.out.println("PLantulas (< 5 cm): " + Plantula);
    System.out.println("Jovenes (5 - 15 cm): " + jovenes);
    System.out.println("Adultos (> 15 cm): " + adultos);
    System.out.println("Diametro promedio: " + promedio + " cm");
    System.out.println("===================================");

    System.out.println("\n===== fin del sistema de gestion forestal =====");

    jm.close();
  }
}
