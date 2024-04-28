package view;

import javax.swing.JCheckBox;
import javax.swing.JTextField;


public class RegAppt extends javax.swing.JFrame implements ErrorDisplay{

    public RegAppt() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        InputPanel = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        textTel = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        textCPF = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        textDate = new javax.swing.JTextField();
        chkIsPacient = new javax.swing.JCheckBox();
        bttnCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 480));
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        lblTitle.setText("Cadastrar Consulta");

        lblName.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblName.setText("Nome do(a) Paciente:");

        textName.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N

        lblTel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblTel.setText("Telefone:");

        textTel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N

        lblCPF.setText("CPF:");

        textCPF.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N

        lblDate.setText("Data da Consulta:");

        textDate.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N

        chkIsPacient.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        chkIsPacient.setText("Já é paciente?");
        chkIsPacient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIsPacientActionPerformed(evt);
            }
        });

        bttnCalc.setBackground(new java.awt.Color(0, 122, 255));
        bttnCalc.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        bttnCalc.setForeground(new java.awt.Color(255, 255, 255));
        bttnCalc.setText("Cadastrar");

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textName, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                        .addComponent(textTel)
                        .addComponent(textCPF)
                        .addGroup(InputPanelLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblName)
                                .addComponent(lblTel)
                                .addComponent(lblCPF)))
                        .addGroup(InputPanelLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(lblDate)))
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textDate)
                            .addComponent(chkIsPacient)
                            .addComponent(bttnCalc, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        InputPanelLayout.setVerticalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTel)
                .addGap(3, 3, 3)
                .addComponent(textTel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCPF)
                .addGap(3, 3, 3)
                .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDate)
                .addGap(3, 3, 3)
                .addComponent(textDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkIsPacient)
                .addGap(12, 12, 12)
                .addComponent(bttnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(InputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitle))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkIsPacientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIsPacientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIsPacientActionPerformed

    public JCheckBox getChkIsPacient() {
        return chkIsPacient;
    }

    public JTextField getTextCPF() {
        return textCPF;
    }

    public JTextField getTextDate() {
        return textDate;
    }

    public JTextField getTextName() {
        return textName;
    }

    public JTextField getTextTel() {
        return textTel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InputPanel;
    private javax.swing.JButton bttnCalc;
    private javax.swing.JCheckBox chkIsPacient;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField textCPF;
    private javax.swing.JTextField textDate;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textTel;
    // End of variables declaration//GEN-END:variables
}
