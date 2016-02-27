package AdministradorConexion;

import Model.Messages.Reply;
import Modelo.Excepciones.MiExcepcion;

/**
 *
 * ManejadorErrores
 17/01/2016
 * @author Alvaro Jose Lobaton Restrepo
 */
public class ManejadorErrores {
    
    public void  respuesta(Reply reply) throws MiExcepcion {
        switch(reply.getErrorCode()) {
            case 0: // En caso de que la transacción haya tenido éxito.
                break;
            case 1: // En caso de que la transacción NO haya tenido éxito.
                throw new MiExcepcion("Error: " + reply.getErrorCode() + " al realizar transacción:\n" + reply.getState());
            default:
                break;
        }
    }
}
