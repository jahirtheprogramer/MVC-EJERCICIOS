/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class ModeloSensor {
    private int temperatura;
    private int tempmin = 10;
    private int tempmax = 25;
    private int[] temperaturas; 
    private int indice; 

    public ModeloSensor() {
        this.temperatura = 0;
        this.temperaturas = new int[20]; 
        this.indice = 0;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        registrarTemperatura(temperatura); 
    }

    public void registrarTemperatura(int temperatura) {
        if (indice < temperaturas.length) {
            temperaturas[indice] = temperatura;
            indice++;
        } else {
            System.out.println("El array de temperaturas está lleno.");
        }
    }

public void mostrarTemperaturas() {
    System.out.println("Temperaturas registradas:");
    if (indice == 0) {
        System.out.println("No hay temperaturas registradas.");
    } else {
        for (int i = 0; i < indice; i++) {
            System.out.println("Temperatura: " + temperaturas[i] + "°C");
        }
    }
}


    public void ActivarValores(int temperatura) {
        System.out.println("Activando...");

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

