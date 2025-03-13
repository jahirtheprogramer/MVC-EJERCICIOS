/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
public class Controlador {
    private int valor;
    private Modelo objmodelo;
    private Vista objVista;
    
    
    
    public Controlador (Modelo obM, Vista obV){
        this.objmodelo=obM;
        this.objVista=obV;
        
    }
   
    
    public void Ejecutar(){
        int opcion=0;
        do{
             objVista.saludar();
             objVista.mostrarMenu();
              opcion=objVista.obtenerOpcion();
             switch(opcion){
                 case 1:
                     objmodelo.jugar();
                     break;
                 case 2:
                     objVista.despedir();
                     
                     break;
                 default:
                     System.out.println("ingrese una opcion.");
                     break;
                     
             }
        }while(opcion !=2);
       
        
    }
    
    
}
