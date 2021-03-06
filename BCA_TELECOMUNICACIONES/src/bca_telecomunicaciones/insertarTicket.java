package bca_telecomunicaciones;

import base.TicketDAO;
import entidades.Ticket;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class insertarTicket extends javax.swing.JFrame {

        /**
         * Creates new form insertarTicket
         */
        public insertarTicket() {
                this.setResizable(false);
                initComponents();
                this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jTextField2 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jComboBox2 = new javax.swing.JComboBox<>();
                jButton1 = new javax.swing.JButton();
                jDateChooser1 = new com.toedter.calendar.JDateChooser();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 204, 153));

                jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Ingrese los datos del ticket: ");

                jLabel2.setText("Cedula: ");

                jLabel3.setText("Fecha inicial:");

                jTextField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField2ActionPerformed(evt);
                        }
                });

                jLabel4.setText("Notas del problema: ");

                jLabel5.setText("Tipo de problema:");

                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                                "A1. Modificaciones acordadas.", "A2. Publicidad engañosa.",
                                "A3. Servicios no solicitados.", "A4. Fraude de contratación.", "A5. Datos personales.",
                                "A6. Plan Corporativo.", "B1. Imposibilidad terminacion de contrato.",
                                "B2. Clausula de permanencia sin consentimiento.",
                                "B3. Clausula de permanencia superior a un año.", "B4. Valor subsidiado o financiado.",
                                "B5. Falta de información.", "B6. Portabilidad númerica.",
                                "B7. Cambio pospago a prepago.", "C1. Activación sin autorización.",
                                "C2. Falta de información.", "C3. No controles de consumo.", "C4. Facturación.",
                                "C5. Calidad del servicio.", "D1. No disponibilidad del servicio." }));

                jButton1.setText("Insertar");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(227, 227, 227)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jLabel2))
                                                                .addGap(81, 81, 81))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup().addContainerGap()
                                                                                .addComponent(jLabel4)
                                                                                .addGap(73, 73, 73)))
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jComboBox2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                321,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                                .addComponent(jDateChooser1,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                223, Short.MAX_VALUE)
                                                                                .addComponent(jTextField2,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addComponent(jTextField3))
                                                .addGap(0, 192, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                426,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(244, 244, 244))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                .addComponent(jButton1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                108,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(305, 305,
                                                                                                                305)))));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextField2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                35,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel2))
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(78, 78, 78)
                                                                                .addComponent(jLabel3))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(70, 70, 70)
                                                                                .addComponent(jDateChooser1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(82, 82, 82)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel5).addComponent(jComboBox2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(53, 53, 53)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jTextField3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                107,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel4))
                                                .addGap(30, 30, 30)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(39, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap()));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap()));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                TicketDAO tdao = new TicketDAO();
                try {
                        String tipoo = String.valueOf(jComboBox2.getSelectedItem()).charAt(0) + ""
                                        + String.valueOf(jComboBox2.getSelectedItem()).charAt(1);
                        if (!jTextField2.getText().equals("") && jDateChooser1.getDate() != null) {
                                Ticket t = new Ticket(jDateChooser1.getDate(), null, jTextField2.getText(), tipoo,
                                                jTextField3.getText(), null, true, 0);
                                tdao.insertarTicket(t);
                                jTextField2.setText("");
                                jTextField3.setText("");
                                jDateChooser1.setDate(null);
                                jComboBox2.setSelectedIndex(0);
                                tdao.cerrarConexion();
                        } else
                                JOptionPane.showMessageDialog(null,
                                                "Revise que los datos estén diligenciados correctamente.");

                } catch (SQLException ex) {
                        // Logger.getLogger(insertarTicket.class.getName()).log(Level.SEVERE, null,
                        // "ERROR, REVISA QUE LOS DATOS INGRESADOS SEAN CORRECTOS.");

                }
        }// GEN-LAST:event_jButton1ActionPerformed

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jTextField2ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JComboBox<String> jComboBox2;
        private com.toedter.calendar.JDateChooser jDateChooser1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        // End of variables declaration//GEN-END:variables
}
