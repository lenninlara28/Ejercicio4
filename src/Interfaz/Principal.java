/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCuotaIn = new javax.swing.JTextField();
        txtCuota3 = new javax.swing.JTextField();
        txtCuota4 = new javax.swing.JTextField();
        txtCuota5 = new javax.swing.JTextField();
        txtCuota6 = new javax.swing.JTextField();
        txtCuota7 = new javax.swing.JTextField();
        txtCuota8 = new javax.swing.JTextField();
        txtCuota9 = new javax.swing.JTextField();
        txtCuota10 = new javax.swing.JTextField();
        txtCuotas11 = new javax.swing.JTextField();
        txtCuota2 = new javax.swing.JTextField();
        txtCuota12 = new javax.swing.JTextField();

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

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Segunda Cuota");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Tercera Cuota");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Cuarta Cuota");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Quinta Cuota");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Sexta Cuota");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("SeptimaCuota");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Octava Cuota");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Novena Cuota");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Decima Cuota");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Undecima Cuota");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Duodecima Cuota");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Primera Cuota");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txtCuotaIn.setEditable(false);
        jPanel1.add(txtCuotaIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 90, -1));

        txtCuota3.setEditable(false);
        jPanel1.add(txtCuota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 100, -1));

        txtCuota4.setEditable(false);
        jPanel1.add(txtCuota4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, -1));

        txtCuota5.setEditable(false);
        jPanel1.add(txtCuota5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 100, -1));

        txtCuota6.setEditable(false);
        jPanel1.add(txtCuota6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 100, -1));

        txtCuota7.setEditable(false);
        jPanel1.add(txtCuota7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, -1));

        txtCuota8.setEditable(false);
        txtCuota8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuota8ActionPerformed(evt);
            }
        });
        jPanel1.add(txtCuota8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 100, -1));

        txtCuota9.setEditable(false);
        jPanel1.add(txtCuota9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 100, -1));

        txtCuota10.setEditable(false);
        jPanel1.add(txtCuota10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 100, -1));

        txtCuotas11.setEditable(false);
        jPanel1.add(txtCuotas11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 100, -1));

        txtCuota2.setEditable(false);
        jPanel1.add(txtCuota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 100, -1));

        txtCuota12.setEditable(false);
        jPanel1.add(txtCuota12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbHacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHacerActionPerformed
        String cuotaini,montoT,qotas;
        int total,metros,primecuota,cuotas;
        metros=Integer.parseInt(txtMetros.getText());
        total=80000*metros;
        cuotas=((total*65)/100)/12;
        montoT=String.valueOf(total);
     txtMontoTotal.setText(montoT);
     
     switch (op){
         case 0:
             primecuota=(total*35)/100;
             cuotaini=String.valueOf(primecuota);
             txtCuota3.setText("$"+cuotaini);
          break;
         case 1:
             qotas=String.valueOf(cuotas);
             txtCuota3.setText("$"+qotas);
     
     }
    
        
    }//GEN-LAST:event_cmbHacerActionPerformed

    private void txtCuota8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuota8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuota8ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtCuota10;
    private javax.swing.JTextField txtCuota12;
    private javax.swing.JTextField txtCuota2;
    private javax.swing.JTextField txtCuota3;
    private javax.swing.JTextField txtCuota4;
    private javax.swing.JTextField txtCuota5;
    private javax.swing.JTextField txtCuota6;
    private javax.swing.JTextField txtCuota7;
    private javax.swing.JTextField txtCuota8;
    private javax.swing.JTextField txtCuota9;
    private javax.swing.JTextField txtCuotaIn;
    private javax.swing.JTextField txtCuotas11;
    private javax.swing.JTextField txtMetros;
    private javax.swing.JTextField txtMontoTotal;
    // End of variables declaration//GEN-END:variables
}
