public class Dimension {
    private float alto;
    private float largo;
    private float ancho;

    public Dimension() {
        this(0.0f, 0.0f, 0.0f);
    }

    public Dimension(float alto, float largo, float ancho) {
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "alto=" + alto +
                ", largo=" + largo +
                ", ancho=" + ancho +
                '}';
    }
}
