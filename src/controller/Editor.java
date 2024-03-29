package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import view.VentanaInicial;
import view.VentanaPrincipal;
import model.Empleado;
import model.Instructor;
import model.Monitor;

/**
 * Clase encargada de controlar el funcionamiento de los elementos de la vista
 *
 * @author * Miguel Angel Naranjo Joya * Laura Andrea Riobueno Rincon * Cristian
 * Camilo Tuso Mozo
 *
 * @version 2.0 25/02/2024
 *
 */
public class Editor implements ActionListener {

    //Se crean instancias de las dos ventanas del programa
    private VentanaInicial wdInicial;
    private VentanaPrincipal wdPrincipal;
    private String rol;

    /**
     * //Metodo constructor de la clase Editor
     *
     * @param ventana es un objeto que presenta toda la interfaz inicial
     * @param ventanaDatos es un objeto que presenta toda la interfaz principal
     */
    public Editor(VentanaInicial ventana, VentanaPrincipal ventanaDatos) {
        this.wdInicial = ventana;
        this.wdPrincipal = ventanaDatos;
        inicializadorBotones();
    }

    /**
     * Metodo que inicializa los listeners de los botones y de los campos de
     * texto
     */
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

                if ((c < '0' || c > '9') && (c != '/')) {// Se consume sino son números o /
                    e.consume();
                } else {
                    if (wdPrincipal.jTFFechaNacimiento.getText().length() > 9) {// Se limita el numero de caracteres
                        e.consume();
                    }
                }

            }
        });

    }

    /**
     * Metodo que crear el empleado con base en los campos de texto de la
     * ventanaPrincipal
     */
    private void crearEmpleado() throws ParseException, IOException {
        String nombre = this.wdPrincipal.jTFNombre.getText();
        String cedula = this.wdPrincipal.jTFCedula.getText();
        String telefono = this.wdPrincipal.jTFTelefono.getText();
        String direccion = this.wdPrincipal.jTFDireccion.getText();
        String email = this.wdPrincipal.jTFCorreo.getText();
        String fNacimiento = this.wdPrincipal.jTFFechaNacimiento.getText();

        if (comprobarCreacion(nombre, cedula, telefono, direccion, email, fNacimiento)) {
            Empleado persona;
            /*if(leerEmpleado(cedula)){
                
            }*/
            if (rol.equals("Monitor")) {
                System.out.print("Esta llegando");
                persona = new Monitor(cedula, nombre, telefono, fNacimiento, direccion, email);
                Conexion alFichero = new Conexion(persona, "Monitor");
                alFichero.Escribir();
            } else if (rol.equals("Instructor")) {
                persona = new Instructor(cedula, nombre, telefono, fNacimiento, direccion, email);
                Conexion alFichero = new Conexion(persona, "Instructor");
                alFichero.Escribir();
            }
        } else {
            this.wdPrincipal.showMsg("Datos incompletos");
        }
    }

    /**
     * Metodo que comprueba que los datos no esten vacios a la hora de crear el
     * empleado
     *
     * @param nomb string que contiene el nombre de un empleado
     * @param ced string que contiene la cedula de un empleado
     * @param tel string que contiene el telefono de un empleado
     * @param dir string que contiene el direccion de un empleado
     * @param tel string que contiene el email de un empleado
     * @param tel string que contiene el fecha de un empleado
     * @return aux un booleano para comprobar la veracidad de la creacion
     */

    private boolean comprobarCreacion(String nomb, String ced, String tel, String dir, String email, String fecha) {
        boolean aux = (nomb.equals("") || tel.equals("") || dir.equals("")
                || fecha.equals("") || email.equals("") || ced.equals(""));
        aux = !aux;
        return aux;
    }

    // Metodo que limpia los campos de texto que el usuario ingresa
    public void LimpiarCampos() {
        wdPrincipal.jTFNombre.setText("");
        wdPrincipal.jTFCedula.setText("");
        wdPrincipal.jTFTelefono.setText("");
        wdPrincipal.jTFCorreo.setText("");
        wdPrincipal.jTFDireccion.setText("");
        wdPrincipal.jTFFechaNacimiento.setText("");

    }

    /**
     * Metodo que pasa los datos de un ArrayList a un objeto tabla de la
     * interfaz
     * @param datos string que contiene un arreglo con los datos de una persona
     */
    public void pasarDatos(ArrayList datos) {
        Object[] personaEnLaTabla = new Object[6];
        personaEnLaTabla[0] = datos.get(0);
        personaEnLaTabla[1] = datos.get(1);
        personaEnLaTabla[2] = datos.get(2);
        personaEnLaTabla[3] = datos.get(3);
        personaEnLaTabla[4] = datos.get(4);
        personaEnLaTabla[5] = datos.get(5);
        this.wdPrincipal.actualizarTabla(personaEnLaTabla);
    }

    //Metodo que pasa los datos de un empleado de un arrayList a una Tabla
    /**
     * 
     * @param datos contiene un arreglo de objetos empleado
     */
   
    public void listarTodo(ArrayList<Empleado> datos) {
        for (int i = 0; i < datos.size(); i++) {
            Object[] personaEnLaTabla = new Object[6];
            personaEnLaTabla[0] = datos.get(i).getCedula();
            personaEnLaTabla[1] = datos.get(i).getNombre();
            personaEnLaTabla[2] = datos.get(i).getTelefono();
            personaEnLaTabla[3] = datos.get(i).getFechaNacimiento();
            personaEnLaTabla[4] = datos.get(i).getDireccion();
            personaEnLaTabla[5] = datos.get(i).getCorreo();
            this.wdPrincipal.actualizarTabla(personaEnLaTabla);
        }
    }

    //Metodo que obtiene los datos de un empleado del fichero
    private void leerEmpleado() throws ParseException, IOException {

        String cedula = this.wdPrincipal.jTFCedula.getText();
        Empleado persona;

        if (rol.equals("Monitor")) {
            persona = new Monitor(cedula);
            Conexion alFichero = new Conexion(persona, "Monitor");
            ArrayList<String[]> datos = new ArrayList<>();
            datos = alFichero.Buscar(cedula, rol);
            if (datos.get(0) == null) {
                wdPrincipal.showMsg("No existe el empleado");
            } else {
                pasarDatos(datos);

            }
        } else if (rol.equals("Instructor")) {
            persona = new Instructor(cedula);
            Conexion alFichero = new Conexion(persona, "Instructor");
            ArrayList<String[]> datos = new ArrayList<>();
            datos = alFichero.Buscar(cedula, rol);
            if (datos.get(0) == null) {
                wdPrincipal.showMsg("No existe el empleado");
            } else {
                pasarDatos(datos);
            }
        }

    }
    //Metodo que obtiene los datos de todos los empleados de un rol del fichero

    private void listarEmpleados() throws ParseException, IOException {

        Conexion alFichero = new Conexion("Monitor");
        ArrayList<Empleado> datos = new ArrayList<>();
        datos = alFichero.Listar(rol);
        if (datos.get(0) == null) {
            wdPrincipal.showMsg("No existe el empleado");
        } else {
            listarTodo(datos);
        }
    }

    //Metodo encargado de borrar un empleado con base en su cedula
    private void borrarEmpleado() throws ParseException, IOException {
        String cedula = this.wdPrincipal.jTFCedula.getText();
        Empleado persona;
        if (rol.equals("Monitor")) {
            persona = new Monitor(cedula);
            Conexion alFichero = new Conexion(persona, "Monitor");
            alFichero.Borrar(cedula, rol);

        } else if (rol.equals("Instructor")) {
            persona = new Instructor(cedula);
            Conexion alFichero = new Conexion(persona, "Instructor");
            alFichero.Borrar(cedula, rol);
        }
    }

    //Metodo que obtiene datos de la vista y los manda a actualizar a la clase conexion
    private void actualizarEmpleado() throws ParseException, IOException {
        String cedula = this.wdPrincipal.jTFCedula.getText();
        String nombre = this.wdPrincipal.jTFNombre.getText();
        String telefono = this.wdPrincipal.jTFTelefono.getText();
        String direccion = this.wdPrincipal.jTFDireccion.getText();
        String email = this.wdPrincipal.jTFCorreo.getText();
        String fNacimiento = this.wdPrincipal.jTFFechaNacimiento.getText();
        Empleado persona;
        if (rol.equals("Monitor")) {
            persona = new Monitor(cedula);
            Conexion alFichero = new Conexion(persona, "Monitor");
            alFichero.Actualizar(cedula, nombre, telefono, fNacimiento, direccion, email);

        } else if (rol.equals("Instructor")) {
            persona = new Instructor(cedula);
            Conexion alFichero = new Conexion(persona, "Instructor");
            alFichero.Actualizar(cedula, nombre, telefono, fNacimiento, direccion, email);
        }
    }

    //Metodo encargado de cambiar las ventanas segun acciones generados por el usuario
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
        if (e.getSource() == this.wdPrincipal.jBtnCrear) {
            try {
                crearEmpleado();
            } catch (ParseException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            LimpiarCampos();
        }
        if (e.getSource() == this.wdPrincipal.jBTNBack) {

            wdPrincipal.setVisible(false);
            wdInicial.setVisible(true);

        }
        if (e.getSource() == this.wdPrincipal.jbtnBuscar) {
            try {
                leerEmpleado();
            } catch (ParseException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == this.wdPrincipal.jbtnEliminar) {
            try {
                borrarEmpleado();
            } catch (ParseException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == this.wdPrincipal.jbtnModificar) {
            try {
                actualizarEmpleado();
            } catch (ParseException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == this.wdPrincipal.jBTNMostrar) {
            try {
                DefaultTableModel temp = (DefaultTableModel) this.wdPrincipal.jTInstructores.getModel();
                for (int i = 0; i < this.wdPrincipal.jTInstructores.getRowCount(); i++) {
                    temp.removeRow(i);
                    i -= 1;
                }
                listarEmpleados();
            } catch (ParseException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
