
package Ejercicios5;


public class Alarma {
    private Sensor sensor;
    private Timbre timbre;

    public Alarma(Sensor sensor, Timbre timbre) {
        this.sensor = sensor;
        this.timbre = timbre;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public Timbre getTimbre() {
        return timbre;
    }

    public void setTimbre(Timbre timbre) {
        this.timbre = timbre;
    }
    
    

    public void comprobar() {
        if (sensor.getValor() > 0) {
            timbre.sonar();
        }
    }
}
