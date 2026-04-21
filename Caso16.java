import java.util.Scanner;

public class Caso16 {

  public static void main(String[] args) {

    Scanner jm = new Scanner(System.in);

    // Caso 16. Bibliotecología: Estadísticas de Circulación de Textos Una biblioteca registra el número de libros prestados diariamente durante un mes de 24 días hábiles. Los datos se almacenan en un vector. El sistema debe identificar los "Días de Baja Afluencia" (menos de 10 libros) y calcular el total de circulación mensual para planeación presupuestal.

    System.out.println("\n===== Inicio del sistema de estadísticas de Circulación de Textos=====");

    int[] biblio = new int[24];
    int totalCirculacion = 0;
    
    for (int i = 0; i < biblio.length; i++) {
      System.out.println("Dia " + (i + 1) + " - libros prestados: ");
      biblio[i] = jm.nextInt();
    }
      
      System.out.println("\n===== Dias de baja influencia (menos de 10 libros) =====");
      boolean bajaInfluencia = false;
    
    
          for (int i = 0; i < biblio.length; i++) {
            totalCirculacion += biblio[i];
            
            if (biblio[i] < 10) {
              System.out.println("Dia " + (i + 1) + ": " + biblio[i] + " libros prestados");
              bajaInfluencia = true;
              
            }
          }x

          if (!bajaInfluencia) {
            System.out.println("No hubo dias de baja influencia.");
          }

          System.out.println("\n===== Estadisticas mensuales =====");
          System.out.println("Total de libros prestados en el mes: " + totalCirculacion);
          System.out.println("Promedio diario: " + (totalCirculacion / 24) + " libros");

          jm.close();
  }
}