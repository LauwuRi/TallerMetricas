package controller;

import view.VentanaInicial;
import view.VentanaPrincipal;

/**
 * Clase que inicia la ejecucion del codigo
 * @author * Miguel Angel Naranjo Joya * Laura Andrea Riobueno Rincon * Cristian
 * Camilo Tuso Mozo
 *
 * @version 2.0 25/02/2024
 *
 */
public class Main {

    
    public static void main(String[] args) {
        VentanaInicial inicial = new VentanaInicial();
        inicial.setVisible(true);
        VentanaPrincipal principal = new VentanaPrincipal();
        principal.setVisible(false);
        Editor control = new Editor(inicial, principal);
    }

}
