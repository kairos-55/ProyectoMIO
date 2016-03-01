package GUI.Fondo;

import java.awt.*;
import javax.swing.*;

/**
 *
 * JPFondo
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public final class JPFondo extends JPanel {

    private Image imagenFondo;

    /**
     * Método encargado de asignar una imagen a un panel
     *
     * @param nombreImagen String ruta de la ubicacion de la imagen
     */
    public JPFondo(String nombreImagen) {
        super();
        setOpaque(false);
        setImagenFondo(new ImageIcon(nombreImagen).getImage());
        setLayout(new BorderLayout());
    }

    /**
     * Método encargado cargar la imagen
     *
     * @param imagenFondo objeto de la clase Image.
     */
    public void setImagenFondo(Image imagenFondo) {
        this.imagenFondo = imagenFondo;
    }

    /**
     * Método encargado de pintar la imagen en el panel
     *
     * @param g objeto de la clase graphics.
     */
    @Override
    public void paint(Graphics g) {
        if (imagenFondo != null) {
            g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
        }
        super.paint(g);
    }
}
