package view;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;

import controller.ControllerIMC;

public class CalcIMC extends javax.swing.JFrame implements ErrorDisplayable{

    public CalcIMC() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        lblAltura = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        tfHeight = new javax.swing.JTextField();
        tfWeight = new javax.swing.JTextField();
        bttnCalc = new javax.swing.JButton();
        bttnLimpar = new javax.swing.JButton();
        resultPanel = new javax.swing.JPanel();
        lblResultado = new javax.swing.JLabel();
        lblInterpretacao = new javax.swing.JLabel();
        bttnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IMC");
        setPreferredSize(new java.awt.Dimension(350, 370));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(350, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 370));

        lblTitle.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        lblTitle.setText("Cálculo de IMC");

        inputPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAltura.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblAltura.setText("Altura (m):");

        lblPeso.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblPeso.setText("Peso (kg):");

        tfHeight.setToolTipText("Insira a altura");
        tfHeight.setNextFocusableComponent(tfWeight);
        tfHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfHeightKeyPressed(evt);
            }
        });

        tfWeight.setToolTipText("Insira o peso");
        tfWeight.setNextFocusableComponent(bttnCalc);
        tfWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfWeightKeyPressed(evt);
            }
        });

        bttnCalc.setBackground(new java.awt.Color(0, 122, 255));
        bttnCalc.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        bttnCalc.setForeground(new java.awt.Color(255, 255, 255));
        bttnCalc.setText("Calcular");
        bttnCalc.setNextFocusableComponent(bttnLimpar);
        bttnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCalcActionPerformed(evt);
            }
        });

        bttnLimpar.setText("Limpar");
        bttnLimpar.setNextFocusableComponent(bttnVoltar);
        bttnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(bttnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttnCalc))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAltura)
                            .addComponent(lblPeso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(tfWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura)
                    .addComponent(tfHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(tfWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(bttnCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        resultPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblResultado.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblResultado.setText("Resultado:");

        lblInterpretacao.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblInterpretacao.setText("Interpretação:");

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInterpretacao, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblResultado)
                .addGap(15, 15, 15)
                .addComponent(lblInterpretacao)
                .addGap(10, 10, 10))
        );

        bttnVoltar.setText("< Voltar");
        bttnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitle)
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttnVoltar)
                        .addGap(48, 48, 48))
                    .addComponent(resultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttnVoltar)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCalcActionPerformed
        ControllerIMC.calculateIMC(this);
    }//GEN-LAST:event_bttnCalcActionPerformed

    private void bttnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_bttnVoltarActionPerformed
    private void bttnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLimparActionPerformed
        tfHeight.setText("");
        tfWeight.setText("");
    }//GEN-LAST:event_bttnLimparActionPerformed

    private void tfHeightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHeightKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            tfWeight.requestFocusInWindow();
        }
    }//GEN-LAST:event_tfHeightKeyPressed

    private void tfWeightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWeightKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            bttnCalc.doClick();
        }
    }//GEN-LAST:event_tfWeightKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCalc;
    private javax.swing.JButton bttnLimpar;
    private javax.swing.JButton bttnVoltar;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblInterpretacao;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JTextField tfHeight;
    private javax.swing.JTextField tfWeight;
    // End of variables declaration//GEN-END:variables

    public JTextField getTfHeight() {
        return tfHeight;
    }

    public JTextField getTfWeight() {
        return tfWeight;
    }

    public JLabel getLblInterpretacao() {
        return lblInterpretacao;
    }

    public JLabel getLblResultado() {
        return lblResultado;
    }
}
