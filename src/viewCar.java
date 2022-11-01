import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class viewCar extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new viewCar();
    }

    private JLabel carPic = new JLabel();
    private JLabel pnl1 = new JLabel();
    private JLabel pnl2 = new JLabel();
    private JLabel pricePerHr = new JLabel();
    private JLabel carSeats = new JLabel();
    private JLabel seats = new JLabel();
    private JLabel available = new JLabel();
    private JLabel availableTxt = new JLabel();
    private JLabel location = new JLabel();
    private JTextArea location1 = new JTextArea();
    private JLabel carName = new JLabel();
    private JLabel carRating = new JLabel();
    private JLabel pricePic = new JLabel();
    private JLabel seatPic = new JLabel();
    private JLabel back = new JLabel();
    private JLabel book = new JLabel();
    private JLabel star = new JLabel();
    private JButton btnBook = new JButton();
    private JButton btnBack = new JButton();

    viewCar() {

        //Car Name
        carName.setText("Tesla Model S");
        carName.setFont(new Font("TW Cen MT", Font.BOLD, 35));
        carName.setForeground(new Color(225,223,186));
        carName.setBackground(new Color(27, 28, 30));
        carName.setSize(300, 27);
        carName.setLocation(390, 30);

        //Available text
        availableTxt.setText("Not Available");
        availableTxt.setFont(new Font("Segoe UI", Font.BOLD, 13));
        availableTxt.setSize(150, 100);
        availableTxt.setForeground(new Color(225,223,186));
        availableTxt.setBackground(new Color(27, 28, 30));
        availableTxt.setLocation(536, 190);

        available.setText("Status: ");
        available.setFont(new Font("Segoe UI", Font.BOLD, 13));
        available.setSize(50, 100);
        available.setForeground(new Color(225,223,186));
        available.setBackground(new Color(27, 28, 30));
        available.setLocation(486, 190);

        //Star Pic
        ImageIcon starPic = new ImageIcon("src\\Pics\\star.png");
        star.setIcon(starPic);
        star.setSize(24, 24);
        star.setLocation(403, 225);

        //Car Rating txt
        carRating.setText("4.7");
        carRating.setFont(new Font("Segoe UI", Font.BOLD, 13));
        carRating.setSize(50, 100);
        carRating.setForeground(new Color(225,223,186));
        carRating.setBackground(new Color(27, 28, 30));
        carRating.setLocation(436, 190);

        //Back Button Text
        back.setText("Back");
        back.setSize(180, 30);
        back.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        back.setForeground(new Color(225,223,186));
        back.setLocation(565, 335);

        //Back Button
        ImageIcon goback = new ImageIcon("src\\Pics\\turn-back.png");
        btnBack.setIcon(goback);
        btnBack.setForeground(new Color(225,223,186));
        btnBack.setBackground(new Color(27, 28, 30));
        btnBack.setFocusable(false);
        btnBack.setSize(64, 64);
        btnBack.setLocation(550, 270);
        btnBack.setBorder(null);
        btnBack.addMouseListener(this);

        //Book button text 
        book.setText("Book Now!");
        book.setSize(180, 30);
        book.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        book.setForeground(new Color(225,223,186));
        book.setLocation(408, 335);

        //Booking icon
        ImageIcon booking = new ImageIcon("src\\Pics\\appointment.png");
        btnBook.setIcon(booking);
        btnBook.setForeground(new Color(225,223,186));
        btnBook.setBackground(new Color(27, 28, 30));
        btnBook.setFocusable(false);
        btnBook.setSize(64, 64);
        btnBook.setLocation(417, 270);
        btnBook.setBorder(null);
        btnBook.addMouseListener(this);

        //Location txt
        location1.setText("Jalan Teknologi 5, Taman Teknologi Malaysia, \n57000 Kuala Lumpur, \n\nWilayah Persekutuan Kuala Lumpur");
        location1.setFont(new Font("Segoe UI", Font.BOLD, 12));
        location1.setBackground(new Color(27, 28, 30));
        location1.setForeground(new Color(225,223,186));
        location1.setSize(250, 100);
        location1.setLocation(423, 110);
        location1.setLineWrap(true);

        //Location title
        location.setText("Location: ");
        location.setFont(new Font("TW Cen MT", Font.BOLD, 23));
        location.setForeground(new Color(225,223,186));
        location.setSize(180, 30);
        location.setLocation(413, 75);

        //Seats icon
        ImageIcon seat = new ImageIcon("src\\Pics\\car-seat.png");
        seatPic.setIcon(seat);
        seatPic.setSize(64, 64);
        seatPic.setLocation(247, 245);

        //Price icon
        ImageIcon price = new ImageIcon("src\\Pics\\price-tag.png");
        pricePic.setIcon(price);
        pricePic.setSize(64, 64);
        pricePic.setLocation(92, 245);

        //txt for Seats
        seats.setText("seats");
        seats.setFont(new Font("Segoe UI", Font.BOLD, 18));
        seats.setForeground(new Color(27, 28, 30));
        seats.setBackground(new Color(225,223,186));
        seats.setSize(180,30);
        seats.setLocation(265, 310);
        seats.setBorder(null);

        //Number of seats
        carSeats.setText("5");
        carSeats.setFont(new Font("Segoe UI", Font.BOLD, 18));
        carSeats.setForeground(new Color(27, 28, 30));
        carSeats.setBackground(new Color(225,223,186));
        carSeats.setSize(20,30);
        carSeats.setLocation(248, 310);
        carSeats.setBorder(null);

        //Price Per Hr txt
        pricePerHr.setText("RM 25/hr");
        pricePerHr.setFont(new Font("Segoe UI", Font.BOLD, 18));
        pricePerHr.setForeground(new Color(27, 28, 30));
        pricePerHr.setBackground(new Color(225,223,186));
        pricePerHr.setSize(180,30);
        pricePerHr.setLocation(87, 310);
        pricePerHr.setBorder(null);

        //Rounded Square graphic
        ImageIcon pnl = new ImageIcon("src\\Pics\\smallPnl.png");
        pnl1.setIcon(pnl);
        pnl1.setSize(135, 134);
        pnl1.setLocation(60, 230);

        pnl2.setIcon(pnl);
        pnl2.setSize(135, 134);
        pnl2.setLocation(210, 230);

        //Car Pic
        ImageIcon car = new ImageIcon("src\\Pics\\Tesla Model S.png");
        carPic.setIcon(car);
        carPic.setSize(412, 225);
        carPic.setLocation(3, 25);
        
        //Frame
        ImageIcon icon = new ImageIcon("src\\Pics\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        //Adding components to Frame
        this.add(back);
        this.add(book);
        this.add(btnBook);
        this.add(btnBack);
        this.add(location1);
        this.add(location);
        this.add(seatPic);
        this.add(pricePic);
        this.add(pricePerHr);
        this.add(carSeats);
        this.add(seats);
        this.add(carPic);
        this.add(pnl1);
        this.add(pnl2);
        this.add(carRating);
        this.add(star);
        this.add(carName);
        this.add(available);
        this.add(availableTxt);
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
