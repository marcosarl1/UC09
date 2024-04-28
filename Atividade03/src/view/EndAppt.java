package view;

import javax.swing.JTextArea;
import model.entities.Appt;

public class EndAppt extends javax.swing.JFrame implements DisplayPopups {

    private final Appt selectedAppt;

    public EndAppt(Appt appt) {
        this.selectedAppt = appt;
        initComponents();
        setLocationRelativeTo(null);
        updateDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneText = new javax.swing.JScrollPane();
        textPrescription = new javax.swing.JTextArea();
        bttnEnd = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        chkIsApptDone = new javax.swing.JCheckBox();
        bttnCancel = new javax.swing.JButton();
        lblPrescription = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 370));
        setResizable(false);

        textPrescription.setBackground(new java.awt.Color(255, 255, 255));
        textPrescription.setColumns(20);
        textPrescription.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        textPrescription.setForeground(new java.awt.Color(0, 0, 0));
        textPrescription.setRows(5);
        textPrescription.setPreferredSize(new java.awt.Dimension(235, 86));
        scrollPaneText.setViewportView(textPrescription);

        bttnEnd.setBackground(new java.awt.Color(0, 122, 255));
        bttnEnd.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        bttnEnd.setForeground(new java.awt.Color(255, 255, 255));
        bttnEnd.setText("Finalizar");
        bttnEnd.setVisible(false);
        if (!selectedAppt.getApptDone()){
            bttnEnd.setVisible(true);
        }
        bttnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEndActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        lblTitle.setText("Detalhes da Consulta");

        chkIsApptDone.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        chkIsApptDone.setText("Consulta Realizada");

        bttnCancel.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        bttnCancel.setText("Cancelar");
        bttnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCancelActionPerformed(evt);
            }
        });

        lblPrescription.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblPrescription.setText("Receita e observações:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitle)
                    .addComponent(chkIsApptDone)
                    .addComponent(scrollPaneText, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblPrescription)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addGap(15, 15, 15)
                .addComponent(chkIsApptDone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrescription)
                .addGap(3, 3, 3)
                .addComponent(scrollPaneText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_bttnCancelActionPerformed

    private void bttnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEndActionPerformed
        finalizeAppt();
    }//GEN-LAST:event_bttnEndActionPerformed

    private void updateDetails() {
        if (selectedAppt != null) {
            textPrescription.setText(selectedAppt.getPrescription());
            chkIsApptDone.setSelected(selectedAppt.getApptDone());
            chkIsApptDone.setEnabled(!selectedAppt.getApptDone());
            textPrescription.setEditable(!selectedAppt.getApptDone());
            updateButtonsVisibility();
        }
    }
    
    private void updateButtonsVisibility(){
        if (selectedAppt != null && !selectedAppt.getApptDone()){
            bttnEnd.setVisible(true);
            bttnCancel.setVisible(true);
        } else {
            bttnEnd.setVisible(false);
            bttnCancel.setVisible(false);
        }
    }
    
    private void finalizeAppt(){
        String prescriptionText = textPrescription.getText().trim();
        if (!prescriptionText.isEmpty()) {
            selectedAppt.setPrescription(prescriptionText);
            selectedAppt.setApptDone(true);
            displaySuccess("Consulta finalizada com sucesso!");
            dispose();
        } else {
            displayError("Preencha o campo de receita e observações.");
        }  
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCancel;
    private javax.swing.JButton bttnEnd;
    private javax.swing.JCheckBox chkIsApptDone;
    private javax.swing.JLabel lblPrescription;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollPaneText;
    private javax.swing.JTextArea textPrescription;
    // End of variables declaration//GEN-END:variables
}
