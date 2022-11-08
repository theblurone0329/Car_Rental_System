import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class addcar_admin extends JFrame implements MouseListener{
    public static void main(String[] args){
        new addcar_admin();
        // try {
        //     FileWriter addCar = new FileWriter("Car.txt");
        //     addCar.write("Tesla"+"\t"+"Model S"+"\t"+"ABC 1234"+"\t"+"2020"+"\t"+"4"+"\n");
        //     addCar.close();
        //     System.out.println("Successfully wrote to the file.");
        //   } catch (IOException e) {
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        //   }
        
    }

    private JLabel carBrand = new JLabel();
    private JLabel carModel = new JLabel();
    private JLabel carPlateNum = new JLabel();
    private JLabel carYear = new JLabel();
    private JLabel carSeat = new JLabel();
    private JTextField txtCarBrand = new JTextField();
    private JTextField txtCarModel = new JTextField();
    private JTextField txtCarPlateNum = new JTextField();
    private JTextField txtCarYear = new JTextField();
    private JTextField txtCarSeat = new JTextField();
    private JButton btnClear = new JButton();
    private JButton btnCancel = new JButton();
    private JButton btnAdd = new JButton(); 
    private JTable table = new JTable();
    private JPanel tablePnl = new JPanel();
    private JSeparator separator1 = new JSeparator();
    private JSeparator separator2 = new JSeparator();
    private JSeparator separator3 = new JSeparator();
    private JSeparator separator4 = new JSeparator();
    private JSeparator separator5 = new JSeparator();
    private JScrollPane pane = new JScrollPane();
    private Border border = new LineBorder(new Color(225,223,186), 1, true);


    addcar_admin(){

        //Table
        // String[] columnsReturn = {"Car Brand", "CarModel", "Car Plate Number", "Car Year", "Car Seats"};
        // String[][] rowsReturn = {{"Tesla", "Model S", "ABC 1234", "2020", "4"}, 
        //                      {"Perodua", "Myvi", "ABC 4576", "2018", "4"},
        //                      {"Proton", "Saga", "KLD 4657", "2018", "4"}};

        // table = new JTable(rowsReturn, columnsReturn){
        //     public boolean isCellEditable(int rows, int columns) {
        //         return false;
        //     }
        // };

        //columns
        Object headers[] = { "Car Brand", "CarModel", "Car Plate Number","Car Year","Car Seats"};
        
        //setup table with column, 0 row 
        DefaultTableModel model = new DefaultTableModel(headers,0);
        table = new JTable();
        table.setModel(model);

        File file = new File("C:\\Users\\M S I\\OneDrive\\Documents\\GitHub\\Car_Rental_System_2\\src\\Text Files\\Car.txt");
        //import Car.txt data into table 
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model1 = (DefaultTableModel)table.getModel();
            Object[] tableLines = br.lines().toArray();
            for(int i = 0; i< tableLines.length;i++){
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("\t");
                model1.addRow(dataRow);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(addcar_admin.class.getName()).log(Level.SEVERE, null, ex);
        }


        table.setPreferredScrollableViewportSize(new Dimension(359, 1500));
        table.setFillsViewportHeight(true);
        table.setBackground(new Color(27, 28, 30));
        table.setForeground(new Color(225,223,186));
        table.setGridColor(new Color(225,223,186));
        table.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        table.setRowHeight(30);
        
        pane = new JScrollPane(table);

        tablePnl.setBounds(320, 20, 363, 347);
        tablePnl.setBorder(BorderFactory.createLineBorder(new Color(225,223,186)));
        tablePnl.add(pane);

        //Object[] rowReturns = new Object[4];

        //Add Button
        btnAdd.setText("Add");
        btnAdd.setSize(90, 37);
        btnAdd.setLocation(200, 300);
        btnAdd.setForeground(new Color(225,223,186));
        btnAdd.setBackground(new Color(27, 28, 30));
        btnAdd.setBorder(border);
        btnAdd.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        btnAdd.setFocusable(false);
        btnAdd.addMouseListener(this);

        //Cancel Button
        btnCancel.setText("Cancel");
        btnCancel.setSize(90, 37);
        btnCancel.setLocation(200, 250);
        btnCancel.setForeground(new Color(225,223,186));
        btnCancel.setBackground(new Color(27, 28, 30));
        btnCancel.setBorder(border);
        btnCancel.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        btnCancel.setFocusable(false);
        btnCancel.addMouseListener(this);
        
        //Clear Button
        btnClear.setText("Clear");
        btnClear.setSize(90, 37);
        btnClear.setLocation(200, 200);
        btnClear.setForeground(new Color(225,223,186));
        btnClear.setBackground(new Color(27, 28, 30));
        btnClear.setBorder(border);
        btnClear.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        btnClear.setFocusable(false);
        btnClear.addMouseListener(this);

        //Car seat text box and label 
        separator5.setForeground(new Color(225,223,186));
        separator5.setBackground(new Color(27, 28, 30));
        separator5.setSize(120, 17);
        separator5.setLocation(35, 335);

        txtCarSeat.setText("eg: 4");
        txtCarSeat.setSize(120, 30);
        txtCarSeat.setBorder(null);
        txtCarSeat.setForeground(new Color(225,223,186));
        txtCarSeat.setBackground(new Color(27, 28, 30));
        txtCarSeat.setFont(new Font("TW Cen MT", Font.BOLD, 14));
        txtCarSeat.setLocation(35,305);

        carSeat.setText("Car Seats");
        carSeat.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        carSeat.setForeground(new Color(225,223,186));
        carSeat.setBackground(new Color(27, 28, 30));
        carSeat.setBorder(null);
        carSeat.setSize(180, 30);
        carSeat.setLocation(15, 280);

        //Car Year text box and label
        separator4.setForeground(new Color(225,223,186));
        separator4.setBackground(new Color(27, 28, 30));
        separator4.setSize(120, 17);
        separator4.setLocation(35, 270);

        txtCarYear.setText("eg: 2017");
        txtCarYear.setSize(120, 30);
        txtCarYear.setBorder(null);
        txtCarYear.setForeground(new Color(225,223,186));
        txtCarYear.setBackground(new Color(27, 28, 30));
        txtCarYear.setFont(new Font("TW Cen MT", Font.BOLD, 14));
        txtCarYear.setLocation(35,240);

        carYear.setText("Car Year");
        carYear.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        carYear.setForeground(new Color(225,223,186));
        carYear.setBackground(new Color(27, 28, 30));
        carYear.setBorder(null);
        carYear.setSize(180, 30);
        carYear.setLocation(15, 215);

        //Car Plate Number text box and label
        separator3.setForeground(new Color(225,223,186));
        separator3.setBackground(new Color(27, 28, 30));
        separator3.setSize(120, 17);
        separator3.setLocation(35, 205);

        txtCarPlateNum.setText("eg: SA 0923 B");
        txtCarPlateNum.setSize(120, 30);
        txtCarPlateNum.setBorder(null);
        txtCarPlateNum.setForeground(new Color(225,223,186));
        txtCarPlateNum.setBackground(new Color(27, 28, 30));
        txtCarPlateNum.setFont(new Font("TW Cen MT", Font.BOLD, 14));
        txtCarPlateNum.setLocation(35,175);

        carPlateNum.setText("Car Plate Number");
        carPlateNum.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        carPlateNum.setForeground(new Color(225,223,186));
        carPlateNum.setBackground(new Color(27, 28, 30));
        carPlateNum.setBorder(null);
        carPlateNum.setSize(180, 30);
        carPlateNum.setLocation(15, 150);

        //Car Model text box and label
        separator2.setForeground(new Color(225,223,186));
        separator2.setBackground(new Color(27, 28, 30));
        separator2.setSize(120, 17);
        separator2.setLocation(35, 140);

        txtCarModel.setText("eg: Corolla Altis");
        txtCarModel.setSize(120, 30);
        txtCarModel.setBorder(null);
        txtCarModel.setForeground(new Color(225,223,186));
        txtCarModel.setBackground(new Color(27, 28, 30));
        txtCarModel.setFont(new Font("TW Cen MT", Font.BOLD, 14));
        txtCarModel.setLocation(35,110);

        carModel.setText("Car Model");
        carModel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        carModel.setForeground(new Color(225,223,186));
        carModel.setBackground(new Color(27, 28, 30));
        carModel.setBorder(null);
        carModel.setSize(180, 30);
        carModel.setLocation(15, 85);

        //Car Brand text box and label
        separator1.setForeground(new Color(225,223,186));
        separator1.setBackground(new Color(27, 28, 30));
        separator1.setSize(120, 17);
        separator1.setLocation(35, 80);

        txtCarBrand.setText("eg: Toyota");
        txtCarBrand.setSize(120, 30);
        txtCarBrand.setBorder(null);
        txtCarBrand.setForeground(new Color(225,223,186));
        txtCarBrand.setBackground(new Color(27, 28, 30));
        txtCarBrand.setFont(new Font("TW Cen MT", Font.BOLD, 14));
        txtCarBrand.setLocation(35,50);

        carBrand.setText("Car Brand");
        carBrand.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        carBrand.setForeground(new Color(225,223,186));
        carBrand.setBackground(new Color(27, 28, 30));
        carBrand.setBorder(null);
        carBrand.setSize(180, 30);
        carBrand.setLocation(15, 25);
        
        //Frame
        ImageIcon icon = new ImageIcon("src\\Pics\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        //Adding components to frame
        this.add(carBrand);
        this.add(txtCarBrand);
        this.add(separator1);
        this.add(carModel);
        this.add(txtCarModel);
        this.add(separator2);
        this.add(carPlateNum);
        this.add(txtCarPlateNum);
        this.add(separator3);
        this.add(carYear);
        this.add(txtCarYear);
        this.add(separator4);
        this.add(carSeat);
        this.add(txtCarSeat);
        this.add(separator5);
        this.add(btnClear);
        this.add(btnCancel);
        this.add(btnAdd);
        this.add(tablePnl);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==btnAdd){
            String brand = txtCarBrand.getText();
            String model = txtCarModel.getText();
            String plate = txtCarPlateNum.getText();
            String year = txtCarYear.getText();
            String seat = txtCarSeat.getText();
            //add new car into Car.txt and new row into table
            try {
                FileWriter fw = new FileWriter("src\\Text Files\\Car.txt",true);
                PrintWriter pw = new PrintWriter(fw);
                if(brand.trim().equals("") || model.trim().equals("") || plate.trim().equals("")|| year.trim().equals("") || seat.trim().equals("")){
                    JOptionPane.showMessageDialog(null, "Blank entry detected! ", "ERROR", JOptionPane.WARNING_MESSAGE);   
                }else{
                    pw.print(brand+"\t"+model+"\t"+plate+"\t"+year+"\t"+seat+"\n");
                    pw.close();
                    DefaultTableModel updatedModel = (DefaultTableModel)table.getModel();
                    String[] row = {brand,model,plate,year,seat};
                    updatedModel.addRow(row);
                }
            } catch (IOException ex) {
                Logger.getLogger(addcar_admin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else if(e.getSource()==btnClear){
            txtCarBrand.setText("");
            txtCarModel.setText("");
            txtCarYear.setText("");
            txtCarPlateNum.setText("");
            txtCarSeat.setText("");
        }
        // Object headers[] = { "Car Brand", "CarModel", "Car Plate Number","Car Year","Car Seats"};
            
        // //setup table with column, 0 row 
        // DefaultTableModel model = new DefaultTableModel(headers,0);
        // tableAC = new JTable();
        // tableAC.setModel(model);

        // File file = new File("src\\Text Files\\Car.txt");
        // //import Car.txt data into table 
        // try {
        //     BufferedReader br = new BufferedReader(new FileReader(file));
        //     DefaultTableModel model1 = (DefaultTableModel)tableAC.getModel();
        //     Object[] tableLines = br.lines().toArray();
        //     for(int i = 0; i< tableLines.length;i++){
        //         String line = tableLines[i].toString().trim();
        //         String[] dataRow = line.split("\t");
        //         model1.addRow(dataRow);
        //     }
        // } catch (FileNotFoundException ex) {
        //     Logger.getLogger(addcar_admin.class.getName()).log(Level.SEVERE, null, ex);
        // }

        // tableAC.setPreferredScrollableViewportSize(new Dimension(359, 347));
        // tableAC.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        // tableAC.setFillsViewportHeight(true);
        // tableAC.setBackground(new Color(27, 28, 30));
        // tableAC.setForeground(new Color(225,223,186));
        // tableAC.setGridColor(new Color(225,223,186));
        // tableAC.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        // tableAC.setRowHeight(30);
        
        // paneAC = new JScrollPane(tableAC, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        // paneAC.setVisible(true);

        // tablePnlAC.setBounds(320, 20, 390, 347);
        // tablePnlAC.setBorder(BorderFactory.createLineBorder(new Color(225,223,186)));
        // tablePnlAC.add(paneAC);
    }

    @Override
    public void mousePressed(MouseEvent e) {

        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}
