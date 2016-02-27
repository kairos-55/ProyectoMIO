package Main;

import GUI.PaquetePrincipal.VentanaPrincipal;
import AdministradorConexion.*;
import Model.Messages.Reply;
import Model.Messages.Request;
import java.io.IOException;

/**
 *
 * MainCliente
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class MainCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdministradorCliente admin = new AdministradorCliente();
        
              
                String sqlStatement = "SELECT placa FROM bus;";
                Request request = new Request();
        request.setType("QUERY");
        request.setSqlRequest(sqlStatement);
                request.setColumns(1);
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(); 
        
    }
    
}
