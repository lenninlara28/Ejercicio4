/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author hp 14
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMetros = new javax.swing.JTextField();
        cmbHacer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JTextField();
        txtCuotaIn = new javax.swing.JTextField();
        txtCuota2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cmbNuevo = new javax.swing.JButton();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Tienda Inmobiliaria");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 220, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Ingrese Cuantos Metros Cuadrados Comprara");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtMetros.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMetros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMetrosKeyTyped(evt);
            }
        });
        jPanel1.add(txtMetros, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 70, 240, -1));

        cmbHacer.setBackground(new java.awt.Color(0, 0, 0));
        cmbHacer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbHacer.setForeground(new java.awt.Color(255, 255, 255));
        cmbHacer.setText("OK");
        cmbHacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHacerActionPerformed(evt);
            }
        });
        jPanel1.add(cmbHacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Su Monto Total Es De");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtMontoTotal.setEditable(false);
        jPanel1.add(txtMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 170, 30));

        txtCuotaIn.setEditable(false);
        jPanel1.add(txtCuotaIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 90, -1));

        txtCuota2.setEditable(false);
        jPanel1.add(txtCuota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 100, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("12 Cuotas de:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Cuota Inicial");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        cmbNuevo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbNuevo.setText("Borrar");
        cmbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbHacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHacerActionPerformed
        String cuotaini,montoT,qotas;
        int total,metros,primecuota,cuotas;
        if(txtMetros.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite Cuantos Metros Cubicos Comprara","error", JOptionPane.ERROR_MESSAGE);
         txtMetros.requestFocusInWindow();}
         
        else{
        
        metros=Integer.parseInt(txtMetros.getText());
        total=80000*metros;
        cuotas=((total*65)/100)/12;
       
        montoT=String.valueOf(total);
        txtMontoTotal.setText(montoT);

        primecuota=(total*35)/100;
        cuotaini=String.valueOf(primecuota);
        txtCuotaIn.setText("$"+cuotaini);

        qotas=String.valueOf(cuotas);
        txtCuota2.setText("$"+qotas);
        
        }
    }//GEN-LAST:event_cmbHacerActionPerformed

    private void txtMetrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMetrosKeyTyped
       char c=evt.getKeyChar(); 
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtMetrosKeyTyped

    private void cmbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNuevoActionPerformed
        txtCuota2.setText("");
     txtCuotaIn.setText("");
     txtMetros.setText("");
     txtMontoTotal.setText("");
     
     
     txtMetros.requestFocusInWindow();
    }//GEN-LAST:event_cmbNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbHacer;
    private javax.swing.JButton cmbNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtCuota2;
    private javax.swing.JTextField txtCuotaIn;
    private javax.swing.JTextField txtMetros;
    private javax.swing.JTextField txtMontoTotal;
    // End of variables declaration//GEN-END:variables
}
