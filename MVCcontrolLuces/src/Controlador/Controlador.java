/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modeloluces;
import Vista.Vista;
import Modelo.ModeloSensorLuz;
import Modelo.ModeloSensorMovimiento;
public class Controlador {
    Modeloluces objmluces = new Modeloluces();
    Vista objvista = new Vista();
    ModeloSensorLuz sensorluz = new ModeloSensorLuz();
    ModeloSensorMovimiento sensormovimiento = new ModeloSensorMovimiento();
    
    public Controlador(Modeloluces objmodelo, Vista objvista ){
        this.objmluces= objmodelo;
        this.objvista= objvista;
    }
    
    public void ejecutar(){
        int opcion;
        do{
            objvista.mostrarmenu();
           opcion= objvista.tomarOpcion();
           
           switch(opcion){
               case 1:
                   boolean esnoche= objvista.comprobarDia();
                   sensorluz.setEsNoche(esnoche);
                    boolean hayMovimiento= objvista.comprobarMovimiento();
                   sensormovimiento.setHayMovimiento(hayMovimiento);
                   
                   objmluces.controlar(sensorluz, sensormovimiento);
                   break;
               case 2:
                   objvista.despedir();
                   break;
               default:
                   System.out.println("ingrese una opcion valida");
                   break;
           }
        }while(opcion!=2);
    }
    
    
    
    
    
}
