package controller;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import model.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import model.Empleado;
import model.Instructor;
import model.Monitor;

/**
 *
 * @author migue
 */
public class Conexion {

    Empleado persona;
    String rol;

    Conexion(Empleado persona, String rol) {
        this.persona = persona;
        this.rol = rol;
    }

    void Escribir() throws IOException {
        System.out.println("Esta llegando a la conexion");
        FileWriter archivo = new FileWriter("ficheros//" + rol + ".txt",true);
        archivo.write(persona.getCedula() + "--" + persona.getNombre() + "--" + persona.getTelefono() + "--"
                + persona.getFechaNacimiento() + "--" + persona.getDireccion() + "--" + persona.getCorreo());
        archivo.write("\n");
        archivo.close();
    }

    ArrayList Buscar(String cedula, String rol) throws IOException {

        BufferedReader almacen = new BufferedReader(new FileReader("ficheros//" + rol + ".txt"));
        String linea;
        ArrayList<String> datos = new ArrayList<>();

        while ((linea = almacen.readLine()) != null) {

            if (linea.contains(cedula)) {
                String[] partes = linea.split("--");
                for (int i = 0; i < 6; i++) {
                    datos.add(partes[i]);
                }
            } else {
                datos.add(null);
            }
        }
        return datos;
    }

    void Borrar(String cedula, String rol) throws IOException {
        
    File archivo = new File("ficheros//" + rol + ".txt");
    
 
    
        ArrayList<Empleado> persona = new ArrayList<Empleado>();
        Empleado aux;
        BufferedReader almacen = new BufferedReader(new FileReader("ficheros//" + rol + ".txt"));
        String linea;
        while ((linea = almacen.readLine()) != null) {
            
            String[] partes = linea.split("--");
            aux = new Empleado(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5]);
            persona.add(aux);
        }
        for (int i = 0; i < persona.size(); i++) {
            System.out.println(cedula);
            if (persona.get(i).getCedula().equals(cedula)) {
                System.out.println("Entra if"+persona.get(i).getCedula());
                persona.remove(i);
            }
        }
        
       for (int i = 0; i < persona.size(); i++) {
             archivo.write(persona.get(i).getCedula() + "--" + persona.get(i).getNombre() + "--" + persona.get(i).getTelefono() + "--"
                + persona.get(i).getFechaNacimiento() + "--" + persona.get(i).getDireccion() + "--" + persona.get(i).getCorreo());
        archivo.write("\n");
        }
        archivo.close();
    }

}
