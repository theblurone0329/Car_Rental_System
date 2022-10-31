import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePage extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new HomePage();
    }

    //Declare Form Components
    private JPanel pnl1 = new JPanel();
    private JPanel pnl2 = new JPanel();
    private JPanel pnl3 = new JPanel();
    private JLabel picCar = new JLabel();
    private JLabel picProgBar_0 = new JLabel();
    private JLabel picProgBar_25 = new JLabel();
    private JLabel picProgBar_50 = new JLabel();
    private JLabel picProgBar_75 = new JLabel();
    private JLabel picProgBar_100 = new JLabel();
    private JLabel status = new JLabel();
    private JLabel message = new JLabel();
    private JLabel message2 = new JLabel();
    private JButton btnBooking = new JButton();
    private JButton btnRegistration = new JButton();
    private JButton btnReports = new JButton();
    private JButton btnProfile = new JButton();
    private JButton btnHome = new JButton();

    HomePage() {

        //Home icon
        ImageIcon home = new ImageIcon("src\\home.png");
        btnHome.setIcon(home);
        btnHome.setBackground(new Color(127, 126, 144));
        btnHome.setFocusable(false);
        btnHome.setSize(64, 64);
        btnHome.setLocation(330, 2);
        btnHome.setBorder(null);
        btnHome.addMouseListener(this);

        //Report icon
        ImageIcon reports = new ImageIcon("src\\report.png");
        btnReports.setIcon(reports);
        btnReports.setBackground(new Color(127, 126, 144));
        btnReports.setFocusable(false);
        btnReports.setSize(64, 64);
        btnReports.setLocation(490, 2);
        btnReports.setBorder(null);
        btnReports.addMouseListener(this);

        //Register icon
        ImageIcon register = new ImageIcon("src\\form.png");
        btnRegistration.setIcon(register);
        btnRegistration.setBackground(new Color(127, 126, 144));
        btnRegistration.setFocusable(false);
        btnRegistration.setSize(64, 64);
        btnRegistration.setLocation(170, 3);
        btnRegistration.setBorder(null);
        btnRegistration.addMouseListener(this);

        //Booking icon
        ImageIcon booking = new ImageIcon("src\\online-booking.png");
        btnBooking.setIcon(booking);
        btnBooking.setBackground(new Color(127, 126, 144));
        btnBooking.setFocusable(false);
        btnBooking.setSize(64, 64);
        btnBooking.setLocation(20, 7);
        btnBooking.setBorder(null);
        btnBooking.addMouseListener(this);

        //Profile icon
        ImageIcon profile = new ImageIcon("src\\account.png");
        btnProfile.setIcon(profile);
        btnProfile.setBackground(new Color(127, 126, 144));
        btnProfile.setFocusable(false);
        btnProfile.setSize(64, 64);
        btnProfile.setLocation(635, 3);
        btnProfile.setBorder(null);
        btnProfile.addMouseListener(this);

        //Message 2
        message2.setText("Head to the booking page to book!");
        message2.setForeground(new Color(225,223,186));
        message2.setBackground(new Color(54,41,44));
        message2.setFont(new Font("TW Cent", Font.BOLD, 26));
        message2.setSize(500, 35);
        message2.setLocation(160, 225);

        //Message
        message.setText("You have no bookings!");
        message.setForeground(new Color(225,223,186));
        message.setBackground(new Color(54,41,44));
        message.setFont(new Font("TW Cent", Font.BOLD, 26));
        message.setSize(400, 35);
        message.setLocation(220, 190);

        //Status text
        status.setText("Status: Rent Request Pending");
        status.setForeground(new Color(225,223,186));
        status.setBackground(new Color(54,41,44));
        status.setFont(new Font("Segoe UI", Font.BOLD, 16));
        status.setSize(230, 35);
        status.setLocation(13, 190);

        //Progress Bar Images
        ImageIcon prog0 = new ImageIcon("src\\1.png");
        ImageIcon prog25 = new ImageIcon("src\\5.png");
        ImageIcon prog50 = new ImageIcon("src\\2.png");
        ImageIcon prog75 = new ImageIcon("src\\3.png");
        ImageIcon prog100 = new ImageIcon("src\\4.png");

        picProgBar_0.setIcon(prog0);
        picProgBar_0.setSize(246, 243);
        picProgBar_0.setLocation(240, 30);

        picProgBar_25.setIcon(prog25);
        picProgBar_25.setSize(246, 243);
        picProgBar_25.setLocation(240, 30);

        picProgBar_50.setIcon(prog50);
        picProgBar_50.setSize(246, 243);
        picProgBar_50.setLocation(240, 30);

        picProgBar_75.setIcon(prog75);
        picProgBar_75.setSize(246, 243);
        picProgBar_75.setLocation(240, 30);

        picProgBar_100.setIcon(prog100);
        picProgBar_100.setSize(246, 243);
        picProgBar_100.setLocation(240, 30);

        // Car Picture
        ImageIcon car = new ImageIcon("src\\Tesla_Model_S_Logo.png");
        picCar.setIcon(car);
        picCar.setSize(236, 125);
        picCar.setLocation(5, 70);

        //Rent Progress Panel
        pnl3.setBackground(new Color(27, 28, 30));
        pnl3.setBounds(110, 60, 500, 300);
        pnl3.setLayout(null);

        //Bottom Panel / Menu
        pnl2.setBackground(new Color(127, 126, 144));
        pnl2.setLayout(null);
        pnl2.setBounds(0, 420, 805, 108);

        //Top Panel
        pnl1.setBackground(new Color(27, 28, 30));
        pnl1.setLayout(null);
        pnl1.setBounds(0, 0, 805, 420);

        //Frame
        ImageIcon icon = new ImageIcon("src\\Company Logo.png");
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 528);
        this.setVisible(true);
        
        //Add Stuff
        pnl3.add(status);
        pnl3.add(picProgBar_100);
        pnl3.add(picProgBar_75);
        pnl3.add(picProgBar_50);
        pnl3.add(picProgBar_25);
        pnl3.add(picProgBar_0);
        pnl3.add(picCar);
        pnl1.add(message);
        pnl1.add(message2);
        pnl1.add(pnl3);
        pnl2.add(btnHome);
        pnl2.add(btnBooking);
        pnl2.add(btnRegistration);
        pnl2.add(btnReports);
        pnl2.add(btnProfile);
        this.add(pnl2);
        this.add(pnl1);

        message.setVisible(false);
        message2.setVisible(false);
        pnl3.setVisible(true);
        picProgBar_100.setVisible(false);
        picProgBar_75.setVisible(false);
        picProgBar_50.setVisible(false);
        picProgBar_25.setVisible(false);
        
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
