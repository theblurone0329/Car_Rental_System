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
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
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

    App() {

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
        // TODO Auto-generated method stub
        if(e.getSource() == btnProfile) {
            pnlProfile.setVisible(true);
            pnl1.setVisible(false);
            pnlVMP.setVisible(false);
            pnlAdd.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlRBP.setVisible(false);
        } else if(e.getSource() == btnHome) {
            pnl1.setVisible(true);
            pnlProfile.setVisible(false);
            pnlAdd.setVisible(false);
            pnlVMP.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlRBP.setVisible(false);
        } else if(e.getSource() == btnRegistration) {
            pnlAdd.setVisible(true);
            pnl1.setVisible(false);
            pnlVMP.setVisible(false);
            pnlProfile.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlRBP.setVisible(false);
        } else if(e.getSource() == btnReports) {
            pnlRBP.setVisible(true);
            pnlVMP.setVisible(false);
            pnl1.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlViewAllCar.setVisible(false);
        } else if(e.getSource() == btnBooking) {
            pnlViewAllCar.setVisible(true);
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
