/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class ModeloSensor {
     private int temperatura;
    private int tempmin=10;
    private int tempmax=25;
   
  public ModeloSensor(){
  this.temperatura=0;
}

public int getTemperatura(){
 return temperatura;
}

public void setTemperatura(int Temperatura){
 this.temperatura=Temperatura;
}

    public void ActivarValores(int temperatura){
   System.out.println("Activando......");

if (temperatura < tempmin) {
    ModeloCalefactor calefactor = new ModeloCalefactor();
    calefactor.activarCalefactor();
} else if (temperatura >= tempmin && temperatura <= tempmax) {
    System.out.println("Inactividad del calefactor y ventilador");
} else {
    ModeloVentilador ventilador = new ModeloVentilador();
    ventilador.activarVentilador();
}


}
}
