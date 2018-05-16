package prog2.estudiantes.menu;

import prog2.estudiantes.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuBucle implements Menu {
    private Menu menu;

    public MenuBucle(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String getNombre() {
        return "loop";
    }

    @Override
    public boolean seleccionar(ArrayList<Estudiante> registro, Scanner scanner) {
        while(menu.seleccionar(registro, scanner));
        return false;
    }
}
