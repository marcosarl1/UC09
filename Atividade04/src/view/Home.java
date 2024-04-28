package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    private final String[] tblColumns = {"Data", "Hora", "Pressão Sistólica", "Pressão Diastólica", "Estresse"};
    DefaultTableModel tableModel = new DefaultTableModel(tblColumns, 0);
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        tblRegistro.setModel(tableModel);
        shortcuts();
        readData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnsYN = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSistolica = new javax.swing.JTextField();
        lblDiastolica = new javax.swing.JLabel();
        txtDiastolica = new javax.swing.JTextField();
        bttnYes = new javax.swing.JRadioButton();
        bttnNo = new javax.swing.JRadioButton();
        lblStress = new javax.swing.JLabel();
        bttnSave = new javax.swing.JButton();
        scrollPaneTbl = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HeartSoft");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Inter", 0, 32)); // NOI18N
        jLabel1.setText("Registro de Pressão Arterial");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(2, 365));

        lblData.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        lblData.setLabelFor(txtData);
        lblData.setText("Data:");

        txtData.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtData.setToolTipText("Insira a data da medição (Exemplo: 05/12/2024).");
        txtData.setNextFocusableComponent(txtHora);

        lblHora.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        lblHora.setLabelFor(txtHora);
        lblHora.setText("Hora:");

        txtHora.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtHora.setToolTipText("Insira a hora da medição (Exemplo: 18:45).");
        txtHora.setNextFocusableComponent(txtSistolica);

        jLabel4.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        jLabel4.setLabelFor(txtSistolica);
        jLabel4.setText("Pressão Sistólica:");

        txtSistolica.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtSistolica.setToolTipText("Insira a pressão sistólica.");
        txtSistolica.setNextFocusableComponent(txtDiastolica);

        lblDiastolica.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        lblDiastolica.setLabelFor(txtDiastolica);
        lblDiastolica.setText("Pressão Diastólica:");

        txtDiastolica.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtDiastolica.setToolTipText("Insira a pressão diastólica.");
        txtDiastolica.setNextFocusableComponent(bttnYes);

        bttnsYN.add(bttnYes);
        bttnYes.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        bttnYes.setText("Sim");
        bttnYes.setToolTipText("Marque se estava em situação de estresse durante medição.");
        bttnYes.setNextFocusableComponent(bttnNo);

        bttnsYN.add(bttnNo);
        bttnNo.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        bttnNo.setText("Não");
        bttnNo.setToolTipText("Marque se não estava em situação de estresse durante medição.");
        bttnNo.setNextFocusableComponent(bttnSave);

        lblStress.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        lblStress.setLabelFor(bttnYes);
        lblStress.setText("Em situação de estresse?");

        bttnSave.setBackground(new java.awt.Color(0, 122, 255));
        bttnSave.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        bttnSave.setForeground(new java.awt.Color(255, 255, 255));
        bttnSave.setText("Salvar");
        bttnSave.setToolTipText("Clique para salvar ou aperte a tecla Enter no teclado.");
        bttnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblData)
                    .addComponent(txtData)
                    .addComponent(txtHora)
                    .addComponent(txtSistolica)
                    .addComponent(txtDiastolica)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHora)
                            .addComponent(jLabel4)
                            .addComponent(lblDiastolica)))
                    .addComponent(lblStress)
                    .addComponent(bttnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblData)
                .addGap(3, 3, 3)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHora)
                .addGap(3, 3, 3)
                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(txtSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDiastolica)
                .addGap(3, 3, 3)
                .addComponent(txtDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblStress)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnYes)
                    .addComponent(bttnNo))
                .addGap(18, 18, 18)
                .addComponent(bttnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        txtData.getAccessibleContext().setAccessibleName("Data");
        txtHora.getAccessibleContext().setAccessibleName("Hora");
        txtSistolica.getAccessibleContext().setAccessibleName("Pressão Sistólica");
        txtDiastolica.getAccessibleContext().setAccessibleName("Pressão Diastólica");

        scrollPaneTbl.setToolTipText("");

        tblRegistro.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Hora", "Pressão Sistólica", "Pressão Diastólica", "Estresse"
            }
        ));
        tblRegistro.setToolTipText("Tabela de registro dos dados.");
        scrollPaneTbl.setViewportView(tblRegistro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(scrollPaneTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(292, 292, 292))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(scrollPaneTbl))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSaveActionPerformed
        try {
            validateInputs();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bttnSaveActionPerformed

    private void shortcuts() {
        getRootPane().setDefaultButton(bttnSave);
    }

    private void validateInputs() {
        String dataString = txtData.getText().trim();
        String horaString = txtHora.getText().trim();
        String sistolicaString = txtSistolica.getText().trim();
        String diastolicaString = txtDiastolica.getText().trim();

        if (dataString.isEmpty() && horaString.isEmpty() && sistolicaString.isEmpty() && diastolicaString.isEmpty() && !bttnYes.isSelected() && !bttnNo.isSelected()) {
            throw new IllegalArgumentException("Preencha todos os campos!");
        } else if (dataString.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo data.");
        } else if (horaString.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo hora.");
        } else if (sistolicaString.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo Pressão Sistólica.");
        } else if (diastolicaString.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo Pressão Diastólica.");
        } else if (!bttnYes.isSelected() && !bttnNo.isSelected()) {
            throw new IllegalArgumentException("Selecione se estava em situação de estresse ou não.");
        }

        try {
            LocalDate.parse(dataString, FORMATTER);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException("Formato de data inválido. Use o formato dd/MM/aaaa");
        }

        try {
            LocalTime.parse(horaString);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException("Formato de hora inválido. Use o formato HH:mm");
        }

        try {
            Integer.valueOf(sistolicaString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Por favor, insira valores númericos para a pressão sistólica");
        }

        try {
            Integer.valueOf(diastolicaString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Por favor, insira valores númericos para a pressão diastólica");
        }

        if (Integer.parseInt(sistolicaString) < 0) {
            throw new IllegalArgumentException("Pressão Sistólica deve ser maior que zero.");
        }

        if (Integer.parseInt(diastolicaString) < 0) {
            throw new IllegalArgumentException("Pressão Diastólica deve ser maior que zero.");
        }

        saveData(dataString, horaString, sistolicaString, diastolicaString);
    }

    private void saveData(String dataString, String horaString, String sistolicaString, String diastolicaString) {
        LocalDate data = LocalDate.parse(dataString, FORMATTER);
        LocalTime hora = LocalTime.parse(horaString);
        boolean stress = bttnYes.isSelected();
        String stressText = stress ? "Sim" : "Não";

        String[] rowData = {data.toString(), hora.toString(), sistolicaString, diastolicaString, stressText};

        String csvRow = String.join(",", rowData);

        try {
            FileWriter writer = new FileWriter("dados_pressao.csv", true);
            try (BufferedWriter buffer = new BufferedWriter(writer)) {
                buffer.write(csvRow);
                buffer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Dados registrados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            readData();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar dados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void readData() {
        String csvFile = "dados_pressao.csv";
        String line;
        String csvSplitBy = ",";

        tableModel.setRowCount(0);

        try (BufferedReader buffer = new BufferedReader(new FileReader(csvFile))) {
            while ((line = buffer.readLine()) != null) {
                String[] rowData = line.split(csvSplitBy);
                tableModel.addRow(rowData);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler os dados do arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bttnNo;
    private javax.swing.JButton bttnSave;
    private javax.swing.JRadioButton bttnYes;
    private javax.swing.ButtonGroup bttnsYN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDiastolica;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblStress;
    private javax.swing.JScrollPane scrollPaneTbl;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDiastolica;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtSistolica;
    // End of variables declaration//GEN-END:variables
}
