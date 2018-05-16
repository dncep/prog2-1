package prog2.estudiantes.menu;

import prog2.estudiantes.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuEditarEstudiante implements Menu {
    @Override
    public String getNombre() {
        return "Editar estudiante";
    }

    @Override
    public boolean seleccionar(ArrayList<Estudiante> registro, Scanner scanner) {
        return true;
    }
}
