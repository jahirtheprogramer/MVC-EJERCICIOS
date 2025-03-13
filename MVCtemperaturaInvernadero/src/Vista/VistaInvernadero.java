/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class VistaInvernadero {
    private Scanner scanner;

public VistaInvernadero (){
this.scanner= new Scanner(System.in);

}
public void mostrarMenu() {
         System.out.println("Control de invernadero");
         System.out.println("1.Ingresar Temperatura");
         System.out.println("2.Salir");
       
}
public int tomarOpcion(){
  int opcion = scanner.nextInt();
  return opcion;
}

public int ingresarTemperatura(){
    System.out.println("dime la temperatura");
    int temperatura = scanner.nextInt();
   return temperatura;

}

public void salir(){
    System.out.println("saliendo del programa");
}







}
