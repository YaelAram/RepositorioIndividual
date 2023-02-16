import java.time.LocalDate;

public class SmartTV {
    private final String familia;
    private final String modelo;
    private final String resolucion;
    private final float pulgadas;
    private final byte peso;
    private final Dimension dimension;
    private final Fabricante fabricante;
    private final SistemaOperativo so;
    private final LocalDate fechaFabricacion;
    private boolean estaEncendida;

    public SmartTV() {
        this("SIN FAMILIA", "SIN MODELO", "SIN RESOLUCION", 0.0F, (byte) 0, new Dimension(), new Fabricante(), SistemaOperativo.ANDROID_TV);
    }

    public SmartTV(String familia, String modelo, String resolucion, float pulgadas, byte peso, Dimension dimension,
                   Fabricante fabricante, SistemaOperativo so) {
        this.familia = familia;
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.pulgadas = pulgadas;
        this.peso = peso;
        this.dimension = dimension;
        this.fabricante = fabricante;
        this.so = so;
        this.fechaFabricacion = LocalDate.now();
        this.estaEncendida = false;
    }

    public SmartTV(String familia, String modelo, String resolucion, float pulgadas, byte peso, Dimension dimension,
                   Fabricante fabricante, SistemaOperativo so, LocalDate fechaFabricacion) {
        this.familia = familia;
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.pulgadas = pulgadas;
        this.peso = peso;
        this.dimension = dimension;
        this.fabricante = fabricante;
        this.so = so;
        this.fechaFabricacion = fechaFabricacion;
        this.estaEncendida = false;
    }

    public String getFamilia() {
        return familia;
    }

    public SistemaOperativo getSo() {
        return so;
    }

    public void encender(){
        this.estaEncendida = true;
        System.out.println("Encendiendo " + this.modelo + "...");
    }

    public void apagar(){
        this.estaEncendida = false;
        System.out.println("Apagando " + this.modelo + "...");
    }

    @Override
    public String toString() {
        return "SmartTV{" +
                "familia='" + familia + '\'' +
                ", modelo='" + modelo + '\'' +
                ", resolucion='" + resolucion + '\'' +
                ", pulgadas=" + pulgadas +
                ", peso=" + peso +
                ", dimension=" + dimension +
                ", fabricante=" + fabricante +
                ", so=" + so +
                ", fechaFabricacion=" + fechaFabricacion +
                '}';
    }
}
