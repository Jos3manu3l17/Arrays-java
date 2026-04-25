import java.util.Scanner;

public class Caso58 {

  public static void main(String[] args) {

    Scanner jm = new Scanner(System.in);

    // Caso 58. Nutrición Infantil: Contenido de Azúcar en Cereales Se analiza el contenido de azúcar 
    // (gramos por cada 100g de producto) en 20 marcas de cereales para niños disponibles en un supermercado. 
    // Los datos se guardan en un vector. La OMS recomienda menos de 10g de azúcar. El aprendiz debe programar 
    // el sistema para que identifique las marcas que superan este límite, calcule el promedio de azúcar de los 
    // cereales analizados y encuentre la marca más saludable (con menor azúcar) para recomendar a los padres de 
    // familia.

    System.out.println("\n===== Inicio del sistema de Nutricion infantil =====");

    int[] marcas = new int[20];
    int gramos = 0;
    int marcaSuperaLimite = 0;
    int marcaSaludable = 0; 


    for (int i = 0; i < marcas.length; i++) {
      System.out.println("\nIngrese la marca del cereal " + (i + 1) + " : ");
      marcas[i] = jm.nextInt();


    }

  }
}