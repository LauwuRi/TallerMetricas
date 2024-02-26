package model;

/**
 * @author * Miguel Angel Naranjo Joya * Laura Andrea Riobueno Rincon * Cristian
 * Camilo Tuso Mozo
 *
 * @version 2.0 25/02/2024
 *
 */
public class Monitor extends Empleado {

     //Constructor de la clase
    public Monitor(String cedula, String nombre, String telefono, String fechaNacimiento, String direccion, String correo) {
        super(cedula, nombre, telefono, fechaNacimiento, direccion, correo);
    }
    //Constructor vacio de la clase
    public Monitor() {

    }
    //Constructor con parametro cedula
    public Monitor(String cedula) {

    }
}
