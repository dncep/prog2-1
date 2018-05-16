package prog2.estudiantes.menu;

import prog2.estudiantes.Estudiante;
import prog2.estudiantes.RegistroEstudiantes;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCrearEstudiante implements Menu {
    @Override
    public String getNombre() {
        return "Crear estudiante";
    }

    @Override
    public boolean seleccionar(ArrayList<Estudiante> registro, Scanner scanner) {
        return true;
    }
}
