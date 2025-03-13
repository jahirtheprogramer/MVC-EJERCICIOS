/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Random;

public class ModeloSensor {


// Clase Sensor

    private boolean detectaMovimiento;

    public ModeloSensor() {
        this.detectaMovimiento = false;
    }

    public void detectarMovimiento() {
        Random random = new Random();
        this.detectaMovimiento = random.nextBoolean();// RECORDAR, lo use para generar un valor aleatorio a la hora de detectar movimiento
    }

    public boolean isDetectaMovimiento() {
        return detectaMovimiento;
    }
}   

