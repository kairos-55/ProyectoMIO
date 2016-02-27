package Main;

import Administrador.Administrador;
import java.io.IOException;

/**
 *
 * MainServidor
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class MainServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Administrador administrador = new Administrador();
            administrador.iniciarServidor();
        } catch (IOException ex) {
            System.out.println(ex.getCause());
        }
    }
    
}