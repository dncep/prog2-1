package prog2.estudiantes.menu;

import prog2.estudiantes.Estudiante;

import java.util.ArrayList;
import java.util.Calendar;
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
        for(Estudiante estudiante : registro) {
            System.out.println();
            System.out.println("\t" + estudiante.nombre + " " + estudiante.apellido + " (" + estudiante.id + ")");
            System.out.println("\t\tFecha de nacimiento: " + estudiante.fechaNacimiento.get(Calendar.DAY_OF_MONTH) + "-" + (estudiante.fechaNacimiento.get(Calendar.MONTH)+1) + "-" + estudiante.fechaNacimiento.get(Calendar.YEAR));
            System.out.println("\t\tEstado: " + estudiante.estado);
            System.out.println("\t\tCarrera: " + estudiante.carrera.getNombre() + " (" + estudiante.carrera.getCodigo() + ")");
            System.out.println("\t\tCédula: " + estudiante.cedula);
            System.out.println("\t\tEs extranjero: " + (estudiante.esExtranjero ? "Si" : "No"));
        }
        System.out.println();
        return true;
    }
}
