
package EJERCICIO9;

    
public class Main {
    
    public static void main(String[] args) {
        BlocNotas blocNotas = new BlocNotas();

        Nota nota1 = new Nota(1, "Recordar comprar heuvos");
        NotaAlarma nota2 = new NotaAlarma(2, "Ir al doc", "10:00");
        Nota nota3 = new Nota(3, "Llamar a Alex");

        blocNotas.addNota(nota1);
        blocNotas.addNota(nota2);
        blocNotas.addNota(nota3);

        blocNotas.listarNotas();

        blocNotas.eliminarNota(1);

        blocNotas.listarNotas();

        System.out.println("Cantidad de notas: " + blocNotas.cantidadNotas());
    }
}
