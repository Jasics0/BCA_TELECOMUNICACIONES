package bca_telecomunicaciones;

import base.TicketDAO;
import entidades.Ticket;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class modificarTicket extends javax.swing.JFrame {

        /**
         * Creates new form buscarCliente
         */
        private Ticket t;

        public modificarTicket() {

                this.setResizable(false);
                initComponents();
                this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jDateChooser1 = new com.toedter.calendar.JDateChooser();
                jDateChooser2 = new com.toedter.calendar.JDateChooser();
                jLabel4 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jTextField2 = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                jComboBox2 = new javax.swing.JComboBox<>();
                jButton2 = new javax.swing.JButton();
                jComboBox3 = new javax.swing.JComboBox<>();
                jComboBox4 = new javax.swing.JComboBox<>();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 204, 153));

                jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Digite la cedula del cliente para buscar su ticket.");

                jLabel2.setText("Cedula Cliente: ");

                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1ActionPerformed(evt);
                        }
                });

                jButton1.setText("Buscar");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                try {
                                        jButton1ActionPerformed(evt);
                                } catch (SQLException e) {
                                        e.printStackTrace();
                                }
                        }
                });

                jLabel3.setText("Tipo:");

                jLabel5.setText("Fecha inicial:");

                jLabel6.setText("Fecha final:");

                jLabel4.setText("Notas solucion:");

                jLabel7.setText("Estado:");

                jTextField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField2ActionPerformed(evt);
                        }
                });

                jLabel8.setText("Calidad del servicio:");

                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

                jButton2.setText("Enviar");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                try {
                                        jButton2ActionPerformed(evt);
                                } catch (SQLException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                }
                        }
                });

                jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
                jComboBox3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox3ActionPerformed(evt);
                        }
                });

                jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                                "A1. Modificaciones acordadas.", "A2. Publicidad engañosa.",
                                "A3. Servicios no solicitados.", "A4. Fraude de contratación.", "A5. Datos personales.",
                                "A6. Plan Corporativo.", "B1. Imposibilidad terminacion de contrato.",
                                "B2. Clausula de permanencia sin consentimiento.",
                                "B3. Clausula de permanencia superior a un año.", "B4. Valor subsidiado o financiado.",
                                "B5. Falta de información.", "B6. Portabilidad númerica.",
                                "B7. Cambio pospago a prepago.", "C1. Activación sin autorización.",
                                "C2. Falta de información.", "C3. No controles de consumo.", "C4. Facturación.",
                                "C5. Calidad del servicio.", "D1. No disponibilidad del servicio." }));
                jComboBox4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox4ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup().addGap(210, 210, 210)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(210, 210, 210))
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(159, 159, 159)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel8).addComponent(jLabel7)
                                                                .addComponent(jLabel4).addComponent(jLabel5)
                                                                .addComponent(jLabel2).addComponent(jLabel6)
                                                                .addComponent(jLabel3))
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jComboBox2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                120,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jButton2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                120,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(115, 115, 115))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jTextField2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                327,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                .addComponent(jTextField1,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                246,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addComponent(jDateChooser1,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                246,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addComponent(jDateChooser2,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                246,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGap(28, 28, 28)
                                                                                                                                                .addComponent(jButton1,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                101,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addComponent(jComboBox4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                321,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jComboBox3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                120,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)))));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(14, 14, 14).addComponent(jLabel1,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                39,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jLabel2))
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel5).addComponent(jDateChooser2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                38,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jDateChooser1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                38,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(2, 2, 2)
                                                                                .addComponent(jComboBox4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                39,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel7).addComponent(jComboBox3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel4).addComponent(jTextField2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                82,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel8)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jComboBox2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(38, 38, 38)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap()));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(8, 8, 8)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap()));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jTextField1ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {// GEN-FIRST:event_jButton1ActionPerformed
                TicketDAO tdao = new TicketDAO();
                if (!jTextField1.getText().equals("")) {
                        t = tdao.consultarTickets(jTextField1.getText());

                        jDateChooser2.setDate(t.getFecha_inicial());
                        jDateChooser1.setDate(t.getFecha_final());
                        if (t.getNotas_solucion() == null) {
                                jTextField2.setText("No tiene notas de solucion.");
                        } else {
                                jTextField2.setText(t.getNotas_solucion());
                        }

                        String infodb = "";

                        for (int i = 0; i < 19; i++) {
                                infodb = "" + jComboBox4.getItemAt(i).toString().charAt(0)
                                                + jComboBox4.getItemAt(i).toString().charAt(1);
                                if ((infodb).equals(t.getTipo())) {
                                        jComboBox4.setSelectedItem(jComboBox4.getItemAt(i).toString());
                                        break;
                                }
                        }

                        for (int i = 0; i < 5; i++) {
                                if (Integer.parseInt(jComboBox2.getItemAt(i)) == t.getCalidad_servicio()) {
                                        jComboBox4.setSelectedItem(jComboBox4.getItemAt(i));
                                        break;
                                }
                        }

                        if (!t.getEstado()) {
                                jComboBox3.setSelectedItem("Inactivo");
                        }
                } else
                        JOptionPane.showMessageDialog(null, "Necesita digitar código del ticket para poder buscarlo");

        }// GEN-LAST:event_jButton1ActionPerformed

        private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox4ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jComboBox4ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {// GEN-FIRST:event_jButton2ActionPerformed
                TicketDAO tdao = new TicketDAO();
                t.setFecha_inicial(jDateChooser2.getDate());
                t.setFecha_final(jDateChooser1.getDate());

                String tipoo = String.valueOf(jComboBox4.getSelectedItem().toString()).charAt(0) + ""
                                + String.valueOf(jComboBox4.getSelectedItem().toString()).charAt(1);
                t.setTipo(tipoo);
                if (jComboBox3.getSelectedItem().toString().equals("Activo")) {
                        t.setEstado(true);
                } else {
                        t.setEstado(false);
                }
                t.setNotas_solucion(jTextField2.getText());
                t.setCalidad_servicio(Integer.parseInt(jComboBox2.getSelectedItem().toString()));
                tdao.editarTicket(t.getCodigo(), t);
                jDateChooser2.setDate(null);
                jDateChooser1.setDate(null);
                jComboBox4.setSelectedIndex(0);
                jComboBox3.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                jTextField1.setText("");
                jTextField2.setText("");
                tdao.cerrarConexion();
        }// GEN-LAST:event_jButton2ActionPerformed

        private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox3ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jComboBox3ActionPerformed

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jTextField2ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JComboBox<String> jComboBox2;
        private javax.swing.JComboBox<String> jComboBox3;
        private javax.swing.JComboBox<String> jComboBox4;
        private com.toedter.calendar.JDateChooser jDateChooser1;
        private com.toedter.calendar.JDateChooser jDateChooser2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        // End of variables declaration//GEN-END:variables
}
