import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Billing extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new Billing();
    }

    private JPanel pnlBill = new JPanel();
    private JLabel titleBill = new JLabel();
    private JLabel titlePaymentDetails = new JLabel();
    private JLabel titleRentalDetails = new JLabel();
    private JLabel carInfoBill = new JLabel();
    private JLabel rentalDurationBill = new JLabel();
    private JLabel priceBill = new JLabel();
    private JLabel usernameBill = new JLabel();
    private JLabel phoneNumBill = new JLabel();
    private JLabel paymentMethodBill = new JLabel();
    private JLabel txtcarInfoBill = new JLabel();
    private JLabel txtrentalDurationBill = new JLabel();
    private JLabel txtpriceBill = new JLabel();
    private JLabel txtusernameBill = new JLabel();
    private JLabel txtphoneNumBill = new JLabel();
    private ButtonGroup btnGroupBill = new ButtonGroup();
    private JRadioButton CashBill = new JRadioButton();
    private JRadioButton OnlineBill = new JRadioButton();
    private JSeparator separatorBill = new JSeparator();
    private JSeparator separatorBill1 = new JSeparator();
    private JButton btnCancelBill = new JButton();
    private JButton btnProceedBill = new JButton();
    private Border borderBill = new LineBorder(new Color(225,223,186), 1, true);


    Billing() {

        titleRentalDetails.setText("Rental Details");
        titleRentalDetails.setSize(150, 30);
        titleRentalDetails.setBorder(null);
        titleRentalDetails.setForeground(new Color(225,223,186));
        titleRentalDetails.setBackground(new Color(27, 28, 30));
        titleRentalDetails.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        titleRentalDetails.setLocation(50, 30);

        separatorBill1.setForeground(new Color(225,223,186));
        separatorBill1.setBackground(new Color(27, 28, 30));
        separatorBill1.setSize(725, 17);
        separatorBill1.setLocation(0, 70);

        carInfoBill.setText("Car Information: ");
        carInfoBill.setSize(150, 30);
        carInfoBill.setBorder(null);
        carInfoBill.setForeground(new Color(225,223,186));
        carInfoBill.setBackground(new Color(27, 28, 30));
        carInfoBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        carInfoBill.setLocation(25, 80);

        rentalDurationBill.setText("Rental Duration: ");
        rentalDurationBill.setSize(150, 30);
        rentalDurationBill.setBorder(null);
        rentalDurationBill.setForeground(new Color(225,223,186));
        rentalDurationBill.setBackground(new Color(27, 28, 30));
        rentalDurationBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        rentalDurationBill.setLocation(25, 110);

        priceBill.setText("Price: ");
        priceBill.setSize(100, 30);
        priceBill.setBorder(null);
        priceBill.setForeground(new Color(225,223,186));
        priceBill.setBackground(new Color(27, 28, 30));
        priceBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        priceBill.setLocation(25, 140);

        txtcarInfoBill.setText("Car Information");
        txtcarInfoBill.setSize(150, 30);
        txtcarInfoBill.setBorder(null);
        txtcarInfoBill.setForeground(new Color(225,223,186));
        txtcarInfoBill.setBackground(new Color(27, 28, 30));
        txtcarInfoBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        txtcarInfoBill.setLocation(180, 80);

        txtrentalDurationBill.setText("Rental Duration");
        txtrentalDurationBill.setSize(150, 30);
        txtrentalDurationBill.setBorder(null);
        txtrentalDurationBill.setForeground(new Color(225,223,186));
        txtrentalDurationBill.setBackground(new Color(27, 28, 30));
        txtrentalDurationBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        txtrentalDurationBill.setLocation(180, 110);

        txtpriceBill.setText("Price");
        txtpriceBill.setSize(100, 30);
        txtpriceBill.setBorder(null);
        txtpriceBill.setForeground(new Color(225,223,186));
        txtpriceBill.setBackground(new Color(27, 28, 30));
        txtpriceBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        txtpriceBill.setLocation(180, 140);

        titlePaymentDetails.setText("Payment Details");
        titlePaymentDetails.setSize(150, 30);
        titlePaymentDetails.setBorder(null);
        titlePaymentDetails.setForeground(new Color(225,223,186));
        titlePaymentDetails.setBackground(new Color(27, 28, 30));
        titlePaymentDetails.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        titlePaymentDetails.setLocation(50, 180);

        separatorBill.setForeground(new Color(225,223,186));
        separatorBill.setBackground(new Color(27, 28, 30));
        separatorBill.setSize(725, 17);
        separatorBill.setLocation(0, 220);

        usernameBill.setText("Username: ");
        usernameBill.setSize(150, 30);
        usernameBill.setBorder(null);
        usernameBill.setForeground(new Color(225,223,186));
        usernameBill.setBackground(new Color(27, 28, 30));
        usernameBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        usernameBill.setLocation(25, 230);

        phoneNumBill.setText("Phone Number: ");
        phoneNumBill.setSize(150, 30);
        phoneNumBill.setBorder(null);
        phoneNumBill.setForeground(new Color(225,223,186));
        phoneNumBill.setBackground(new Color(27, 28, 30));
        phoneNumBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        phoneNumBill.setLocation(25, 260);

        paymentMethodBill.setText("Payment Method: ");
        paymentMethodBill.setSize(150, 30);
        paymentMethodBill.setBorder(null);
        paymentMethodBill.setForeground(new Color(225,223,186));
        paymentMethodBill.setBackground(new Color(27, 28, 30));
        paymentMethodBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        paymentMethodBill.setLocation(25, 290);

        txtusernameBill.setText("Username");
        txtusernameBill.setSize(150, 30);
        txtusernameBill.setBorder(null);
        txtusernameBill.setForeground(new Color(225,223,186));
        txtusernameBill.setBackground(new Color(27, 28, 30));
        txtusernameBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        txtusernameBill.setLocation(180, 230);

        txtphoneNumBill.setText("Phone Number");
        txtphoneNumBill.setSize(150, 30);
        txtphoneNumBill.setBorder(null);
        txtphoneNumBill.setForeground(new Color(225,223,186));
        txtphoneNumBill.setBackground(new Color(27, 28, 30));
        txtphoneNumBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        txtphoneNumBill.setLocation(180, 260);

        CashBill.setText("Cash");
        CashBill.setSize(150, 30);
        CashBill.setBorder(null);
        CashBill.setForeground(new Color(225,223,186));
        CashBill.setBackground(new Color(27, 28, 30));
        CashBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        CashBill.setLocation(180, 290);
        CashBill.setFocusable(false);

        OnlineBill.setText("Online Banking");
        OnlineBill.setSize(150, 30);
        OnlineBill.setBorder(null);
        OnlineBill.setForeground(new Color(225,223,186));
        OnlineBill.setBackground(new Color(27, 28, 30));
        OnlineBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        OnlineBill.setLocation(180, 310);
        OnlineBill.setFocusable(false);

        btnGroupBill.add(CashBill);
        btnGroupBill.add(OnlineBill);

        //Cancel Button
        btnCancelBill.setText("Cancel");
        btnCancelBill.setSize(90, 37);
        btnCancelBill.setLocation(425, 305);
        btnCancelBill.setForeground(new Color(225,223,186));
        btnCancelBill.setBackground(new Color(27, 28, 30));
        btnCancelBill.setBorder(borderBill);
        btnCancelBill.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        btnCancelBill.setFocusable(false);
        btnCancelBill.addMouseListener(this);
        
        //Clear Button
        btnProceedBill.setText("Proceed");
        btnProceedBill.setSize(90, 37);
        btnProceedBill.setLocation(525, 305);
        btnProceedBill.setForeground(new Color(225,223,186));
        btnProceedBill.setBackground(new Color(27, 28, 30));
        btnProceedBill.setBorder(borderBill);
        btnProceedBill.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        btnProceedBill.setFocusable(false);
        btnProceedBill.addMouseListener(this);
    
        //Page Title
        titleBill.setText("Rental Checkout");
        titleBill.setFont(new Font("TW Cen MT", Font.PLAIN, 28));
        titleBill.setForeground(new Color(225,223,186));
        titleBill.setBackground(new Color(27, 28, 30));
        titleBill.setSize(200, 27);
        titleBill.setLocation(280, 10);

        //Panel
        pnlBill.setLayout(null);
        pnlBill.setBackground(new Color(27, 28, 30));
        pnlBill.setSize(725, 420);
        pnlBill.setVisible(true);

        pnlBill.add(titleBill);
        pnlBill.add(titleRentalDetails);
        pnlBill.add(titlePaymentDetails);
        pnlBill.add(carInfoBill);
        pnlBill.add(rentalDurationBill);
        pnlBill.add(priceBill);
        pnlBill.add(usernameBill);
        pnlBill.add(phoneNumBill);
        pnlBill.add(paymentMethodBill);
        pnlBill.add(txtcarInfoBill);
        pnlBill.add(txtrentalDurationBill);
        pnlBill.add(txtpriceBill);
        pnlBill.add(txtusernameBill);
        pnlBill.add(txtphoneNumBill);
        pnlBill.add(CashBill);
        pnlBill.add(OnlineBill);
        pnlBill.add(separatorBill);
        pnlBill.add(separatorBill1);
        pnlBill.add(btnCancelBill);
        pnlBill.add(btnProceedBill);

        //Panel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBackground(new Color(27, 28, 30));
        this.setSize(725, 420);
        this.setVisible(true);

        this.add(pnlBill);
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
