package prog2.estudiantes.data;

public enum Estado {
    NUEVO("Nuevo"),
    ACTIVO("Activo"),
    A_PRUEBA_ACADEMICA("A prueba académica"),
    INACTIVO("Inactivo");

    private String legible;

    Estado(String legible) {
        this.legible = legible;
    }



    @Override
    public String toString() {
        return legible;
    }
}
