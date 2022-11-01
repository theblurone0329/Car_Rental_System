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

    App() {

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

            //Radio button for uncompleted
            uncompleted.setText("Uncompleted");
            uncompleted.setForeground(new Color(225,223,186));
            uncompleted.setBackground(new Color(27, 28, 30));
            uncompleted.setSize(110, 25);
            uncompleted.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            uncompleted.setLocation(60, 60);
            uncompleted.setFocusable(false);

            //Radio button for completed
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
            titleService.setText("Current Service");
            titleService.setFont(new Font("TW Cen MT", Font.PLAIN, 28));
            titleService.setForeground(new Color(225,223,186));
            titleService.setBackground(new Color(27, 28, 30));
            titleService.setSize(200, 27);
            titleService.setLocation(440, 50);

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

            //Txt view under view button
            txtView.setText("View");
            txtView.setSize(40, 32);
            txtView.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            txtView.setForeground(new Color(225,223,186));
            txtView.setLocation(560, 280);

            //View button to show current booked service
            ImageIcon btn_View = new ImageIcon("src\\Pics\\file.png");
            btnView.setIcon(btn_View);
            btnView.setSize(32, 32);
            btnView.setLocation(560, 257);
            btnView.setFocusable(false);
            btnView.setBorder(null);
            btnView.setBackground(new Color(27, 28, 30));

            //Current booked car picture
            ImageIcon car = new ImageIcon("src\\Pics\\Car_profile.png");
            car_Profile.setIcon(car);
            car_Profile.setSize(174, 100);
            car_Profile.setLocation(435, 115);

            //Current service progress
            ImageIcon progBar_0 = new ImageIcon("src\\Pics\\1_1.png");
            progBar0.setIcon(progBar_0);
            progBar0.setSize(135, 139);
            progBar0.setLocation(430, 210);

            ImageIcon progBar_25 = new ImageIcon("src\\Pics\\1_2.png");
            progBar25.setIcon(progBar_25);
            progBar25.setSize(135, 139);
            progBar25.setLocation(430, 210);

            ImageIcon progBar_50 = new ImageIcon("src\\Pics\\1_3.png");
            progBar50.setIcon(progBar_50);
            progBar50.setSize(135, 139);
            progBar50.setLocation(430, 210);

            ImageIcon progBar_75 = new ImageIcon("src\\Pics\\1_4.png");
            progBar75.setIcon(progBar_75);
            progBar75.setSize(135, 139);
            progBar75.setLocation(430, 210);

            ImageIcon progBar_100 = new ImageIcon("src\\Pics\\1_5.png");
            progBar100.setIcon(progBar_100);
            progBar100.setSize(135, 139);
            progBar100.setLocation(430, 210);

            //Gradient Border on the right
            ImageIcon br1 = new ImageIcon("src\\Pics\\Border.png");
            border2.setIcon(br1);
            border2.setSize(400, 320);
            border2.setLocation(390, 70);

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
            pnl1.setVisible(false);
            pnlProfile.setVisible(true);
        } else if(e.getSource() == btnHome) {
            pnl1.setVisible(true);
            pnlProfile.setVisible(false);
            pnlAdd.setVisible(false);
            pnlVMP.setVisible(false);
        } else if(e.getSource() == btnRegistration) {
            pnl1.setVisible(false);
            pnlAdd.setVisible(true);
        } else if(e.getSource() == btnReports) {
            pnl1.setVisible(false);
            pnlVMP.setVisible(true);
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
