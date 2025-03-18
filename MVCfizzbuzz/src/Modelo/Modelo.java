/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Modelo {
    
     private String[] mensajes;
    private int indice;

    public Modelo(int tamaño) {
        mensajes = new String[tamaño];
        indice = 0;
    }

    public String generarMensaje(int numero) {
        String mensaje;
        if (numero % 3 == 0 && numero % 5 == 0) {
            mensaje = "FizzBuzz";
        } else if (numero % 3 == 0) {
            mensaje = "Fizz";
        } else if (numero % 5 == 0) {
            mensaje = "Buzz";
        } else {
            mensaje = String.valueOf(numero);
        }
        
       
        return mensaje;
    }

 

}
