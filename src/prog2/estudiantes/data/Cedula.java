package prog2.estudiantes.data;

import java.util.regex.Pattern;

public class Cedula {
    private static final Pattern REGEX_CEDULA = Pattern.compile("\\d{11}|\\d{3}-\\d{7}-\\d");

    private String cedula;

    private Cedula(String cedula) {
        this.cedula = cedula;
    }

    public static Cedula crearCedula(String input) {
        if(REGEX_CEDULA.matcher(input).matches()) {
            if(input.length() == 11) input = input.substring(0,3) + "-" + input.substring(3,10) + "-" + input.substring(10,11);
            return new Cedula(input);
        }
        return null;
    }

    @Override
    public String toString() {
        return cedula;
    }
}
