
package Ejercicios5;


public class Main {
    
    public static void main(String[] args) {
    Sensor sensor = new Sensor(1);
    Timbre timbre = new Timbre();
    Alarma alarma = new Alarma(sensor, timbre);
    alarma.comprobar(); 

    Luz luz = new Luz();
    AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa(sensor, timbre, luz);
    alarmaLuminosa.comprobar();

    sensor.setValor(-5);
    alarmaLuminosa.comprobar(); 
}
}
