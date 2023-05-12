
package EJERCICIO9;

public class NotaAlarma extends Nota {
    private String horaAlarma;

    public NotaAlarma(int id, String texto, String horaAlarma) {
        super(id, texto);
        this.horaAlarma = horaAlarma;
    }

    public String getHoraAlarma() {
        return horaAlarma;
    }

    public void setHoraAlarma(String horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    @Override
    public String toString() {
        return super.toString() + " | Alarma a las " + horaAlarma;
    }
}
