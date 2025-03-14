/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vista {
    private Scanner scanner;
    
    public Vista(){
        scanner=new Scanner(System.in);
    }
    
    public void mostrarmenu(){
            System.out.println("\nMenú:");
            System.out.println("1. Leer sensores y controlar luces");
            System.out.println("2. Salir");
    }
    
      public int tomarOpcion(){
       int opcion = scanner.nextInt();
       return opcion;
  }
      public boolean comprobarDia(){
            
            System.out.print("¿Es de noche? (true/false): ");
            boolean esNoche = scanner.nextBoolean();
            return esNoche;
      }
      public  boolean comprobarMovimiento(){
          System.out.print("¿Hay movimiento en la habitación? (true/false): ");
            boolean hayMovimiento = scanner.nextBoolean();
           return hayMovimiento;
      }
      
     public void despedir(){
      System.out.println("Adiosito");
  }
 
}
