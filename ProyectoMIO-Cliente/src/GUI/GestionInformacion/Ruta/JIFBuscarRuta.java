package GUI.GestionInformacion.Ruta;

import Control.ControlEmpleado;
import Control.ControlRuta;
import Control.ControlRecorrido;
import Control.ControlRuta;
import GUI.PaquetePrincipal.AnclarVentanaInterna;
import Modelo.Entidades.Empleado;
import Modelo.Entidades.Ruta;
import Modelo.Entidades.Recorrido;
import Modelo.Entidades.Ruta;
import Modelo.Validadores.LanzarMensaje;
import Modelo.Excepciones.MiExcepcion;
import Modelo.Validadores.Validador;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.border.EtchedBorder;

/**
 *
 * JIFBuscarRuta
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class JIFBuscarRuta extends AnclarVentanaInterna {

    /**
     * Creates new form JIFViewProfile
     *
     * @param title
     * @param parentWidth
     * @param parentHeight
     * @throws Modelo.Excepciones.MiExcepcion
     */
    public JIFBuscarRuta(String title, int parentWidth, int parentHeight) throws MiExcepcion {
        super();
        this.parentWidth = parentWidth;
        this.parentHeight = parentHeight;
        setTitle(title);
        setResizable(false);
        setClosable(true);
        setMaximizable(false);
        setSize(WIDTH_, HEIGHT_);
        setLocation((int) (Math.abs(this.parentWidth - this.getSize().width) / 2), (int) (Math.abs(this.parentHeight - this.getSize().height) / 2));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocked(true);
        initComponents();
        initializeComponents();
        
        actualizarRutas();
        jCBNombreRuta.addActionListener(manejadorEventos);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPInformacion = new javax.swing.JPanel();
        jLCodigoEstacion = new javax.swing.JLabel();
        jTFNombreRuta = new javax.swing.JTextField();
        jCBNombreRuta = new javax.swing.JComboBox();
        jPLabels = new javax.swing.JPanel();
        jLControlPassword = new javax.swing.JLabel();
        jPControls = new javax.swing.JPanel();
        jPBotonBuscar = new javax.swing.JPanel();
        jPContenedorBoton = new javax.swing.JPanel();
        jBBuscarRuta = new javax.swing.JButton();

        jPInformacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPInformacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPInformacion.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        jLCodigoEstacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLCodigoEstacion.setText("Nombre de la Ruta:");
        jPInformacion.add(jLCodigoEstacion);

        jTFNombreRuta.setMaximumSize(new java.awt.Dimension(200, 25));
        jTFNombreRuta.setMinimumSize(new java.awt.Dimension(40, 25));
        jTFNombreRuta.setPreferredSize(new java.awt.Dimension(100, 25));
        jTFNombreRuta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNombreRutaFocusLost(evt);
            }
        });
        jPInformacion.add(jTFNombreRuta);

        jCBNombreRuta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBNombreRuta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPInformacion.add(jCBNombreRuta);

        jPLabels.setLayout(new java.awt.GridLayout(3, 0));
        jPLabels.add(jLControlPassword);

        jPInformacion.add(jPLabels);

        jPControls.setLayout(new java.awt.GridLayout(3, 0));
        jPInformacion.add(jPControls);

        getContentPane().add(jPInformacion, java.awt.BorderLayout.NORTH);

        jPBotonBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPBotonBuscar.setMaximumSize(new java.awt.Dimension(610, 37));
        jPBotonBuscar.add(jPContenedorBoton);

        jBBuscarRuta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBBuscarRuta.setText("BUSCAR RUTA");
        jBBuscarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarRutaActionPerformed(evt);
            }
        });
        jPBotonBuscar.add(jBBuscarRuta);

        getContentPane().add(jPBotonBuscar, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarRutaActionPerformed
        try {
            registros = false;
            displayTab();
        } catch (MiExcepcion ex) {
            Logger.getLogger(JIFBuscarRuta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBBuscarRutaActionPerformed

    private void jTFNombreRutaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNombreRutaFocusLost
                    
            /*if(jTFCodigoRuta.getText()!=""){
                
            String cod = jTFCodigoRuta.getText();
            
            String codigo = "";
            
            String item = "";
            
            int indice = 0;
            
            boolean encontrado = false;
            
                for(int i=1; i<jCBCodigoRuta.getItemCount(); i++){
                    
                    item = (String) jCBCodigoRuta.getItemAt(i);
                    
                    for(int j=0; j<item.length(); j++) {
                        
                        if(item.charAt(i)==' ') { 
                                
                                codigo = item.substring(0, i);  
                                
                                if(cod.equals(codigo)) {
                                    indice = i;
                                    encontrado = true;
                                    break;
                                }
                                
                            }
                        
                    }
                    
                    if(encontrado){
                        break;
                    }
                }
                
            jCBCodigoRuta.setSelectedIndex(indice);
                
            }else{
                jCBCodigoRuta.setSelectedIndex(0);
            }*/
        
    }//GEN-LAST:event_jTFNombreRutaFocusLost

    private void initializeComponents() {
        lanzarMensaje = new LanzarMensaje(this);
        manejadorEventos = new buscarRutaManejadorEventos();
        controlRuta = new ControlRuta();
        controlRecorrido = new ControlRecorrido();
        validador = new Validador();
        registros = true;
    }

    private void actualizarRutas() throws MiExcepcion {
        Ruta[] rutas = controlRuta.listarRutas();
        if ((Arrays.asList(rutas)).isEmpty()) {
            
            if(!registros){
                dispose();
            }
            throw new MiExcepcion("No hay rutas registradas en la base de datos.");            
        }
        
        String[] codigos = new String[rutas.length+1];
        
        codigos[0] = "Seleccione el nombre de la ruta...";
        
        for(int i=1; i<=rutas.length; i++){
            
            codigos[i] = "" + rutas[i-1].getNombre();
            
        }
        
        jCBNombreRuta.setModel(new javax.swing.DefaultComboBoxModel(codigos));
    }
    
    private void actualizarListaRecorridos() throws MiExcepcion {
        Recorrido[] recorridos = controlRecorrido.listarRecorridos();
        if ((Arrays.asList(recorridos)).isEmpty()) {
            throw new MiExcepcion("No hay recorridos registrados en la base de datos.");
        }
        
        String[] id = new String[recorridos.length+1];
        
        id[0] = "Seleccione el recorrido...";
        
        for(int i=1; i<=recorridos.length; i++){
            
            id[i] = "" + recorridos[i-1].getId();
            
        }
        
        jCBIdRecorridos.setModel(new javax.swing.DefaultComboBoxModel(id));
    }

    
    private void displayTab() throws MiExcepcion {
        // Bloqueamos el boton Buscar
        jBBuscarRuta.setEnabled(false);
        jTFNombreRuta.setEditable(false);
        jCBNombreRuta.setEnabled(false);
        // Desbloqueamos el Internal Frame     
        setLocked(false);
        // Definimos un nuevo tamaño.
        setSize(WIDTH_, 280);
        // Definimos el layot del panel...  
        jPUpdatePassword = new JPanel();
        jPUpdatePassword.setLayout(new BorderLayout());
        jPUpdatePassword.setBorder(new EtchedBorder());
        // Creamos un panel para las etiquetas.
        JPanel jPUpdateLabels = new JPanel();
        jPUpdateLabels.setLayout(new GridLayout(1, 1));
        // Creamos las etiquetas.
        JLabel jLNew = new JLabel("Identificador del Recorrido:");
        
        // Añadimos las etiquetas.
        jPUpdateLabels.add(jLNew);
        
        // Creamos el panel para los campos de contraseña.
        JPanel jPUpdateTF = new JPanel();
        jPUpdateTF.setLayout(new GridLayout(1, 1));
        // Campos de contraseña.
        jCBIdRecorridos = new JComboBox(); 
        
        actualizarListaRecorridos();        
        
        // Añadimos los campos de texto al panel
        jPUpdateTF.add(jCBIdRecorridos);
        
        jPBotonesModificar = new JPanel();
        jPBotonesModificar.setLayout(new FlowLayout());
        //jPBotonesModificar.setBorder(new EtchedBorder());
        
        jBGuardarModificaciones = new JButton("GUARDAR MODIFICACIÓN");
        jBGuardarModificaciones.addActionListener(manejadorEventos);
        
        jBCancelar = new JButton("CANCELAR");
        jBCancelar.addActionListener(manejadorEventos);
        
        jPBotonesModificar.add(jBGuardarModificaciones);
        jPBotonesModificar.add(jBCancelar);
        
        jPBotonesModificar.setVisible(false);
        
        String codigo = jTFNombreRuta.getText().trim();
        
        Ruta ruta = controlRuta.buscarRuta(codigo);               
           
        for(int i=1; i<=jCBIdRecorridos.getItemCount(); i++) {
                        
            if((""+ruta.getIdRecorrido()).equals(jCBIdRecorridos.getItemAt(i))) {
                jCBIdRecorridos.setSelectedIndex(i);
                break;
            }
            
        }
        
        jCBIdRecorridos.setEnabled(false);
        
        // Creamos un panel para los botones
        JPanel jPUpdateButtons = new JPanel();
        //jPUpdateButtons.setLayout(new GridLayout(1, 2));
        jPUpdateButtons.setLayout(new FlowLayout());
        
        JPanel jPBotones = new JPanel();
        jPBotones.setLayout(new BoxLayout(jPBotones, BoxLayout.PAGE_AXIS));
        jPBotones.setBorder(new EtchedBorder());
        //jPBotones.setLayout(new FlowLayout());
        //jPBotones.setLayout(new GridLayout(1, 2));
        //jPUpdateButtons.setBorder(new EtchedBorder());
        // Creamos los botones.
        jBModificar = new JButton("MODIFICAR");
        jBModificar.addActionListener(manejadorEventos);
        
        jBEliminar = new JButton("ELIMINAR");
        jBEliminar.addActionListener(manejadorEventos);
        
        jBBuscar = new JButton("BUSCAR DE NUEVO");
        jBBuscar.addActionListener(manejadorEventos);
        
        // Procedemos a agregar los botones al panel
        jPUpdateButtons.add(jBModificar);
        jPUpdateButtons.add(jBEliminar);
        jPUpdateButtons.add(jBBuscar);
        
        jPBotones.add(jPBotonesModificar);
        jPBotones.add(jPUpdateButtons);
        // Procedemos a armar el panel completo.
        jPUpdatePassword.add(jPUpdateLabels, "Before");
        jPUpdatePassword.add(jPUpdateTF, "Center");
        jPUpdatePassword.add(jPBotones, "Last");
        
        //jPUpdatePassword.add(jPUpdateLabels, "Before");
        //jPUpdatePassword.add(jPUpdateTF);
        //jPUpdatePassword.add(jPBotonesModificar);
        
        //jPUpdatePassword.add(jPUpdateButtons, "Last");
        // Agregamos el panel ala ventana principal
        //this.add(jPUpdatePassword, "South");
        this.jPBotonBuscar.setLayout(new BoxLayout(jPBotonBuscar, BoxLayout.PAGE_AXIS));
        this.jPBotonBuscar.add(jPUpdatePassword);        
        // Bloqueamos de nuevo el internal frame.
        setLocked(true);
        // Actualizamos la interfaz.
        updateUI();
    }

    private void retractTab() {
        // Limpiamos los campos.
        this.jTFNombreRuta.setText("");
        this.jCBNombreRuta.setSelectedIndex(0);
        this.jCBIdRecorridos.setSelectedIndex(0);
        
        // Debemos recoger la ventana y retirar los componentes.
        // Reactivamos el boton editar.
        jBBuscarRuta.setEnabled(true);
        jTFNombreRuta.setEditable(true);
        jCBNombreRuta.setEnabled(true);
        // Retiramos los componentes:
        this.jPBotonBuscar.remove(jPUpdatePassword);
        jPBotonBuscar.setLayout(new FlowLayout());
        // Desbloqueamos el internal frame para devolverlo a su tamaño original.
        setLocked(false);
        setSize(WIDTH_, HEIGHT_);
        setLocked(true);
        // Actualizamos la interfaz grafica.
        updateUI();
    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarRuta;
    private javax.swing.JComboBox jCBNombreRuta;
    private javax.swing.JLabel jLCodigoEstacion;
    private javax.swing.JLabel jLControlPassword;
    private javax.swing.JPanel jPBotonBuscar;
    private javax.swing.JPanel jPContenedorBoton;
    private javax.swing.JPanel jPControls;
    private javax.swing.JPanel jPInformacion;
    private javax.swing.JPanel jPLabels;
    private javax.swing.JTextField jTFNombreRuta;
    // End of variables declaration//GEN-END:variables
    private final int parentWidth;
    private final int parentHeight;
    private JButton jBModificar;
    private JButton jBEliminar;
    private JButton jBBuscar;
    private JButton jBGuardarModificaciones;
    private JButton jBCancelar;
    private JTextField jTFNombre;
    private JTextField jTFDireccion;
    private JComboBox jCBIdRecorridos;
    private JPanel jPUpdatePassword;
    private JPanel jPBotonesModificar;
    private LanzarMensaje lanzarMensaje;
    private buscarRutaManejadorEventos manejadorEventos;
    private final static int WIDTH_ = 650;
    private final static int HEIGHT_ = 120;
    private Validador validador;
    private ControlRuta controlRuta;
    private ControlRecorrido controlRecorrido;
    private boolean registros;
    
    private class buscarRutaManejadorEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == jCBNombreRuta) {
                
                try{
                    if(jCBNombreRuta.getSelectedIndex()!=0){                                                                                          
                                
                        String nombre = (String) jCBNombreRuta.getSelectedItem();
                                                                         
                        jTFNombreRuta.setText(nombre);
                        
                    }else{
                        jTFNombreRuta.setText("");
                    }
                    
                } catch (Exception ex){
                    jTFNombreRuta.setText("");
                }          
            }
            
            if(e.getSource() == jBModificar){
                
                jPBotonesModificar.setVisible(true);
                jBModificar.setEnabled(false);
                jBEliminar.setEnabled(false);
                jBBuscar.setEnabled(false);
                                
                jCBIdRecorridos.setEnabled(true);
                
            }
            
            if(e.getSource() == jBGuardarModificaciones) {
                
                String[] informacion = new String[2];
                informacion[0] = (String) jTFNombreRuta.getText();
                informacion[1] = (String) jCBIdRecorridos.getSelectedItem();
                
                try {                                       
                                        
                    if(jCBIdRecorridos.getSelectedItem()==jCBIdRecorridos.getItemAt(0)) {

                        lanzarMensaje.mostrarMessageDialog("Debe seleccionar algún recorrido.", title, JOptionPane.INFORMATION_MESSAGE); 

                    } else {

                        controlRuta.modificarRuta(informacion);
                        lanzarMensaje.mostrarMessageDialog("La ruta ha sido modificada en la base de datos con éxito.", title, JOptionPane.INFORMATION_MESSAGE);
                        actualizarRutas();
                        retractTab();
                    
                    }                   
                    
                } catch (MiExcepcion ex) {
                    lanzarMensaje.mostrarMessageDialog(ex.getMessage(), title, JOptionPane.ERROR_MESSAGE);
                }               
                
            }
            
            if(e.getSource() == jBCancelar || e.getSource() == jBBuscar) {
                
                retractTab();
                
            }
            
            if(e.getSource() == jBEliminar) {
                
                String codigo = jTFNombreRuta.getText();
                
                try {
                    controlRuta.eliminarRuta(codigo);
                    lanzarMensaje.mostrarMessageDialog("La ruta fue eliminada con éxito.", title, JOptionPane.INFORMATION_MESSAGE);
                    actualizarRutas();                    
                } catch (MiExcepcion ex) {
                    
                    lanzarMensaje.mostrarMessageDialog(ex.getMessage(), title, JOptionPane.ERROR_MESSAGE);
                    
                } finally {
                    
                    retractTab();
                    
                }
                
            }
            
        }
    }
    
};
