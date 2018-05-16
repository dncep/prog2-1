package prog2.estudiantes.menu;

import prog2.estudiantes.Estudiante;
import prog2.estudiantes.RegistroEstudiantes;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuListarEstudiantes implements Menu {
    @Override
    public String getNombre() {
        return "Listar estudiantes";
    }

    @Override
    public boolean seleccionar(ArrayList<Estudiante> registro, Scanner scanner) {
        if(registro.size() == 0) {
            System.out.println("No hay estudiantes registrados");
            return true;
        }
        System.out.println("Estudiantes registrados (" + registro.size() + "): ");
        System.out.println();
        for(Estudiante estudiante : registro) {
            System.out.println();
            System.out.println("\t" + estudiante.getNombre() + " " + estudiante.getApellido());
            System.out.println("\t\tFecha de nacimiento: " + estudiante.getFechaNacimiento());
            System.out.println("\t\tEstado: " + estudiante.getEstado());
            System.out.println("\t\tID: " + estudiante.getId());
            System.out.println("\t\tCarrera: " + estudiante.getCarrera().getNombre() + " (" + estudiante.getCarrera().getCodigo() + ")");
            System.out.println("\t\tCédula: " + estudiante.getCedula());
            System.out.println("\t\tEs extranjero: " + (estudiante.esExtranjero() ? "Si" : "No"));
        }
        System.out.println();
        return true;
    }
}
