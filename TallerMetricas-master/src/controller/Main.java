package controller;

import view.VentanaInicial;
import view.VentanaPrincipal;

/**
 * @author
 ** Miguel Angel Naranjo Joya
 ** Laura Andrea Riobueno Rincon
 ** Cristian Camilo Tuso Mozo
 * 
 * @version 1.0 23/02/2024
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaInicial inicial = new VentanaInicial();
        inicial.setVisible(true);
        VentanaPrincipal principal = new VentanaPrincipal();
        principal.setVisible(false);
        Editor control = new Editor(inicial,principal);
    }
    
}
