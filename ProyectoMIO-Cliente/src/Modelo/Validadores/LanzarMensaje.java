package Modelo.Validadores;

import Modelo.Excepciones.MiExcepcion;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * LanzarMensaje
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class LanzarMensaje {

    /**
     * Atributos privados de la clase.
     */
    Component componentePadre;

    public LanzarMensaje(Component componentePadre) {
        this.componentePadre = componentePadre;
    }

    /**
     * displayMessageDialog Metodo encargado de lanzar un mensaje de dialogo.
     *
     * @param mensaje Mensaje.
     * @param titulo Titulo del Frame.
     * @param tipo Tipo de mensaje.
     */
    public void mostrarMessageDialog(String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(this.componentePadre, mensaje, titulo, tipo);
    }

    /**
     * displayConfirmDialog Metodo encargado de desplegar un mensaje de
     * confirmacion.
     *
     * @param mensaje Mensaje
     * @param titulo Titulo del Frame.
     * @return Un entero 0 o 1, dependiendo de si la opcion es si o no.
     */
    public int mostrarConfirmDialog(String mensaje, String titulo) {
        return JOptionPane.showConfirmDialog(this.componentePadre, mensaje, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    /**
     *
     * @param mensaje
     * @param titulo
     * @return
     */
    public String mostrarInputDialog(String mensaje, String titulo) {
        return JOptionPane.showInputDialog(this.componentePadre, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
    }

    /**
     *
     * @return
     */
    public String mostrarPasswordDialog() {
        JLabel jPassword = new JLabel("Contraseña: ");
        JTextField password = new JPasswordField();
        Object[] ob = {jPassword, password};
        int result = JOptionPane.showConfirmDialog(this.componentePadre, ob, "Creación de contraseña.", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return password.getText();
        } else {
            return null;
        }
    }

    /**
     *
     * @param mensaje
     * @param comboBox
     * @param titulo
     * @return
     * @throws Modelo.Excepciones.MiExcepcion
     */
    public Object mostrarJComboDialog(String mensaje, JComboBox comboBox, String titulo) throws MiExcepcion {
        Object[] ob = {mensaje, comboBox};
        int result = JOptionPane.showConfirmDialog(this.componentePadre, ob, titulo, JOptionPane.OK_CANCEL_OPTION);
        switch (result) {
            case JOptionPane.OK_OPTION:
                return comboBox.getSelectedItem();
            case JOptionPane.CANCEL_OPTION:
                throw new MiExcepcion("Acción cancelada por el usuario.");
            default:
                return null;
        }
    }

    /**
     * displayCustomizedComponentDialog Método encargado de lanzar un JDialog
     * customizado. Los componentes que se deseen añadir deben estar en el orden
     * deseado de aparicion.
     *
     * @param componentes
     * @param titulo
     * @throws Modelo.Excepciones.MiExcepcion
     */
    public void mostrarComponentDialogPerzonalizado(Object componentes, String titulo) throws MiExcepcion {
        int result = JOptionPane.showConfirmDialog(this.componentePadre, componentes, titulo, JOptionPane.OK_CANCEL_OPTION);
        switch (result) {
            case JOptionPane.OK_OPTION:
                break;
            case JOptionPane.CANCEL_OPTION:
                throw new MiExcepcion("Acción cancelada por el usuario.");
            default:
                break;
        }

    }
}
