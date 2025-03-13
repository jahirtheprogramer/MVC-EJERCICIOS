/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.ModeloSistemaSeguridad;
import Vista.Vista;
public class Controlador {
    Vista objVista = new Vista();
    ModeloSistemaSeguridad objModelo = new ModeloSistemaSeguridad();
   
    
    
    public Controlador(Vista vista, ModeloSistemaSeguridad modelo){
        this.objVista=vista;
        this.objModelo=modelo;
        
    }
    
    
    
    
    
    public void ejecutar(){
    int opcion;
        do {
            objVista.mostrarMenu();
            opcion = objVista.tomarOpcion();

            switch (opcion) {
                case 1:
                    objModelo.activarAlarma();
                    break;
                case 2:
                   objModelo.desactivarAlarma();
                    break;
                case 3:
                   objModelo.verificarSensores();
                    break;
                case 4:
                   boolean noche =objVista.AlterarDia();
                    objModelo.setEsDeNoche(noche);
                    break;
                case 5:
                   objVista.despedir();
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    } 
}
