package prog2.estudiantes;

import prog2.estudiantes.menu.MenuBucle;
import prog2.estudiantes.menu.MenuInicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuBucle bucle = new MenuBucle(new MenuInicio());
        bucle.seleccionar(new ArrayList<>(), new Scanner(System.in));
    }
}
