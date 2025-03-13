/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
public class ModeloSistemaSeguridad {
    private ModeloSensor[] sensor;
   
    private boolean esDeNoche;
    private boolean alarmaActivada;
    

    public ModeloSistemaSeguridad() {
         this.sensor = new ModeloSensor[3];
        this. sensor[0] = new ModeloSensor();
        this. sensor[1] = new ModeloSensor();
        this. sensor[2] = new ModeloSensor();
        this.esDeNoche = false;
        this.alarmaActivada = false;
    }

    public void activarAlarma() {
        alarmaActivada = true;
        System.out.println("Alarma activada.");
    }

    public void desactivarAlarma() {
        alarmaActivada = false;
        System.out.println("Alarma desactivada.");
    }

    public void setEsDeNoche(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }
    public boolean getEsnoche(boolean noche){
        return  esDeNoche;
    }
    
    

    public void verificarSensores() {
       
       
        sensor[0].detectarMovimiento();
         sensor[1].detectarMovimiento();
         sensor[2].detectarMovimiento();

        int sensoresActivos = 0;
        if ( sensor[0].isDetectaMovimiento()) sensoresActivos++;//evaluamos si el sensor ha detectado movimiento, si el sensor lanza true, pues sumamos uno a la variable sensores activos
        if ( sensor[1].isDetectaMovimiento()) sensoresActivos++;
        if ( sensor[2].isDetectaMovimiento()) sensoresActivos++;
        System.out.println("Estado de la alarma: " + alarmaActivada);
        System.out.println("Es de noche: " + esDeNoche);
        System.out.println("Sensores activos: " + sensoresActivos);
        System.out.println("Sensor 1: " +  sensor[0].isDetectaMovimiento());
        System.out.println("Sensor 2: " +  sensor[1].isDetectaMovimiento());
        System.out.println("Sensor 3: " +  sensor[2].isDetectaMovimiento());
        System.out.println("Es de noche?: " + esDeNoche);

        if (alarmaActivada && esDeNoche && sensoresActivos >= 2) {
            System.out.println("¡ALERTA! Intruso detectado. La alarma se ha activado.");
        } else {
            System.out.println("Todo en orden.");
        }
    }
}
