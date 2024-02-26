package model;

import java.io.BufferedReader;

/**
 * @author * Miguel Angel Naranjo Joya * Laura Andrea Riobueno Rincon * Cristian
 * Camilo Tuso Mozo
 *
 * @version 1.0 23/02/2024
 *
 */
public class Empleado {

    private String cedula;
    private String nombre;
    private String telefono;
    private String fechaNacimiento;
    private String direccion;
    private String correo;

    public Empleado(String cedula, String nombre, String telefono, String fechaNacimiento, String direccion, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.correo = correo;
    }

    public Empleado() {
    }

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
