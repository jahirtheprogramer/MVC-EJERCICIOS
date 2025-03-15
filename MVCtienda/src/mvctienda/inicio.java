
package mvctienda;




import Modelo.ModeloControlAcceso;
import Vista.Vista;
import Controlador.Controlador;
public class inicio {

   
    public static void main(String[] args) {
       ModeloControlAcceso objmodelo = new ModeloControlAcceso();
       Vista objVista = new Vista();
       Controlador objControlador = new Controlador(objmodelo,objVista);
       objControlador.ejecutar();
    }
    
}
