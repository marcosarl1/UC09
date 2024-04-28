package view;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.entities.Appt;

public class Home extends javax.swing.JFrame implements DisplayPopups {

    private List<Appt> listAppts = new ArrayList<>();
    private final String[] tblColumns = {"Paciente", "CPF", "Telefone", "Data", "Já era paciente?", "Consulta"};
    DefaultTableModel tableModel = new DefaultTableModel(tblColumns, 0);

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        bttnNewAppt = new javax.swing.JButton();
        bttnDeleteAppt = new javax.swing.JButton();
        bttnEndAppt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppt = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NutriSoft");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        lblTitle.setLabelFor(this);
        lblTitle.setText("Boas vindas ao sistema de agendamento");

        bttnNewAppt.setBackground(new java.awt.Color(0, 122, 255));
        bttnNewAppt.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        bttnNewAppt.setForeground(new java.awt.Color(255, 255, 255));
        bttnNewAppt.setText("Nova Consulta");
        bttnNewAppt.setToolTipText("Abrir tela para cadastro de nova consulta.");
        bttnNewAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnNewApptActionPerformed(evt);
            }
        });

        bttnDeleteAppt.setBackground(new java.awt.Color(0, 122, 255));
        bttnDeleteAppt.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        bttnDeleteAppt.setForeground(new java.awt.Color(255, 255, 255));
        bttnDeleteAppt.setText("Excluir Consulta");
        bttnDeleteAppt.setToolTipText("Excluir consulta selecionada.");
        bttnDeleteAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDeleteApptActionPerformed(evt);
            }
        });

        bttnEndAppt.setBackground(new java.awt.Color(0, 122, 255));
        bttnEndAppt.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        bttnEndAppt.setForeground(new java.awt.Color(255, 255, 255));
        bttnEndAppt.setText("Finalizar Consulta");
        bttnEndAppt.setToolTipText("Abrir tela para finalização de consulta.");
        bttnEndAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEndApptActionPerformed(evt);
            }
        });

        tblAppt.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        tblAppt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "CPF", "Telefone", "Data", "Já era paciente?", "Consulta realizada"
            }
        ));
        tblAppt.setToolTipText("Tabela de consultas.");
        tblAppt.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(tblAppt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnNewAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttnDeleteAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttnEndAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblTitle)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnNewAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnDeleteAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnEndAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnDeleteApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDeleteApptActionPerformed
        deleteAppt(getPositionAppt());
    }//GEN-LAST:event_bttnDeleteApptActionPerformed

    private void bttnEndApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEndApptActionPerformed
        int posAppt = getPositionAppt();
        if (posAppt >= 0) {
            Appt selectedAppt = listAppts.get(posAppt);
            EndAppt endAppt = new EndAppt(this, selectedAppt);
            endAppt.setVisible(true);
        }
    }//GEN-LAST:event_bttnEndApptActionPerformed

    private void bttnNewApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnNewApptActionPerformed
        RegAppt regAppt = new RegAppt(this);
        regAppt.setVisible(true);
    }//GEN-LAST:event_bttnNewApptActionPerformed

    public void addAppt(Appt appt) {
        listAppts.add(appt);
        refreshTable();
    }

    public void refreshTable() {
        if (!listAppts.isEmpty()) {
            Appt appt;
            tableModel = new DefaultTableModel(tblColumns, 0);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            for (int i = 0; i < listAppts.size(); i++) {
                appt = listAppts.get(i);

                String isPatientString;
                if (appt.getIsPatient()) {
                    isPatientString = "Sim";
                } else {
                    isPatientString = "Não";
                }

                String apptDoneString;
                if (appt.getApptDone()) {
                    apptDoneString = "Realizada";
                } else {
                    apptDoneString = "Pendente";
                }

                String apptDateString = appt.getApptDate().format(formatter);

                String[] rowData = {
                    appt.getPatientName(), appt.getCpf(), appt.getTel(), apptDateString, isPatientString, apptDoneString
                };

                tableModel.addRow(rowData);
            }

            tblAppt.setModel(tableModel);
        } else {
            tableModel = new DefaultTableModel(tblColumns, 0);
            tblAppt.setModel(tableModel);
        }
    }

    private int getPositionAppt() {
        int posAppt = tblAppt.getSelectedRow();

        if (posAppt == -1) {
            displayError("Selecione uma consulta.");
        }
        return posAppt;
    }

    private void deleteAppt(int posAppt) {
        if (posAppt >= 0) {
            String[] options = {"Sim", "Não"};

            int delete = JOptionPane.showOptionDialog(rootPane,
                    "Tem certeza que deseja excluir a consulta?",
                    "Exclusão de consulta",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
            if (delete == 0) {
                listAppts.remove(posAppt);
                refreshTable();
            } else {
                tblAppt.clearSelection();
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnDeleteAppt;
    private javax.swing.JButton bttnEndAppt;
    private javax.swing.JButton bttnNewAppt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAppt;
    // End of variables declaration//GEN-END:variables
}
