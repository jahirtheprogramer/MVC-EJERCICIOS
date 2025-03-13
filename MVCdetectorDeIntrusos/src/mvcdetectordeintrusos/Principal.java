/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvcdetectordeintrusos;

import Modelo.ModeloSistemaSeguridad;
import Vista.Vista;
import Controlador.Controlador;
public class Principal {

    
    public static void main(String[] args) {
       ModeloSistemaSeguridad objm = new ModeloSistemaSeguridad();
       Vista objv = new Vista();
       Controlador objc = new Controlador(objv,objm);
       objc.ejecutar();
    }
    
}
