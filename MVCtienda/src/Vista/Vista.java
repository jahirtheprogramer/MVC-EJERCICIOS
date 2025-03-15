
package Vista;

import java.util.Scanner;


public class Vista {
    private Scanner scanner;
    public Vista (){
         scanner=new Scanner(System.in);
    }
    
    
    public void mostrarMenu(){
        System.out.println("\nMenú:");
            System.out.println("1. Verificar acceso a tienda");
            System.out.println("2. Salir");
    }
    
    public int tomarOpcion(){
       int opcion = scanner.nextInt();
       return opcion;
    }
    
    public boolean verificarMembresia (){
        System.out.print("¿Tiene membresía válida? (true/false): ");
        boolean tieneMembresia = scanner.nextBoolean();
        return tieneMembresia;
    }
    
    public boolean verificarEmpleado(){
        System.out.print("¿Es empleado? (true/false): ");
                boolean esEmpleado = scanner.nextBoolean();
        return esEmpleado;
    }
    
    public boolean verificarHorario(){
        System.out.print("¿Es hora dentro del horario de atención? (true/false): ");
         boolean horarioAtencion = scanner.nextBoolean();
         return horarioAtencion;
    }
    
    public void despedir(){
       System.out.println("Adiosito");
    }
    
    
    
    
    
    
    
}
