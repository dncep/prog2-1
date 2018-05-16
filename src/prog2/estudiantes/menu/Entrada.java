package prog2.estudiantes.menu;

import prog2.estudiantes.data.Carrera;
import prog2.estudiantes.data.Cedula;
import prog2.estudiantes.data.Estado;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Scanner;
import java.util.function.Predicate;

public class Entrada {

    private static final Collection<String> VALORES_VERDADEROS = Arrays.asList("SI", "SÍ", "S", "V", "VERDADERO", "T", "Y", "TRUE", "YES");
    private static final Collection<String> VALORES_FALSOS = Arrays.asList("NO", "N", "F", "FALSO", "FALSE");

    public static String getString(String instruccion, Scanner scanner) {
        while(true) {
            System.out.print(instruccion + ": ");
            String input = scanner.nextLine();
            if(input.trim().length() > 0) {
                return input;
            } else {
                System.out.println("Entrada '" + input + "' inválida");
            }
        }
    }

    public static Calendar getFecha(String instruccion, Scanner scanner) {
        System.out.println(instruccion + ": ");
        int a = getInt("\tIntroduzca el año", scanner, n -> (n > 0 & n <= Calendar.getInstance().get(Calendar.YEAR)));
        boolean bisiesto = (a % 4 == 0) && (a % 100 != 0 || a % 400 == 0);
        int m = getInt("\tIntroduzca el mes (01-12)", scanner, n -> (n >= 1 && n <= 12));
        int d = getInt("\tIntroduzca el día del mes", scanner, n -> n >= 1 && n <= ((m == 2) ? (bisiesto ? 29 : 28) : (30 + ((m <= 7) ? (n % 2) : ((n+1) % 2)))));
        Calendar date = Calendar.getInstance();
        date.set(a, m-1, d);
        return date;
    }

    public static int getInt(String instruccion, Scanner scanner, Predicate<Integer> validacion) {
        while(true) {
            System.out.print(instruccion + ": ");
            String input = scanner.nextLine();
            try {
                int n = Integer.parseInt(input);
                if(validacion.test(n)) {
                    return n;
                }
            } catch(NumberFormatException x) {
                //Salta fuera del catch y muestra un error
            }
            System.out.println("Entrada '" + input + "' inválida");
        }
    }

    public static Cedula getCedula(String instruccion, Scanner scanner) {
        while(true) {
            System.out.print(instruccion + ": ");
            String input = scanner.nextLine();

            Cedula cedula = Cedula.crearCedula(input);
            if(cedula != null) {
                return cedula;
            } else {
                System.out.println("Entrada '" + input + "' inválida");
            }
        }
    }

    public static boolean getBoolean(String instruccion, Scanner scanner) {
        while(true) {
            System.out.print(instruccion + ": ");
            String input = scanner.nextLine().trim().toUpperCase();

            if(VALORES_VERDADEROS.contains(input)) return true;
            else if(VALORES_FALSOS.contains(input)) return false;
            else System.out.println("Entrada '" + input + "' inválida");;
        }
    }

    public static Estado getEstado(String instruccion, Scanner scanner) {
        while(true) {
            System.out.print(instruccion + ": ");
            String input = scanner.nextLine().trim().toUpperCase();

            for(Estado estado : Estado.values()) {
                if(estado.toString().toUpperCase().equals(input)) return estado;
            }

            System.out.println("Entrada '" + input + "' inválida");;
        }
    }

    public static Carrera getCarrera(String instruccion, Scanner scanner) {
        while(true) {
            System.out.print(instruccion + ": ");
            String input = scanner.nextLine().trim().toUpperCase();

            for(Carrera carrera : Carrera.values()) {
                if(carrera.getCodigo().equals(input) || carrera.getNombre().toUpperCase().equals(input)) return carrera;
            }

            System.out.println("Entrada '" + input + "' inválida");;
        }
    }
}
