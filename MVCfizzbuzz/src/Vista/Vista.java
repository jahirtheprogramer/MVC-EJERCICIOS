/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;


/**
 *
 * @author Usuario
 */
public class Vista {
     public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMensajes(String[] mensajes, int cantidad) {
        System.out.println("Mensajes registrados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(mensajes[i]);
        }
    }
}
