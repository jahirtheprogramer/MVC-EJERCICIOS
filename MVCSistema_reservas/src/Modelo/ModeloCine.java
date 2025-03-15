/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

 
import java.util.ArrayList;
import java.util.List;

public class ModeloCine {
    private String nombre;
    private List<ModeloSala> salas;

    public ModeloCine(String nombre) {
        this.nombre = nombre;
        this.salas = new ArrayList<>();
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void agregarSala(ModeloSala sala) {
        salas.add(sala);
    }

    public ModeloSala getSala(int idSala) {
        for (ModeloSala sala : salas) {
            if (sala != null) {
                return sala;
            }
        }
        return null;
    }
    
   
}