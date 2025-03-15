/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.ModeloCine;
import Modelo.ModeloSala;
import Modelo.ModeloUsuario;
import Vista.Vista;
public class Controlador {
    ModeloSala sala1 = new ModeloSala(1, 10);
    Vista vista = new Vista();

    public void ejecutar (){
      int opcion;
      do{
          vista.mostrarmenu();
          opcion = vista.tomaropcion();
          switch(opcion){
              case 1:
                  String cineNombre = vista.solicitarNombreCine();
                  ModeloCine cine = new ModeloCine(cineNombre);
                  vista.mostrarMensaje("¡Bienvenido al sistema de reservas de " + cine.getNombre() + "!");
                  
                  String nombre=vista.SolicitarNombre();
                  ModeloUsuario usuario1 = new ModeloUsuario(nombre, 1);
                  
                  while (sala1.hayAsientosDisponibles()) {
                  sala1.mostrarAsientosDisponibles();
                  int asiento= vista.registrarAsientos();
                  if (asiento == 0) {
                  System.out.println("Saliendo del sistema...");
                  break;
                    }
                  sala1.reservarAsiento(asiento);
                   }
                   vista.denegarAsiento();
                  break;
          }
      }while (opcion!=2);
    }
    
}

