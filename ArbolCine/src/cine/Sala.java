package cine;

import java.awt.*;
import java.text.NumberFormat;

public class Sala {
    private final String nombreSala;
    private final int numFila;
    private final int numCol;
    private final Asiento[][] sala;

    public Sala(String nombreSala, int numFila, int numCol, boolean reclinable, String material, Color color) {
        this.nombreSala = nombreSala;
        this.numFila = numFila;
        this.numCol = numCol;
        this.sala = new Asiento[numFila][numCol];

        for(int i = 0 ; i < numFila ; i++)
            for(int j = 0 ; j < numCol ; j++)
                this.sala[i][j] = new Asiento(i, j, reclinable, material, color);
    }

    public void reclinar(int fila, int columna){
        this.sala[fila][columna].reclinar();
    }

    @Override
    public String toString() {
        NumberFormat f = NumberFormat.getInstance();
        f.setMinimumIntegerDigits(2);
        StringBuilder str = new StringBuilder("Sala " + this.nombreSala + "\n\n");

        str.append("Notacion: \n*: Costo $6 \no: Costo $10\n\n");

        for(int i = 0 ; i < numFila ; i++){
            str.append("Fila ").append(f.format(i + 1)).append(":");
            for(int j = 0 ; j < numCol ; j++)
                str.append((this.sala[i][j].getPrecio() == 6) ? " *" : " o");
            str.append("\n");
        }

        return str.toString();
    }
}
