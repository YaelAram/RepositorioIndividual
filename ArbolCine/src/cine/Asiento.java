package cine;

import java.awt.*;

public class Asiento {
    private final int fila;
    private final int columna;
    private final float precio;
    private final boolean reclinable;
    private final String material;
    private final Color color;

    public Asiento(int fila, int columna, boolean reclinable, String material, Color color) {
        this.fila = fila;
        this.columna = columna;
        this.precio = (fila > 3) ? 6F : 10F;
        this.reclinable = reclinable;
        this.material = material;
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void reclinar(){
        if(!reclinable) System.out.println("Asiento de la fila " + (this.fila + 1) + " y columna " + (this.columna + 1) + " no reclinable");
        else System.out.println("Reclinando asiento de la fila " + (this.fila + 1) + " y columna " + (this.columna + 1) + "...");
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "fila=" + fila +
                ", columna=" + columna +
                ", precio=" + precio +
                ", reclinable=" + reclinable +
                ", material='" + material + '\'' +
                ", color=" + color +
                '}';
    }
}
