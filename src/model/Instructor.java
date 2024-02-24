/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
public class Instructor extends Empleado{
    
    public Instructor(String cedula, String nombre, String telefono, Date fechaNacimiento, String direccion, String correo) {
        super(cedula, nombre, telefono, fechaNacimiento, direccion, correo);
    }
    
}
