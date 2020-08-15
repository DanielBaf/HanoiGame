package View;

public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();
        bToAButton = new javax.swing.JButton();
        cToBButton = new javax.swing.JButton();
        aToCButton = new javax.swing.JButton();
        aToBButton = new javax.swing.JButton();
        bToCButton = new javax.swing.JButton();
        cToAButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        aTowerTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        cTowerTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        bTowerTable = new javax.swing.JTable();
        nDisksComboBox = new javax.swing.JComboBox<>();
        nDisksLabel = new javax.swing.JLabel();
        minMovsLabel = new javax.swing.JLabel();
        minimumMovesTextField = new javax.swing.JTextField();
        userMovesTextField = new javax.swing.JTextField();
        userMovLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        containerPanel.setBackground(new java.awt.Color(51, 51, 51));
        containerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bToAButton.setBackground(new java.awt.Color(0, 0, 0));
        bToAButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bToAButton.setForeground(new java.awt.Color(255, 255, 255));
        bToAButton.setText("A");
        bToAButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 137, 56), new java.awt.Color(255, 211, 57), java.awt.Color.pink, new java.awt.Color(51, 51, 51)));

        cToBButton.setBackground(new java.awt.Color(0, 0, 0));
        cToBButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cToBButton.setForeground(new java.awt.Color(255, 255, 255));
        cToBButton.setText("B");
        cToBButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 137, 56), new java.awt.Color(255, 211, 57), java.awt.Color.pink, new java.awt.Color(51, 51, 51)));

        aToCButton.setBackground(new java.awt.Color(0, 0, 0));
        aToCButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        aToCButton.setForeground(new java.awt.Color(255, 255, 255));
        aToCButton.setText("C");
        aToCButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 137, 56), new java.awt.Color(255, 211, 57), java.awt.Color.pink, new java.awt.Color(51, 51, 51)));

        aToBButton.setBackground(new java.awt.Color(0, 0, 0));
        aToBButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        aToBButton.setForeground(new java.awt.Color(255, 255, 255));
        aToBButton.setText("B");
        aToBButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 137, 56), new java.awt.Color(255, 211, 57), java.awt.Color.pink, new java.awt.Color(51, 51, 51)));

        bToCButton.setBackground(new java.awt.Color(0, 0, 0));
        bToCButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bToCButton.setForeground(new java.awt.Color(255, 255, 255));
        bToCButton.setText("C");
        bToCButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 137, 56), new java.awt.Color(255, 211, 57), java.awt.Color.pink, new java.awt.Color(51, 51, 51)));

        cToAButton.setBackground(new java.awt.Color(0, 0, 0));
        cToAButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cToAButton.setForeground(new java.awt.Color(255, 255, 255));
        cToAButton.setText("A");
        cToAButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 137, 56), new java.awt.Color(255, 211, 57), java.awt.Color.pink, new java.awt.Color(51, 51, 51)));

        aTowerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        aTowerTable.setAutoscrolls(false);
        aTowerTable.setFocusable(false);
        aTowerTable.setRowSelectionAllowed(false);
        aTowerTable.setShowHorizontalLines(false);
        aTowerTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(aTowerTable);
        if (aTowerTable.getColumnModel().getColumnCount() > 0) {
            aTowerTable.getColumnModel().getColumn(0).setResizable(false);
        }

        cTowerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cTowerTable.setAutoscrolls(false);
        cTowerTable.setFocusable(false);
        cTowerTable.setRowSelectionAllowed(false);
        cTowerTable.setShowHorizontalLines(false);
        cTowerTable.setShowVerticalLines(false);
        jScrollPane2.setViewportView(cTowerTable);
        if (cTowerTable.getColumnModel().getColumnCount() > 0) {
            cTowerTable.getColumnModel().getColumn(0).setResizable(false);
        }

        bTowerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bTowerTable.setAutoscrolls(false);
        bTowerTable.setFocusable(false);
        bTowerTable.setRowSelectionAllowed(false);
        bTowerTable.setShowHorizontalLines(false);
        bTowerTable.setShowVerticalLines(false);
        jScrollPane3.setViewportView(bTowerTable);
        if (bTowerTable.getColumnModel().getColumnCount() > 0) {
            bTowerTable.getColumnModel().getColumn(0).setResizable(false);
        }

        nDisksComboBox.setBackground(new java.awt.Color(0, 0, 0));
        nDisksComboBox.setForeground(new java.awt.Color(204, 204, 204));
        nDisksComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        nDisksComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.orange, java.awt.Color.darkGray));

        nDisksLabel.setForeground(new java.awt.Color(255, 255, 255));
        nDisksLabel.setText("Numero de discos:");

        minMovsLabel.setForeground(new java.awt.Color(255, 255, 255));
        minMovsLabel.setText("Movimientos minimos:");

        minimumMovesTextField.setBackground(new java.awt.Color(0, 0, 0));
        minimumMovesTextField.setForeground(new java.awt.Color(153, 0, 51));
        minimumMovesTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minimumMovesTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.orange, java.awt.Color.darkGray));

        userMovesTextField.setBackground(new java.awt.Color(0, 0, 0));
        userMovesTextField.setForeground(new java.awt.Color(204, 204, 204));
        userMovesTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userMovesTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.orange, java.awt.Color.darkGray));

        userMovLabel.setForeground(new java.awt.Color(255, 255, 255));
        userMovLabel.setText("Tus Movimientos:");

        startButton.setBackground(new java.awt.Color(0, 0, 0));
        startButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("INICIAR");
        startButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 176, 117), new java.awt.Color(255, 255, 153), new java.awt.Color(255, 170, 166), new java.awt.Color(51, 51, 51)));

        restartButton.setBackground(new java.awt.Color(0, 0, 0));
        restartButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        restartButton.setForeground(new java.awt.Color(255, 255, 255));
        restartButton.setText("REINICIAR");
        restartButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 176, 117), new java.awt.Color(255, 255, 153), new java.awt.Color(255, 170, 166), new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(containerPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(aToBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aToCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                                .addComponent(bToAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bToCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(cToAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cToBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(containerPanelLayout.createSequentialGroup()
                                .addComponent(minMovsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(minimumMovesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(containerPanelLayout.createSequentialGroup()
                                .addComponent(userMovLabel)
                                .addGap(10, 10, 10)
                                .addComponent(userMovesTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                                .addComponent(nDisksLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nDisksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(aToCButton)
                        .addComponent(aToBButton))
                    .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cToBButton)
                        .addComponent(cToAButton))
                    .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bToAButton)
                        .addComponent(bToCButton)))
                .addGap(21, 21, 21)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nDisksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nDisksLabel))
                .addGap(18, 18, 18)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minMovsLabel)
                    .addComponent(minimumMovesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userMovLabel)
                    .addComponent(userMovesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(restartButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton aToBButton;
    public javax.swing.JButton aToCButton;
    public javax.swing.JTable aTowerTable;
    public javax.swing.JButton bToAButton;
    public javax.swing.JButton bToCButton;
    public javax.swing.JTable bTowerTable;
    public javax.swing.JButton cToAButton;
    public javax.swing.JButton cToBButton;
    public javax.swing.JTable cTowerTable;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel minMovsLabel;
    public javax.swing.JTextField minimumMovesTextField;
    public javax.swing.JComboBox<String> nDisksComboBox;
    private javax.swing.JLabel nDisksLabel;
    public javax.swing.JButton restartButton;
    public javax.swing.JButton startButton;
    private javax.swing.JLabel userMovLabel;
    public javax.swing.JTextField userMovesTextField;
    // End of variables declaration//GEN-END:variables
}
