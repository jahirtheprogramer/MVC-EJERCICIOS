/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvcfizzbuzz;
 import Modelo.Modelo;
import Vista.Vista;
import Controlador.Controlador;
public class Principal {

  
    public static void main(String[] args) {
        
        Vista vista = new Vista();
        Modelo modelo = new Modelo(100);
       Controlador objcontrolador = new Controlador(modelo,vista);
       
       objcontrolador.iniciar();
    }
    
}
