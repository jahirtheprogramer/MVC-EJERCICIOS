/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ModeloSala {
    private int idSala;
    private List<ModeloAsientos> asientos;

    public ModeloSala(int idSala, int capacidad) {
        this.idSala = idSala;
        this.asientos = new ArrayList<>();
        for (int i = 1; i <= capacidad; i++) {
            asientos.add(new ModeloAsientos(i));
        }
    }

    public boolean reservarAsiento(int numero) {
        if (numero < 1 || numero > asientos.size()) {
            System.out.println("Número de asiento inválido.");
            return false;
        }

        ModeloAsientos asiento = asientos.get(numero - 1);
        if (asiento.reservar()) {
            System.out.println("Asiento " + numero + " reservado con éxito.");
            return true;
        } else {
            System.out.println("El asiento " + numero + " ya está ocupado.");
            return false;
        }
    }

    public void mostrarAsientosDisponibles() {
        System.out.print("Asientos disponibles: ");
        for (ModeloAsientos asiento : asientos) {
            if (!asiento.estaOcupado()) {
                System.out.print(asiento.getNumero() + " ");
            }
        }
        System.out.println();
    }

    public boolean hayAsientosDisponibles() {
        for (ModeloAsientos asiento : asientos) {
            if (!asiento.estaOcupado()) {
                return true;
            }
        }
        return false;
    }
}
