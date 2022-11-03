import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class App extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new App();
    }

    //Home Page
    private JPanel pnl1 = new JPanel();
    private JPanel pnl2 = new JPanel();
    private JPanel pnl3 = new JPanel();
    private JPanel pnlProfile = new JPanel();
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

    //Profile
    private JLabel lblUsername = new JLabel();
    private JLabel lblEmail = new JLabel();
    private JLabel lblPhoneNum = new JLabel();
    private JButton btnEdit = new JButton();
    private JLabel border = new JLabel();
    private JLabel border2 = new JLabel();
    private JLabel progBar0 = new JLabel();
    private JLabel progBar25 = new JLabel();
    private JLabel progBar50 = new JLabel();
    private JLabel progBar75 = new JLabel();
    private JLabel progBar100 = new JLabel();
    private JLabel car_Profile = new JLabel();
    private JButton btnView = new JButton();
    private JLabel icnUsername = new JLabel();
    private JLabel icnEmail = new JLabel();
    private JLabel icnPhoneNum = new JLabel();
    private JLabel titleProfile = new JLabel();
    private JLabel titleService = new JLabel();
    private JLabel txtView = new JLabel();

    //Add Page
    private JPanel pnlAdd = new JPanel();
    private JPanel pnlLeft = new JPanel();
    private JPanel pnlRight = new JPanel();
    private JLabel txtCus = new JLabel();
    private JLabel txtCar = new JLabel();
    private JButton btnAddCus = new JButton();
    private JButton btnAddCar = new JButton();
    private JSeparator separator1 = new JSeparator(SwingConstants.VERTICAL);

    //View Monthly Report Page
    private JPanel pnlVMP = new JPanel();
    private JButton btnClear = new JButton();
    private JButton btnSearch = new JButton();
    private JLabel totalIncome = new JLabel();
    private JLabel txtTotalIncome = new JLabel();
    private JCheckBox completed = new JCheckBox();
    private JCheckBox uncompleted = new JCheckBox();
    private JTable table = new JTable();
    private JScrollPane pane = new JScrollPane();
    private JPanel tablePnl = new JPanel();
    private Border borderVMP = new LineBorder(new Color(225,223,186), 1, true);

    //View All Car Page
    private JLabel pnl1Car = new JLabel();
    private JLabel pnl2Car = new JLabel();
    private JLabel pnl3Car = new JLabel();
    private JLabel pnl4Car = new JLabel();
    private JLabel pnl5Car = new JLabel();
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
    private JPanel pnlViewAllCar = new JPanel();
    ImageIcon pnl = new ImageIcon("src\\Pics\\pnl.png");
    ImageIcon pricePic = new ImageIcon("src\\Pics\\price-tag (1).png");
    ImageIcon seat = new ImageIcon("src\\Pics\\car-seat (1).png");
    private Border borderCar = new LineBorder(new Color(27, 28, 30), 4, true);

    //RBP Page
    private JPanel pnlRBP = new JPanel();
    private JPanel pnlLeftRBP = new JPanel();
    private JPanel pnlRightRBP = new JPanel();
    private JLabel txtReport = new JLabel();
    private JLabel txtBook = new JLabel();
    private JButton btnReport  = new JButton();
    private JButton btnBook = new JButton();
    private JSeparator separator1RBP = new JSeparator(SwingConstants.VERTICAL);

    //Registration Page
    private JPanel pnlR = new JPanel();
    private JButton btnRegisterR = new JButton();
    private JSeparator separator1R = new JSeparator();
    private JSeparator separator2R = new JSeparator();
    private JSeparator separator3R = new JSeparator();
    private JSeparator separator4R = new JSeparator();
    private JTextField txtUsernameR = new JTextField();
    private JTextField txtPasswordR = new JTextField();
    private JTextField txtEmailR= new JTextField();
    private JTextField txtPhoneNumR = new JTextField();
    private JLabel pageTitleR = new JLabel();
    private JLabel car1R = new JLabel();
    private JLabel car2R = new JLabel();
    private JLabel icnUsernameR = new JLabel();
    private JLabel icnPhoneNumR = new JLabel();
    private JLabel icnEmailR = new JLabel();
    private JLabel icnPasswordR = new JLabel();

    //Add Car Admin Page
    private JPanel pnlAC = new JPanel();
    private JLabel carBrandAC = new JLabel();
    private JLabel carModelAC = new JLabel();
    private JLabel carPlateNumAC = new JLabel();
    private JLabel carYearAC = new JLabel();
    private JLabel carSeatAC = new JLabel();
    private JTextField txtCarBrandAC = new JTextField();
    private JTextField txtCarModelAC = new JTextField();
    private JTextField txtCarPlateNumAC = new JTextField();
    private JTextField txtCarYearAC = new JTextField();
    private JTextField txtCarSeatAC = new JTextField();
    private JButton btnClearAC = new JButton();
    private JButton btnCancelAC = new JButton();
    private JButton btnAddAC = new JButton(); 
    private JTable tableAC = new JTable();
    private JPanel tablePnlAC = new JPanel();
    private JSeparator separator1AC = new JSeparator();
    private JSeparator separator2AC = new JSeparator();
    private JSeparator separator3AC = new JSeparator();
    private JSeparator separator4AC = new JSeparator();
    private JSeparator separator5AC = new JSeparator();
    private JScrollPane paneAC = new JScrollPane();
    private Border borderAC = new LineBorder(new Color(225,223,186), 1, true);

    //Edit Profile Page
    private JPanel pnlEP = new JPanel();
    private JTextField lblUsernameEP = new JTextField();
    private JTextField lblPhoneNumEP = new JTextField();
    private JTextField lblEmailEP = new JTextField();
    private JButton btnChangeEP = new JButton();
    private JButton btnChangePwdEP = new JButton();
    private JButton btnDefaultEP = new JButton();
    private JLabel pageTitleEP = new JLabel();
    private JSeparator separator1EP = new JSeparator();
    private JSeparator separator2EP = new JSeparator();
    private JSeparator separator3EP = new JSeparator();
    private JLabel icnUsernameEP = new JLabel();
    private JLabel icnPhoneNumEP = new JLabel();
    private JLabel icnEmailEP = new JLabel();
    private JLabel carPicEP = new JLabel();

    //Change Password Page
    private JPanel pnlCP = new JPanel();
    private JTextField passwordCP = new JTextField();
    private JTextField confirmPwdCP = new JTextField(); 
    private JLabel pageTitleCP = new JLabel();
    private JLabel pwdPicCP = new JLabel();
    private JSeparator separator1CP = new JSeparator();
    private JSeparator separator2CP = new JSeparator();
    private JButton btnChangeCP = new JButton();

    //View Monthly Report
    private JPanel pnlMR = new JPanel();
    private JButton btnClearMR = new JButton();
    private JButton btnSearchMR = new JButton();
    private JLabel totalIncomeMR = new JLabel();
    private JLabel txtTotalIncomeMR = new JLabel();
    private JRadioButton completedMR = new JRadioButton();
    private JRadioButton uncompletedMR = new JRadioButton();
    private JTable tableMR = new JTable();
    private JScrollPane paneMR = new JScrollPane();
    private JPanel tablePnlMR = new JPanel();
    private Border borderMR = new LineBorder(new Color(225,223,186), 1, true);

    //View Car Page
    private JPanel pnlBigOCP = new JPanel();
    private JLabel carPicOCP = new JLabel();
    private JLabel pnl1OCP = new JLabel();
    private JLabel pnl2OCP = new JLabel();
    private JLabel pricePerHrOCP = new JLabel();
    private JLabel carSeatsOCP = new JLabel();
    private JLabel seatsOCP = new JLabel();
    private JLabel availableOCP = new JLabel();
    private JLabel availableTxtOCP = new JLabel();
    private JLabel locationOCP = new JLabel();
    private JTextArea location1OCP = new JTextArea();
    private JLabel carNameOCP = new JLabel();
    private JLabel carRatingOCP = new JLabel();
    private JLabel pricePicOCP = new JLabel();
    private JLabel seatPicOCP = new JLabel();
    private JLabel backOCP = new JLabel();
    private JLabel bookOCP = new JLabel();
    private JLabel starOCP = new JLabel();
    private JButton btnBookOCP = new JButton();
    private JButton btnBackOCP = new JButton();

    //View Booking Request Page
    private JPanel pnlBR = new JPanel();
    private JLabel lblSearchBR = new JLabel();
    private JTextArea txtSearchBR = new JTextArea();
    private JSeparator separator1BR = new JSeparator();
    private JLabel lblUserIDBR = new JLabel();
    private JLabel lblUserNameBR = new JLabel();
    private JLabel lblPhoneNumBR = new JLabel();
    private JLabel lblCarInfoBR = new JLabel();
    private JLabel lblRentDateBR = new JLabel();
    private JLabel lblReturnDateBR = new JLabel();
    private JLabel txtUserIDBR = new JLabel();
    private JLabel txtUserNameBR = new JLabel();
    private JLabel txtPhoneNumBR = new JLabel();
    private JLabel txtCarInfoBR = new JLabel();
    private JLabel txtRentDateBR = new JLabel();
    private JLabel txtReturnDateBR = new JLabel();
    private JButton btnCancelBR = new JButton();
    private JButton btnDeclineBR = new JButton();
    private JButton btnAcceptBR = new JButton();
    private JTable tableBR = new JTable();
    private JScrollPane paneBR = new JScrollPane();
    private JPanel tableBRPnl = new JPanel();
    private Border borderBR = new LineBorder(new Color(225,223,186), 1, true);

    App() {

        //View Booking Request Page
        {
            txtUserIDBR.setText("U12");
            txtUserIDBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            txtUserIDBR.setForeground(new Color(225,223,186));
            txtUserIDBR.setBackground(new Color(27, 28, 30));
            txtUserIDBR.setLocation(260, 215);
            txtUserIDBR.setSize(150, 26);

            txtUserNameBR.setText("Adrian_Fu");
            txtUserNameBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            txtUserNameBR.setForeground(new Color(225,223,186));
            txtUserNameBR.setBackground(new Color(27, 28, 30));
            txtUserNameBR.setLocation(260, 242);
            txtUserNameBR.setSize(150, 26);

            txtPhoneNumBR.setText("0111234566");
            txtPhoneNumBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            txtPhoneNumBR.setForeground(new Color(225,223,186));
            txtPhoneNumBR.setBackground(new Color(27, 28, 30));
            txtPhoneNumBR.setLocation(260, 269);
            txtPhoneNumBR.setSize(150, 26);

            txtCarInfoBR.setText("Honda City, VHJ 1023");
            txtCarInfoBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            txtCarInfoBR.setForeground(new Color(225,223,186));
            txtCarInfoBR.setBackground(new Color(27, 28, 30));
            txtCarInfoBR.setLocation(260, 296);
            txtCarInfoBR.setSize(150, 26);

            txtRentDateBR.setText("12-09-2022");
            txtRentDateBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            txtRentDateBR.setForeground(new Color(225,223,186));
            txtRentDateBR.setBackground(new Color(27, 28, 30));
            txtRentDateBR.setLocation(260, 323);
            txtRentDateBR.setSize(150, 26);

            txtReturnDateBR.setText("13-09-2022");
            txtReturnDateBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            txtReturnDateBR.setForeground(new Color(225,223,186));
            txtReturnDateBR.setBackground(new Color(27, 28, 30));
            txtReturnDateBR.setLocation(260, 350);
            txtReturnDateBR.setSize(150, 26);

            lblUserIDBR.setText("User ID: ");
            lblUserIDBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            lblUserIDBR.setForeground(new Color(225,223,186));
            lblUserIDBR.setBackground(new Color(27, 28, 30));
            lblUserIDBR.setLocation(110, 215);
            lblUserIDBR.setSize(150, 26);

            lblUserNameBR.setText("Username: ");
            lblUserNameBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            lblUserNameBR.setForeground(new Color(225,223,186));
            lblUserNameBR.setBackground(new Color(27, 28, 30));
            lblUserNameBR.setLocation(110, 242);
            lblUserNameBR.setSize(150, 26);

            lblPhoneNumBR.setText("Phone Number: ");
            lblPhoneNumBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            lblPhoneNumBR.setForeground(new Color(225,223,186));
            lblPhoneNumBR.setBackground(new Color(27, 28, 30));
            lblPhoneNumBR.setLocation(110, 269);
            lblPhoneNumBR.setSize(150, 26);

            lblCarInfoBR.setText("Car Information: ");
            lblCarInfoBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            lblCarInfoBR.setForeground(new Color(225,223,186));
            lblCarInfoBR.setBackground(new Color(27, 28, 30));
            lblCarInfoBR.setLocation(110, 296);
            lblCarInfoBR.setSize(150, 26);

            lblRentDateBR.setText("Rental Date: ");
            lblRentDateBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            lblRentDateBR.setForeground(new Color(225,223,186));
            lblRentDateBR.setBackground(new Color(27, 28, 30));
            lblRentDateBR.setLocation(110, 323);
            lblRentDateBR.setSize(150, 26);

            lblReturnDateBR.setText("Return Date: ");
            lblReturnDateBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            lblReturnDateBR.setForeground(new Color(225,223,186));
            lblReturnDateBR.setBackground(new Color(27, 28, 30));
            lblReturnDateBR.setLocation(110, 350);
            lblReturnDateBR.setSize(150, 26);

            btnCancelBR.setText("Cancel");
            btnCancelBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            btnCancelBR.setForeground(new Color(225,223,186));
            btnCancelBR.setBackground(new Color(27, 28, 30));
            btnCancelBR.setLocation(500, 250);
            btnCancelBR.setSize(80, 26);
            btnCancelBR.setBorder(borderBR);

            btnDeclineBR.setText("Decline");
            btnDeclineBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            btnDeclineBR.setForeground(new Color(225,223,186));
            btnDeclineBR.setBackground(new Color(27, 28, 30));
            btnDeclineBR.setLocation(500, 285);
            btnDeclineBR.setSize(80, 26);
            btnDeclineBR.setBorder(borderBR);

            btnAcceptBR.setText("Accept");
            btnAcceptBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            btnAcceptBR.setForeground(new Color(225,223,186));
            btnAcceptBR.setBackground(new Color(27, 28, 30));
            btnAcceptBR.setLocation(500, 320);
            btnAcceptBR.setSize(80, 26);
            btnAcceptBR.setBorder(borderBR);


            //Table
            String[] columnsReturn = {"Return ID", "Username", "Status", "Return Date"};
            String[][] rowsReturn = {{"R01", "Hamid_Karim_123", "Returned", "04-10-2022"}, 
                                {"R02", "Adrian_Fu", "Not Returned", "N/A"},
                                {"R02", "Adrian_Fu", "Not Returned", "N/A"},
                                {"R02", "Adrian_Fu", "Not Returned", "N/A"}, 
                                {"R02", "Adrian_Fu", "Not Returned", "N/A"}};

            tableBR = new JTable(rowsReturn, columnsReturn){
                public boolean isCellEditable(int rows, int columns) {
                    return false;
                }
            };

            tableBR.setPreferredScrollableViewportSize(new Dimension(450, 151));
            tableBR.setFillsViewportHeight(true);
            tableBR.setBackground(new Color(27, 28, 30));
            tableBR.setForeground(new Color(225,223,186));
            tableBR.setGridColor(new Color(225,223,186));
            tableBR.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            tableBR.setRowHeight(30);
            
            paneBR = new JScrollPane(tableBR);

            tableBRPnl.setSize(450, 145);
            tableBRPnl.setLocation(130, 60);
            tableBRPnl.add(paneBR);

            //Object[] rowReturns = new Object[4];

            separator1BR.setForeground(new Color(225,223,186));
            separator1BR.setBackground(new Color(27, 28, 30));
            separator1BR.setSize(160, 17);
            separator1BR.setLocation(160, 46);

            txtSearchBR.setSize(160, 30);
            txtSearchBR.setLocation(160, 16);
            txtSearchBR.setForeground(new Color(225,223,186));
            txtSearchBR.setBackground(new Color(27, 28, 30));
            txtSearchBR.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            txtSearchBR.setCaretColor(new Color(225,223,186));
            
            lblSearchBR.setText("Search User ID: ");
            lblSearchBR.setSize(130, 37);
            lblSearchBR.setLocation(30, 10);
            lblSearchBR.setForeground(new Color(225,223,186));
            lblSearchBR.setBackground(new Color(27, 28, 30));
            lblSearchBR.setFont(new Font("TW Cen MT", Font.PLAIN, 18));

            //Frame
            pnlBR.setBackground(new Color(27, 28, 30));
            pnlBR.setLayout(null);
            pnlBR.setSize(725, 420);
            pnlBR.setVisible(false);

            pnlBR.add(lblSearchBR);
            pnlBR.add(txtSearchBR);
            pnlBR.add(separator1BR);
            pnlBR.add(tableBRPnl);
            pnlBR.add(lblUserIDBR);
            pnlBR.add(lblUserNameBR);
            pnlBR.add(lblPhoneNumBR);
            pnlBR.add(lblCarInfoBR);
            pnlBR.add(lblRentDateBR);
            pnlBR.add(lblReturnDateBR);
            pnlBR.add(txtUserIDBR);
            pnlBR.add(txtUserNameBR);
            pnlBR.add(txtPhoneNumBR);
            pnlBR.add(txtCarInfoBR);
            pnlBR.add(txtRentDateBR);
            pnlBR.add(txtReturnDateBR);
            pnlBR.add(btnCancelBR);
            pnlBR.add(btnAcceptBR);
            pnlBR.add(btnDeclineBR);
        }

        //View Car Page
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

        //View Monthly Report 
        {
            //Table
            String[] columnsReturn = {"First", "Second", "Third", "Fourth"};
            String[][] rowsReturn = {};

            tableMR = new JTable(rowsReturn, columnsReturn){
                public boolean isCellEditable(int rows, int columns) {
                    return false;
                }
            };

            tableMR.setPreferredScrollableViewportSize(new Dimension(597, 1500));
            tableMR.setFillsViewportHeight(true);
            tableMR.setBackground(new Color(27, 28, 30));
            tableMR.setForeground(new Color(225,223,186));
            tableMR.setGridColor(new Color(225,223,186));
            tableMR.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            tableMR.setRowHeight(30);
            
            paneMR = new JScrollPane(tableMR);

            tablePnlMR.setBounds(50, 155, 597, 300);
            tablePnlMR.setBorder(BorderFactory.createLineBorder(new Color(225,223,186)));
            tablePnlMR.add(paneMR);

            //Object[] rowReturns = new Object[4];

            //Cancel Button
            btnSearchMR.setText("Search");
            btnSearchMR.setSize(85, 37);
            btnSearchMR.setLocation(155, 100);
            btnSearchMR.setForeground(new Color(225,223,186));
            btnSearchMR.setBackground(new Color(27, 28, 30));
            btnSearchMR.setBorder(borderMR);
            btnSearchMR.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            btnSearchMR.setFocusable(false);
            btnSearchMR.addMouseListener(this);
            
            //Clear Button
            btnClearMR.setText("Clear");
            btnClearMR.setSize(85, 37);
            btnClearMR.setLocation(50, 100);
            btnClearMR.setForeground(new Color(225,223,186));
            btnClearMR.setBackground(new Color(27, 28, 30));
            btnClearMR.setBorder(borderMR);
            btnClearMR.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            btnClearMR.setFocusable(false);
            btnClearMR.addMouseListener(this);

            //Text Total income (Manipulate)
            txtTotalIncomeMR.setText("RM 4,230.00");
            txtTotalIncomeMR.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            txtTotalIncomeMR.setForeground(new Color(225,223,186));
            txtTotalIncomeMR.setBackground(new Color(27, 28, 30));
            txtTotalIncomeMR.setSize(193, 26);
            txtTotalIncomeMR.setLocation(553, 60);

            //Text total income
            totalIncomeMR.setText("TOTAL INCOME (MONTH): ");
            totalIncomeMR.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            totalIncomeMR.setForeground(new Color(225,223,186));
            totalIncomeMR.setBackground(new Color(27, 28, 30));
            totalIncomeMR.setSize(193, 26);
            totalIncomeMR.setLocation(360, 60);

            //Check Box for uncompleted
            uncompletedMR.setText("Uncompleted");
            uncompletedMR.setForeground(new Color(225,223,186));
            uncompletedMR.setBackground(new Color(27, 28, 30));
            uncompletedMR.setSize(110, 25);
            uncompletedMR.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            uncompletedMR.setLocation(60, 60);
            uncompletedMR.setFocusable(false);

            //Check Box for completed
            completedMR.setText("Completed");
            completedMR.setForeground(new Color(225,223,186));
            completedMR.setBackground(new Color(27, 28, 30));
            completedMR.setSize(98, 25);
            completedMR.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            completedMR.setLocation(60, 30);
            completedMR.setFocusable(false);

            //Panel 
            pnlMR.setBackground(new Color(27, 28, 30));
            pnlMR.setLayout(null);
            pnlMR.setSize(725, 420);
            pnlMR.setVisible(true);

            //Adding components to Frame
            pnlMR.add(completedMR);
            pnlMR.add(uncompletedMR);
            pnlMR.add(totalIncomeMR);
            pnlMR.add(txtTotalIncomeMR);
            pnlMR.add(btnClearMR);
            pnlMR.add(btnSearchMR);
            pnlMR.add(tablePnlMR);
        }

        //Change Password Page
        {
            ImageIcon pwdCP = new ImageIcon("src\\Pics\\password.png");
            pwdPicCP.setIcon(pwdCP);
            pwdPicCP.setSize(256, 256);
            pwdPicCP.setLocation(420, 60);

            btnChangeCP.setText("Change Password");
            btnChangeCP.setSize(140, 44);
            btnChangeCP.setLocation(290, 300);
            btnChangeCP.setForeground(new Color(225,223,186));
            btnChangeCP.setBackground(new Color(27, 28, 30));
            Border borderCP = new LineBorder(new Color(225,223,186), 1, true);
            btnChangeCP.setBorder(borderCP);
            btnChangeCP.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnChangeCP.setFocusable(false);
            btnChangeCP.addMouseListener(this);

            pageTitleCP.setText("Change Password");
            pageTitleCP.setFont(new Font("TW Cen MT", Font.PLAIN, 28));
            pageTitleCP.setForeground(new Color(225,223,186));
            pageTitleCP.setBackground(new Color(27, 28, 30));
            pageTitleCP.setSize(200, 27);
            pageTitleCP.setLocation(270, 10);

            //Confirm Password box
            confirmPwdCP.setText("Confirm Password");
            confirmPwdCP.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            confirmPwdCP.setForeground(new Color(225,223,186));
            confirmPwdCP.setBackground(new Color(27, 28, 30));
            confirmPwdCP.setSize(180,30);
            confirmPwdCP.setLocation(125, 210);
            confirmPwdCP.setBorder(null);
            confirmPwdCP.addMouseListener(this);

            separator2CP.setForeground(new Color(225,223,186));
            separator2CP.setBackground(new Color(27, 28, 30));
            separator2CP.setSize(180, 17);
            separator2CP.setLocation(125, 243);

            //First Password box
            passwordCP.setText("Password");
            passwordCP.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            passwordCP.setForeground(new Color(225,223,186));
            passwordCP.setBackground(new Color(27, 28, 30));
            passwordCP.setSize(180,30);
            passwordCP.setLocation(125, 110);
            passwordCP.setBorder(null);
            passwordCP.addMouseListener(this);

            separator1CP.setForeground(new Color(225,223,186));
            separator1CP.setBackground(new Color(27, 28, 30));
            separator1CP.setSize(180, 17);
            separator1CP.setLocation(125, 143);

            pnlCP.setBackground(new Color(27, 28, 30));
            pnlCP.setLayout(null);
            pnlCP.setSize(725, 420);
            pnlCP.setVisible(false);

            pnlCP.add(passwordCP);
            pnlCP.add(confirmPwdCP);
            pnlCP.add(separator1CP);
            pnlCP.add(separator2CP);
            pnlCP.add(pageTitleCP);
            pnlCP.add(btnChangeCP);
            pnlCP.add(pwdPicCP);
        }

        //Edit Profile Page
        {
            //Car Picture
            ImageIcon carEP = new ImageIcon("src\\Pics\\sport-car.png");
            carPicEP.setIcon(carEP);
            carPicEP.setSize(256, 256);
            carPicEP.setLocation(300, 140);

            //Icon for Username
            ImageIcon userEP = new ImageIcon("src\\Pics\\user.png");
            icnUsernameEP.setIcon(userEP);
            icnUsernameEP.setSize(32, 32);
            icnUsernameEP.setLocation(70, 93);

            //Icon for Email
            ImageIcon emailEP = new ImageIcon("src\\Pics\\email.png");
            icnEmailEP.setIcon(emailEP);
            icnEmailEP.setSize(32, 32);
            icnEmailEP.setLocation(70, 173);

            //Icon for Phone
            ImageIcon phoneEP = new ImageIcon("src\\Pics\\smartphone.png");
            icnPhoneNumEP.setIcon(phoneEP);
            icnPhoneNumEP.setSize(32, 32);
            icnPhoneNumEP.setLocation(70, 253);

            //Page Title
            pageTitleEP.setText("Change Details");
            pageTitleEP.setFont(new Font("TW Cen MT", Font.PLAIN, 28));
            pageTitleEP.setForeground(new Color(225,223,186));
            pageTitleEP.setBackground(new Color(27, 28, 30));
            pageTitleEP.setSize(200, 27);
            pageTitleEP.setLocation(280, 10);

            //Change Button
            btnChangeEP.setText("Change Details");
            btnChangeEP.setSize(140, 44);
            btnChangeEP.setLocation(535, 130);
            btnChangeEP.setForeground(new Color(225,223,186));
            btnChangeEP.setBackground(new Color(27, 28, 30));
            Border borderEP= new LineBorder(new Color(225,223,186), 1, true);
            btnChangeEP.setBorder(borderEP);
            btnChangeEP.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnChangeEP.setFocusable(false);

            //Change Password Button
            btnChangePwdEP.setText("Change Password");
            btnChangePwdEP.setSize(140, 44);
            btnChangePwdEP.setLocation(535, 185);
            btnChangePwdEP.setForeground(new Color(225,223,186));
            btnChangePwdEP.setBackground(new Color(27, 28, 30));
            Border border1EP = new LineBorder(new Color(225,223,186), 1, true);
            btnChangePwdEP.setBorder(border1EP);
            btnChangePwdEP.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnChangePwdEP.setFocusable(false);
            btnChangePwdEP.addMouseListener(this);

            //Reset Button
            btnDefaultEP.setText("Back to Default");
            btnDefaultEP.setSize(140, 44);
            btnDefaultEP.setLocation(535, 240);
            btnDefaultEP.setForeground(new Color(225,223,186));
            btnDefaultEP.setBackground(new Color(27, 28, 30));
            Border border2EP = new LineBorder(new Color(225,223,186), 1, true);
            btnDefaultEP.setBorder(border2EP);
            btnDefaultEP.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnDefaultEP.setFocusable(false);

            //Txt for Phone No.
            lblPhoneNumEP.setText("011-1087 8646");
            lblPhoneNumEP.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            lblPhoneNumEP.setForeground(new Color(225,223,186));
            lblPhoneNumEP.setBackground(new Color(27, 28, 30));
            lblPhoneNumEP.setSize(180,30);
            lblPhoneNumEP.setLocation(110, 250);
            lblPhoneNumEP.setBorder(null);

            separator3EP.setForeground(new Color(225,223,186));
            separator3EP.setBackground(new Color(27, 28, 30));
            separator3EP.setSize(180, 17);
            separator3EP.setLocation(110, 283);

            //Txt for Email
            lblEmailEP.setText("adrianfwl@gmail.com");
            lblEmailEP.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            lblEmailEP.setForeground(new Color(225,223,186));
            lblEmailEP.setBackground(new Color(27, 28, 30));
            lblEmailEP.setSize(180,30);
            lblEmailEP.setLocation(110, 170);
            lblEmailEP.setBorder(null);

            separator2EP.setForeground(new Color(225,223,186));
            separator2EP.setBackground(new Color(27, 28, 30));
            separator2EP.setSize(180, 17);
            separator2EP.setLocation(110, 203);

            //Txt for Username
            lblUsernameEP.setText("Adrian_Fu");
            lblUsernameEP.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            lblUsernameEP.setForeground(new Color(225,223,186));
            lblUsernameEP.setBackground(new Color(27, 28, 30));
            lblUsernameEP.setSize(180,30);
            lblUsernameEP.setLocation(110, 90);
            lblUsernameEP.setBorder(null);

            separator1EP.setForeground(new Color(225,223,186));
            separator1EP.setBackground(new Color(27, 28, 30));
            separator1EP.setSize(180, 17);
            separator1EP.setLocation(110, 123);
            
            //Frame
            pnlEP.setBackground(new Color(27, 28, 30));
            pnlEP.setLayout(null);
            pnlEP.setSize(725, 420);
            pnlEP.setVisible(false);

            //Adding Components to Frame
            pnlEP.add(lblUsernameEP);
            pnlEP.add(lblEmailEP);
            pnlEP.add(lblPhoneNumEP);
            pnlEP.add(btnChangeEP);
            pnlEP.add(btnChangePwdEP);
            pnlEP.add(btnDefaultEP);
            pnlEP.add(pageTitleEP);
            pnlEP.add(separator1EP);
            pnlEP.add(separator2EP);
            pnlEP.add(separator3EP);
            pnlEP.add(icnUsernameEP);
            pnlEP.add(icnEmailEP);
            pnlEP.add(icnPhoneNumEP);
            pnlEP.add(carPicEP);
        }

        //Add Car Admin Page
        {
            //Table
            String[] columnsReturn = {"Car Brand", "CarModel", "Car Plate Number", "Car Year", "Car Seats"};
            String[][] rowsReturn = {{"Tesla", "Model S", "ABC 1234", "2020", "4"}, 
                                {"Perodua", "Myvi", "ABC 4576", "2018", "4"},
                                {"Proton", "Saga", "KLD 4657", "2018", "4"}};

            tableAC = new JTable(rowsReturn, columnsReturn){
                public boolean isCellEditable(int rows, int columns) {
                    return false;
                }
            };

            tableAC.setPreferredScrollableViewportSize(new Dimension(359, 1500));
            tableAC.setFillsViewportHeight(true);
            tableAC.setBackground(new Color(27, 28, 30));
            tableAC.setForeground(new Color(225,223,186));
            tableAC.setGridColor(new Color(225,223,186));
            tableAC.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            tableAC.setRowHeight(30);
            
            paneAC = new JScrollPane(tableAC);

            tablePnlAC.setBounds(320, 20, 363, 347);
            tablePnlAC.setBorder(BorderFactory.createLineBorder(new Color(225,223,186)));
            tablePnlAC.add(paneAC);

            //Object[] rowReturns = new Object[4];

            //Add Button
            btnAddAC.setText("Add");
            btnAddAC.setSize(90, 37);
            btnAddAC.setLocation(200, 300);
            btnAddAC.setForeground(new Color(225,223,186));
            btnAddAC.setBackground(new Color(27, 28, 30));
            btnAddAC.setBorder(borderAC);
            btnAddAC.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnAddAC.setFocusable(false);
            btnAddAC.addMouseListener(this);

            //Cancel Button
            btnCancelAC.setText("Cancel");
            btnCancelAC.setSize(90, 37);
            btnCancelAC.setLocation(200, 250);
            btnCancelAC.setForeground(new Color(225,223,186));
            btnCancelAC.setBackground(new Color(27, 28, 30));
            btnCancelAC.setBorder(borderAC);
            btnCancelAC.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnCancelAC.setFocusable(false);
            btnCancelAC.addMouseListener(this);
            
            //Clear Button
            btnClearAC.setText("Clear");
            btnClearAC.setSize(90, 37);
            btnClearAC.setLocation(200, 200);
            btnClearAC.setForeground(new Color(225,223,186));
            btnClearAC.setBackground(new Color(27, 28, 30));
            btnClearAC.setBorder(borderAC);
            btnClearAC.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnClearAC.setFocusable(false);
            btnClearAC.addMouseListener(this);

            //Car seat text box and label 
            separator5AC.setForeground(new Color(225,223,186));
            separator5AC.setBackground(new Color(27, 28, 30));
            separator5AC.setSize(120, 17);
            separator5AC.setLocation(35, 335);

            txtCarSeatAC.setText("eg: 4");
            txtCarSeatAC.setSize(120, 30);
            txtCarSeatAC.setBorder(null);
            txtCarSeatAC.setForeground(new Color(225,223,186));
            txtCarSeatAC.setBackground(new Color(27, 28, 30));
            txtCarSeatAC.setFont(new Font("TW Cen MT", Font.BOLD, 14));
            txtCarSeatAC.setLocation(35,305);

            carSeatAC.setText("Car Seats");
            carSeatAC.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            carSeatAC.setForeground(new Color(225,223,186));
            carSeatAC.setBackground(new Color(27, 28, 30));
            carSeatAC.setBorder(null);
            carSeatAC.setSize(180, 30);
            carSeatAC.setLocation(15, 280);

            //Car Year text box and label
            separator4AC.setForeground(new Color(225,223,186));
            separator4AC.setBackground(new Color(27, 28, 30));
            separator4AC.setSize(120, 17);
            separator4AC.setLocation(35, 270);

            txtCarYearAC.setText("eg: 2017");
            txtCarYearAC.setSize(120, 30);
            txtCarYearAC.setBorder(null);
            txtCarYearAC.setForeground(new Color(225,223,186));
            txtCarYearAC.setBackground(new Color(27, 28, 30));
            txtCarYearAC.setFont(new Font("TW Cen MT", Font.BOLD, 14));
            txtCarYearAC.setLocation(35,240);

            carYearAC.setText("Car Year");
            carYearAC.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            carYearAC.setForeground(new Color(225,223,186));
            carYearAC.setBackground(new Color(27, 28, 30));
            carYearAC.setBorder(null);
            carYearAC.setSize(180, 30);
            carYearAC.setLocation(15, 215);

            //Car Plate Number text box and label
            separator3AC.setForeground(new Color(225,223,186));
            separator3AC.setBackground(new Color(27, 28, 30));
            separator3AC.setSize(120, 17);
            separator3AC.setLocation(35, 205);

            txtCarPlateNumAC.setText("eg: SA 0923 B");
            txtCarPlateNumAC.setSize(120, 30);
            txtCarPlateNumAC.setBorder(null);
            txtCarPlateNumAC.setForeground(new Color(225,223,186));
            txtCarPlateNumAC.setBackground(new Color(27, 28, 30));
            txtCarPlateNumAC.setFont(new Font("TW Cen MT", Font.BOLD, 14));
            txtCarPlateNumAC.setLocation(35,175);

            carPlateNumAC.setText("Car Plate Number");
            carPlateNumAC.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            carPlateNumAC.setForeground(new Color(225,223,186));
            carPlateNumAC.setBackground(new Color(27, 28, 30));
            carPlateNumAC.setBorder(null);
            carPlateNumAC.setSize(180, 30);
            carPlateNumAC.setLocation(15, 150);

            //Car Model text box and label
            separator2AC.setForeground(new Color(225,223,186));
            separator2AC.setBackground(new Color(27, 28, 30));
            separator2AC.setSize(120, 17);
            separator2AC.setLocation(35, 140);

            txtCarModelAC.setText("eg: Corolla Altis");
            txtCarModelAC.setSize(120, 30);
            txtCarModelAC.setBorder(null);
            txtCarModelAC.setForeground(new Color(225,223,186));
            txtCarModelAC.setBackground(new Color(27, 28, 30));
            txtCarModelAC.setFont(new Font("TW Cen MT", Font.BOLD, 14));
            txtCarModelAC.setLocation(35,110);

            carModelAC.setText("Car Model");
            carModelAC.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            carModelAC.setForeground(new Color(225,223,186));
            carModelAC.setBackground(new Color(27, 28, 30));
            carModelAC.setBorder(null);
            carModelAC.setSize(180, 30);
            carModelAC.setLocation(15, 85);

            //Car Brand text box and label
            separator1AC.setForeground(new Color(225,223,186));
            separator1AC.setBackground(new Color(27, 28, 30));
            separator1AC.setSize(120, 17);
            separator1AC.setLocation(35, 80);

            txtCarBrandAC.setText("eg: Toyota");
            txtCarBrandAC.setSize(120, 30);
            txtCarBrandAC.setBorder(null);
            txtCarBrandAC.setForeground(new Color(225,223,186));
            txtCarBrandAC.setBackground(new Color(27, 28, 30));
            txtCarBrandAC.setFont(new Font("TW Cen MT", Font.BOLD, 14));
            txtCarBrandAC.setLocation(35,50);

            carBrandAC.setText("Car Brand");
            carBrandAC.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            carBrandAC.setForeground(new Color(225,223,186));
            carBrandAC.setBackground(new Color(27, 28, 30));
            carBrandAC.setBorder(null);
            carBrandAC.setSize(180, 30);
            carBrandAC.setLocation(15, 25);
            
            //Panel
            pnlAC.setBackground(new Color(27, 28, 30));
            pnlAC.setLayout(null);
            pnlAC.setSize(725, 420);
            pnlAC.setVisible(false);

            //Adding components to frame
            pnlAC.add(carBrandAC);
            pnlAC.add(txtCarBrandAC);
            pnlAC.add(separator1AC);
            pnlAC.add(carModelAC);
            pnlAC.add(txtCarModelAC);
            pnlAC.add(separator2AC);
            pnlAC.add(carPlateNumAC);
            pnlAC.add(txtCarPlateNumAC);
            pnlAC.add(separator3AC);
            pnlAC.add(carYearAC);
            pnlAC.add(txtCarYearAC);
            pnlAC.add(separator4AC);
            pnlAC.add(carSeatAC);
            pnlAC.add(txtCarSeatAC);
            pnlAC.add(separator5AC);
            pnlAC.add(btnClearAC);
            pnlAC.add(btnCancelAC);
            pnlAC.add(btnAddAC);
            pnlAC.add(tablePnlAC);
        }

        //Registration Page
        {
            //Icons for Phone No.
            ImageIcon icnPhoneR = new ImageIcon("src\\Pics\\smartphone.png");
            icnPhoneNumR.setIcon(icnPhoneR);
            icnPhoneNumR.setSize(32, 32);
            icnPhoneNumR.setLocation(360, 207);

            //Icon for Email
            ImageIcon icnEmaR = new ImageIcon("src\\Pics\\email.png");
            icnEmailR.setIcon(icnEmaR);
            icnEmailR.setSize(32, 32);
            icnEmailR.setLocation(85, 207);

            //Icon for Password
            ImageIcon icnPwdR = new ImageIcon("src\\Pics\\key.png");
            icnPasswordR.setIcon(icnPwdR);
            icnPasswordR.setSize(32, 32);
            icnPasswordR.setLocation(360, 97);

            //Icon for Username
            ImageIcon icnUserR = new ImageIcon("src\\Pics\\user.png");
            icnUsernameR.setIcon(icnUserR);
            icnUsernameR.setSize(32, 32);
            icnUsernameR.setLocation(85, 97);

            //Car picture on right 
            ImageIcon car_2R = new ImageIcon("src\\Pics\\car2.png");
            car2R.setIcon(car_2R);
            car2R.setSize(400, 200);
            car2R.setLocation(470,220);

            //Car picture on left
            ImageIcon car_1R = new ImageIcon("src\\Pics\\car1.png");
            car1R.setIcon(car_1R);
            car1R.setSize(400, 200);
            car1R.setLocation(-110,220);

            //Register Button
            btnRegisterR.setText("Register User");
            btnRegisterR.setFont(new Font("TW Cen MT", Font.BOLD, 18));
            Border borderR = new LineBorder(new Color(225,223,186), 1, true);
            btnRegisterR.setBorder(borderR);
            btnRegisterR.setFocusable(false);
            btnRegisterR.setForeground(new Color(225,223,186));
            btnRegisterR.setBackground(new Color(27, 28, 30));
            btnRegisterR.setSize(158, 44);
            btnRegisterR.setLocation(270, 285);
            btnRegisterR.addMouseListener(this);

            //Separators under each textboxes
            separator4R.setForeground(new Color(225,223,186));
            separator4R.setBackground(new Color(27, 28, 30));
            separator4R.setSize(195, 17);
            separator4R.setLocation(400, 240);

            separator3R.setForeground(new Color(225,223,186));
            separator3R.setBackground(new Color(27, 28, 30));
            separator3R.setSize(195, 17);
            separator3R.setLocation(125, 240);

            separator2R.setForeground(new Color(225,223,186));
            separator2R.setBackground(new Color(27, 28, 30));
            separator2R.setSize(195, 17);
            separator2R.setLocation(400, 130);

            separator1R.setForeground(new Color(225,223,186));
            separator1R.setBackground(new Color(27, 28, 30));
            separator1R.setSize(195, 17);
            separator1R.setLocation(125, 130);

            //Text Box for Phone Num
            txtPhoneNumR.setText("Phone No.");
            txtPhoneNumR.setFont(new Font("Segoe UI", Font.PLAIN, 15));
            txtPhoneNumR.setForeground(new Color(225,223,186));
            txtPhoneNumR.setBackground(new Color(27, 28, 30));
            txtPhoneNumR.setSize(195, 44);
            txtPhoneNumR.setLocation(400, 195);
            txtPhoneNumR.setBorder(null);
            txtPhoneNumR.addMouseListener(this);

            //Text Box for Password
            txtPasswordR.setText("Password");
            txtPasswordR.setFont(new Font("Segoe UI", Font.PLAIN, 15));
            txtPasswordR.setForeground(new Color(225,223,186));
            txtPasswordR.setBackground(new Color(27, 28, 30));
            txtPasswordR.setSize(195, 44);
            txtPasswordR.setLocation(400, 85);
            txtPasswordR.setBorder(null);
            txtPasswordR.addMouseListener(this);

            //Text Box for Email
            txtEmailR.setText("Email");
            txtEmailR.setFont(new Font("Segoe UI", Font.PLAIN, 15));
            txtEmailR.setForeground(new Color(225,223,186));
            txtEmailR.setBackground(new Color(27, 28, 30));
            txtEmailR.setSize(195, 44);
            txtEmailR.setLocation(125, 195);
            txtEmailR.setBorder(null);
            txtEmailR.addMouseListener(this);

            //Text Box for Username
            txtUsernameR.setText("Username");
            txtUsernameR.setFont(new Font("Segoe UI", Font.PLAIN, 15));
            txtUsernameR.setForeground(new Color(225,223,186));
            txtUsernameR.setBackground(new Color(27, 28, 30));
            txtUsernameR.setSize(195, 44);
            txtUsernameR.setLocation(125, 85);
            txtUsernameR.setBorder(null);
            txtUsernameR.addMouseListener(this);

            //Text for Page Title
            pageTitleR.setText("Registration");
            pageTitleR.setFont(new Font("TW Cen MT", Font.PLAIN, 28));
            pageTitleR.setForeground(new Color(225,223,186));
            pageTitleR.setBackground(new Color(27, 28, 30));
            pageTitleR.setSize(150, 27);
            pageTitleR.setLocation(275, 10);

            //Form
            pnlR.setBackground(new Color(27, 28, 30));
            pnlR.setLayout(null);
            pnlR.setSize(725, 420);
            pnlR.setVisible(false);

            //Adding Components to form
            pnlR.add(icnPhoneNumR);
            pnlR.add(icnEmailR);
            pnlR.add(icnPasswordR);
            pnlR.add(icnUsernameR);
            pnlR.add(btnRegisterR);
            pnlR.add(separator4R);
            pnlR.add(separator3R);
            pnlR.add(separator2R);
            pnlR.add(separator1R);
            pnlR.add(txtPhoneNumR);
            pnlR.add(txtPasswordR);
            pnlR.add(txtEmailR);
            pnlR.add(txtUsernameR);
            pnlR.add(pageTitleR);
            pnlR.add(car1R);
            pnlR.add(car2R);
        }

        //View Report or Booking Page
        {
            separator1RBP.setForeground(new Color(225,223,186));
            separator1RBP.setBackground(new Color(27, 28, 30));
            separator1RBP.setSize(10, 420);
            separator1RBP.setLocation(363, 0);

            txtReport.setText("View Reports");
            txtReport.setSize(150, 37);
            txtReport.setLocation(133, 214);
            txtReport.setBackground(new Color(27, 28, 30));
            txtReport.setForeground(new Color(225,223,186));
            txtReport.setFont(new Font("TW Cent", Font.PLAIN, 16));

            txtBook.setText("View Booking Request");
            txtBook.setSize(180, 37);
            txtBook.setLocation(103, 214);
            txtBook.setBackground(new Color(27, 28, 30));
            txtBook.setForeground(new Color(225,223,186));
            txtBook.setFont(new Font("TW Cent", Font.PLAIN, 16));

            ImageIcon cus = new ImageIcon("src\\Pics\\online-booking2.png");
            btnBook.setIcon(cus);
            btnBook.setSize(64, 64);
            btnBook.setBackground(new Color(27, 28, 30));
            btnBook.setLocation(150, 150);
            btnBook.setFocusable(false);
            btnBook.setBorder(null);
            btnBook.addMouseListener(this);

            ImageIcon car = new ImageIcon("src\\Pics\\clipboard.png");
            btnReport.setIcon(car);
            btnReport.setSize(64, 64);
            btnReport.setBackground(new Color(27, 28, 30));
            btnReport.setLocation(150, 150);
            btnReport.setFocusable(false);
            btnReport.setBorder(null);
            btnReport.addMouseListener(this);

            pnlRightRBP.setBackground(new Color(27, 28, 30));
            pnlRightRBP.setBounds(364, 0, 362, 420);
            pnlRightRBP.setLayout(null);

            pnlLeftRBP.setBackground(new Color(27, 28, 30));
            pnlLeftRBP.setBounds(0, 0, 362, 420);
            pnlLeftRBP.setLayout(null);

            pnlRightRBP.add(txtBook);
            pnlRightRBP.add(btnBook);
            pnlLeftRBP.add(txtReport);
            pnlLeftRBP.add(btnReport);

            //Panel
            pnlRBP.setBackground(new Color(27, 28, 30));
            pnlRBP.setLayout(null);
            pnlRBP.setSize(725, 420);
            pnlRBP.setVisible(false);

            pnlRBP.add(pnlLeftRBP);
            pnlRBP.add(pnlRightRBP);
            pnlRBP.add(separator1RBP);
        }

        //View All Car Page
        {
            ImageIcon searchPic = new ImageIcon("src\\Pics\\magnifier.png");
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

            //Third Car Panel
            btn3.setText("Learn More!");
            btn3.setForeground(new Color(27, 28, 30));
            btn3.setBackground(new Color(127, 126, 144));
            btn3.setFont(new Font("TW Cen MT", Font.BOLD, 18));
            btn3.setFocusable(false);
            btn3.setSize(110, 35);
            btn3.setLocation(405, 575);
            btn3.setBorder(borderCar);
            btn3.addMouseListener(this);
            
            price3.setIcon(pricePic);
            price3.setText("RM 24/hr");
            price3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            price3.setForeground(new Color(27, 28, 30));
            price3.setSize(140, 32);
            price3.setLocation(410, 500);

            seats3.setIcon(seat);
            seats3.setText("4");
            seats3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
            seats3.setForeground(new Color(27, 28, 30));
            seats3.setSize(50, 32);
            seats3.setLocation(410, 535);

            carName3.setText("Tesla Model S");
            carName3.setForeground(new Color(27, 28, 30));
            carName3.setBackground(new Color(127, 126, 144));
            carName3.setFont(new Font("Segoe UI", Font.BOLD, 26));
            carName3.setSize(180, 30);
            carName3.setLocation(190, 571);

            ImageIcon car3Pic = new ImageIcon("src\\Pics\\Tesla_Model_S_Logo.png");
            car3.setIcon(car3Pic);
            car3.setSize(241, 121);
            car3.setLocation(170, 470);

            pnl3Car.setIcon(pnl);
            pnl3Car.setSize(394, 160);
            pnl3Car.setLocation(155, 470);

            //Second Car Panel
            btn2.setText("Learn More!");
            btn2.setForeground(new Color(27, 28, 30));
            btn2.setBackground(new Color(127, 126, 144));
            btn2.setFont(new Font("TW Cen MT", Font.BOLD, 18));
            btn2.setFocusable(false);
            btn2.setSize(110, 35);
            btn2.setLocation(405, 420);
            btn2.setBorder(borderCar);
            btn2.addMouseListener(this);
            
            price2.setIcon(pricePic);
            price2.setText("RM 24/hr");
            price2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            price2.setForeground(new Color(27, 28, 30));
            price2.setSize(140, 32);
            price2.setLocation(410, 345);

            seats2.setIcon(seat);
            seats2.setText("4");
            seats2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
            seats2.setForeground(new Color(27, 28, 30));
            seats2.setSize(50, 32);
            seats2.setLocation(410, 380);

            carName2.setText("Tesla Model S");
            carName2.setForeground(new Color(27, 28, 30));
            carName2.setBackground(new Color(127, 126, 144));
            carName2.setFont(new Font("Segoe UI", Font.BOLD, 26));
            carName2.setSize(180, 30);
            carName2.setLocation(190, 416);

            ImageIcon car2Pic = new ImageIcon("src\\Pics\\Tesla_Model_S_Logo.png");
            car2.setIcon(car2Pic);
            car2.setSize(241, 121);
            car2.setLocation(170, 285);

            pnl2Car.setIcon(pnl);
            pnl2Car.setSize(394, 160);
            pnl2Car.setLocation(155, 315);

            //First Car Panel
            btn1.setText("Learn More!");
            btn1.setForeground(new Color(27, 28, 30));
            btn1.setBackground(new Color(127, 126, 144));
            btn1.setFont(new Font("TW Cen MT", Font.BOLD, 18));
            btn1.setFocusable(false);
            btn1.setSize(110, 35);
            btn1.setLocation(405, 225);
            btn1.setBorder(borderCar);
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

            ImageIcon car1Pic = new ImageIcon("src\\Pics\\Tesla_Model_S_Logo.png");
            car1.setIcon(car1Pic);
            car1.setSize(241, 121);
            car1.setLocation(170, 90);

            ImageIcon pnl = new ImageIcon("src\\Pics\\pnl.png");
            pnl1Car.setIcon(pnl);
            pnl1Car.setSize(394, 160);
            pnl1Car.setLocation(155, 120);

            pnlViewAllCar.setSize(725, 420);
            pnlViewAllCar.setBackground(new Color(27, 28, 30));
            pnlViewAllCar.setLayout(null);
            pnlViewAllCar.setVisible(false);

            pnlViewAllCar.add(car1);
            pnlViewAllCar.add(carName1);
            pnlViewAllCar.add(btn1);
            pnlViewAllCar.add(seats1);
            pnlViewAllCar.add(price1);
            pnlViewAllCar.add(pnl1Car);
            pnlViewAllCar.add(car2);
            pnlViewAllCar.add(carName2);
            pnlViewAllCar.add(btn2);
            pnlViewAllCar.add(seats2);
            pnlViewAllCar.add(price2);
            pnlViewAllCar.add(pnl2Car);
            pnlViewAllCar.add(separator);
            pnlViewAllCar.add(seats);
            pnlViewAllCar.add(txtSeats);
            pnlViewAllCar.add(separator2);
            pnlViewAllCar.add(search);

            //JScrollPane pane = new JScrollPane(panel1, 
                //JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                //JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            //this.add(pane);
        }

        //View Monthly Report Page
        {
            //Table
            String[] columnsReturn = {"First", "Second", "Third", "Fourth"};
            String[][] rowsReturn = {};

            table = new JTable(rowsReturn, columnsReturn){
                public boolean isCellEditable(int rows, int columns) {
                    return false;
                }
            };

            table.setPreferredScrollableViewportSize(new Dimension(597, 1500));
            table.setFillsViewportHeight(true);
            table.setBackground(new Color(27, 28, 30));
            table.setForeground(new Color(225,223,186));
            table.setGridColor(new Color(225,223,186));
            table.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            table.setRowHeight(30);
            
            pane = new JScrollPane(table);

            tablePnl.setBounds(50, 155, 597, 300);
            tablePnl.setBorder(BorderFactory.createLineBorder(new Color(225,223,186)));
            tablePnl.add(pane);

            //Object[] rowReturns = new Object[4];

            //Cancel Button
            btnSearch.setText("Search");
            btnSearch.setSize(85, 37);
            btnSearch.setLocation(155, 100);
            btnSearch.setForeground(new Color(225,223,186));
            btnSearch.setBackground(new Color(27, 28, 30));
            btnSearch.setBorder(borderVMP);
            btnSearch.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            btnSearch.setFocusable(false);
            btnSearch.addMouseListener(this);
            
            //Clear Button
            btnClear.setText("Clear");
            btnClear.setSize(85, 37);
            btnClear.setLocation(50, 100);
            btnClear.setForeground(new Color(225,223,186));
            btnClear.setBackground(new Color(27, 28, 30));
            btnClear.setBorder(borderVMP);
            btnClear.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            btnClear.setFocusable(false);
            btnClear.addMouseListener(this);

            //Text Total income (Manipulate)
            txtTotalIncome.setText("RM 4,230.00");
            txtTotalIncome.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            txtTotalIncome.setForeground(new Color(225,223,186));
            txtTotalIncome.setBackground(new Color(27, 28, 30));
            txtTotalIncome.setSize(193, 26);
            txtTotalIncome.setLocation(553, 60);

            //Text total income
            totalIncome.setText("TOTAL INCOME (MONTH): ");
            totalIncome.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            totalIncome.setForeground(new Color(225,223,186));
            totalIncome.setBackground(new Color(27, 28, 30));
            totalIncome.setSize(193, 26);
            totalIncome.setLocation(360, 60);

            //CheckBox for uncompleted
            uncompleted.setText("Uncompleted");
            uncompleted.setForeground(new Color(225,223,186));
            uncompleted.setBackground(new Color(27, 28, 30));
            uncompleted.setSize(110, 25);
            uncompleted.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            uncompleted.setLocation(60, 60);
            uncompleted.setFocusable(false);

            //CheckBox for completed
            completed.setText("Completed");
            completed.setForeground(new Color(225,223,186));
            completed.setBackground(new Color(27, 28, 30));
            completed.setSize(98, 25);
            completed.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            completed.setLocation(60, 30);
            completed.setFocusable(false);

            //Frame
            pnlVMP.setBackground(new Color(27, 28, 30));
            pnlVMP.setLayout(null);
            pnlVMP.setSize(725, 420);
            pnlVMP.setVisible(false);

            //Adding components to Frame
            pnlVMP.add(completed);
            pnlVMP.add(uncompleted);
            pnlVMP.add(totalIncome);
            pnlVMP.add(txtTotalIncome);
            pnlVMP.add(btnClear);
            pnlVMP.add(btnSearch);
            pnlVMP.add(tablePnl);
        }

        //Add Page
        {
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
            pnlAdd.setBackground(new Color(27, 28, 30));
            pnlAdd.setLayout(null);
            pnlAdd.setSize(725, 420);
            pnlAdd.setVisible(false);

            pnlAdd.add(pnlLeft);
            pnlAdd.add(pnlRight);
            pnlAdd.add(separator1);
        }

        //Profile Page
        {
            //Titles for each section
            titleProfile.setText("User Profile");
            titleProfile.setFont(new Font("TW Cen MT", Font.PLAIN, 28));
            titleProfile.setForeground(new Color(225,223,186));
            titleProfile.setBackground(new Color(27, 28, 30));
            titleProfile.setSize(150, 27);
            titleProfile.setLocation(115, 340);

            //Icons
            ImageIcon icnPhoneNo = new ImageIcon("src\\Pics\\smartphone.png");
            icnPhoneNum.setIcon(icnPhoneNo);
            icnPhoneNum.setSize(32, 32);
            icnPhoneNum.setLocation(85, 207);

            ImageIcon icnEma = new ImageIcon("src\\Pics\\email.png");
            icnEmail.setIcon(icnEma);
            icnEmail.setSize(32, 32);
            icnEmail.setLocation(85, 147);

            ImageIcon icnUser = new ImageIcon("src\\Pics\\user.png");
            icnUsername.setIcon(icnUser);
            icnUsername.setSize(32, 32);
            icnUsername.setLocation(85, 87);

            //Gradient Border on the left
            ImageIcon br = new ImageIcon("src\\Pics\\Border.png");
            border.setIcon(br);
            border.setSize(400, 320);
            border.setLocation(50, 25);

            //Edit button for editing profile details
            ImageIcon btn = new ImageIcon("src\\Pics\\btnEdit2.png");
            btnEdit.setIcon(btn);
            btnEdit.setSize(78, 39);
            btnEdit.setLocation(145, 260);
            btnEdit.addMouseListener(this);
            btnEdit.setFocusable(false);
            btnEdit.setBorder(null);

            //Txt for Phone No.
            lblPhoneNum.setText("011-1087 8646");
            lblPhoneNum.setFont(new Font("Segoe UI", Font.PLAIN, 15));
            lblPhoneNum.setForeground(new Color(225,223,186));
            lblPhoneNum.setSize(100,25);
            lblPhoneNum.setLocation(125, 210);

            //Txt for Email
            lblEmail.setText("adrianfwl@gmail.com");
            lblEmail.setFont(new Font("Segoe UI", Font.PLAIN, 15));
            lblEmail.setForeground(new Color(225,223,186));
            lblEmail.setSize(150,25);
            lblEmail.setLocation(125, 150);

            //Txt for Username
            lblUsername.setText("Adrian_Fu");
            lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 15));
            lblUsername.setForeground(new Color(225,223,186));
            lblUsername.setSize(88,25);
            lblUsername.setLocation(125, 90);
            
            //Panel
            pnlProfile.setBackground(new Color(27, 28, 30));
            pnlProfile.setLayout(null);
            pnlProfile.setBounds(0, 0, 725, 420);
            pnlProfile.setVisible(false);

            //Adding items to Panel Profile
            pnlProfile.add(txtView);
            pnlProfile.add(titleService);
            pnlProfile.add(titleProfile);
            pnlProfile.add(icnPhoneNum);
            pnlProfile.add(icnEmail);
            pnlProfile.add(icnUsername);
            pnlProfile.add(btnView);
            pnlProfile.add(car_Profile);
            pnlProfile.add(progBar100);
            pnlProfile.add(progBar0);
            pnlProfile.add(progBar25);
            pnlProfile.add(progBar50);
            pnlProfile.add(progBar75);
            pnlProfile.add(btnEdit);
            pnlProfile.add(lblUsername);
            pnlProfile.add(lblEmail);
            pnlProfile.add(lblPhoneNum);
            pnlProfile.add(border);
            pnlProfile.add(border2);
        }

        //Home Page
        {
            //Home icon
            ImageIcon home = new ImageIcon("src\\Pics\\home.png");
            btnHome.setIcon(home);
            btnHome.setBackground(new Color(127, 126, 144));
            btnHome.setFocusable(false);
            btnHome.setSize(64, 64);
            btnHome.setLocation(330, 2);
            btnHome.setBorder(null);
            btnHome.addMouseListener(this);

            //Report icon
            ImageIcon reports = new ImageIcon("src\\Pics\\report.png");
            btnReports.setIcon(reports);
            btnReports.setBackground(new Color(127, 126, 144));
            btnReports.setFocusable(false);
            btnReports.setSize(64, 64);
            btnReports.setLocation(490, 2);
            btnReports.setBorder(null);
            btnReports.addMouseListener(this);

            //Register icon
            ImageIcon register = new ImageIcon("src\\Pics\\form.png");
            btnRegistration.setIcon(register);
            btnRegistration.setBackground(new Color(127, 126, 144));
            btnRegistration.setFocusable(false);
            btnRegistration.setSize(64, 64);
            btnRegistration.setLocation(170, 3);
            btnRegistration.setBorder(null);
            btnRegistration.addMouseListener(this);

            //Booking icon
            ImageIcon booking = new ImageIcon("src\\Pics\\online-booking.png");
            btnBooking.setIcon(booking);
            btnBooking.setBackground(new Color(127, 126, 144));
            btnBooking.setFocusable(false);
            btnBooking.setSize(64, 64);
            btnBooking.setLocation(20, 7);
            btnBooking.setBorder(null);
            btnBooking.addMouseListener(this);

            //Profile icon
            ImageIcon profile = new ImageIcon("src\\Pics\\account.png");
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
            ImageIcon prog0 = new ImageIcon("src\\Pics\\1.png");
            ImageIcon prog25 = new ImageIcon("src\\Pics\\5.png");
            ImageIcon prog50 = new ImageIcon("src\\Pics\\2.png");
            ImageIcon prog75 = new ImageIcon("src\\Pics\\3.png");
            ImageIcon prog100 = new ImageIcon("src\\Pics\\4.png");

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
            ImageIcon car = new ImageIcon("src\\Pics\\Tesla_Model_S_Logo.png");
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
            ImageIcon icon = new ImageIcon("src\\Pics\\Company Logo.png");
            this.setIconImage(icon.getImage());
            this.setTitle("RentiZen");
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(725, 528);
            this.setResizable(false);
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
            
            //Adding Components to Main Frame
            this.add(pnl2);
            this.add(pnl1);
            
            //Pages
            this.add(pnlBR);
            this.add(pnlBigOCP);
            this.add(pnlMR);
            this.add(pnlCP);
            this.add(pnlEP);
            this.add(pnlAC);
            this.add(pnlR);
            this.add(pnlRBP);
            this.add(pnlViewAllCar);
            this.add(pnlVMP);
            this.add(pnlAdd);
            this.add(pnlProfile);
            
            message.setVisible(false);
            message2.setVisible(false);

            picProgBar_100.setVisible(false);
            picProgBar_75.setVisible(false);
            picProgBar_50.setVisible(false);
            picProgBar_25.setVisible(false);
            }    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Profile Button
        if(e.getSource() == btnProfile) {
            pnlProfile.setVisible(true);
            pnl1.setVisible(false);
            pnlVMP.setVisible(false);
            pnlAdd.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlRBP.setVisible(false);
            pnlR.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlMR.setVisible(false);
            pnlBigOCP.setVisible(false);
            pnlBR.setVisible(false);
        } //Home Button
        else if(e.getSource() == btnHome) {
            pnl1.setVisible(true);
            pnlProfile.setVisible(false);
            pnlAdd.setVisible(false);
            pnlVMP.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlRBP.setVisible(false);
            pnlR.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlMR.setVisible(false);
            pnlBigOCP.setVisible(false);
            pnlBR.setVisible(false);
        } //Registration Button 
        else if(e.getSource() == btnRegistration) {
            pnlAdd.setVisible(true);
            pnl1.setVisible(false);
            pnlVMP.setVisible(false);
            pnlProfile.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlRBP.setVisible(false);
            pnlR.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlMR.setVisible(false);
            pnlBigOCP.setVisible(false);
            pnlBR.setVisible(false);
        } //Reports Button
        else if(e.getSource() == btnReports) {
            pnlRBP.setVisible(true);
            pnlVMP.setVisible(false);
            pnl1.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlR.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlMR.setVisible(false);
            pnlBigOCP.setVisible(false);
            pnlBR.setVisible(false);
        } //Booking Button
        else if(e.getSource() == btnBooking) {
            pnlViewAllCar.setVisible(true);
            pnlVMP.setVisible(false);
            pnl1.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlRBP.setVisible(false);
            pnlR.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlMR.setVisible(false);
            pnlBigOCP.setVisible(false);
            pnlBR.setVisible(false);
        } //Register Customer Page Button
        else if(e.getSource() == btnAddCus) {
            pnlR.setVisible(true);
            pnlViewAllCar.setVisible(false);
            pnlVMP.setVisible(false);
            pnl1.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlRBP.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlMR.setVisible(false);
            pnlBigOCP.setVisible(false);
            pnlBR.setVisible(false);
        } //Add Car Page Button
        else if(e.getSource() == btnAddCar) {
            pnlAC.setVisible(true);
            pnlR.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlVMP.setVisible(false);
            pnl1.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlRBP.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlMR.setVisible(false);
            pnlBigOCP.setVisible(false);
            pnlBR.setVisible(false);
        } //Edit Button in Profile Page
        else if(e.getSource() == btnEdit) {
            pnlEP.setVisible(true);
            pnlAC.setVisible(false);
            pnlR.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlVMP.setVisible(false);
            pnl1.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlRBP.setVisible(false);
            pnlCP.setVisible(false);
            pnlMR.setVisible(false);
            pnlBigOCP.setVisible(false);
            pnlBR.setVisible(false);
        } else if(e.getSource() == btnChangePwdEP) {
            pnlCP.setVisible(true);
            pnlEP.setVisible(false);
            pnlAC.setVisible(false);
            pnlR.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlVMP.setVisible(false);
            pnl1.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlRBP.setVisible(false);
            pnlMR.setVisible(false);
            pnlBigOCP.setVisible(false);
            pnlBR.setVisible(false);
        } else if(e.getSource() == btnReport) {
            pnlMR.setVisible(true);
            pnlCP.setVisible(false);
            pnlEP.setVisible(false);
            pnlAC.setVisible(false);
            pnlR.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlVMP.setVisible(false);
            pnl1.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlRBP.setVisible(false);
            pnlBigOCP.setVisible(false);
            pnlBR.setVisible(false);
        } else if(e.getSource() == btn1 || e.getSource() == btn2 || e.getSource() == btn3 || e.getSource() == btn4 || e.getSource() == btn5) {
            pnlBigOCP.setVisible(true);
            pnlMR.setVisible(true);
            pnlCP.setVisible(false);
            pnlEP.setVisible(false);
            pnlAC.setVisible(false);
            pnlR.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlVMP.setVisible(false);
            pnl1.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlRBP.setVisible(false);
            pnlBR.setVisible(false);
        } else if(e.getSource() == btnBook) {
            pnlBR.setVisible(true);
            pnlBigOCP.setVisible(false);
            pnlMR.setVisible(true);
            pnlCP.setVisible(false);
            pnlEP.setVisible(false);
            pnlAC.setVisible(false);
            pnlR.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlVMP.setVisible(false);
            pnl1.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlRBP.setVisible(false);
        } else if(e.getSource() == btnBackOCP) {
            pnlViewAllCar.setVisible(true);
            pnlBR.setVisible(false);
            pnlBigOCP.setVisible(false);
            pnlMR.setVisible(false);
            pnlCP.setVisible(false);
            pnlEP.setVisible(false);
            pnlAC.setVisible(false);
            pnlR.setVisible(false);
            pnlVMP.setVisible(false);
            pnl1.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlRBP.setVisible(false);
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
