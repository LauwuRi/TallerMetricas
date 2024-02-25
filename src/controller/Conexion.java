package controller;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
        FileWriter archivo = new FileWriter("ficheros//"+rol+".txt", true);
        archivo.write(persona.getCedula()+"--"+persona.getNombre()+"--"+persona.getTelefono()+"--"+
                persona.getFechaNacimiento()+"--"+persona.getDireccion()+"--"+persona.getCorreo());
        archivo.write("\n");
        archivo.close();
    }
    
    ArrayList Buscar(String cedula, String rol) throws IOException{
        
        BufferedReader almacen = new BufferedReader(new FileReader("ficheros//"+rol+".txt"));
        String linea;
        ArrayList<String> datos = new ArrayList<>();

        while ((linea = almacen.readLine()) != null) {
            
            if(linea.contains(cedula)){
                String[] partes = linea.split("--");
                for(int i=0; i< 6; i++){
                    datos.add(partes[i]);
                }
           }else{
                datos.add(null);
           }
        }
        return datos;
    }
    
    void Borrar(String cedula, String rol) throws IOException{

    }
    
}
