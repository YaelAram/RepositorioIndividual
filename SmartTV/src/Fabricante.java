import java.util.Arrays;

public class Fabricante {
    private String nombre;
    private String pais;

    public Fabricante() {
        this("SIN NOMBRE", "NINGUN LUGAR");
    }

    public Fabricante(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
