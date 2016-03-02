package GUI.PaquetePrincipal;

import Modelo.Validadores.LanzarMensaje;
import Modelo.Excepciones.MiExcepcion;
import GUI.Fondo.JPFondo;
import GUI.FechaSistema.JPFechaSistema;
import GUI.GestionInformacion.Empleado.JIFEmpleado;
import GUI.GestionInformacion.Estacion.JIFEstacion;
/*import Control.EmployeeControl;
import Control.OfficeControl;
import Control.UseraccountControl;
import GUI.Background.JPBackground;
import GUI.Login.JPLogin;
import GUI.Parametrization.Employee.JIFEmployee;
import GUI.Parametrization.Offices.JIFOffices;
import GUI.Parametrization.Payroll.JIFPayrollConcepts;
import GUI.Payroll.PayrollPeriod.JIFPayrollPeriod;
import GUI.Parametrization.Users.JIFUser;
import GUI.Parametrization.Users.JIFViewProfile;
import GUI.Payroll.LiquidatePayroll.JIFLiquidatePayroll;
import GUI.Reports.Graphics.JIFGraphicsEmployeesPayrollPeriod;
import GUI.Reports.Listings.JIFEmployeeList;
import GUI.Reports.Listings.JIFOfficesList;
import GUI.Reports.Listings.JIFUseraccountsList;
import GUI.Reports.Payroll.JIFPaycheck;
import GUI.Reports.Payroll.JIFPaymentReceipt;
import GUI.SystemDate.JPSystemDate;
import Model.Entities.Employee;
import Model.Entities.Office;
import Model.Entities.Useraccount;
import Model.Utils.FileManager;*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * VentanaPrincipal
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     *
     * @param title
     */
    public VentanaPrincipal(String title) {
        super(title);
        initComponents();
        setAppearance();
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Cierre al salir.
        setExtendedState(MAXIMIZED_BOTH); // Pantalla completa.
        //setResizable(false);
        initializeComponents();
        accommodateComponents();        
        //jPLoginPanel.preparingFirstUsage();
        setVisible(true); // Hacemos visible el Frame.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMBMenu = new javax.swing.JMenuBar();
        jMFile = new javax.swing.JMenu();
        jMIFileViewProfile = new javax.swing.JMenuItem();
        jMIFileLogout = new javax.swing.JMenuItem();
        jSFile01 = new javax.swing.JPopupMenu.Separator();
        jMIFileClose = new javax.swing.JMenuItem();
        jMParametrization = new javax.swing.JMenu();
        jMIGestionInformacionEmpleados = new javax.swing.JMenuItem();
        jMIGestionInformacionEstacion = new javax.swing.JMenuItem();
        jSParametrization01 = new javax.swing.JPopupMenu.Separator();
        jMParametrizationPayroll = new javax.swing.JMenu();
        jMIPayrollConcepts = new javax.swing.JMenuItem();
        jMReports = new javax.swing.JMenu();
        jMListings = new javax.swing.JMenu();
        jMIReportsUsers = new javax.swing.JMenuItem();
        aJSEmployees = new javax.swing.JPopupMenu.Separator();
        jMIReportsEmployees = new javax.swing.JMenuItem();
        aJMIReportsEmployee_OfficeList = new javax.swing.JMenuItem();
        aJSOffices = new javax.swing.JPopupMenu.Separator();
        jMIReportsOffices = new javax.swing.JMenuItem();
        jMIPayrollReports = new javax.swing.JMenu();
        jMIPayroll = new javax.swing.JMenuItem();
        jMIPaymentReceipt = new javax.swing.JMenuItem();
        jMGraphics = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMHelp = new javax.swing.JMenu();
        jMIAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMBMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jMFile.setText("ARCHIVO");

        jMIFileViewProfile.setText("Ver perfil");
        jMIFileViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFileViewProfileActionPerformed(evt);
            }
        });
        jMFile.add(jMIFileViewProfile);

        jMIFileLogout.setText("Cerrar sesión");
        jMIFileLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFileLogoutActionPerformed(evt);
            }
        });
        jMFile.add(jMIFileLogout);
        jMFile.add(jSFile01);

        jMIFileClose.setText("Salir");
        jMIFileClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFileCloseActionPerformed(evt);
            }
        });
        jMFile.add(jMIFileClose);

        jMBMenu.add(jMFile);

        jMParametrization.setText("GESTIÓN INFORMACIÓN");

        jMIGestionInformacionEmpleados.setText("Empleados");
        jMIGestionInformacionEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGestionInformacionEmpleadosActionPerformed(evt);
            }
        });
        jMParametrization.add(jMIGestionInformacionEmpleados);

        jMIGestionInformacionEstacion.setText("Estaciones");
        jMIGestionInformacionEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGestionInformacionEstacionActionPerformed(evt);
            }
        });
        jMParametrization.add(jMIGestionInformacionEstacion);
        jMParametrization.add(jSParametrization01);

        jMParametrizationPayroll.setText("Nómina");

        jMIPayrollConcepts.setText("Conceptos de Nómina");
        jMIPayrollConcepts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPayrollConceptsActionPerformed(evt);
            }
        });
        jMParametrizationPayroll.add(jMIPayrollConcepts);

        jMParametrization.add(jMParametrizationPayroll);

        jMBMenu.add(jMParametrization);

        jMReports.setText("INFORMES");

        jMListings.setText("Listados");

        jMIReportsUsers.setText("Listado de Usuarios");
        jMIReportsUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIReportsUsersActionPerformed(evt);
            }
        });
        jMListings.add(jMIReportsUsers);
        jMListings.add(aJSEmployees);

        jMIReportsEmployees.setText("Listado de Empleados");
        jMIReportsEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIReportsEmployeesActionPerformed(evt);
            }
        });
        jMListings.add(jMIReportsEmployees);

        aJMIReportsEmployee_OfficeList.setText("Listado de Empleados por Sede");
        aJMIReportsEmployee_OfficeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aJMIReportsEmployee_OfficeListActionPerformed(evt);
            }
        });
        jMListings.add(aJMIReportsEmployee_OfficeList);
        jMListings.add(aJSOffices);

        jMIReportsOffices.setText("Listado de Sedes");
        jMIReportsOffices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIReportsOfficesActionPerformed(evt);
            }
        });
        jMListings.add(jMIReportsOffices);

        jMReports.add(jMListings);

        jMIPayrollReports.setText("Nomina");

        jMIPayroll.setText("Desprendible de Nomina");
        jMIPayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPayrollActionPerformed(evt);
            }
        });
        jMIPayrollReports.add(jMIPayroll);

        jMIPaymentReceipt.setText("Desprendible de Pago para un Empleado");
        jMIPaymentReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPaymentReceiptActionPerformed(evt);
            }
        });
        jMIPayrollReports.add(jMIPaymentReceipt);

        jMReports.add(jMIPayrollReports);

        jMGraphics.setText("Graficos");

        jMenuItem1.setText("Sueldo de Empleados por Periodo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMGraphics.add(jMenuItem1);

        jMReports.add(jMGraphics);

        jMBMenu.add(jMReports);

        jMHelp.setText("AYUDA");

        jMIAbout.setText("Acerca de...");
        jMIAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAboutActionPerformed(evt);
            }
        });
        jMHelp.add(jMIAbout);

        jMBMenu.add(jMHelp);

        setJMenuBar(jMBMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAboutActionPerformed
        /*FileManager fileM = new FileManager("src/GUI/Help/About.txt");
        fileM.readFile();
        throwerM.displayMessageDialog(fileM.returnFileContent(), "Acerca de....", JOptionPane.INFORMATION_MESSAGE);*/
    }//GEN-LAST:event_jMIAboutActionPerformed

    private void jMIFileCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFileCloseActionPerformed
        System.exit(0);// Salimos del programa.
    }//GEN-LAST:event_jMIFileCloseActionPerformed

    private void jMIFileLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFileLogoutActionPerformed
        /*try {
             jPLoginPanel.configLogout();
        } catch (MiExcepcion ex) {
            throwerM.mostrarMessageDialog(ex.getMessage(), "Cerrar sesión", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_jMIFileLogoutActionPerformed

    private void jMIFileViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFileViewProfileActionPerformed
        // Actualizamos primero la información base de la sesión.
        /*String username = jPLoginPanel.getUsername();
        String completeName = jPLoginPanel.getCompleteName();
        JIFViewProfile internalFrame = new JIFViewProfile("Perfil de usuario", (int) getSize().width, (int) getSize().height, username, completeName);
        background.add(internalFrame);
        internalFrame.setVisible(true);*/
    }//GEN-LAST:event_jMIFileViewProfileActionPerformed

    private void jMIReportsEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIReportsEmployeesActionPerformed
        /*EmployeeControl eControl = new EmployeeControl();
        try{
            Employee[] rows = eControl.listEmployees();
            if(rows.length == 0) {
                throw new MyException("No hay registros de empleados.");
            }
            int[] sizes = eControl.listTableSizes();
            String[] columns = {"IDENTIFICACIÓN", "NOMBRE COMPLETO", "PRIMER APELLIDO", "SEGUNDO APELLIDO", "ESTADO", "CARGO",
                "DIRECCIÓN", "CIUDAD", "GENERO", "ESTADO CIVIL", "FECHA DE NACIMIENTO", "LUGAR DE NACIMIENTO",
                "TELÉFONO","E-MAIL"};
            JIFEmployeeList jIFEmployees = new JIFEmployeeList("Lista de Empleados", getSize().width, getSize().height, columns, rows, sizes, false);
            background.add(jIFEmployees);
            jIFEmployees.setVisible(true);
        } catch(MyException e) {
            throwerM.displayMessageDialog(e.getMessage(), "Lista de Empleados", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_jMIReportsEmployeesActionPerformed

    private void jMIReportsUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIReportsUsersActionPerformed
        /*UseraccountControl control = new UseraccountControl();
        try {
            Useraccount[] rows = control.listUsers();
            if(rows.length == 0) {
                throw new MyException("No hay registros de usuarios en el sistema.");
            }
            int[] sizes = control.listTableSizes();
            String[] columns = {"USERNAME", "ESTADO"};
            JIFUseraccountsList jIFUsers = new JIFUseraccountsList("Lista de Usuarios", getSize().width, getSize().height, columns, rows, sizes, false);
            background.add(jIFUsers);
            jIFUsers.setVisible(true);
        } catch (MyException ex) {
            throwerM.displayMessageDialog(ex.getMessage(), "Lista de Usuarios", JOptionPane.ERROR_MESSAGE);
        }*/ 
    }//GEN-LAST:event_jMIReportsUsersActionPerformed

    private void jMIPayrollConceptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPayrollConceptsActionPerformed
        /*JIFPayrollConcepts internalFrame = new JIFPayrollConcepts("Conceptos de Nómina (Novedades)", (int) getSize().width, (int) getSize().height);
        background.add(internalFrame);
        internalFrame.setVisible(true);*/
    }//GEN-LAST:event_jMIPayrollConceptsActionPerformed

    private void jMIReportsOfficesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIReportsOfficesActionPerformed
        /*OfficeControl control = new OfficeControl(); 
        try {                       
            Office[] rows = control.listOffices();
            if(rows.length == 0) {
                throw new MyException("No hay registros de sedes en el sistema.");
            }
            int[] sizes = control.listTableSizes();
            String[] columns = {"CÓDIGO", "NOMBRE", "ESTADO", "CIUDAD", "DIRECCIÓN", "TELÉFONO"};
            JIFOfficesList jIFOffices = new JIFOfficesList("Lista de Sedes", getSize().width, getSize().height, columns, rows, sizes, false);
            background.add(jIFOffices);
            jIFOffices.setVisible(true);
        } catch (MyException ex) {
            throwerM.displayMessageDialog(ex.getMessage(), "Lista de Sedes", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_jMIReportsOfficesActionPerformed

    private void jMIGestionInformacionEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGestionInformacionEmpleadosActionPerformed
        JIFEmpleado internalFrame = new JIFEmpleado("Gestión de Empleados", (int) getSize().width, (int) getSize().height);
        fondo.add(internalFrame);
        internalFrame.setVisible(true);
    }//GEN-LAST:event_jMIGestionInformacionEmpleadosActionPerformed

    private void aJMIReportsEmployee_OfficeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aJMIReportsEmployee_OfficeListActionPerformed
        /*String title = "Lista de Empleados por Sede";
        EmployeeControl eControl = new EmployeeControl();
        OfficeControl oControl = new OfficeControl();
        try{
            Office[] offices = oControl.listOffices();
            if(offices.length == 0) throw new MyException("No hay registros para sedes en el sistema.");
            Vector offices_ = new Vector();
            offices_.add(" ");
            offices_.addAll(Arrays.asList(offices));
            JComboBox jCBCode = new JComboBox();
            jCBCode.setModel(new javax.swing.DefaultComboBoxModel(offices_));
            
            Office office = (Office) throwerM.displayJComboDialog("Selecciona una sede: ", jCBCode, title);
            String office_code = office.getCode();
            Employee[] rows = eControl.listEmployees(office_code);
            if(rows.length == 0) {
                throw new MyException("No hay registros de empleados para la sede " + office + ".");
            }
            int[] sizes = eControl.listTableSizes();
            String[] columns = {"IDENTIFICACIÓN", "NOMBRE COMPLETO", "PRIMER APELLIDO", "SEGUNDO APELLIDO", "ESTADO", "CARGO",
                "DIRECCIÓN", "CIUDAD", "GENERO", "ESTADO CIVIL", "FECHA DE NACIMIENTO", "LUGAR DE NACIMIENTO",
                "TELÉFONO","E-MAIL"};
            JIFEmployeeList jIFEmployees = new JIFEmployeeList(title, getSize().width, getSize().height, columns, rows, sizes, false);
            background.add(jIFEmployees);
            jIFEmployees.setVisible(true);
        } catch(MyException e) {
            throwerM.displayMessageDialog(e.getMessage(), title, JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            throwerM.displayMessageDialog("Debes seleccionar una sede.", title, JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_aJMIReportsEmployee_OfficeListActionPerformed

    private void jMIPaymentReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPaymentReceiptActionPerformed
        /*String title = "Generar Desprendible de Pago para un Empleado.";
        try {
            JIFPaymentReceipt internalFrame = new JIFPaymentReceipt(title, (int) getSize().width, (int) getSize().height);
            background.add(internalFrame);
            internalFrame.setVisible(true);
        } catch (MyException ex) {
            throwerM.displayMessageDialog(ex.getMessage(), title, JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_jMIPaymentReceiptActionPerformed

    private void jMIPayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPayrollActionPerformed
        /*String title = "Generar Desprendible de Nomina.";
        try {
            JIFPaycheck internalFrame = new JIFPaycheck(title, (int) getSize().width, (int) getSize().height);
            background.add(internalFrame);
            internalFrame.setVisible(true);
        } catch (MyException ex) {
            throwerM.displayMessageDialog(ex.getMessage(), title, JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_jMIPayrollActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        /*String title = "Sueldo Empleados por Periodo de Pago.";
        try {
            JIFGraphicsEmployeesPayrollPeriod internalFrame = new JIFGraphicsEmployeesPayrollPeriod(title, (int) getSize().width, (int) getSize().height);
            background.add(internalFrame);
            internalFrame.setVisible(true);
        } catch (MyException ex) {
            throwerM.displayMessageDialog(ex.getMessage(), title, JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMIGestionInformacionEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGestionInformacionEstacionActionPerformed
        JIFEstacion internalFrame = new JIFEstacion("Nueva Estación", (int) getSize().width, (int) getSize().height);
        fondo.add(internalFrame);
        internalFrame.setVisible(true);
    }//GEN-LAST:event_jMIGestionInformacionEstacionActionPerformed
   
    /**
     * setAppearance Metodo encargado de poner el Look And Feel del Frame.
     */
    private void setAppearance() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (LOOKANDFEEL.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            // Por defecto la aplicación tomara otro look and feel que el usuario tenga disponible en su PC.
        }
    }

    /**
     * initializeComponents.
     */
    private void initializeComponents() {
        // LANZADOR DE MENSAJES.
        throwerM = new LanzarMensaje(this);
        /*
        // PANEL DE ACCESO AL SISTEMA.
        // A este punto se gestiona la preparación del primer uso de la aplicación.
        jPLoginPanel = new JPLogin ("Acceso al sistema.", this);*/
        
        // FONDO DE LA APLICACIÓN.
        fondo = new JPFondo("src/GUI/Fondo/background_blue.jpg");
        
        // PANEL DE FECHA DEL SISTEMA
        jPFechaSistema = new JPFechaSistema();
    }

    /**
     * accommodateComponents.
     */
    private void accommodateComponents() {
        // CONTAINER.
        container = getContentPane();
        container.setLayout(new GridLayout(1, 1));
        container.add(fondo);
        // PANEL DE FECHA DEL SISTEMA.
        JPanel jPSeparatorSD = new JPanel();
        jPSeparatorSD.setLayout(new BorderLayout());        
        jPSeparatorSD.setBackground(new Color(0, 0, 0, 60));        
        jPSeparatorSD.add(jPFechaSistema, "North");
        fondo.add(jPSeparatorSD, "East");
        // DISEÑO DEL PANEL DE ACCESO.        
        JPanel jPSeparatorBody = new JPanel();
        jPSeparatorBody.setLayout(new BorderLayout());
        jPSeparatorBody.setOpaque(false);
        jPSeparatorBody.add(new JSeparator(SwingConstants.VERTICAL), "After");
        fondo.add(jPSeparatorBody, "Center");        
        JPanel jPSeparatorLogin = new JPanel();
        //separator.setOpaque(false); Panel totalmente transparente.
        jPSeparatorLogin.setBackground(new Color(0,0,0,60));
        jPSeparatorLogin.setLayout(new BorderLayout());        
        //jPSeparatorLogin.add(jPLoginPanel, "East");   
        jPSeparatorBody.add(jPSeparatorLogin, "North");    
        // PREPARAMOS LAS OPCIONES DE MENÚ HABILITADAS        
        // Damos los permisos iniciales.
        //initialPermissions();
        //initialPermissions();
        rootPermissions();
    }    
    // METODOS PARA LA GESTIÓN DE PERMISOS
    /**
     * initialPermissions [Metodo encargado de dar los permisos iniciales del programa].
     */
    public void initialPermissions() {
        jMBMenu.removeAll();
        jMIFileLogout.setEnabled(false);
        jMIFileViewProfile.setEnabled(false);
        jMBMenu.add(jMFile);
        jMBMenu.add(jMHelp);        
    }
    
    public void rootPermissions() {
        jMBMenu.removeAll();
        setEnabledMenuItems(true);
        jMBMenu.add(jMFile);
        jMBMenu.add(jMParametrization);        
        jMBMenu.add(jMReports);
        jMBMenu.add(jMHelp);          
    }
    
    public void counterPermissions() {
        jMBMenu.removeAll();
        setEnabledMenuItems(true);
        jMBMenu.add(jMFile);        
        jMBMenu.add(jMReports);
        jMIReportsUsers.setEnabled(false);
        jMBMenu.add(jMHelp); 
    }
    
    public void operatorPermissions() {
        jMBMenu.removeAll();
        setEnabledMenuItems(true);
        jMBMenu.add(jMFile);
        jMBMenu.add(jMReports);
        jMIReportsEmployees.setEnabled(false);        
        jMIReportsUsers.setEnabled(false);
        jMBMenu.add(jMHelp);
    }

    public void auxiliarPermissions() {
        jMBMenu.removeAll();
        setEnabledMenuItems(true);
        jMBMenu.add(jMFile);
        jMBMenu.add(jMReports);
        jMIReportsEmployees.setEnabled(false);        
        jMIReportsUsers.setEnabled(false);
        jMBMenu.add(jMHelp);
    }
    
    public void setEnabledMenuItems(boolean bool) {
        jMIAbout.setEnabled(bool);
        jMIFileClose.setEnabled(bool);
        jMIFileLogout.setEnabled(bool);
        jMIFileViewProfile.setEnabled(bool);
        jMIGestionInformacionEstacion.setEnabled(bool);
        jMIGestionInformacionEmpleados.setEnabled(bool);
        jMIPayrollConcepts.setEnabled(bool);
        jMIReportsEmployees.setEnabled(bool);
        jMIReportsOffices.setEnabled(bool);
        jMIReportsUsers.setEnabled(bool);
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aJMIReportsEmployee_OfficeList;
    private javax.swing.JPopupMenu.Separator aJSEmployees;
    private javax.swing.JPopupMenu.Separator aJSOffices;
    private javax.swing.JMenuBar jMBMenu;
    private javax.swing.JMenu jMFile;
    private javax.swing.JMenu jMGraphics;
    private javax.swing.JMenu jMHelp;
    private javax.swing.JMenuItem jMIAbout;
    private javax.swing.JMenuItem jMIFileClose;
    private javax.swing.JMenuItem jMIFileLogout;
    private javax.swing.JMenuItem jMIFileViewProfile;
    private javax.swing.JMenuItem jMIGestionInformacionEmpleados;
    private javax.swing.JMenuItem jMIGestionInformacionEstacion;
    private javax.swing.JMenuItem jMIPaymentReceipt;
    private javax.swing.JMenuItem jMIPayroll;
    private javax.swing.JMenuItem jMIPayrollConcepts;
    private javax.swing.JMenu jMIPayrollReports;
    private javax.swing.JMenuItem jMIReportsEmployees;
    private javax.swing.JMenuItem jMIReportsOffices;
    private javax.swing.JMenuItem jMIReportsUsers;
    private javax.swing.JMenu jMListings;
    private javax.swing.JMenu jMParametrization;
    private javax.swing.JMenu jMParametrizationPayroll;
    private javax.swing.JMenu jMReports;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSFile01;
    private javax.swing.JPopupMenu.Separator jSParametrization01;
    // End of variables declaration//GEN-END:variables
    // CONSTANTES
    private final static String LOOKANDFEEL = "Nimbus";
    // ATRIBUTOS PRIVADOS DE LA CLASE.
    private Container container;
    private LanzarMensaje throwerM;
    
    // ACCESO AL SISTEMA.
    //private JPLogin jPLoginPanel; 
    // FECHA DEL SISTEMA.
    private JPFechaSistema jPFechaSistema;
    
    // FONDO.
    private JPFondo fondo;
}
