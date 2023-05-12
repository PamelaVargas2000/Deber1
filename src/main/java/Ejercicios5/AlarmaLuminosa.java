
package Ejercicios5;


public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa(Sensor sensor, Timbre timbre, Luz luz) {
        super(sensor, timbre);
        this.luz = luz;
    }

    @Override
    public void comprobar() {
        if (getSensor().getValor() > 0) {
            getTimbre().sonar();
            luz.encender();
        } else {
            luz.apagar();
        }
    }
}
