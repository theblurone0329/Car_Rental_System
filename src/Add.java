import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Add extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new Add();
    }

    private JPanel pnlLeft = new JPanel();
    private JPanel pnlRight = new JPanel();
    private JLabel txtCus = new JLabel();
    private JLabel txtCar = new JLabel();
    private JButton btnAddCus = new JButton();
    private JButton btnAddCar = new JButton();
    private JSeparator separator1 = new JSeparator(SwingConstants.VERTICAL);

    Add() {
        separator1.setForeground(new Color(225,223,186));
        separator1.setBackground(new Color(27, 28, 30));
        separator1.setSize(10, 420);
        separator1.setLocation(363, 0);

        txtCar.setText("Register New Car");
        txtCar.setSize(150, 37);
        txtCar.setLocation(123, 214);
        txtCar.setBackground(new Color(27, 28, 30));
        txtCar.setForeground(new Color(225,223,186));
        txtCar.setFont(new Font("TW Cent", Font.PLAIN, 16));

        txtCus.setText("Register New Customer");
        txtCus.setSize(180, 37);
        txtCus.setLocation(103, 214);
        txtCus.setBackground(new Color(27, 28, 30));
        txtCus.setForeground(new Color(225,223,186));
        txtCus.setFont(new Font("TW Cent", Font.PLAIN, 16));

        ImageIcon cus = new ImageIcon("src\\Pics\\add-user.png");
        btnAddCus.setIcon(cus);
        btnAddCus.setSize(64, 64);
        btnAddCus.setBackground(new Color(27, 28, 30));
        btnAddCus.setLocation(150, 150);
        btnAddCus.setFocusable(false);
        btnAddCus.setBorder(null);
        btnAddCus.addMouseListener(this);

        ImageIcon car = new ImageIcon("src\\Pics\\add-car.png");
        btnAddCar.setIcon(car);
        btnAddCar.setSize(64, 64);
        btnAddCar.setBackground(new Color(27, 28, 30));
        btnAddCar.setLocation(150, 160);
        btnAddCar.setFocusable(false);
        btnAddCar.setBorder(null);
        btnAddCar.addMouseListener(this);

        pnlRight.setBackground(new Color(27, 28, 30));
        pnlRight.setBounds(364, 0, 362, 420);
        pnlRight.setLayout(null);

        pnlLeft.setBackground(new Color(27, 28, 30));
        pnlLeft.setBounds(0, 0, 362, 420);
        pnlLeft.setLayout(null);

        pnlRight.add(txtCar);
        pnlRight.add(btnAddCar);
        pnlLeft.add(txtCus);
        pnlLeft.add(btnAddCus);

        //Frame
        ImageIcon icon = new ImageIcon("src\\Pics\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        this.add(pnlLeft);
        this.add(pnlRight);
        this.add(separator1);
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
 