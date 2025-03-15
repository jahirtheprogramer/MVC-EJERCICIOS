package Controlador;

import Modelo.ModeloControlAcceso;
import Modelo.ModeloUsuario;
import Vista.Vista;

public class Controlador {
    ModeloControlAcceso objModelo = new ModeloControlAcceso();
    Vista objVista = new Vista();

    public Controlador(ModeloControlAcceso objmodelo, Vista objVista) {
        this.objModelo = objmodelo;
        this.objVista = objVista;
    }

    public void ejecutar() {
        int opcion;
        do {
            objVista.mostrarMenu();
            opcion = objVista.tomarOpcion();
            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos usuarios desea verificar? ");
                    int numUsuarios = objVista.tomarOpcion();  

                    ModeloUsuario[] usuarios = new ModeloUsuario[numUsuarios];
                    for (int i = 0; i < numUsuarios; i++) {
                        System.out.println("\nUsuario " + (i + 1) + ":");
                        boolean tieneMembresia = objVista.verificarMembresia();
                        boolean esEmpleado = objVista.verificarEmpleado();
                        boolean horarioAtencion = objVista.verificarHorario();
                        usuarios[i] = new ModeloUsuario(tieneMembresia, esEmpleado, horarioAtencion);
                    }
                    objModelo.verificarAcceso(usuarios);
                    break;
                case 2:
                    objVista.despedir();
                    break;
                default:
                    System.out.println("Ingrese una opción válida del menú.");
                    break;
            }
        } while (opcion != 2);
    }
}

