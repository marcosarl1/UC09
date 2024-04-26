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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nutrisoft");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttnIMC.setBackground(new java.awt.Color(0, 122, 255));
        bttnIMC.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        bttnIMC.setForeground(new java.awt.Color(255, 255, 255));
        bttnIMC.setText("IMC");
        bttnIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnIMCActionPerformed(evt);
            }
        });
        jPanel2.add(bttnIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 134, 152, 50));

        bttnGastoCal.setBackground(new java.awt.Color(0, 122, 255));
        bttnGastoCal.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        bttnGastoCal.setForeground(new java.awt.Color(255, 255, 255));
        bttnGastoCal.setText("Gasto Calórico");
        bttnGastoCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnGastoCalActionPerformed(evt);
            }
        });
        jPanel2.add(bttnGastoCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 211, 152, 50));

        jButton3.setBackground(new java.awt.Color(0, 122, 255));
        jButton3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Recomendações");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 288, 152, 50));

        jLabel1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText(" Escolha uma das opções abaixo:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 92, 190, -1));

        jLabel2.setFont(new java.awt.Font("Inter", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NutriSoft");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 35, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnIMCActionPerformed
        CalcIMC calcIMC = new CalcIMC();
        calcIMC.setVisible(true);
    }//GEN-LAST:event_bttnIMCActionPerformed

    private void bttnGastoCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnGastoCalActionPerformed
        CalcGC gastoCalorico = new CalcGC();
        gastoCalorico.setVisible(true);
    }//GEN-LAST:event_bttnGastoCalActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnGastoCal;
    private javax.swing.JButton bttnIMC;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
