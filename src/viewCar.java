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

        //View Car Page ✅
        {
            //Car Name
            carNameOCP.setText("Tesla Model S");
            carNameOCP.setFont(new Font("TW Cen MT", Font.BOLD, 35));
            carNameOCP.setForeground(new Color(225,223,186));
            carNameOCP.setBackground(new Color(27, 28, 30));
            carNameOCP.setSize(300, 27);
            carNameOCP.setLocation(390, 30);

            //Available text
            availableTxtOCP.setText("Not Available");
            availableTxtOCP.setFont(new Font("Segoe UI", Font.BOLD, 13));
            availableTxtOCP.setSize(150, 100);
            availableTxtOCP.setForeground(new Color(225,223,186));
            availableTxtOCP.setBackground(new Color(27, 28, 30));
            availableTxtOCP.setLocation(536, 190);

            availableOCP.setText("Status: ");
            availableOCP.setFont(new Font("Segoe UI", Font.BOLD, 13));
            availableOCP.setSize(50, 100);
            availableOCP.setForeground(new Color(225,223,186));
            availableOCP.setBackground(new Color(27, 28, 30));
            availableOCP.setLocation(486, 190);

            //Star Pic
            ImageIcon starPicOCP = new ImageIcon("src\\Pics\\star.png");
            starOCP.setIcon(starPicOCP);
            starOCP.setSize(24, 24);
            starOCP.setLocation(403, 225);

            //Car Rating txt
            carRatingOCP.setText("4.7");
            carRatingOCP.setFont(new Font("Segoe UI", Font.BOLD, 13));
            carRatingOCP.setSize(50, 100);
            carRatingOCP.setForeground(new Color(225,223,186));
            carRatingOCP.setBackground(new Color(27, 28, 30));
            carRatingOCP.setLocation(436, 190);

            //Back Button Text
            backOCP.setText("Back");
            backOCP.setSize(180, 30);
            backOCP.setFont(new Font("TW Cen MT", Font.BOLD, 18));
            backOCP.setForeground(new Color(225,223,186));
            backOCP.setLocation(565, 335);

            //Back Button
            ImageIcon gobackOCP = new ImageIcon("src\\Pics\\turn-back.png");
            btnBackOCP.setIcon(gobackOCP);
            btnBackOCP.setForeground(new Color(225,223,186));
            btnBackOCP.setBackground(new Color(27, 28, 30));
            btnBackOCP.setFocusable(false);
            btnBackOCP.setSize(64, 64);
            btnBackOCP.setLocation(550, 270);
            btnBackOCP.setBorder(null);
            btnBackOCP.addMouseListener(this);

            //Book button text 
            bookOCP.setText("Book Now!");
            bookOCP.setSize(180, 30);
            bookOCP.setFont(new Font("TW Cen MT", Font.BOLD, 18));
            bookOCP.setForeground(new Color(225,223,186));
            bookOCP.setLocation(408, 335);

            //Booking icon
            ImageIcon bookingOCP = new ImageIcon("src\\Pics\\appointment.png");
            btnBookOCP.setIcon(bookingOCP);
            btnBookOCP.setForeground(new Color(225,223,186));
            btnBookOCP.setBackground(new Color(27, 28, 30));
            btnBookOCP.setFocusable(false);
            btnBookOCP.setSize(64, 64);
            btnBookOCP.setLocation(417, 270);
            btnBookOCP.setBorder(null);
            btnBookOCP.addMouseListener(this);

            //Location txt
            location1OCP.setText("Jalan Teknologi 5, Taman Teknologi Malaysia, \n57000 Kuala Lumpur, \n\nWilayah Persekutuan Kuala Lumpur");
            location1OCP.setFont(new Font("Segoe UI", Font.BOLD, 12));
            location1OCP.setBackground(new Color(27, 28, 30));
            location1OCP.setForeground(new Color(225,223,186));
            location1OCP.setSize(250, 100);
            location1OCP.setLocation(423, 110);
            location1OCP.setLineWrap(true);

            //Location title
            locationOCP.setText("Location: ");
            locationOCP.setFont(new Font("TW Cen MT", Font.BOLD, 23));
            locationOCP.setForeground(new Color(225,223,186));
            locationOCP.setSize(180, 30);
            locationOCP.setLocation(413, 75);

            //Seats icon
            ImageIcon seatOCP = new ImageIcon("src\\Pics\\car-seat.png");
            seatPicOCP.setIcon(seatOCP);
            seatPicOCP.setSize(64, 64);
            seatPicOCP.setLocation(247, 245);

            //Price icon
            ImageIcon priceOCP = new ImageIcon("src\\Pics\\price-tag.png");
            pricePicOCP.setIcon(priceOCP);
            pricePicOCP.setSize(64, 64);
            pricePicOCP.setLocation(92, 245);

            //txt for Seats
            seatsOCP.setText("seats");
            seatsOCP.setFont(new Font("Segoe UI", Font.BOLD, 18));
            seatsOCP.setForeground(new Color(27, 28, 30));
            seatsOCP.setBackground(new Color(225,223,186));
            seatsOCP.setSize(180,30);
            seatsOCP.setLocation(265, 310);
            seatsOCP.setBorder(null);

            //Number of seats
            carSeatsOCP.setText("5");
            carSeatsOCP.setFont(new Font("Segoe UI", Font.BOLD, 18));
            carSeatsOCP.setForeground(new Color(27, 28, 30));
            carSeatsOCP.setBackground(new Color(225,223,186));
            carSeatsOCP.setSize(20,30);
            carSeatsOCP.setLocation(248, 310);
            carSeatsOCP.setBorder(null);

            //Price Per Hr txt
            pricePerHrOCP.setText("RM 25/hr");
            pricePerHrOCP.setFont(new Font("Segoe UI", Font.BOLD, 18));
            pricePerHrOCP.setForeground(new Color(27, 28, 30));
            pricePerHrOCP.setBackground(new Color(225,223,186));
            pricePerHrOCP.setSize(180,30);
            pricePerHrOCP.setLocation(87, 310);
            pricePerHrOCP.setBorder(null);

            //Rounded Square graphic
            ImageIcon pnlOCP = new ImageIcon("src\\Pics\\smallPnl.png");
            pnl1OCP.setIcon(pnlOCP);
            pnl1OCP.setSize(135, 134);
            pnl1OCP.setLocation(60, 230);

            pnl2OCP.setIcon(pnlOCP);
            pnl2OCP.setSize(135, 134);
            pnl2OCP.setLocation(210, 230);

            //Car Pic
            ImageIcon carOCP = new ImageIcon("src\\Pics\\Tesla Model S.png");
            carPicOCP.setIcon(carOCP);
            carPicOCP.setSize(412, 225);
            carPicOCP.setLocation(3, 25);
            
            //Frame
            pnlBigOCP.setBackground(new Color(27, 28, 30));
            pnlBigOCP.setLayout(null);
            pnlBigOCP.setSize(725, 420);
            pnlBigOCP.setVisible(false);

            //Adding components to Frame
            pnlBigOCP.add(backOCP);
            pnlBigOCP.add(bookOCP);
            pnlBigOCP.add(btnBookOCP);
            pnlBigOCP.add(btnBackOCP);
            pnlBigOCP.add(location1OCP);
            pnlBigOCP.add(locationOCP);
            pnlBigOCP.add(seatPicOCP);
            pnlBigOCP.add(pricePicOCP);
            pnlBigOCP.add(pricePerHrOCP);
            pnlBigOCP.add(carSeatsOCP);
            pnlBigOCP.add(seatsOCP);
            pnlBigOCP.add(carPicOCP);
            pnlBigOCP.add(pnl1OCP);
            pnlBigOCP.add(pnl2OCP);
            pnlBigOCP.add(carRatingOCP);
            pnlBigOCP.add(starOCP);
            pnlBigOCP.add(carNameOCP);
            pnlBigOCP.add(availableOCP);
            pnlBigOCP.add(availableTxtOCP);
        }
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
