package prog2.estudiantes.menu;

import prog2.estudiantes.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public interface Menu {
    String getNombre();
    boolean seleccionar(ArrayList<Estudiante> registro, Scanner scanner);
}
