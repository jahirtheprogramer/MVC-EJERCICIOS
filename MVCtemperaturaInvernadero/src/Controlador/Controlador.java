/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VistaInvernadero;

import Modelo.ModeloSensor;

public class Controlador {
    
private ModeloSensor modelo_sensor;
private VistaInvernadero vista_invernadero;


public Controlador (ModeloSensor sensor1, VistaInvernadero vista1){
 this.modelo_sensor= sensor1;
 this.vista_invernadero=vista1;

}

public void ejecutar(){
int opcion;
do{
vista_invernadero.mostrarMenu();
 opcion = this.vista_invernadero.tomarOpcion();
   switch(opcion){
   case 1:
     int temperatura = this.vista_invernadero.ingresarTemperatura();
     modelo_sensor.ActivarValores(temperatura);
     modelo_sensor.registrarTemperatura(temperatura);
    break;
   case 2:
       modelo_sensor.mostrarTemperaturas();
       break;
   case 3:
     vista_invernadero.salir();
     break;
    default:
    System.out.println("Opción invalida.");
break;
  }


}while(opcion!=3);
}




}
