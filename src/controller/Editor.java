/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import view.VentanaInicial;
import view.VentanaPrincipal;
import model.Empleado;
import model.Instructor;
import model.Monitor;

/**
 * @author
 ** Miguel Angel Naranjo Joya
 ** Laura Andrea Riobueno Rincon
 ** Cristian Camilo Tuso Mozo
 * 
 * @version 1.0 23/02/2024
 * 
 */
public class Editor implements ActionListener{
    

     private VentanaInicial wdInicial;
    private VentanaPrincipal wdPrincipal;
    private Scanner scanner;
    private int id;
    private String rol;

    public Editor(VentanaInicial ventana, VentanaPrincipal ventanaDatos) {
        scanner = new Scanner(System.in);
        this.wdInicial = ventana;
        this.wdPrincipal = ventanaDatos;
        inicializadorBotones();
    }

    private void inicializadorBotones() {
        this.wdInicial.jBTNInstructor.addActionListener((ActionListener) this);
        this.wdInicial.jBTNMonitor.addActionListener((ActionListener) this);

        this.wdPrincipal.jBtnCrear.addActionListener((ActionListener) this);
        this.wdPrincipal.jbtnBuscar.addActionListener((ActionListener) this);
        this.wdPrincipal.jbtnEliminar.addActionListener((ActionListener) this);
        this.wdPrincipal.jbtnModificar.addActionListener((ActionListener) this);
        this.wdPrincipal.jBTNBack.addActionListener((ActionListener) this);
        this.wdPrincipal.jBTNMostrar.addActionListener((ActionListener) this);
    }
    private void crearEmpleado(){
        String nombre = this.wdPrincipal.jTFNombre.getText();
        String cedula = this.wdPrincipal.jTFCedula.getText();
        String telefono = this.wdPrincipal.jTFTelefono.getText();
        String direccion = this.wdPrincipal.jTFDireccion.getText();
        String email = this.wdPrincipal.jTFCorreo.getText();
        String fNacimiento = this.wdPrincipal.jTFFechaNacimiento.getText();
        if(comprobarCreacion(nombre,cedula,telefono,direccion,email,fNacimiento)){
            
        }
    }
    private boolean comprobarCreacion(String nomb, String ced, String tel, String dir, String email, String fecha){
        boolean aux=(nomb.equals("") || tel.equals("") || dir.equals("")
                || fecha.equals("") || email.equals("")||ced.equals(""));
        aux=!aux;
        return aux;
    }
     public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.wdInicial.jBTNInstructor) {
            this.wdInicial.setVisible(false);
            this.wdPrincipal.setVisible(true);
            this.wdPrincipal.jPBackground.setBackground(new Color(102, 153, 255));
            this.wdPrincipal.jLTitulo.setText("Manejo datos de instructores");
            this.rol = "Instructor";
        }
        if (e.getSource() == this.wdInicial.jBTNMonitor) {
            this.wdInicial.setVisible(false);
            this.wdPrincipal.setVisible(true);
            this.wdPrincipal.jPBackground.setBackground(new Color(102, 153, 255));
            this.wdPrincipal.jLTitulo.setText("Manejo datos de monitores");
            this.rol = "Monitor";
        }
        if(e.getSource()==this.wdPrincipal.jBtnCrear){
            crearEmpleado();
        }
        if (e.getSource() == this.wdPrincipal.jBTNBack) {
         
           wdPrincipal.setVisible(false);
            wdInicial.setVisible(true);

        }
       
       
    }
}