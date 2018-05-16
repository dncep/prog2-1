package prog2.estudiantes;

import java.util.ArrayList;

public class RegistroEstudiantes {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public int getCantidad() {
        return estudiantes.size();
    }
}
