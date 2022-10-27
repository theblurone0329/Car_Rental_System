import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class viewCar extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new viewCar();
    }

    JLabel carPic = new JLabel();
    JLabel pnl1 = new JLabel();
    JLabel pnl2 = new JLabel();
    JLabel pricePerHr = new JLabel();
    JLabel carSeats = new JLabel();
    JLabel seats = new JLabel();
    JLabel available = new JLabel();
    JLabel location = new JLabel();
    JLabel location1 = new JLabel();
    JLabel carName = new JLabel();
    JLabel carRating = new JLabel();
    JLabel pricePic = new JLabel();
    JLabel seatPic = new JLabel();
    JLabel back = new JLabel();
    JLabel book = new JLabel();
    JButton btnBook = new JButton();
    JButton btnBack = new JButton();

    viewCar() {

        back.setText("Back");
        back.setSize(180, 30);
        back.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        back.setForeground(new Color(225,223,186));
        back.setLocation(565, 315);

        ImageIcon goback = new ImageIcon("src\\turn-back.png");
        btnBack.setIcon(goback);
        btnBack.setForeground(new Color(225,223,186));
        btnBack.setBackground(new Color(27, 28, 30));
        btnBack.setFocusable(false);
        btnBack.setSize(64, 64);
        btnBack.setLocation(550, 250);
        btnBack.setBorder(null);
        btnBack.addMouseListener(this);

        book.setText("Book Now!");
        book.setSize(180, 30);
        book.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        book.setForeground(new Color(225,223,186));
        book.setLocation(408, 315);

        ImageIcon booking = new ImageIcon("src\\appointment.png");
        btnBook.setIcon(booking);
        btnBook.setForeground(new Color(225,223,186));
        btnBook.setBackground(new Color(27, 28, 30));
        btnBook.setFocusable(false);
        btnBook.setSize(64, 64);
        btnBook.setLocation(417, 250);
        btnBook.setBorder(null);
        btnBook.addMouseListener(this);

        location1.setText("Jalan Teknologi 5, Taman Teknologi Malaysia, " +
        "57000 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur");
        location1.setFont(new Font("Segoe UI", Font.BOLD, 13));
        location1.setBackground(new Color(27, 28, 30));
        location1.setForeground(new Color(225,223,186));
        location1.setSize(250, 100);
        location1.setLocation(413, 50);
        location1.setVerticalTextPosition(JLabel.TOP);

        location.setText("Location: ");
        location.setFont(new Font("TW Cen MT", Font.BOLD, 23));
        location.setForeground(new Color(225,223,186));
        location.setSize(180, 30);
        location.setLocation(413, 35);

        ImageIcon seat = new ImageIcon("src\\car-seat.png");
        seatPic.setIcon(seat);
        seatPic.setSize(64, 64);
        seatPic.setLocation(247, 245);

        ImageIcon price = new ImageIcon("src\\price-tag.png");
        pricePic.setIcon(price);
        pricePic.setSize(64, 64);
        pricePic.setLocation(92, 245);

        seats.setText("seats");
        seats.setFont(new Font("Segoe UI", Font.BOLD, 18));
        seats.setForeground(new Color(27, 28, 30));
        seats.setBackground(new Color(225,223,186));
        seats.setSize(180,30);
        seats.setLocation(265, 310);
        seats.setBorder(null);

        carSeats.setText("5");
        carSeats.setFont(new Font("Segoe UI", Font.BOLD, 18));
        carSeats.setForeground(new Color(27, 28, 30));
        carSeats.setBackground(new Color(225,223,186));
        carSeats.setSize(20,30);
        carSeats.setLocation(248, 310);
        carSeats.setBorder(null);

        pricePerHr.setText("RM 25/hr");
        pricePerHr.setFont(new Font("Segoe UI", Font.BOLD, 18));
        pricePerHr.setForeground(new Color(27, 28, 30));
        pricePerHr.setBackground(new Color(225,223,186));
        pricePerHr.setSize(180,30);
        pricePerHr.setLocation(87, 310);
        pricePerHr.setBorder(null);

        ImageIcon pnl = new ImageIcon("src\\smallPnl.png");
        pnl1.setIcon(pnl);
        pnl1.setSize(135, 134);
        pnl1.setLocation(60, 230);

        pnl2.setIcon(pnl);
        pnl2.setSize(135, 134);
        pnl2.setLocation(210, 230);

        ImageIcon car = new ImageIcon("src\\Tesla Model S.png");
        carPic.setIcon(car);
        carPic.setSize(412, 225);
        carPic.setLocation(0, 5);
        
        ImageIcon icon = new ImageIcon("src\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

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
