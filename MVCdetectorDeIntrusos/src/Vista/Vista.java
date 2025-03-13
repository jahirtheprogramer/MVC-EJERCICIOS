/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.ModeloSistemaSeguridad;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vista {
     private Scanner scanner;
     
     
     
     
public Vista (){
this.scanner= new Scanner(System.in);

}
  public void mostrarMenu() {
         System.out.println("\n--- Menú de Seguridad ---");
            System.out.println("1. Activar alarma");
            System.out.println("2. Desactivar alarma");
            System.out.println("3. Simular sensores");
            System.out.println("4. Cambiar estado del día");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
           
       
}  
  public int tomarOpcion(){
       int opcion = scanner.nextInt();
       return opcion;
  }
  public boolean AlterarDia (){
      System.out.print("Ingrese 1 si es de noche, 0 si es de día: ");
                    boolean esDeNoche = scanner.nextInt() == 1;
      System.out.println("Estado del día actualizado.");
      return esDeNoche;
  }
  
  public void despedir(){{
      System.out.println("Adiosito");
  }
  
  }   
}
