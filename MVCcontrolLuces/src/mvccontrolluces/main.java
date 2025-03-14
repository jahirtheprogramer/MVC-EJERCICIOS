
package mvccontrolluces;

import Modelo.Modeloluces;
import Vista.Vista;
import Controlador.Controlador;
public class main {

    
    public static void main(String[] args) {
      Modeloluces objluces = new Modeloluces();
      Vista objvista = new Vista();
      Controlador objcontrolador = new Controlador(objluces,objvista);
      objcontrolador.ejecutar();
                                                                
    }
    
}
