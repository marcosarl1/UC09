package view;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bttnIMC = new javax.swing.JButton();
        bttnGastoCal = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nutrisoft");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttnIMC.setBackground(new java.awt.Color(0, 122, 255));
        bttnIMC.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        bttnIMC.setText("IMC");
        bttnIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnIMCActionPerformed(evt);
            }
        });
        jPanel2.add(bttnIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 85, 147, 50));

        bttnGastoCal.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        bttnGastoCal.setText("Gasto Calórico");
        bttnGastoCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnGastoCalActionPerformed(evt);
            }
        });
        jPanel2.add(bttnGastoCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 175, 147, 50));

        jButton3.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 265, 147, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnIMCActionPerformed
        CalcIMC calcIMC = new CalcIMC();
        calcIMC.setVisible(true);
    }//GEN-LAST:event_bttnIMCActionPerformed

    private void bttnGastoCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnGastoCalActionPerformed
        CalcGastoCal gastoCalorico = new CalcGastoCal();
        gastoCalorico.setVisible(true);
    }//GEN-LAST:event_bttnGastoCalActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnGastoCal;
    private javax.swing.JButton bttnIMC;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
