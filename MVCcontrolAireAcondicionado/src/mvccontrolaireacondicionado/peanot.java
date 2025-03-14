/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvccontrolaireacondicionado;

import Modelo.ModeloaireAcondicionado;
import Vista.Vista;
import Controlador.Controlador;
public class peanot {

    
    public static void main(String[] args) {
        ModeloaireAcondicionado objmodelo= new ModeloaireAcondicionado();
        Vista objVista= new Vista();
        Controlador objControlador= new Controlador(objmodelo,objVista);
        objControlador.ejecutar();
    }
    
}
