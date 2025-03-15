
package Modelo;

public class ModeloControlAcceso {

    public void verificarAcceso(ModeloUsuario[] usuarios) {
        for (int i = 0; i < usuarios.length; i++) {
            ModeloUsuario cliente = usuarios[i];

            if ((cliente.tieneMembresia() && cliente.estaEnHorarioAtencion()) || cliente.esEmpleado()) {
                System.out.println("Acceso permitido al usuario " + (i + 1) + " a la tienda.");
            } else {
                System.out.println(" Acceso denegado al usuario " + (i + 1) + " a la tienda.");
            }
        }
    }
}

