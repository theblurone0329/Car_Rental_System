import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Booking extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new Booking();
    }

    //Booking Page
    private String username;
    private JPanel pnlB = new JPanel();
    private JPanel pnlViewAllCar = new JPanel();
    private JPanel pnlDate = new JPanel();
    private JPanel pnlHour = new JPanel();
    private JLabel carModelB = new JLabel();
    private JLabel bookingDateB = new JLabel();
    private JLabel endBookingDateB = new JLabel();
    private JLabel bookingHourB = new JLabel();
    private JLabel endBookingHourB = new JLabel();
    private JLabel pageTitleB = new JLabel();
    private JTextField txtCarModelB = new JTextField();
    private JTextField txtStartDateB = new JTextField();
    private JTextField txtEndDateB = new JTextField();
    private JTextField txtStartHourB = new JTextField();
    private JTextField txtEndHourB = new JTextField();
    private JButton btnBookB = new JButton();
    private JButton btnHourB = new JButton();
    private JButton btnDateB = new JButton();
    private JSeparator separator1B = new JSeparator();
    private JSeparator separator2B = new JSeparator();
    private JSeparator separator3B = new JSeparator();
    private JSeparator separator4B = new JSeparator();
    private JSeparator separator5B = new JSeparator();
    private JLabel calendarPicB = new JLabel();

    public JPanel bookingPage(JPanel pnlB, JPanel pnlViewAllCar, String username) {
        //Panel view when btnHourB clicked
        pnlHour.setSize(340, 200);
        pnlHour.setLocation(80, 200);
        pnlHour.setVisible(false);
        pnlHour.setBackground(new Color(27, 28, 30));
        pnlHour.setLayout(null);

        //Start Date Title
        bookingHourB.setText("Start Time");
        bookingHourB.setBackground(new Color(27, 28, 30));
        bookingHourB.setForeground(new Color(225,223,186));
        bookingHourB.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        bookingHourB.setSize(130,25);
        bookingHourB.setLocation(20, 20);

        //End Date Title
        endBookingHourB.setText("End Time");
        endBookingHourB.setBackground(new Color(27, 28, 30));
        endBookingHourB.setForeground(new Color(225,223,186));
        endBookingHourB.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        endBookingHourB.setSize(130,25);
        endBookingHourB.setLocation(20, 100);

        //Separator Under End Date txt Box
        separator5B.setForeground(new Color(225,223,186));
        separator5B.setBackground(new Color(27, 28, 30));
        separator5B.setSize(195, 17);
        separator5B.setLocation(40, 163);

        //End Date txt Box
        txtEndHourB.setText("17:00");
        txtEndHourB.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtEndHourB.setForeground(new Color(225,223,186));
        txtEndHourB.setBackground(new Color(27, 28, 30));
        txtEndHourB.setSize(100, 42);
        txtEndHourB.setLocation(40, 120);
        txtEndHourB.setBorder(null);
        txtEndHourB.setEditable(true);
        txtEndHourB.addMouseListener(this);

        //Separator Under Start Date txt Box
        separator4B.setForeground(new Color(225,223,186));
        separator4B.setBackground(new Color(27, 28, 30));
        separator4B.setSize(195, 17);
        separator4B.setLocation(40, 83);

        //Start Date Txt Box
        txtStartHourB.setText("07:00");
        txtStartHourB.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtStartHourB.setForeground(new Color(225,223,186));
        txtStartHourB.setBackground(new Color(27, 28, 30));
        txtStartHourB.setSize(100, 42);
        txtStartHourB.setLocation(40, 40);
        txtStartHourB.setBorder(null);
        txtStartHourB.setEditable(true);
        txtStartHourB.addMouseListener(this);

        //Panel view when btnDateB clicked
        pnlDate.setSize(340, 200);
        pnlDate.setLocation(80, 200);
        pnlDate.setVisible(false);
        pnlDate.setBackground(new Color(27, 28, 30));
        pnlDate.setLayout(null);  

        //Start Date Title
        bookingDateB.setText("Start Date");
        bookingDateB.setBackground(new Color(27, 28, 30));
        bookingDateB.setForeground(new Color(225,223,186));
        bookingDateB.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        bookingDateB.setSize(130,25);
        bookingDateB.setLocation(20, 20);

        //End Date Title
        endBookingDateB.setText("End Date");
        endBookingDateB.setBackground(new Color(27, 28, 30));
        endBookingDateB.setForeground(new Color(225,223,186));
        endBookingDateB.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        endBookingDateB.setSize(130,25);
        endBookingDateB.setLocation(20, 100);

        //Separator Under End Date txt Box
        separator3B.setForeground(new Color(225,223,186));
        separator3B.setBackground(new Color(27, 28, 30));
        separator3B.setSize(195, 17);
        separator3B.setLocation(40, 163);

        //End Date txt Box
        txtEndDateB.setText("10-09-2022");
        txtEndDateB.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtEndDateB.setForeground(new Color(225,223,186));
        txtEndDateB.setBackground(new Color(27, 28, 30));
        txtEndDateB.setSize(100, 42);
        txtEndDateB.setLocation(40, 120);
        txtEndDateB.setBorder(null);
        txtEndDateB.setEditable(true);
        txtEndDateB.addMouseListener(this);

        //Separator Under Start Date txt Box
        separator2B.setForeground(new Color(225,223,186));
        separator2B.setBackground(new Color(27, 28, 30));
        separator2B.setSize(195, 17);
        separator2B.setLocation(40, 83);

        //Start Date Txt Box
        txtStartDateB.setText("09-09-2022");
        txtStartDateB.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtStartDateB.setForeground(new Color(225,223,186));
        txtStartDateB.setBackground(new Color(27, 28, 30));
        txtStartDateB.setSize(100, 42);
        txtStartDateB.setLocation(40, 40);
        txtStartDateB.setBorder(null);
        txtStartDateB.setEditable(true);
        txtStartDateB.addMouseListener(this);

        //Hour Button
        btnHourB.setText("Book by Hour");
        btnHourB.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        Border borderB = new LineBorder(new Color(225,223,186), 1, true);
        btnHourB.setBorder(borderB);
        btnHourB.setFocusable(false);
        btnHourB.setForeground(new Color(225,223,186));
        btnHourB.setBackground(new Color(27, 28, 30));
        btnHourB.setSize(150, 30);
        btnHourB.setLocation(80, 160);
        btnHourB.addMouseListener(this);

        //Date Button
        btnDateB.setText("Book by Date");
        btnDateB.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        btnDateB.setBorder(borderB);
        btnDateB.setFocusable(false);
        btnDateB.setForeground(new Color(225,223,186));
        btnDateB.setBackground(new Color(27, 28, 30));
        btnDateB.setSize(150, 30);
        btnDateB.setLocation(250, 160);
        btnDateB.addMouseListener(this);

        //Booking Button
        btnBookB.setText("Book");
        btnBookB.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        btnBookB.setFocusable(false);
        btnBookB.setForeground(new Color(225,223,186));
        btnBookB.setBackground(new Color(27, 28, 30));
        btnBookB.setSize(110, 44);
        btnBookB.setLocation(485, 330);
        btnBookB.setBorder(borderB);
        btnBookB.addMouseListener(this);

        //Big Calendar Picture
        ImageIcon calendarB = new ImageIcon("src\\Pics\\calendar.png");
        calendarPicB.setIcon(calendarB);
        calendarPicB.setSize(256, 256);
        calendarPicB.setLocation(430, 40);

        //Separator under Car Model txt Box
        separator1B.setForeground(new Color(225,223,186));
        separator1B.setBackground(new Color(27, 28, 30));
        separator1B.setSize(195, 17);
        separator1B.setLocation(120, 137);

        //Car Model txt Box
        txtCarModelB.setText("Tesla Model S");
        txtCarModelB.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtCarModelB.setForeground(new Color(225,223,186));
        txtCarModelB.setBackground(new Color(27, 28, 30));
        txtCarModelB.setSize(100, 42);
        txtCarModelB.setLocation(120, 95);
        txtCarModelB.setBorder(null);
        txtCarModelB.setEditable(false);

        //Car Model Title
        carModelB.setText("Car Model");
        carModelB.setBackground(new Color(27, 28, 30));
        carModelB.setForeground(new Color(225,223,186));
        carModelB.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        carModelB.setSize(100,25);
        carModelB.setLocation(100, 70);

        //Text for Page Title
        pageTitleB.setText("Booking");
        pageTitleB.setFont(new Font("TW Cen MT", Font.PLAIN, 28));
        pageTitleB.setForeground(new Color(225,223,186));
        pageTitleB.setBackground(new Color(27, 28, 30));
        pageTitleB.setSize(122, 27);
        pageTitleB.setLocation(310, 10);

        //Panel
        pnlB.setBackground(new Color(27, 28, 30));
        pnlB.setLayout(null);
        pnlB.setSize(725, 420);
        pnlB.setVisible(false);

        pnlHour.add(bookingHourB);
        pnlHour.add(endBookingHourB);
        pnlHour.add(txtEndHourB);
        pnlHour.add(txtStartHourB);
        pnlHour.add(separator4B);
        pnlHour.add(separator5B);

        pnlDate.add(bookingDateB);
        pnlDate.add(endBookingDateB);
        pnlDate.add(txtEndDateB);
        pnlDate.add(txtStartDateB);
        pnlDate.add(separator2B);
        pnlDate.add(separator3B);

        //Adding items to frame
        pnlB.add(btnBookB);
        pnlB.add(calendarPicB);
        pnlB.add(separator1B);
        pnlB.add(txtCarModelB);
        pnlB.add(pageTitleB);
        pnlB.add(carModelB);
        pnlB.add(btnHourB);
        pnlB.add(btnDateB);
        pnlB.add(pnlDate);
        pnlB.add(pnlHour);

        return pnlB;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub          
        if(e.getSource() == btnHourB) {
            pnlHour.setVisible(true);
            pnlDate.setVisible(false);
        } else if(e.getSource() == btnDateB) {
            pnlDate.setVisible(true);
            pnlHour.setVisible(false);
        } else if(e.getSource() == btnBookB) {
            String model = txtCarModelB.getText();
            String start = "";
            String end = "";

            if(pnlHour.isVisible()) {
                start = txtStartHourB.getText();
                end = txtEndHourB.getText();
                String[] array = {username, model, start, end, "N/A", "N/A", "Pending", "\n"};
                try
                {
                    FileWriter fw = new FileWriter("src\\Text Files\\Booking.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);    

                    for (int i = 0; i < array.length ; i++)
                    {
                        pw.write(array[i] + ", ");
                    }
                    pw.close();
                    JOptionPane.showMessageDialog(null, "Booking Made Successful. Awaiting approval", "Booking Succesful", JOptionPane.INFORMATION_MESSAGE);
                    pnlB.setVisible(false);
                    pnlViewAllCar.setVisible(true);
                }
                catch (Exception f)
                {
                    f.printStackTrace();
                    System.out.println("No such file exists.");
                }
            } else if(pnlDate.isVisible()) {
                start = txtStartDateB.getText();
                end = txtEndDateB.getText();
                String[] array = {username, model, "N/A", "N/A", start, end, "Pending", "\n"};
                try
                {
                    FileWriter fw = new FileWriter("src\\Text Files\\Booking.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);    

                    for (int i = 0; i < array.length ; i++)
                    {
                        pw.write(array[i] + ", ");
                    }
                    pw.close();
                    JOptionPane.showMessageDialog(null, "Booking Made Successful. Awaiting approval", "Booking Succesful", JOptionPane.INFORMATION_MESSAGE);
                    pnlB.setVisible(false);
                    pnlViewAllCar.setVisible(true);
                }
                catch (Exception f)
                {
                    f.printStackTrace();
                    System.out.println("No such file exists.");
                }
            }
        }
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
