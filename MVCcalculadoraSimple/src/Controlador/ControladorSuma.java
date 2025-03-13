/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Modelo;
import Vista.VistaCalculadora;
public class ControladorSuma {
      private Modelo calculadora;
    private VistaCalculadora vista;

    public ControladorSuma() {
        calculadora = new Modelo();
        vista = new VistaCalculadora();
    }

    public void ejecutar() {
          do {
            vista.mostrarMenu();
            int operacion = vista.obtenerOperacion();
             if (operacion == 5) {
                vista.mostrarMensajeSalida();
                break; 
            }
            double[] numeros = vista.obtenerNumeros();
            double num1 = numeros[0];
            double num2 = numeros[1];
            double resultado = 0;

            switch (operacion) {
           
                case 1:
                    
                    resultado = calculadora.sumar(num1, num2);
                    vista.mostrarResultado(resultado);
                    break;
                case 2:
                    resultado = calculadora.restar(num1, num2);
                    vista.mostrarResultado(resultado);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(num1, num2);
                    vista.mostrarResultado(resultado);
                    break;
                case 4:
                    resultado = calculadora.dividir(num1, num2);
                    vista.mostrarResultado(resultado);
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
                    break;
            }

        } while (true);
    }
}
      



 
 
 


   









