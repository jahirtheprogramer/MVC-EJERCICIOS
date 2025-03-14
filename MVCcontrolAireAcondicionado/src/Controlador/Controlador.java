/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.ModelosensorHumedad;
import Modelo.ModelosensorTemperatura;
import Modelo.ModeloaireAcondicionado;
import Vista.Vista;
public class Controlador {
    ModelosensorHumedad objmodeloHumedad= new ModelosensorHumedad();
    ModelosensorTemperatura objmodeloTemperatura= new ModelosensorTemperatura();
    ModeloaireAcondicionado objmodeloAcondicionado= new ModeloaireAcondicionado();
    Vista objvista = new Vista();
    
    
    public Controlador (ModeloaireAcondicionado objmaire, Vista objVista){
   this.objmodeloAcondicionado= objmaire;
   this.objvista= objVista;
}


public void ejecutar(){
    int opcion;
    do{
        objvista.mostrarMenu();
        opcion=objvista.tomarOpcion();
        switch(opcion){
            case 1:
                double temperatura=objvista.ingresarTemperatura();
                objmodeloTemperatura.setTemperatura(temperatura);
                
                double humedad=objvista.ingresarHumedad();
                objmodeloHumedad.setHumedad(humedad);
                
                objmodeloAcondicionado.controlar(objmodeloTemperatura, objmodeloHumedad);
             break;
            case 2:
                objvista.despedir();
             break;
            default:
                System.out.println("ingresa un valor de acuerdo al menu");
                    
        }
    }while(opcion!=2);
}




















}


