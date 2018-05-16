package prog2.estudiantes;

import prog2.estudiantes.data.Carrera;
import prog2.estudiantes.data.Cedula;
import prog2.estudiantes.data.Estado;

import java.util.Calendar;

public class Estudiante {
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    private Estado estado;
    private int id;
    private Carrera carrera;
    private Cedula cedula;
    boolean esExtranjero = false;

    public Estudiante(String nombre, String apellido, Calendar fechaNacimiento, Estado estado, int id, Carrera carrera, Cedula cedula, boolean esExtranjero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.id = id;
        this.carrera = carrera;
        this.cedula = cedula;
        this.esExtranjero = esExtranjero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public void setCedula(Cedula cedula) {
        this.cedula = cedula;
    }

    public boolean esExtranjero() {
        return esExtranjero;
    }

    public void setExtranjero(boolean esExtranjero) {
        this.esExtranjero = esExtranjero;
    }
}
