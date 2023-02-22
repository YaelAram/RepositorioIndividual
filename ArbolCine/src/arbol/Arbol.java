package arbol;

public class Arbol implements ReinoVegetal {
    private String nombre;
    private int edad;
    private float altura;
    private boolean estaVivo;
    private final Pais pais;

    public Arbol() {
        this("Sin nombre", 0, 0.0F, false, new Pais());
    }

    public Arbol(String nombre, int edad, float altura, boolean estaVivo, Pais pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.estaVivo = estaVivo;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    @Override
    public void fotosintesis() {
        System.out.println("Realizando fotosintesis...");
    }

    @Override
    public void absorberAgua() {
        System.out.println("Absorbiendo agua...");
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", estaVivo=" + estaVivo +
                ", pais=" + pais +
                '}';
    }
}
