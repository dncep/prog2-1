package prog2.estudiantes.data;

public enum AreaAcademica {
    BASICAS("Ciencias Básicas y Ambientales"),
    SALUD("Ciencias de la Salud"),
    HUMANIDADES("Ciencias Sociales y Humanidades"),
    INGENIERIAS("Ingenierías"),
    ECONOMIA("Economía y Negocios");

    private String nombre;

    AreaAcademica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
