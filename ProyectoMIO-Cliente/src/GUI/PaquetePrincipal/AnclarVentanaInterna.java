package GUI.PaquetePrincipal;
import javax.swing.*;

/**
 *
 * AnclarVentanaInterna
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class AnclarVentanaInterna extends JInternalFrame {

    // Atributos privados de la clase.
    private boolean bloqueada;

    // Para hacer el InternalFrame Modal...

    /**
     * ModalInternalFrame
     */
    public AnclarVentanaInterna() {
        this.bloqueada = false;
    }
    // Para inmovilizar el InternalFrame 

    @Override
    public void reshape(int x, int y, int width, int height) {
        if (!bloqueada) {
            super.reshape(x, y, width, height);
        }
    }

    public boolean isLocked() {
        return bloqueada;
    }

    public void setLocked(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }
}
