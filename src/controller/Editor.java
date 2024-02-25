package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private String rol;
    public Editor(VentanaInicial ventana, VentanaPrincipal ventanaDatos) {
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
        this.wdPrincipal.jTFNombre.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				char d;
				d = Character.toLowerCase(c);
				if ((d < 'a' || d > 'z')) {
					if (d == ' ') {// Se consume sino son letras
					} else {
						e.consume();
					}

				}

			}
		});
        this.wdPrincipal.jTFTelefono.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if ((c < '0' || c > '9')) {// Se consume sino son números
					e.consume();
				} else {
					if (wdPrincipal.jTFTelefono.getText().length() > 9) {// Se limita el numero de caracteres
						e.consume();
					}
				}


			}
		}
        
        );
         this.wdPrincipal.jTFCedula.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if ((c < '0' || c > '9')) {// Se consume sino son números
					e.consume();
				} else {
					if (wdPrincipal.jTFCedula.getText().length() > 9) {// Se limita el numero de caracteres
						e.consume();
					}
				}


			}
		});
          this.wdPrincipal.jTFFechaNacimiento.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if ((c < '0' || c > '9')&&(c!='/')) {// Se consume sino son números o /
					e.consume();
				} else {
					if (wdPrincipal.jTFFechaNacimiento.getText().length() > 9) {// Se limita el numero de caracteres
						e.consume();
					}
				}


			}
		});
        
    }
    
    private void crearEmpleado() throws ParseException, IOException{
        String nombre = this.wdPrincipal.jTFNombre.getText();
        String cedula = this.wdPrincipal.jTFCedula.getText();
        String telefono = this.wdPrincipal.jTFTelefono.getText();
        String direccion = this.wdPrincipal.jTFDireccion.getText();
        String email = this.wdPrincipal.jTFCorreo.getText();
        String fNacimiento = this.wdPrincipal.jTFFechaNacimiento.getText();
        
        
        if(comprobarCreacion(nombre,cedula,telefono,direccion,email,fNacimiento)){
            
          Empleado persona;
            if(rol.equals("Monitor")){
                System.out.print("Esta llegando");
                  persona = new Monitor(cedula,nombre,telefono,fNacimiento,direccion,email);
                  Conexion alFichero = new Conexion(persona,"Monitor");
                  alFichero.Escribir();
            }else if(rol.equals("Instructor")){
                persona = new Instructor(cedula,nombre,telefono,fNacimiento,direccion,email);
                  Conexion alFichero = new Conexion(persona,"Instructor");
                  alFichero.Escribir();
            }
        }else {
            this.wdPrincipal.showMsg("Datos incompletos");
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
            try {
                
                crearEmpleado();
            } catch (ParseException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == this.wdPrincipal.jBTNBack) {
         
           wdPrincipal.setVisible(false);
            wdInicial.setVisible(true);

        }
       
       
    }
}