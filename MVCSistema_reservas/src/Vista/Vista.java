/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;


public class Vista {
     private Scanner scanner;
    
    public Vista(){
        scanner=new Scanner(System.in);
   }
    
    
    public void mostrarmenu(){
            System.out.println("Bienvenido");
            System.out.println("1. Hacer una reserva");
            System.out.println("2. Salir");
    }
    
    public int tomaropcion(){
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        return opcion;
    }
    
    public void desperdirse(){
        System.out.println("Adiosito");
    }
    
    public String SolicitarNombre(){
        System.out.println("Dime tu nombre");
        String Nombre = scanner.nextLine();
          
        return Nombre;
    }
    
   public String solicitarNombreCine(){
       System.out.println("Dime el nombre del cine ");
       
       String cine= scanner.nextLine();
        
       return cine;
   }
     public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public int registrarAsientos(){
         System.out.print("Seleccione un asiento a reservar (1-10) o 0 para salir: ");
         int asiento = scanner.nextInt();
         return asiento;
    }
    
    public void denegarAsiento(){
        System.out.println("no hay mas asientos disponibles");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
