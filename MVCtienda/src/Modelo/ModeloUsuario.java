
package Modelo;


public class ModeloUsuario {
     private boolean tieneMembresia;
    private boolean esEmpleado;
    private boolean horarioAtencion;
    
    
    public ModeloUsuario(){
        
    }

    public ModeloUsuario(boolean tieneMembresia, boolean esEmpleado, boolean horarioAtencion) {
        this.tieneMembresia = tieneMembresia;
        this.esEmpleado = esEmpleado;
        this.horarioAtencion = horarioAtencion;
    }

    public boolean tieneMembresia() {
        return tieneMembresia;
    }

    public boolean esEmpleado() {
        return esEmpleado;
    }

    public boolean estaEnHorarioAtencion() {
        return horarioAtencion;
    }
}
