/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author
 ** Miguel Angel Naranjo Joya
 ** Laura Andrea Riobueno Rincon
 ** Cristian Camilo Tuso Mozo
 * 
 * @version 1.0 23/02/2024
 * 
 */
public abstract class Empleado {
    
    private String cedula;
    private String nombre;
    private String telefono;
    private Date fechaNacimiento;
    private String direccion;
    private String correo;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");


    public Empleado(String cedula, String nombre, String telefono, Date fechaNacimiento, String direccion, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.correo = correo;
    }
    public Empleado(){
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
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

    public Empleado cargar(BufferedReader almacen) {
                
		try {
			cedula = almacen.readLine();
			nombre = almacen.readLine();
			telefono = almacen.readLine();
			fechaNacimiento = formato.parse(almacen.readLine());
			direccion=almacen.readLine();
			correo=almacen.readLine();
			
			return new Empleado(cedula,nombre,telefono,fechaNacimiento,direccion,correo) {};// Se retorna un nueo objeto como un constructor
		} catch (Exception e) {

		}
		return null;
    }
    
}
