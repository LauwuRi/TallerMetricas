package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import model.Empleado;

/**
 * @author * Miguel Angel Naranjo Joya * Laura Andrea Riobueno Rincon * Cristian
 * Camilo Tuso Mozo
 *
 * @version 1.0 23/02/2024
 *
 */
public class Conexion {

    Empleado persona;
    String rol;

    Conexion(Empleado persona, String rol) {
        this.persona = persona;
        this.rol = rol;
    }

    Conexion(String monitor) {
        this.rol = rol;
    }

    void Escribir() throws IOException {
        System.out.println("Esta llegando a la conexion");
        FileWriter archivo = new FileWriter("ficheros//" + rol + ".txt", true);
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
            if (persona.get(i).getCedula().equals(cedula)) {
                persona.remove(i);
            }
        }

        almacen.close();
        Writer archivo = new FileWriter("ficheros//" + rol + ".txt", false);

        for (int i = 0; i < persona.size(); i++) {

            System.out.println(persona.get(i).getCedula());

            archivo.write(persona.get(i).getCedula() + "--" + persona.get(i).getNombre() + "--" + persona.get(i).getTelefono() + "--"
                    + persona.get(i).getFechaNacimiento() + "--" + persona.get(i).getDireccion() + "--" + persona.get(i).getCorreo());
            archivo.write("\n");
        }
        archivo.close();
    }

    ArrayList Listar(String rol) throws IOException {

        ArrayList<Empleado> persona = new ArrayList<Empleado>();
        Empleado aux;
        BufferedReader almacen = new BufferedReader(new FileReader("ficheros//" + rol + ".txt"));
        String linea;

        while ((linea = almacen.readLine()) != null) {
            String[] partes = linea.split("--");
            aux = new Empleado(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5]);
            persona.add(aux);
        }
        return persona;
    }

    void Actualizar(String cedula, String nombre, String telefono, String fechaNacimiento, String direccion, String correo) throws IOException {

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
            if (persona.get(i).getCedula().equals(cedula)) {
                if (!nombre.equals("")) {
                    persona.get(i).setNombre(nombre);
                }
                if (!telefono.equals("")) {
                    persona.get(i).setTelefono(telefono);
                }
                if (!fechaNacimiento.equals("")) {
                    persona.get(i).setFechaNacimiento(fechaNacimiento);
                }
                if (!direccion.equals("")) {
                    persona.get(i).setDireccion(direccion);
                }
                if (!correo.equals("")) {
                    persona.get(i).setCorreo(correo);
                }
            }
        }

        almacen.close();
        Writer archivo = new FileWriter("ficheros//" + rol + ".txt", false);

        for (int i = 0; i < persona.size(); i++) {

            System.out.println(persona.get(i).getCedula());

            archivo.write(persona.get(i).getCedula() + "--" + persona.get(i).getNombre() + "--" + persona.get(i).getTelefono() + "--"
                    + persona.get(i).getFechaNacimiento() + "--" + persona.get(i).getDireccion() + "--" + persona.get(i).getCorreo());
            archivo.write("\n");
        }
        archivo.close();
    }

}
