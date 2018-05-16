package prog2.estudiantes.menu;

import prog2.estudiantes.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuBorrarEstudiante implements Menu {
    @Override
    public String getNombre() {
        return "Borrar estudiante";
    }

    @Override
    public boolean seleccionar(ArrayList<Estudiante> registro, Scanner scanner) {
        return true;
    }
}
