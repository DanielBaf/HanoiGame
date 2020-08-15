package Controller;

import Model.*;
import View.Game;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ControllerClass implements ActionListener{
    Game game;
    Pile pileTowerA, pileTowerB, pileTowerC;
    Node node;

    DefaultTableModel modelTowerA, modelTowerB, modelTowerC;
    
    int nMovements = 0, objective = 0, maxRows = 10;
    
    double minMovs = 0;
    
    boolean stopGame = false;
    
    
    public ControllerClass(Game game) {
        this.game = game;
        castModels();
        centerTables();
        this.game.startButton.addActionListener(this);
        this.game.restartButton.addActionListener(this);
    }
    
    /**
     * to rewrite the tables in running time
     */
    public void castModels(){
        this.modelTowerA = (DefaultTableModel)(this.game.aTowerTable.getModel());//save the info in the actual table for a re declaration
        this.modelTowerA.setRowCount(this.maxRows);//we put the max number of rows in a table for piles
        this.modelTowerB = (DefaultTableModel)(this.game.bTowerTable.getModel());
        this.modelTowerB.setRowCount(this.maxRows);
        this.modelTowerC = (DefaultTableModel)(this.game.cTowerTable.getModel());
        this.modelTowerC.setRowCount(this.maxRows);
    }
    
    public void begin(){
        this.game.setLocationRelativeTo(null);
        this.game.setResizable(false);
        this.game.setVisible(true);
    }
    
    /**
     * the default renderer is in the left side of the table
     * this centers the text
     */
    private void centerTables(){
        DefaultTableCellRenderer renderA = new DefaultTableCellRenderer();//a center render
        renderA.setHorizontalAlignment(SwingConstants.CENTER);//config
        this.game.aTowerTable.getColumnModel().getColumn(0).setCellRenderer(renderA);//set the table like the savede render up
        DefaultTableCellRenderer renderB = new DefaultTableCellRenderer();
        renderA.setHorizontalAlignment(SwingConstants.CENTER);
        this.game.bTowerTable.getColumnModel().getColumn(0).setCellRenderer(renderB);
        DefaultTableCellRenderer renderC = new DefaultTableCellRenderer();
        renderA.setHorizontalAlignment(SwingConstants.CENTER);
        this.game.cTowerTable.getColumnModel().getColumn(0).setCellRenderer(renderC);
    }
    
    /**
     * restart the boxes for a new game
     */
    private void clean(){
        this.nMovements = 0;
        this.minMovs = 0;
        this.game.nDisksComboBox.setSelectedItem(String.valueOf(this.objective));
    }
    

    private void showCantMoves(){
        this.nMovements++;
        this.game.userMovesTextField.setText(String.valueOf(this.nMovements));
    }
    
    /**
     * initialize the piles 
     */
    private void start(){
        try {
            //re initialize the piles 
            this.pileTowerA = new Pile();
            this.pileTowerB = new Pile();
            this.pileTowerC = new Pile();
            this.objective = Integer.parseInt(this.game.nDisksComboBox.getSelectedItem().toString());//the users select the number of disks
            this.minMovs = ((Math.pow(2, this.objective)) - 1);
            //show the movements
            this.game.userMovesTextField.setText(String.valueOf(this.nMovements));
            this.game.minimumMovesTextField.setText(String.valueOf(String.format("%.0f", this.minMovs)));
            //draw the table
            for (int x = this.objective; x >= 1; x--) {
                Node platform = new Node();
                String disk = "";
                for (int y = x; y >= 0; y--) {
                    disk += "#";
                }
                platform.setFact(disk);
                //we always start the disks in the tower a
                this.pileTowerA.push(platform);
            }
            showTowerA();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * re start the actual game and clean the boxes 
     */
    private void restart(){
        try {
            if(this.game.minimumMovesTextField.getText().equals("")){
                clean(); start();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void showTowerA(){
        //1st clean the table
        ((DefaultTableModel)(this.game.aTowerTable.getModel())).setRowCount(0);
        this.modelTowerA.setRowCount(this.maxRows);//re asign the max rows
        //on pile
        Node nodeTemp;
        int rowDisk = (this.maxRows-this.pileTowerA.getNodeMeter());
        
        if(this.pileTowerA.getNodeMeter()>0){
            for(nodeTemp = this.pileTowerA.getHeadNode(); nodeTemp.getDownNode() != null; nodeTemp = nodeTemp.getDownNode()){
                String[] normalVector = {nodeTemp.getFact()};
                this.modelTowerA.insertRow(rowDisk, normalVector);
                rowDisk++;
            }
            if(nodeTemp.getDownNode() == null){
                String[] normalVector = {nodeTemp.getFact()};
                this.modelTowerA.insertRow(rowDisk, normalVector);
            }
        }
        this.game.aTowerTable.setModel(this.modelTowerA);
        this.modelTowerA.setRowCount(this.maxRows);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.game.startButton)
            start();
        else if (e.getSource() == this.game.restartButton)
            restart();
    }
    
}
