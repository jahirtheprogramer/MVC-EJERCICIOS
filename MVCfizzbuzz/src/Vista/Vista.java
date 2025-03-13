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
    private Scanner scanner = new Scanner(System.in);
    
    
  public Vista(){
      
  }  
    
    
    
    
    public void saludar(){
        System.out.println("Bienvenido.");
    }
    
    
    public void mostrarMenu(){
        System.out.println("---MENU---");
        System.out.println("1.Jugar");
        System.out.println("2.Salir");
    }
    
    public int obtenerOpcion(){
        int opcion=scanner.nextInt();
        return opcion;
    }
    
    public void despedir(){
        System.out.println("Adios.");
    }
}
