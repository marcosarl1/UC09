package view;

import controller.ControllerCalories;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CalcGC extends javax.swing.JFrame implements ErrorDisplayable{

    public CalcGC() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnsFM = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rbFemale = new javax.swing.JRadioButton();
        rbMale = new javax.swing.JRadioButton();
        lblWeight = new javax.swing.JLabel();
        tfWeight = new javax.swing.JTextField();
        tfHeight = new javax.swing.JTextField();
        lblHeight = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        lblAge = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        lblActivity = new javax.swing.JLabel();
        cbActivity = new javax.swing.JComboBox<>();
        bttnCalc = new javax.swing.JButton();
        bttnLimpar = new javax.swing.JButton();
        resultPanel = new javax.swing.JPanel();
        lblGastoBasal = new javax.swing.JLabel();
        lblGastoTotal = new javax.swing.JLabel();
        bttnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IMC");
        setPreferredSize(new java.awt.Dimension(350, 520));
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        lblTitle.setText("Cálculo de Gasto Calórico");

        inputPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel2.setText("Sexo:");

        bttnsFM.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        rbFemale.setText("Feminino");
        rbFemale.setNextFocusableComponent(rbMale);

        bttnsFM.add(rbMale);
        rbMale.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        rbMale.setText("Masculino");
        rbMale.setNextFocusableComponent(tfWeight);

        lblWeight.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblWeight.setText("Peso (kg):");

        tfWeight.setNextFocusableComponent(tfHeight);

        tfHeight.setNextFocusableComponent(tfAge);

        lblHeight.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblHeight.setText("Altura (cm):");

        lblAge.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblAge.setText("Idade:");

        tfAge.setNextFocusableComponent(cbActivity);

        lblActivity.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblActivity.setText("Nível de Atividade:");

        cbActivity.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        cbActivity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentário", "Leve (exercício leve 1 a 3 dias/semana)", "Moderado (exercício moderado 3 a 5 dias/semana)", "Ativo (exercício pesado 5 a 6 dias/semana)", "Extremamente ativo (exercício pesado diário)" }));
        cbActivity.setNextFocusableComponent(bttnCalc);

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
                .addGap(10, 10, 10)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAge))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bttnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttnCalc))
                            .addComponent(cbActivity, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inputPanelLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lblWeight))
                                    .addComponent(tfWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(inputPanelLayout.createSequentialGroup()
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(lblHeight)))))
                        .addGap(10, 10, 10))))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFemale)
                    .addComponent(rbMale))
                .addGap(15, 15, 15)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(lblHeight))
                .addGap(3, 3, 3)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblAge)
                .addGap(3, 3, 3)
                .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblActivity)
                .addGap(3, 3, 3)
                .addComponent(cbActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnCalc, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(bttnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        resultPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblGastoBasal.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblGastoBasal.setText("Gasto Basal:");

        lblGastoTotal.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblGastoTotal.setText("Gasto Total:");

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGastoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGastoBasal, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblGastoBasal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGastoTotal)
                .addContainerGap(9, Short.MAX_VALUE))
        );

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnVoltar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttnVoltar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCalcActionPerformed
        ControllerCalories.calculateCalories(this);
    }//GEN-LAST:event_bttnCalcActionPerformed
    private void bttnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_bttnVoltarActionPerformed

    private void bttnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLimparActionPerformed
        tfHeight.setText("");
        tfWeight.setText("");
        tfAge.setText("");
        cbActivity.setSelectedIndex(0);
        bttnsFM.clearSelection();
    }//GEN-LAST:event_bttnLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCalc;
    private javax.swing.JButton bttnLimpar;
    private javax.swing.JButton bttnVoltar;
    private javax.swing.ButtonGroup bttnsFM;
    private javax.swing.JComboBox<String> cbActivity;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblActivity;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGastoBasal;
    private javax.swing.JLabel lblGastoTotal;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfHeight;
    private javax.swing.JTextField tfWeight;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getCbActivity() {
        return cbActivity;
    }

    public JRadioButton getRbFemale() {
        return rbFemale;
    }

    public JRadioButton getRbMale() {
        return rbMale;
    }

    public JTextField getTfAge() {
        return tfAge;
    }

    public JTextField getTfHeight() {
        return tfHeight;
    }

    public JTextField getTfWeight() {
        return tfWeight;
    }

    public JLabel getLblGastoBasal() {
        return lblGastoBasal;
    }

    public JLabel getLblGastoTotal() {
        return lblGastoTotal;
    }
}
