
package EJERCICIO9;

import java.util.ArrayList;

public class BlocNotas {
    private ArrayList<Nota> notas;

    public BlocNotas() {
        notas = new ArrayList<>();
    }

    public void addNota(Nota nota) {
        notas.add(nota);
    }

    public void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("El bloc de notas está vacío");
        } else {
            for (Nota nota : notas) {
                System.out.println(nota);
            }
        }
    }

    public void eliminarNota(int posicion) {
        if (posicion < 0 || posicion >= notas.size()) {
            System.out.println("La posición no es válida");
        } else {
            notas.remove(posicion);
            System.out.println("La nota ha sido eliminada");
        }
    }

    public int cantidadNotas() {
        return notas.size();
    }
}
