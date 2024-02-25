package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import model.Empleado;

/**
 *
 * @author migue
 */
public class Conexion {
    Empleado persona;
    String rol;
    Conexion(Empleado persona, String rol){
        this.persona=persona;
        this.rol=rol;
    }
     void Escribir() throws IOException{
        System.out.println("Esta llegando a la conexion");
        FileWriter archivo = new FileWriter("ficheros//"+rol+".txt");
        archivo.write(persona.getCedula()+"--"+persona.getNombre()+"--"+persona.getTelefono()+"--"+
                persona.getFechaNacimiento()+"--"+persona.getDireccion()+"--"+persona.getCorreo());
        archivo.close();
    }
}
