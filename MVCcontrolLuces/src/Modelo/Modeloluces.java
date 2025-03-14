/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Modeloluces {
    private boolean[] encendidas = new boolean[4]; 

public void controlar(ModeloSensorLuz sensorLuz, ModeloSensorMovimiento sensorMov) {
    boolean esNoche = sensorLuz.getEsNoche();
    boolean hayMovimiento = sensorMov.getHayMovimiento();

    for (int i = 0; i < encendidas.length; i++) {
        if (esNoche && hayMovimiento) {
            encender(i);
        } else {
            apagar(i);
        }
    }
}

private void encender(int habitacion) {
    if (!encendidas[habitacion]) {
        encendidas[habitacion] = true;
        System.out.println("Las luces de la habitación " + (habitacion + 1) + " se han encendido.");
    } else {
        System.out.println("Las luces de la habitación " + (habitacion + 1) + " ya están encendidas.");
    }
}

private void apagar(int habitacion) {
    if (encendidas[habitacion]) {
        encendidas[habitacion] = false;
        System.out.println("Las luces de la habitación " + (habitacion + 1) + " se han apagado.");
    } else {
        System.out.println("Las luces de la habitación " + (habitacion + 1) + " ya están apagadas.");
    }
}

}
