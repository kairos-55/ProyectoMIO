package ConnectionManagement;

import Model.Messages.Reply;
import Model.Exceptions.MyException;

/**
 *
 * ErrorHandler
 * 17/01/2016
 * @author Alvaro Jose Lobaton Restrepo
 */
public class ErrorHandler {
    
    public void  manageReply(Reply reply) throws MyException {
        switch(reply.getErrorCode()) {
            case 0: // En caso de que la transacción haya tenido exito.
                break;
            case 1: // En caso de que la transacción NO haya tenido exito.
                throw new MyException("Error: " + reply.getErrorCode() + " al realizar transaccion:\n" + reply.getState());
            default:
                break;
        }
    }
}
