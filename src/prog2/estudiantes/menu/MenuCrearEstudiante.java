package prog2.estudiantes.menu;

import prog2.estudiantes.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCrearEstudiante implements Menu {
    @Override
    public String getNombre() {
        return "Crear estudiante";
    }

    @Override
    public boolean seleccionar(ArrayList<Estudiante> registro, Scanner scanner) {
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = Entrada.getString("Introduzca el nombre", scanner);
        estudiante.apellido = Entrada.getString("Introduzca el apellido", scanner);
        estudiante.fechaNacimiento = Entrada.getFecha("Introduzca la fecha de nacimiento", scanner);
        estudiante.estado = Entrada.getEstado("Introduzca el estado del estudiante", scanner);
        estudiante.id = Entrada.getInt("Introduzca el ID o matrícula del estudiante", scanner, n -> n >= 0);
        estudiante.carrera = Entrada.getCarrera("Introduzca la carrera del estudiante", scanner);
        estudiante.cedula = Entrada.getCedula("Introduzca la cédula del estudiante", scanner);
        estudiante.esExtranjero = Entrada.getBoolean("El estudiante es extranjero", scanner);
        registro.add(estudiante);
        System.out.println("Estudiante " + estudiante.nombre + " " + estudiante.apellido + " (" + estudiante.id + ") ha sido registrado correctamente");
        return true;
    }
}
