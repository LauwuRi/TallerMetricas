package model;


/**
 * Clase empleado, la cual define los atributos los roles
 * @author * Miguel Angel Naranjo Joya * Laura Andrea Riobueno Rincon * Cristian
 * Camilo Tuso Mozo
 *
 * @version 2.0 25/02/2024
 *
 */
public class Empleado {

    //Atributos de un empleado
    private String cedula;
    private String nombre;
    private String telefono;
    private String fechaNacimiento;
    private String direccion;
    private String correo;

    //Constructor de un empleado, sus datos
    public Empleado(String cedula, String nombre, String telefono, String fechaNacimiento, String direccion, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.correo = correo;
    }

    //Constructor vacio
    public Empleado() {
    }

    //Metodos getters y setters de cada uno de los atributos
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
