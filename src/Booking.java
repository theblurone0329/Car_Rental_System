import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Booking extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new Booking();
    }

    JLabel carModel = new JLabel();
    JLabel bookingDate = new JLabel();
    JLabel endBookingDate = new JLabel();
    JLabel pageTitle = new JLabel();
    JTextField txtCarModel = new JTextField();
    JButton btnBook = new JButton();
    JSeparator separator1 = new JSeparator();
    Booking() {

        separator1.setForeground(new Color(225,223,186));
        separator1.setBackground(new Color(27, 28, 30));
        separator1.setSize(195, 17);
        separator1.setLocation(120, 137);

        txtCarModel.setText("Tesla Model S");
        txtCarModel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtCarModel.setForeground(new Color(225,223,186));
        txtCarModel.setBackground(new Color(27, 28, 30));
        txtCarModel.setSize(100, 42);
        txtCarModel.setLocation(120, 95);
        txtCarModel.setBorder(null);
        txtCarModel.setEditable(false);

        carModel.setText("Car Model");
        carModel.setBackground(new Color(27, 28, 30));
        carModel.setForeground(new Color(225,223,186));
        carModel.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        carModel.setSize(100,25);
        carModel.setLocation(100, 70);

        bookingDate.setText("Start Date");
        bookingDate.setBackground(new Color(27, 28, 30));
        bookingDate.setForeground(new Color(225,223,186));
        bookingDate.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        bookingDate.setSize(130,25);
        bookingDate.setLocation(100, 150);

        endBookingDate.setText("End Date");
        endBookingDate.setBackground(new Color(27, 28, 30));
        endBookingDate.setForeground(new Color(225,223,186));
        endBookingDate.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        endBookingDate.setSize(130,25);
        endBookingDate.setLocation(100, 230);

        //Text for Page Title
        pageTitle.setText("Booking");
        pageTitle.setFont(new Font("TW Cen MT", Font.PLAIN, 24));
        pageTitle.setForeground(new Color(225,223,186));
        pageTitle.setBackground(new Color(27, 28, 30));
        pageTitle.setSize(122, 27);
        pageTitle.setLocation(320, 10);
        
        ImageIcon icon = new ImageIcon("src\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        this.add(separator1);
        this.add(txtCarModel);
        this.add(pageTitle);
        this.add(carModel);
        this.add(bookingDate);
        this.add(endBookingDate);
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
