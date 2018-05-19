package prog2.estudiantes.menu;

import prog2.estudiantes.Estudiante;
import prog2.estudiantes.data.Cedula;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class MenuBuscarEstudiante implements Menu {
    @Override
    public String getNombre() {
        return "Buscar estudiante";
    }

    @Override
    public boolean seleccionar(ArrayList<Estudiante> estudiantes, Scanner scanner) {
        String busca = Entrada.getString("Introduzca el nombre o cedula", scanner);
        Cedula cedula = Cedula.crearCedula(busca);
        boolean encontrado = false;
        for (Estudiante est : estudiantes) {
            if (est.cedula.equals(cedula) || est.nombre.equalsIgnoreCase(busca) || est.apellido.equalsIgnoreCase(busca)) {
                System.out.println(est.nombre + " " + est.apellido + " (" + est.id + ")");
                System.out.println("Fecha de nacimiento: " + est.fechaNacimiento.get(Calendar.DAY_OF_MONTH) + "-" + (est.fechaNacimiento.get(Calendar.MONTH) + 1) + "-" + est.fechaNacimiento.get(Calendar.YEAR));
                System.out.println("Estado: " + est.estado);
                System.out.println("Carrera: " + est.carrera.getNombre() + " (" + est.carrera.getCodigo() + ")");
                System.out.println("Cédula: " + est.cedula);
                System.out.println("Es extranjero: " + (est.esExtranjero ? "Si" : "No"));
                System.out.println();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado");
        }
        return true;
    }
}