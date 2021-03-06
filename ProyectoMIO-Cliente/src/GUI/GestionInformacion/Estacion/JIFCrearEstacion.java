package GUI.GestionInformacion.Estacion;

import GUI.PaquetePrincipal.AnclarVentanaInterna;
import Modelo.Validadores.LanzarMensaje;
import Modelo.Excepciones.MiExcepcion;
import Modelo.Validadores.Validador;
import Modelo.Entidades.Empleado;
import Control.ControlEstacion;
import Control.ControlEmpleado;
import Modelo.Entidades.Estacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * JIFCrearEstacion
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class JIFCrearEstacion extends AnclarVentanaInterna {

    /**
     * Creates new form JIFEmployee
     *
     * @param titulo Un string correspondiente al titulo del JInternalFrame
     * @param parent_w
     * @param parent_h
     */
    public JIFCrearEstacion(String titulo, int parent_w, int parent_h) throws MiExcepcion {
        super();
        this.parentWidth = parent_w;
        this.parentHeight = parent_h;
        setTitle(titulo);
        setResizable(false);
        setClosable(true);
        setMaximizable(false);
        setSize(WIDTH_, HEIGHT_);
        setLocation((int) (Math.abs(this.parentWidth - this.getSize().width) / 2), (int) (Math.abs(this.parentHeight - this.getSize().height) / 2));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocked(true);
        // INICIALIZAMOS COMPONENTES
        initComponents();
        // INICIALIZAMOS ATRIBUTOS
        validador = new Validador();
        lanzarMensaje = new LanzarMensaje(this);
        manejadorEventos = new JIFEstacionManejadorEventos();
        controlEstacion = new ControlEstacion();
        controlEmpleado = new ControlEmpleado();
        // CONTROL
        /*setEnabledGeneralDataForm(false);
        setEnabledContractForm(false);
        setEnabledSaveControl(false);*/
        // Definimos el valor de la acción por defecto siempre en -1.
        //action = -1;
        // ACTUALIZAMOS EL COMBOBOX Y SETEAMOS SU ActionListener
        actualizarListaEmpleados();
        jCBCedulaDirector.addActionListener(manejadorEventos);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBotonCrear = new javax.swing.JPanel();
        jBCrearEstacion = new javax.swing.JButton();
        jPInformacionEstacion = new javax.swing.JPanel();
        jLCodigoEstacion = new javax.swing.JLabel();
        jTFCodigoEstacion = new javax.swing.JTextField();
        jLNombreEstacion = new javax.swing.JLabel();
        jTFNombreEstacion = new javax.swing.JTextField();
        jLDireccionEstacion = new javax.swing.JLabel();
        jTFDireccionEstacion = new javax.swing.JTextField();
        jLCedulaDirector = new javax.swing.JLabel();
        jCBCedulaDirector = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(407, 800));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        jPBotonCrear.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBCrearEstacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBCrearEstacion.setText("CREAR ESTACIÓN");
        jBCrearEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearEstacionActionPerformed(evt);
            }
        });
        jPBotonCrear.add(jBCrearEstacion);

        getContentPane().add(jPBotonCrear, java.awt.BorderLayout.PAGE_END);

        jPInformacionEstacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPInformacionEstacion.setLayout(new java.awt.GridLayout(4, 2, 0, 10));

        jLCodigoEstacion.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLCodigoEstacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCodigoEstacion.setText("Código:");
        jPInformacionEstacion.add(jLCodigoEstacion);
        jPInformacionEstacion.add(jTFCodigoEstacion);

        jLNombreEstacion.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLNombreEstacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNombreEstacion.setText("Nombre:");
        jPInformacionEstacion.add(jLNombreEstacion);

        jTFNombreEstacion = new javax.swing.JTextField(20);
        jPInformacionEstacion.add(jTFNombreEstacion);

        jLDireccionEstacion.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLDireccionEstacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDireccionEstacion.setText("Direccion:");
        jPInformacionEstacion.add(jLDireccionEstacion);
        jPInformacionEstacion.add(jTFDireccionEstacion);

        jLCedulaDirector.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLCedulaDirector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCedulaDirector.setText("Cédula Director:");
        jPInformacionEstacion.add(jLCedulaDirector);

        jCBCedulaDirector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPInformacionEstacion.add(jCBCedulaDirector);

        getContentPane().add(jPInformacionEstacion, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * cleanGeneralDataForm.
     */
    private void limpiarCampos() {
                
        jTFCodigoEstacion.setText("");
        jTFNombreEstacion.setText("");
        jTFDireccionEstacion.setText("");
        jCBCedulaDirector.setSelectedIndex(0);
        
    }
    
    /**
     * setEnabledGeneralDataForm
     *
     * @param bool
     */
    private void setEnabledGeneralDataForm(boolean bool) {
        jTFCodigoEstacion.setEnabled(bool);
        jTFDireccionEstacion.setEnabled(bool);
        jCBCedulaDirector.setEnabled(bool);
        
    }

    private void setEnabledContractForm(boolean bool) {
        
    }

    private void setEnabledRelateForm(boolean bool) {
        
    }

    private void setEditableGeneralDataForm(boolean bool) {
        jTFCodigoEstacion.setEditable(bool);
        jTFDireccionEstacion.setEditable(bool);
        jCBCedulaDirector.setEditable(bool);
        
    }

    private void setEditableContractForm(boolean bool) {
        
    }

    private void setEditableRelateForm(boolean bool) {
        
    }

    private void setEnabledSaveControl(boolean bool) {
        
    }

    private void setEnabledFormControl(boolean bool) {
        jBCrearEstacion.setEnabled(bool);
       
    }
        
    private void actualizarListaEmpleados() throws MiExcepcion {
        Empleado[] empleados = controlEmpleado.listarEmpleados();
        if ((Arrays.asList(empleados)).isEmpty()) {
            throw new MiExcepcion("No hay empleados registrados en la base de datos.");
        }
        
        String[] cedulas = new String[empleados.length+1];
        
        cedulas[0] = "Seleccione la cédula del director...";
        
        for(int i=1; i<=empleados.length; i++){
            
            cedulas[i] = empleados[i-1].getCedula();
            
        }
        
        jCBCedulaDirector.setModel(new javax.swing.DefaultComboBoxModel(cedulas));
    }

    private void pinTab(int actualTab) {
        
    }

    private void unpinTab() {
        
    }

    /**
     * searchEmployee [Método encargado de buscar la informacion general del
     * empleado y ponerla en el formulario].
     *
     * @throws MyException
     * @throws ParseException
     */
    

    private void jBCrearEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearEstacionActionPerformed
        
        String[] informacion = new String[4];
        
        informacion[0] = jTFCodigoEstacion.getText().trim();
        informacion[1] = jTFNombreEstacion.getText().trim().toUpperCase();
        informacion[2] = jTFDireccionEstacion.getText().trim().toUpperCase();
        informacion[3] = (String) jCBCedulaDirector.getSelectedItem();
                      
        try {                           
            
            validador.validarCampoVacio(informacion[0], "CÓDIGO");
            validador.validarCampoVacio(informacion[1], "NOMBRE");
            validador.validarCampoVacio(informacion[2], "DIRECCIÓN");
                        
            validador.validarCadenaNumeros(informacion[0], "El CÓDIGO DE LA ESTACIÓN ");
            
            if(jCBCedulaDirector.getSelectedItem()==jCBCedulaDirector.getItemAt(0)) {
                
                lanzarMensaje.mostrarMessageDialog("Debe seleccionar la cédula del director.", title, JOptionPane.INFORMATION_MESSAGE); 
                
            } else {
            
            Estacion[] estacion = controlEstacion.yaEsDirector(informacion[3]);
            
            if ((Arrays.asList(estacion)).isEmpty()) {
                
                controlEstacion.crearEstacion(informacion);

                lanzarMensaje.mostrarMessageDialog("La estación fue creada con éxito.", title, JOptionPane.INFORMATION_MESSAGE); 

                limpiarCampos();
                
            }else {
                                   
                lanzarMensaje.mostrarMessageDialog("No se pudo crear la estación, ya que el empleado con la cédula " + informacion[3] 
                        + " ya es director de la estación " + estacion[0].getNombre(), 
                        title, JOptionPane.ERROR_MESSAGE);               
                            
            }
            }
            
        } catch (MiExcepcion ex) {
            
            lanzarMensaje.mostrarMessageDialog(ex.getMessage(), title, JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_jBCrearEstacionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCrearEstacion;
    private javax.swing.JComboBox jCBCedulaDirector;
    private javax.swing.JLabel jLCedulaDirector;
    private javax.swing.JLabel jLCodigoEstacion;
    private javax.swing.JLabel jLDireccionEstacion;
    private javax.swing.JLabel jLNombreEstacion;
    private javax.swing.JPanel jPBotonCrear;
    private javax.swing.JPanel jPInformacionEstacion;
    private javax.swing.JTextField jTFCodigoEstacion;
    private javax.swing.JTextField jTFDireccionEstacion;
    private javax.swing.JTextField jTFNombreEstacion;
    // End of variables declaration//GEN-END:variables
    private final static int WIDTH_ = 470;
    private final static int HEIGHT_ = 220;
    private final int parentWidth;
    private final int parentHeight;
    private final LanzarMensaje lanzarMensaje;
    private final Validador validador;
    private final ControlEstacion controlEstacion;  
    private final ControlEmpleado controlEmpleado;
    private final JIFEstacionManejadorEventos manejadorEventos;
    
    private class JIFEstacionManejadorEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == jCBCedulaDirector) {
                try {
                    Empleado empleado = ((Empleado) jCBCedulaDirector.getSelectedItem());
                    
                } catch (Exception ex) {
                    
                }
            }
            
        }
    }
}
