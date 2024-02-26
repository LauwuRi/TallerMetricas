package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import model.Empleado;

/**
 * Clase encargada de otorgar funciones CRUD para guardar informacion en
 * ficheros
 *
 * @author * Miguel Angel Naranjo Joya * Laura Andrea Riobueno Rincon * Cristian
 * Camilo Tuso Mozo
 *
 * @version 2.0 25/02/2024
 *
 */
public class Conexion {

    Empleado persona;
    String rol;

    /**
     * @param persona es un objeto tipo Empleado que viene con sus atributos
     * @param rol es un string que puede ser Monitor o Instructor
     */
    Conexion(Empleado persona, String rol) {
        this.persona = persona;
        this.rol = rol;
    }

    /**
     * @param monitor es un string que puede ser Monitor o Instructor
     */
    Conexion(String monitor) {
        this.rol = rol;
    }

    /**
     * Metodo encargado de escribir en un fichero los datos de un empleado
     */
    void Escribir() throws IOException {
        System.out.println("Esta llegando a la conexion");
        FileWriter archivo = new FileWriter("ficheros//" + rol + ".txt", true);
        archivo.write(persona.getCedula() + "--" + persona.getNombre() + "--" + persona.getTelefono() + "--"
                + persona.getFechaNacimiento() + "--" + persona.getDireccion() + "--" + persona.getCorreo());
        archivo.write("\n");
        archivo.close();
    }

    /**
     * Metodo encargado de buscar los datos de una persona con su cedula
     *
     * @param cedula es un string que contiene la identificacion del empleado
     * @param rol es un string que puede ser Monitor o Instructor
     * @return Arraylist con los datos de una persona
     */
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

    /**
     * Metodo encargado de buscar y borrar los datos de una persona a partir su
     * cedula
     *
     * @param cedula es un string que contiene la identificacion del empleado
     * @param rol es un string que puede ser Monitor o Instructor
     */
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

    /**
     * Metodo encargado de encontrar y guardar todos los datos de un rol en un
     * fichero
     *
     * @param rol es un string que puede ser Monitor o Instructor
     * @return Arraylist de objetos persona
     */
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

    /**
     * Metodo encargado de actualizar los datos en un fichero revisando que
     * campo de texto necesita un cambio
     *
     *
     * @param cedula es un string que contiene la identificacion del empleado
     * @param nombre es un string que puede contener el nombre del empleado
     * @param telefono es un string que puede contener el telefono del empleado
     * @param fechaNacimiento es un string que puede conetener la fecha de
     * nacimiento del empleado
     * @param direccion es un string que puede contener la direccion del
     * empleado
     * @param correo es un string que puede contener el correo del empleado
     */
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
