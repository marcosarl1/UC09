package view;

public class Home extends javax.swing.JFrame implements ErrorDisplay{

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneTable = new javax.swing.JScrollPane();
        tblAppt = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        bttnNewAppt = new javax.swing.JButton();
        bttnDeleteAppt = new javax.swing.JButton();
        bttnEndAppt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NutriSoft");
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        tblAppt.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        tblAppt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Paciente", "CPF", "Telefone", "Data"
            }
        ));
        scrollPaneTable.setViewportView(tblAppt);

        lblTitle.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        lblTitle.setText("Boas vindas ao sistema de agendamento");

        bttnNewAppt.setBackground(new java.awt.Color(0, 122, 255));
        bttnNewAppt.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        bttnNewAppt.setForeground(new java.awt.Color(255, 255, 255));
        bttnNewAppt.setText("Nova Consulta");
        bttnNewAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnNewApptActionPerformed(evt);
            }
        });

        bttnDeleteAppt.setBackground(new java.awt.Color(0, 122, 255));
        bttnDeleteAppt.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        bttnDeleteAppt.setForeground(new java.awt.Color(255, 255, 255));
        bttnDeleteAppt.setText("Excluir Consulta");
        bttnDeleteAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDeleteApptActionPerformed(evt);
            }
        });

        bttnEndAppt.setBackground(new java.awt.Color(0, 122, 255));
        bttnEndAppt.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        bttnEndAppt.setForeground(new java.awt.Color(255, 255, 255));
        bttnEndAppt.setText("Finalizar Consulta");
        bttnEndAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEndApptActionPerformed(evt);
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
                        .addComponent(bttnNewAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttnDeleteAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttnEndAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblTitle)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnNewAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnDeleteAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnEndAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnDeleteApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDeleteApptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnDeleteApptActionPerformed

    private void bttnEndApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEndApptActionPerformed
        EndAppt endAppt = new EndAppt();
        endAppt.setVisible(true);
    }//GEN-LAST:event_bttnEndApptActionPerformed

    private void bttnNewApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnNewApptActionPerformed
        RegAppt regAppt = new RegAppt();
        regAppt.setVisible(true);
    }//GEN-LAST:event_bttnNewApptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnDeleteAppt;
    private javax.swing.JButton bttnEndAppt;
    private javax.swing.JButton bttnNewAppt;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable tblAppt;
    // End of variables declaration//GEN-END:variables
}
