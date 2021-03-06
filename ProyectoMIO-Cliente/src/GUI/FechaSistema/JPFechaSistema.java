package GUI.FechaSistema;

import java.awt.Color;

/**
 *
 * JPFechaSistema
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class JPFechaSistema extends javax.swing.JPanel {
    /**
     * Creates new form JPSystemDate
     */
    public JPFechaSistema() {
        initComponents();
        // Hacemos transparente los paneles.
        this.setOpaque(false);
        this.jPDate.setOpaque(false);        
        // Ponemos color a las letras de los labels.
        this.jLMonthAndYear.setForeground(Color.white);
        // Actualizamos el panel de fecha
        updateDatePanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDCDateChooser = new com.toedter.calendar.JDateChooser();
        jPDate = new javax.swing.JPanel();
        jPMesYANo = new javax.swing.JPanel();
        jLMonthAndYear = new javax.swing.JLabel();
        jPDay = new javax.swing.JPanel();
        jLDayOfTheWeek = new javax.swing.JLabel();
        jLDia = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout(50, 10));

        jDCDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCDateChooserPropertyChange(evt);
            }
        });
        add(jDCDateChooser, java.awt.BorderLayout.SOUTH);

        jPDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPDate.setPreferredSize(new java.awt.Dimension(150, 150));
        jPDate.setLayout(new java.awt.BorderLayout());

        jPMesYANo.setBackground(new java.awt.Color(135, 36, 35));

        jLMonthAndYear.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLMonthAndYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPMesYANo.add(jLMonthAndYear);

        jPDate.add(jPMesYANo, java.awt.BorderLayout.NORTH);

        jPDay.setBackground(java.awt.Color.white);
        jPDay.setLayout(new java.awt.BorderLayout());

        jLDayOfTheWeek.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLDayOfTheWeek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPDay.add(jLDayOfTheWeek, java.awt.BorderLayout.NORTH);

        jLDia.setFont(new java.awt.Font("Ubuntu", 1, 60)); // NOI18N
        jLDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPDay.add(jLDia, java.awt.BorderLayout.CENTER);

        jPDate.add(jPDay, java.awt.BorderLayout.CENTER);

        add(jPDate, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jDCDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCDateChooserPropertyChange
        updateDatePanel();
    }//GEN-LAST:event_jDCDateChooserPropertyChange

    public final void updateDatePanel() {
        this.jLDia.setText(Integer.toString(this.jDCDateChooser.getJCalendar().getDayChooser().getDay() ) );
        this.jLDayOfTheWeek.setText(WEEK_DAYS[ this.jDCDateChooser.getJCalendar().getDate().getDay() ]); 
        this.jLMonthAndYear.setText(MONTHS[this.jDCDateChooser.getJCalendar().getMonthChooser().getMonth()] 
                + " " 
                + Integer.toString(this.jDCDateChooser.getJCalendar().getYearChooser().getYear() ) ); 
        // Actualizamos la fecha.
        setDate(this.jDCDateChooser.getJCalendar().getDayChooser().getDay() 
        + "/" + this.jDCDateChooser.getJCalendar().getMonthChooser().getMonth() 
        + "/" + this.jDCDateChooser.getJCalendar().getYearChooser().getYear());
    }
    /**
     * setDate [Método encargado de setear la fecha del sistema].
     * @param date 
     */
    public void setDate(String date) {
        this.date = date;
    }
    /**
     * getDate [Método encargado de retornar la fecha del sistema].
     * @return 
     */
    public String getDate(){
        return date;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDCDateChooser;
    private javax.swing.JLabel jLDayOfTheWeek;
    private javax.swing.JLabel jLDia;
    private javax.swing.JLabel jLMonthAndYear;
    private javax.swing.JPanel jPDate;
    private javax.swing.JPanel jPDay;
    private javax.swing.JPanel jPMesYANo;
    // End of variables declaration//GEN-END:variables
    private static final String[] MONTHS = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", 
        "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
    private static final String[] WEEK_DAYS = {"DOMINGO", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO"};
    private String date;
}
