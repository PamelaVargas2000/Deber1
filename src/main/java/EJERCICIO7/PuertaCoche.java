
package EJERCICIO7;


public class PuertaCoche extends ComponenteDeCoche implements PuertaBloqueable, Alarma {
    private boolean estaBloqueada;
    private boolean alarmaActivada;
    
    public PuertaCoche(String descripcion, double peso, double coste) {
        super(descripcion, peso, coste);
        estaBloqueada = false;
        alarmaActivada = false;
    }
    
    @Override
    public void abrir() {
        System.out.println("La puerta se ha abierto");
    }
    
    @Override
    public void cerrar() {
        System.out.println("La puerta se ha cerrado");
    }
    
    @Override
    public void bloquear() {
        estaBloqueada = true;
        System.out.println("La puerta ha sido bloqueada");
    }
    
    @Override
    public void desbloquear() {
        estaBloqueada = false;
        System.out.println("La puerta ha sido desbloqueada");
    }
    
    @Override
    public boolean alarmaActivada() {
        return alarmaActivada;
    }
    
    @Override
    public void activarAlarma() {
        alarmaActivada = true;
        System.out.println("La alarma se ha activado");
    }
    
    @Override
    public void desactivarAlarma() {
        alarmaActivada = false;
        System.out.println("La alarma se ha desactivado");
    }
}
