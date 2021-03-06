/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aman
 */
public class Currency extends javax.swing.JFrame {

    /**
     * Creates new form Currency
     */
    public Currency() {
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

        jLabel1 = new javax.swing.JLabel();
        from = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        to = new javax.swing.JComboBox();
        x = new javax.swing.JTextField();
        y = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("      From");

        from.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Taka", "USD", "Euro", "GBP" }));
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel2.setText("       To");

        to.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Taka", "USD", "Euro", "GBP" }));

        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });

        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 204, 255));
        jLabel3.setText("  Currency Converter");

        jButton1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 153, 255));
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 153, 255));
        jButton3.setText("Return");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 204, 204));
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(y))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(56, 56, 56)
                                .addComponent(jButton4)))))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed

    }//GEN-LAST:event_yActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        x.setText(null);
        y.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double ca;
        double amount = Double.parseDouble(x.getText());
        if (from.getSelectedItem().toString() == "Taka" && to.getSelectedItem().toString() == "Taka") {
            ca = amount;
            y.setText("" + ca);
        } else if (from.getSelectedItem().toString() == "Taka" && to.getSelectedItem().toString() == "USD") {
            ca = amount / 92.95;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "Taka" && to.getSelectedItem().toString() == "Euro") {
            ca = amount / 97.96;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "Taka" && to.getSelectedItem().toString() == "GBP") {
            ca = amount / 113.546;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "Taka") {
            ca = amount * 92.95;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "USD") {
            ca = amount;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "Euro") {
            ca = amount * 0.94;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "GBP") {
            ca = amount * 0.81;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "Euro" && to.getSelectedItem().toString() == "Taka") {
            ca = amount * 97.96;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "Euro" && to.getSelectedItem().toString() == "USD") {
            ca = amount * 1.05;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "Euro" && to.getSelectedItem().toString() == "GBP") {
            ca = amount * 0.86;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "Euro" && to.getSelectedItem().toString() == "Euro") {
            ca = amount;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "Taka") {
            ca = amount * 113.54;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "USD") {
            ca = amount * 1.22;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "Euro") {
            ca = amount * 1.15;
            y.setText(String.format("%.3f", ca));
        } else if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "GBP") {
            ca = amount;
            y.setText(String.format("%.3f", ca));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.toBack();
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Currency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox from;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox to;
    private javax.swing.JTextField x;
    private javax.swing.JTextField y;
    // End of variables declaration//GEN-END:variables
}
