import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Dimension;

public class addcar_admin extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new addcar_admin();
    }

    JLabel carBrand = new JLabel();
    JLabel carModel = new JLabel();
    JLabel carPlateNum = new JLabel();
    JLabel carYear = new JLabel();
    JLabel carSeat = new JLabel();
    JTextField txtCarBrand = new JTextField();
    JTextField txtCarModel = new JTextField();
    JTextField txtCarPlateNum = new JTextField();
    JTextField txtCarYear = new JTextField();
    JTextField txtCarSeat = new JTextField();
    JButton btnClear = new JButton();
    JButton btnCancel = new JButton();
    JButton btnAdd = new JButton(); 
    JTable table = new JTable();
    JPanel tablePnl = new JPanel();
    JSeparator separator1 = new JSeparator();
    JSeparator separator2 = new JSeparator();
    JSeparator separator3 = new JSeparator();
    JSeparator separator4 = new JSeparator();
    JSeparator separator5 = new JSeparator();
    JScrollPane pane = new JScrollPane();
    private Border border = new LineBorder(new Color(225,223,186), 1, true);

    addcar_admin() {

        //Table
        String[] columnsReturn = {"Car Brand", "CarModel", "Car Plate Number", "Car Year", "Car Seats"};
        String[][] rowsReturn = {{"Tesla", "Model S", "ABC 1234", "2020", "4"}, 
                            {"Perodua", "Myvi", "ABC 4576", "2018", "4"},
                            {"Proton", "Saga", "KLD 4657", "2018", "4"}};

        table = new JTable(rowsReturn, columnsReturn){
            public boolean isCellEditable(int rows, int columns) {
                return false;
            }
        };

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

        carYear.setText("Car Plate Number");
        carYear.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        carYear.setForeground(new Color(225,223,186));
        carYear.setBackground(new Color(27, 28, 30));
        carYear.setBorder(null);
        carYear.setSize(180, 30);
        carYear.setLocation(15, 215);

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
        ImageIcon icon = new ImageIcon("src\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

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
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
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
