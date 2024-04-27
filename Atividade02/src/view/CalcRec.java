package view;

public class CalcRec extends javax.swing.JFrame implements ErrorDisplayable{

    public CalcRec() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        lblCal = new javax.swing.JLabel();
        tfCal = new javax.swing.JTextField();
        bttnCalc = new javax.swing.JButton();
        bttnLimpar = new javax.swing.JButton();
        resultPanel = new javax.swing.JPanel();
        lblCarbo = new javax.swing.JLabel();
        lblProtein = new javax.swing.JLabel();
        lblGordura = new javax.swing.JLabel();
        bttnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jLabel1.setText("Recomendações");

        inputPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputPanel.setPreferredSize(new java.awt.Dimension(310, 100));

        lblCal.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblCal.setText("Calorias diárias (kcal):");

        tfCal.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N

        bttnCalc.setBackground(new java.awt.Color(0, 122, 255));
        bttnCalc.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        bttnCalc.setForeground(new java.awt.Color(255, 255, 255));
        bttnCalc.setText("Calcular");

        bttnLimpar.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        bttnLimpar.setText("Limpar");

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCal)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblCal)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                        .addContainerGap(141, Short.MAX_VALUE)
                        .addComponent(bttnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnCalc)))
                .addGap(10, 10, 10))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblCal)
                .addGap(3, 3, 3)
                .addComponent(tfCal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        resultPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCarbo.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblCarbo.setText("Carboidratos (50%):");

        lblProtein.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblProtein.setText("Proteína (25%):");

        lblGordura.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblGordura.setText("Gordura (25%):");

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCarbo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(lblProtein, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGordura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblCarbo)
                .addGap(15, 15, 15)
                .addComponent(lblProtein)
                .addGap(15, 15, 15)
                .addComponent(lblGordura)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        bttnVoltar.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        bttnVoltar.setText("< Voltar");
        bttnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnVoltar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnVoltar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_bttnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCalc;
    private javax.swing.JButton bttnLimpar;
    private javax.swing.JButton bttnVoltar;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCal;
    private javax.swing.JLabel lblCarbo;
    private javax.swing.JLabel lblGordura;
    private javax.swing.JLabel lblProtein;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JTextField tfCal;
    // End of variables declaration//GEN-END:variables
}
