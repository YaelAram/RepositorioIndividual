public enum SistemaOperativo {
    APPLE_TV("Apple TV", "1.0.0", "Apple"),
    ANDROID_TV("Android TV", "1.0.0", "Google");

    private final String nombre;
    private final String version;
    private final String desarrollador;

    SistemaOperativo(String nombre, String version, String desarrollador) {
        this.nombre = nombre;
        this.version = version;
        this.desarrollador = desarrollador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    @Override
    public String toString() {
        return "SistemaOperativo{" +
                "nombre='" + nombre + '\'' +
                ", version='" + version + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                '}';
    }
}
