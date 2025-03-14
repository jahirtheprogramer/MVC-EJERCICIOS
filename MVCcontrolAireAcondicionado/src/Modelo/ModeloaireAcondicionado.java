/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class ModeloaireAcondicionado {
   private boolean[] encendidos = new boolean[4];  

    public void controlar(ModelosensorTemperatura sensorTemp, ModelosensorHumedad sensorHum) {
        double temperatura = sensorTemp.getTemperatura();
        double humedad = sensorHum.getHumedad();

        for (int i = 0; i < encendidos.length; i++) {
            if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
                encender(i);
            } else {
                apagar(i);
            }
        }
    }

    private void encender(int aire) {
        if (!encendidos[aire]) {
            encendidos[aire] = true;
            System.out.println("️ Aire acondicionado " + (aire + 1) + " ENCENDIDO.");
        } else {
            System.out.println("ℹ️ El aire acondicionado " + (aire + 1) + " ya está encendido.");
        }
    }

    private void apagar(int aire) {
        if (encendidos[aire]) {
            encendidos[aire] = false;
            System.out.println(" Aire acondicionado " + (aire + 1) + " APAGADO.");
        } else {
            System.out.println("ℹ️ El aire acondicionado " + (aire + 1) + " ya está apagado.");
        }
    }
}
