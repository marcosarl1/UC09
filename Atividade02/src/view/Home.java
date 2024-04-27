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
        bttnRec = new javax.swing.JButton();
        lblSubTitle = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

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
        bttnIMC.setToolTipText("Abrir tela de cálculo de IMC.");
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
        bttnGastoCal.setToolTipText("Abrir tela de gasto calórico.");
        bttnGastoCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnGastoCalActionPerformed(evt);
            }
        });
        jPanel2.add(bttnGastoCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 211, 152, 50));

        bttnRec.setBackground(new java.awt.Color(0, 122, 255));
        bttnRec.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        bttnRec.setForeground(new java.awt.Color(255, 255, 255));
        bttnRec.setText("Recomendações");
        bttnRec.setToolTipText("Abrir tela de cálculo de recomendações.");
        bttnRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRecActionPerformed(evt);
            }
        });
        jPanel2.add(bttnRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 288, 152, 50));

        lblSubTitle.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblSubTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblSubTitle.setText(" Escolha uma das opções abaixo:");
        jPanel2.add(lblSubTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 92, 190, -1));

        lblTitle.setFont(new java.awt.Font("Inter", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("NutriSoft");
        jPanel2.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 35, 170, -1));

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

    private void bttnRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRecActionPerformed
        CalcRec calcRec = new CalcRec();
        calcRec.setVisible(true);
    }//GEN-LAST:event_bttnRecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnGastoCal;
    private javax.swing.JButton bttnIMC;
    private javax.swing.JButton bttnRec;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
