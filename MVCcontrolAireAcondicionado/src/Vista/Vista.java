
package Vista;

import java.util.Scanner;


public class Vista {
    private Scanner scanner;
    
    public Vista(){
        scanner=new Scanner(System.in);
   }
  public void mostrarMenu(){
      System.out.println("\nMenú:\n1. Leer sensores y controlar aire acondicionado\n2. Salir");
   }  
   public int tomarOpcion(){
       int opcion = scanner.nextInt();
       return opcion;
   }
   public double ingresarTemperatura(){
       System.out.print("Ingrese la temperatura actual (°C): ");
        double temperatura = scanner.nextDouble();
        return temperatura;
   }
    public double ingresarHumedad(){
       System.out.print("Ingrese la humedad actual (%): ");
        double humedad = scanner.nextDouble();
        return humedad;
   }
       public void despedir(){
      System.out.println("Adiosito");
   }
}