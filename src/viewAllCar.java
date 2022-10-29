import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class viewAllCar extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new viewAllCar();
    }

    private JLabel pnl1 = new JLabel();
    private JLabel pnl2 = new JLabel();
    private JLabel pnl3 = new JLabel();
    private JLabel pnl4 = new JLabel();
    private JLabel pnl5 = new JLabel();
    private JLabel pnlBorder1 = new JLabel();
    private JLabel pnlBorder2 = new JLabel();
    private JLabel pnlBorder3 = new JLabel();
    private JLabel pnlBorder4 = new JLabel();
    private JLabel pnlBorder5 = new JLabel();
    private JLabel car1 = new JLabel();
    private JLabel car2 = new JLabel();
    private JLabel car3 = new JLabel();
    private JLabel car4 = new JLabel();
    private JLabel car5 = new JLabel();
    private JLabel carName1 = new JLabel();
    private JLabel carName2 = new JLabel();
    private JLabel carName3 = new JLabel();
    private JLabel carName4 = new JLabel();
    private JLabel carName5 = new JLabel();
    private JLabel seats1 = new JLabel();
    private JLabel seats2 = new JLabel();
    private JLabel seats3 = new JLabel();
    private JLabel seats4 = new JLabel();
    private JLabel seats5 = new JLabel();
    private JLabel price1 = new JLabel();
    private JLabel price2 = new JLabel();
    private JLabel price3 = new JLabel();
    private JLabel price4 = new JLabel();
    private JLabel price5 = new JLabel();
    private JLabel price = new JLabel();
    private JLabel seats = new JLabel();
    private JTextField txtSeats = new JTextField();
    private JButton btn1 = new JButton();
    private JButton btn2 = new JButton();
    private JButton btn3 = new JButton();
    private JButton btn4 = new JButton();
    private JButton btn5 = new JButton();
    private JButton search = new JButton();
    private JSeparator separator = new JSeparator();
    private JSeparator separator2 = new JSeparator();
    private JPanel panel1 = new JPanel();
    private JScrollPane pane = new JScrollPane();
    ImageIcon pnl = new ImageIcon("src\\pnl.png");
    ImageIcon pricePic = new ImageIcon("src\\price-tag (1).png");
    ImageIcon seat = new ImageIcon("src\\car-seat (1).png");
    private Border border = new LineBorder(new Color(27, 28, 30), 4, true);

    viewAllCar() {

        ImageIcon searchPic = new ImageIcon("src\\magnifier.png");
        search.setIcon(searchPic);
        search.setSize(32, 32);
        search.setBackground(new Color(27, 28, 30));
        search.setBorder(null);
        search.setLocation(485, 30);
        search.addMouseListener(this);

        separator2.setForeground(new Color(225,223,186));
        separator2.setBackground(new Color(27, 28, 30));
        separator2.setSize(70, 17);
        separator2.setLocation(405, 65);

        txtSeats.setText("eg: 4");
        txtSeats.setSize(70, 35);
        txtSeats.setForeground(new Color(225,223,186));
        txtSeats.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtSeats.setBackground(new Color(27, 28, 30));
        txtSeats.setLocation(405, 30);
        txtSeats.setBorder(null);
        txtSeats.addMouseListener(this);

        seats.setText("Preferred Amount of Seats: ");
        seats.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        seats.setForeground(new Color(225,223,186));
        seats.setSize(220, 35);
        seats.setLocation(185, 30);

        separator.setForeground(new Color(225,223,186));
        separator.setBackground(new Color(27, 28, 30));
        separator.setSize(725, 17);
        separator.setLocation(0, 80);

        //Second Car Panel
        btn2.setText("Learn More!");
        btn2.setForeground(new Color(27, 28, 30));
        btn2.setBackground(new Color(127, 126, 144));
        btn2.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        btn2.setFocusable(false);
        btn2.setSize(110, 35);
        btn2.setLocation(405, 400);
        btn2.setBorder(border);
        btn1.addMouseListener(this);
        
        price2.setIcon(pricePic);
        price2.setText("RM 24/hr");
        price2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        price2.setForeground(new Color(27, 28, 30));
        price2.setSize(140, 32);
        price2.setLocation(410, 325);

        seats2.setIcon(seat);
        seats2.setText("4");
        seats2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        seats2.setForeground(new Color(27, 28, 30));
        seats2.setSize(50, 32);
        seats2.setLocation(410, 360);

        carName2.setText("Tesla Model S");
        carName2.setForeground(new Color(27, 28, 30));
        carName2.setBackground(new Color(127, 126, 144));
        carName2.setFont(new Font("Segoe UI", Font.BOLD, 26));
        carName2.setSize(180, 30);
        carName2.setLocation(190, 396);

        ImageIcon car2Pic = new ImageIcon("src\\Tesla_Model_S_Logo.png");
        car2.setIcon(car2Pic);
        car2.setSize(241, 121);
        car2.setLocation(170, 295);

        pnl2.setIcon(pnl);
        pnl2.setSize(394, 160);
        pnl2.setLocation(155, 295);

        //First Car Panel
        btn1.setText("Learn More!");
        btn1.setForeground(new Color(27, 28, 30));
        btn1.setBackground(new Color(127, 126, 144));
        btn1.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        btn1.setFocusable(false);
        btn1.setSize(110, 35);
        btn1.setLocation(405, 225);
        btn1.setBorder(border);
        btn1.addMouseListener(this);
        
        price1.setIcon(pricePic);
        price1.setText("RM 24/hr");
        price1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        price1.setForeground(new Color(27, 28, 30));
        price1.setSize(140, 32);
        price1.setLocation(410, 150);

        seats1.setIcon(seat);
        seats1.setText("4");
        seats1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        seats1.setForeground(new Color(27, 28, 30));
        seats1.setSize(50, 32);
        seats1.setLocation(410, 185);

        carName1.setText("Tesla Model S");
        carName1.setForeground(new Color(27, 28, 30));
        carName1.setBackground(new Color(127, 126, 144));
        carName1.setFont(new Font("Segoe UI", Font.BOLD, 26));
        carName1.setSize(180, 30);
        carName1.setLocation(190, 221);

        ImageIcon car1Pic = new ImageIcon("src\\Tesla_Model_S_Logo.png");
        car1.setIcon(car1Pic);
        car1.setSize(241, 121);
        car1.setLocation(170, 90);

        ImageIcon pnl = new ImageIcon("src\\pnl.png");
        pnl1.setIcon(pnl);
        pnl1.setSize(394, 160);
        pnl1.setLocation(155, 120);

        pane.setSize(725, 420);
        pane.setBackground(new Color(27, 28, 30));
        pane.setLayout(null);

        pane.add(car1);
        pane.add(carName1);
        pane.add(btn1);
        pane.add(seats1);
        pane.add(price1);
        pane.add(pnl1);
        pane.add(car2);
        pane.add(carName2);
        pane.add(btn2);
        pane.add(seats2);
        pane.add(price2);
        pane.add(pnl2);
        pane.add(separator);
        pane.add(seats);
        pane.add(txtSeats);
        pane.add(separator2);
        pane.add(search);

        //Frame
        ImageIcon icon = new ImageIcon("src\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        this.add(pane);
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
