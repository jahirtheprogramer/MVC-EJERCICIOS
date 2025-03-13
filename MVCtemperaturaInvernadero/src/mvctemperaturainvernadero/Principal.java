/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvctemperaturainvernadero;

import Controlador.Controlador;
import Modelo.ModeloSensor;
import Vista.VistaInvernadero;
public class Principal {


    public static void main(String[] args) {
     VistaInvernadero objVista = new VistaInvernadero();
     ModeloSensor objmsensor = new ModeloSensor();
      Controlador obj = new Controlador(objmsensor,objVista);
      obj.ejecutar();
    }
    
}
