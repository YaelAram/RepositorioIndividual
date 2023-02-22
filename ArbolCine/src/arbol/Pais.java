package arbol;

public class Pais {
    private final String nombre;
    private final String continente;

    public Pais() {
        this("Sin nombre", "Sin Continente");
    }

    public Pais(String nombre, String continente) {
        this.nombre = nombre;
        this.continente = continente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContinente() {
        return continente;
    }

    @Override
    public String toString() {
        return "arbol.Pais{" +
                "nombre='" + nombre + '\'' +
                ", continente='" + continente + '\'' +
                '}';
    }
}
