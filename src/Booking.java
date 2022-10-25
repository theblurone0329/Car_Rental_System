import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Booking extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new Booking();
    }

    JLabel carModel = new JLabel();
    JLabel bookingDate = new JLabel();
    JLabel endBookingDate = new JLabel();
    JLabel pageTitle = new JLabel();
    JTextField txtCarModel = new JTextField();
    JTextField txtStartDate = new JTextField();
    JTextField txtEndDate = new JTextField();
    JButton btnBook = new JButton();
    JSeparator separator1 = new JSeparator();
    JSeparator separator2 = new JSeparator();
    JSeparator separator3 = new JSeparator();
    JLabel calendarPic = new JLabel();

    Booking() {

        //Booking Button
        btnBook.setText("Book");
        btnBook.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        Border border = new LineBorder(new Color(225,223,186), 1, true);
        btnBook.setBorder(border);
        btnBook.setFocusable(false);
        btnBook.setForeground(new Color(225,223,186));
        btnBook.setBackground(new Color(27, 28, 30));
        btnBook.setSize(110, 44);
        btnBook.setLocation(300, 315);
        btnBook.addMouseListener(this);

        //Big Calendar Picture
        ImageIcon calendar = new ImageIcon("src\\calendar.png");
        calendarPic.setIcon(calendar);
        calendarPic.setSize(256, 256);
        calendarPic.setLocation(430, 40);

        //Separator Under End Date txt Box
        separator3.setForeground(new Color(225,223,186));
        separator3.setBackground(new Color(27, 28, 30));
        separator3.setSize(195, 17);
        separator3.setLocation(120, 297);

        //End Date txt Box
        txtEndDate.setText("10-09-2022");
        txtEndDate.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtEndDate.setForeground(new Color(225,223,186));
        txtEndDate.setBackground(new Color(27, 28, 30));
        txtEndDate.setSize(100, 42);
        txtEndDate.setLocation(120, 255);
        txtEndDate.setBorder(null);
        txtEndDate.setEditable(false);

        //Separator Under Start Date txt Box
        separator2.setForeground(new Color(225,223,186));
        separator2.setBackground(new Color(27, 28, 30));
        separator2.setSize(195, 17);
        separator2.setLocation(120, 217);

        //Start Date Txt Box
        txtStartDate.setText("09-09-2022");
        txtStartDate.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtStartDate.setForeground(new Color(225,223,186));
        txtStartDate.setBackground(new Color(27, 28, 30));
        txtStartDate.setSize(100, 42);
        txtStartDate.setLocation(120, 175);
        txtStartDate.setBorder(null);
        txtStartDate.setEditable(false);

        //Separator under Car Model txt Box
        separator1.setForeground(new Color(225,223,186));
        separator1.setBackground(new Color(27, 28, 30));
        separator1.setSize(195, 17);
        separator1.setLocation(120, 137);

        //Car Model txt Box
        txtCarModel.setText("Tesla Model S");
        txtCarModel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtCarModel.setForeground(new Color(225,223,186));
        txtCarModel.setBackground(new Color(27, 28, 30));
        txtCarModel.setSize(100, 42);
        txtCarModel.setLocation(120, 95);
        txtCarModel.setBorder(null);
        txtCarModel.setEditable(false);

        //Car Model Title
        carModel.setText("Car Model");
        carModel.setBackground(new Color(27, 28, 30));
        carModel.setForeground(new Color(225,223,186));
        carModel.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        carModel.setSize(100,25);
        carModel.setLocation(100, 70);

        //Start Date Title
        bookingDate.setText("Start Date");
        bookingDate.setBackground(new Color(27, 28, 30));
        bookingDate.setForeground(new Color(225,223,186));
        bookingDate.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        bookingDate.setSize(130,25);
        bookingDate.setLocation(100, 150);

        //End Date Title
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
        
        //Frame
        ImageIcon icon = new ImageIcon("src\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        //Adding items to frame
        this.add(btnBook);
        this.add(calendarPic);
        this.add(separator3);
        this.add(txtEndDate);
        this.add(separator2);
        this.add(txtStartDate);
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
