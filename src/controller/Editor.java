/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
public class Editor {
    
//    ArrayList<Monitor> listaMonitores = new ArrayList();
 //   ArrayList<Instructor> listaInstructor = new ArrayList();
    ArrayList<Empleado> List = new ArrayList();
    public void cargar(String rol) throws IOException{
        Empleado per,aux;
        File archivo = new File("ficheros\\"+rol+".txt");
        if(!archivo.exists()){
            archivo.createNewFile();
            
        }
		FileReader leer;
		BufferedReader Almacen;
                if(rol=="Monitor"){
                    
                per = new Monitor();
                aux= new Monitor();
                }else{
                    per = new Instructor();
                    aux = new Instructor();
                }
                try {
			leer = new FileReader(archivo);
			Almacen = new BufferedReader(leer);
			per = aux.cargar(Almacen); //ESTA LINEA
			while (per != null) {
				List.add(per);
				per = aux.cargar(Almacen);
			}
			Almacen.close();
			leer.close();
		} catch (Exception e) {

		}
                
    };
}