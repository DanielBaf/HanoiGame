package Controller;

import Model.*;
import View.Game;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ControllerClass implements ActionListener{
    Game game;    

    DefaultTableModel modelTowerA, modelTowerB, modelTowerC;
    
    int objective = 0, maxRows = 10, movesPlayer = 0;
    
    double minMovs = 0;
    
    boolean stopGame = false;
    
    ArrayList<Disk> pile1, pile2, pile3;
    
    public ControllerClass(Game game) {
        this.game = game;
        setButtonsEnabled(false);
        castModels();
        centerTables();
        setArrayLists();
        setActionListener();  
    }            
    /**
     * to rewrite the tables in running time
     */
    public void castModels(){
        this.modelTowerA = (DefaultTableModel)(this.game.aTowerTable.getModel());//save the info in the actual table for a re declaration
        this.modelTowerB = (DefaultTableModel)(this.game.bTowerTable.getModel());
        this.modelTowerC = (DefaultTableModel)(this.game.cTowerTable.getModel());
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
        renderB.setHorizontalAlignment(SwingConstants.CENTER);
        this.game.bTowerTable.getColumnModel().getColumn(0).setCellRenderer(renderB);
        DefaultTableCellRenderer renderC = new DefaultTableCellRenderer();
        renderC.setHorizontalAlignment(SwingConstants.CENTER);
        this.game.cTowerTable.getColumnModel().getColumn(0).setCellRenderer(renderC);
    }
    
    private void setButtonsEnabled(boolean enabled){
        this.game.aToBButton.setEnabled(enabled);
        this.game.aToCButton.setEnabled(enabled);
        this.game.bToAButton.setEnabled(enabled);
        this.game.bToCButton.setEnabled(enabled);
        this.game.cToAButton.setEnabled(enabled);
        this.game.cToBButton.setEnabled(enabled);
    }
    
    private void setArrayLists(){
        this.pile1 = new ArrayList<Disk>();
        this.pile2 = new ArrayList<Disk>();
        this.pile3 = new ArrayList<Disk>();
    }     
    
    private void setActionListener(){
        this.game.startButton.addActionListener(this);
        this.game.restartButton.addActionListener(this);
        this.game.aToBButton.addActionListener(this);
        this.game.aToCButton.addActionListener(this);
        this.game.bToAButton.addActionListener(this);
        this.game.bToCButton.addActionListener(this);
        this.game.cToAButton.addActionListener(this);
        this.game.cToBButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.game.startButton)
            start();
        else if (e.getSource() == this.game.aToBButton)
            moveDiskAToB();
        else if (e.getSource() == this.game.aToCButton)
            moveDiskAToC();
        else if (e.getSource() == this.game.bToAButton)
            moveDiskBToA();
        else if (e.getSource() == this.game.bToCButton)
            moveDiskBToC();
        else if (e.getSource() == this.game.cToAButton)
            moveDiskCToA();
        else if (e.getSource() == this.game.cToBButton)
            moveDiskCToB();
        else if (e.getSource() == this.game.restartButton)
            start();
    }
    
    
    private void start(){           
        setArrayLists();
        this.movesPlayer = 0;
        this.stopGame = false;
        this.objective = Integer.parseInt(this.game.nDisksComboBox.getSelectedItem().toString());//the users select the number of disks
        this.game.userMovesTextField.setText(String.valueOf(this.movesPlayer));
        this.minMovs = ((Math.pow(2, this.objective)) - 1);
        this.game.minimumMovesTextField.setText(String.valueOf(String.format("%.0f", this.minMovs)));
        for (int i = 0; i < this.objective; i++) {
            Disk tower = new Disk();
            String bodyDisk = ""; 
            for (int j = (this.objective-i); j >= 0; j--) {
                bodyDisk += "#"; 
            }
            tower.setBodyTower(bodyDisk);
            tower.setValueTower(this.objective-i);
            this.pile1.add(tower);
        }
        showPiles();        
        setButtonsEnabled(true);
    }        
    
    private void moveDiskAToB(){
        moveDisk(this.pile1,this.pile2);
    }
    
    private void moveDiskAToC(){
        moveDisk(this.pile1,this.pile3);
    }
    
    private void moveDiskBToA(){
        moveDisk(this.pile2,this.pile1);
    }
    
    private void moveDiskBToC(){
        moveDisk(this.pile2,this.pile3);
    }
    
    private void moveDiskCToA(){
        moveDisk(this.pile3,this.pile1);
    }
    
    private void moveDiskCToB(){
        moveDisk(this.pile3,this.pile2);
    }
    
    private void moveDisk(ArrayList<Disk> pileToQuit, ArrayList<Disk> pileToMove){        
        try{            
            Disk diskTopQuit = pileToQuit.get(pileToQuit.size()-1);
            try{
                Disk diskTopMove = pileToMove.get(pileToMove.size()-1);
                if (diskTopMove.getValueTower() > diskTopQuit.getValueTower()) {
                    pileToQuit.remove(pileToQuit.size()-1);
                    pileToMove.add(diskTopQuit);
                    addMovePlayer();
                }else{
                    JOptionPane.showMessageDialog(null, "No puedes realizar este movimiento");
                }                
            }catch(Exception e){
                pileToQuit.remove(pileToQuit.size()-1);
                pileToMove.add(diskTopQuit);
                addMovePlayer();
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No puedes realizar este movimiento, porque la torre no tiene discos");
        }
        showPiles();
        this.game.userMovesTextField.setText(String.valueOf(this.movesPlayer));
        reviewWin();
        reviewMinMovesExceed();
    }
    
    private void showPiles(){
        showPile(this.modelTowerA,this.pile1);
        showPile(this.modelTowerB,this.pile2);
        showPile(this.modelTowerC,this.pile3);                
        this.game.aTowerTable.setModel(this.modelTowerA);
        this.game.bTowerTable.setModel(this.modelTowerB);
        this.game.cTowerTable.setModel(this.modelTowerC);
    }
    
    private void showPile(DefaultTableModel modelTower, ArrayList<Disk> pile){
        try{
            for (int i = 0; i < 10; i++) {
                modelTower.removeRow(0);            
            }     
        } catch(Exception e){
            
        }
        for (int i = 0; i < (10-pile.size()); i++) {
            modelTower.addRow(new Object[]{""});            
        }
        for (int i = (pile.size()-1); i >= 0; i--) {   
            String bodyTower = pile.get(i).getBodyTower();
            modelTower.addRow(new Object[]{bodyTower});            
        }
    }
    
    private void reviewMinMovesExceed(){
        if (this.minMovs == this.movesPlayer && this.stopGame == false) {
            int option = JOptionPane.showConfirmDialog(null, "Ya excediste los pasos minimos deseas continuar?");
            if (option == JOptionPane.OK_OPTION) {
                this.stopGame = false;
            }else{
                this.stopGame = true;                
                setButtonsEnabled(false);
            }
        }
    }
    
    private void reviewWin(){
        if (this.pile3.size() == this.objective) {
            JOptionPane.showMessageDialog(null,"Ganaste");
            this.stopGame = true;
            setButtonsEnabled(false);
        }
    }                
    
    private void addMovePlayer(){
        this.movesPlayer++;
    }
    
    
}
