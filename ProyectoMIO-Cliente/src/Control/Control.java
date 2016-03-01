package Control;

import AdministradorConexion.AdministradorCliente;
import AdministradorConexion.ManejadorErrores;

/**
 *
 * Control
 * 27/01/2016
 * @author Alvaro Jose Lobaton Restrepo
 */
public class Control {
    protected final AdministradorCliente administradorCliente;
    protected final ManejadorErrores manejadorErrores;
    protected String sqlStatement;
    
    protected Control() {   
        administradorCliente = new AdministradorCliente();
        manejadorErrores = new ManejadorErrores();
    }
}
