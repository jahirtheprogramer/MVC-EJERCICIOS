/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.util.Scanner;


public class Controlador {
   private Modelo modelo;
    private Vista vista;
    private Scanner scanner;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        vista.mostrarMensaje("Ingrese el rango máximo para FizzBuzz:");
        int rango = scanner.nextInt();
        ejecutarFizzBuzz(rango);
    }

    public void ejecutarFizzBuzz(int rango) {
        for (int i = 1; i <= rango; i++) {
            String mensaje = modelo.generarMensaje(i);
            vista.mostrarMensaje("Número: " + i + " -> " + mensaje);
        }
       
    }
    
    
}
