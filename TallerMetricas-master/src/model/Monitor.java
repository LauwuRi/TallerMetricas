package model;


/**
 * @author
 ** Miguel Angel Naranjo Joya
 ** Laura Andrea Riobueno Rincon
 ** Cristian Camilo Tuso Mozo
 * 
 * @version 1.0 23/02/2024
 * 
 */
public class Monitor extends Empleado{
    
    public Monitor(String cedula, String nombre, String telefono, String fechaNacimiento, String direccion, String correo) {
        super(cedula, nombre, telefono, fechaNacimiento, direccion, correo);
    }
    public Monitor(){
    
    }
    public Monitor(String cedula){
    
    }    
}