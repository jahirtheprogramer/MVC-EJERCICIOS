/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
import java.util.Scanner;

public class VistaCalculadora {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("Operaciones disponibles:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
    }

    public int obtenerOperacion() {
        System.out.print("Seleccione una operación del (1-5): ");
        return scanner.nextInt();
    }

    public double[] obtenerNumeros() {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        return new double[] { num1, num2 };
    }

    public void mostrarResultado(double resultado) {
        if (Double.isNaN(resultado)) {
            System.out.println("Operación no válida.");
        } else {
            System.out.println("El resultado es: " + resultado);
        }
    }

    public void mostrarMensajeSalida() {
        System.out.println("Gracias por usar la calculadora.");
    }











}
