
package EJERCICIO7;


public class Main {
   
     public static void main(String[] args) {
        
        PuertaCoche puerta = new PuertaCoche("Puerta delantera izquierda", 10.5, 100.0);
    
        puerta.abrir();
        puerta.cerrar();
        
        puerta.bloquear();
        puerta.desbloquear();
      
        puerta.activarAlarma();
        puerta.desactivarAlarma();
   
       
    }
}
