package prog2.estudiantes.menu;

import prog2.estudiantes.Estudiante;

import java.util.*;

public class MenuInicio implements Menu {

    private List<Menu> opciones = Arrays.asList(new MenuCrearEstudiante(), new MenuListarEstudiantes(), new MenuEditarEstudiante(), new MenuBorrarEstudiante(), new MenuBuscarEstudiante(), new MenuSalir());

    @Override
    public String getNombre() {
        return "root";
    }

    @Override
    public boolean seleccionar(ArrayList<Estudiante> registro, Scanner scanner) {
        System.out.println("Menu: ");
        int i = 0;
        for(Menu menu : opciones) {
            System.out.println("\t" + (i+1) + ". " + menu.getNombre());
            i++;
        }
        System.out.print("Introduzca el número de la opción a seleccionar: ");
        String input = scanner.next();
        try {
            i = Integer.parseInt(input);
            if(i < 1 || i > opciones.size()) i = -1;
        } catch(NumberFormatException x) {
            i = -1;
        }
        if(i == -1) {
            System.out.println("'" + input + "' no es un valor válido");
        } else {
            Menu opcion = opciones.get(i-1);
            return opcion.seleccionar(registro, scanner);
        }
        return true;
    }
}
