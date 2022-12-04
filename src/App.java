import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class App extends JFrame implements MouseListener{

    //Customer Home Page
    private JPanel pnl2Cus = new JPanel();
    private JButton btnBookingCus = new JButton();
    private JButton btnProfileCus = new JButton();

    //Admin Home Page
    private JPanel adminHome = new JPanel();
    private JPanel pnl1Admin = new JPanel();
    private JPanel pnl2Admin = new JPanel();
    private JButton btnBooking = new JButton();
    private JButton btnRegistration = new JButton();
    private JButton btnReports = new JButton();
    private JButton btnProfile = new JButton();
    private JButton btnHome = new JButton();
    private JPanel pnlLeftRBP = new JPanel();
    private JPanel pnlRightRBP = new JPanel();
    private JPanel pnlDownRBP = new JPanel();
    private JLabel txtReport = new JLabel();
    private JLabel txtBook = new JLabel();
    private JLabel txtReturnCar = new JLabel();
    private JButton btnReport  = new JButton();
    private JButton btnBook = new JButton();
    private JButton btnReturnCar = new JButton();
    private JSeparator separator1RBP = new JSeparator(SwingConstants.VERTICAL);
    private JSeparator separator2RBP = new JSeparator();

    //Profile
    private JPanel pnlProfile = new JPanel();
    private JLabel lblUsername = new JLabel();
    private JLabel lblEmail = new JLabel();
    private JLabel lblPhoneNum = new JLabel();
    private JButton btnEdit = new JButton();
    private JLabel border = new JLabel();
    private JLabel border2 = new JLabel();
    private JLabel icnUsername = new JLabel();
    private JLabel icnEmail = new JLabel();
    private JLabel icnPhoneNum = new JLabel();
    private JLabel titleProfile = new JLabel();
    private JLabel message = new JLabel();
    private JLabel message2 = new JLabel();
    private JLabel message3 = new JLabel();
    private JLabel carPic = new JLabel();

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
    private JButton btnClearMR = new JButton();
    private JButton btnSearchMR = new JButton();
    private JLabel totalIncome = new JLabel();
    private JLabel txtTotalIncome = new JLabel();
    private JCheckBox completed = new JCheckBox();
    private JCheckBox uncompleted = new JCheckBox();
    private JTable tableMR = new JTable();
    private JScrollPane pane = new JScrollPane();
    private JPanel tablePnl = new JPanel();
    private Border borderVMP = new LineBorder(new Color(225,223,186), 1, true);

    //View All Car Page
    private JButton btnLearnMoreACP = new JButton();
    private JLabel lblCarModel = new JLabel();
    private JLabel lblCarYear = new JLabel();
    private JLabel lblCarSeats = new JLabel();
    private JLabel lblCarPrice = new JLabel();
    private JLabel txtCarModel = new JLabel();
    private JLabel txtCarYear = new JLabel();
    private JLabel txtCarSeats = new JLabel();
    private JLabel txtCarPrice = new JLabel();
    private JPanel tablePnlACP = new JPanel();
    private JScrollPane paneACP = new JScrollPane();
    private JTable tableA = new JTable();
    private JPanel pnlViewAllCar = new JPanel();

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
    private JLabel carPriceAC = new JLabel();
    private JTextField txtCarBrandAC = new JTextField();
    private JTextField txtCarModelAC = new JTextField();
    private JTextField txtCarPlateNumAC = new JTextField();
    private JTextField txtCarYearAC = new JTextField();
    private JTextField txtCarSeatAC = new JTextField();
    private JTextField txtCarPriceAC = new JTextField();
    private JButton btnClearAC = new JButton();
    private JButton btnCancelAC = new JButton();
    private JButton btnAddAC = new JButton(); 
    private JButton btnEditAC = new JButton(); 
    private JButton btnDeleteAC = new JButton(); 
    private JTable tableAC = new JTable();
    private JPanel tablePnlAC = new JPanel();
    private JSeparator separator1AC = new JSeparator();
    private JSeparator separator2AC = new JSeparator();
    private JSeparator separator3AC = new JSeparator();
    private JSeparator separator4AC = new JSeparator();
    private JSeparator separator5AC = new JSeparator();
    private JSeparator separator6AC = new JSeparator();
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
    private JButton btnCancelCP = new JButton();
    private JButton btnChangeCP = new JButton();

    //View Booking Request Page
    private JPanel pnlBR = new JPanel();
    private JLabel lblUserIDBR = new JLabel();
    private JLabel lblUserNameBR = new JLabel();
    private JLabel lblStartTimeBR = new JLabel();
    private JLabel lblEndTimeBR = new JLabel();
    private JLabel lblCarInfoBR = new JLabel();
    private JLabel lblRentDateBR = new JLabel();
    private JLabel lblReturnDateBR = new JLabel();
    private JLabel txtUserIDBR = new JLabel();
    private JLabel txtUserNameBR = new JLabel();
    private JLabel txtStartTimeBR = new JLabel();
    private JLabel txtEndTimeBR = new JLabel();
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

    //Booking Page
    private JPanel pnlB = new JPanel();
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

    //Return Car Admin Page
    private JPanel pnlRCA = new JPanel();
    private JLabel usernameRCA = new JLabel();
    private JLabel carModelRCA = new JLabel();
    private JLabel dateRCA = new JLabel();
    private JLabel onRentTitleRCA = new JLabel();
    private JLabel returnedTitleRCA = new JLabel();
    private JTable onRentRCA = new JTable();
    private JTable returnedRCA = new JTable(); 
    private JTextField txtUsernameRCA = new JTextField();
    private JTextField txtCarModelRCA = new JTextField();
    private JTextField txtDateRCA = new JTextField();
    private JButton btnRefreshRCA = new JButton();
    private JButton btnProceedRCA = new JButton();
    private JSeparator separator1RCA = new JSeparator();
    private JSeparator separator2RCA = new JSeparator();
    private JSeparator separator3RCA = new JSeparator();
    private JScrollPane paneRCA1 = new JScrollPane();
    private JScrollPane paneRCA2 = new JScrollPane();
    private JPanel onRentPnlRCA = new JPanel();
    private JPanel returnedPnlRCA = new JPanel();
    private Border borderRCA = new LineBorder(new Color(225,223,186), 1, true);

    //Billing Page
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

    Functions functions = new Functions();

    App(User user) throws FileNotFoundException {

        //Billing Page ✅
        {
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

            txtcarInfoBill.setText(txtCarModelB.getText());
            txtcarInfoBill.setSize(150, 30);
            txtcarInfoBill.setBorder(null);
            txtcarInfoBill.setForeground(new Color(225,223,186));
            txtcarInfoBill.setBackground(new Color(27, 28, 30));
            txtcarInfoBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            txtcarInfoBill.setLocation(180, 80);

            txtrentalDurationBill.setText("Rental Duration");
            txtrentalDurationBill.setSize(350, 30);
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

            txtusernameBill.setText(user.getUsername());
            txtusernameBill.setSize(150, 30);
            txtusernameBill.setBorder(null);
            txtusernameBill.setForeground(new Color(225,223,186));
            txtusernameBill.setBackground(new Color(27, 28, 30));
            txtusernameBill.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            txtusernameBill.setLocation(180, 230);

            txtphoneNumBill.setText(user.getPhoneNum());
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
            pnlBill.setVisible(false);

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
        }

        //Return Car Admin Page
        {
            {//Returned Table
            returnedTitleRCA.setText("RETURNED CARS");
            returnedTitleRCA.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            returnedTitleRCA.setSize(200, 22);
            returnedTitleRCA.setForeground(new Color(225,223,186));
            returnedTitleRCA.setBackground(new Color(27, 28, 30));
            returnedTitleRCA.setLocation(420, 198);

            Object columns[] = {"Username", "Model", "Return Date", "Status"};
            DefaultTableModel modelRCA = new DefaultTableModel(columns,0);
            returnedRCA = new JTable();
            returnedRCA.setCellSelectionEnabled(false); //bcs this table just for display
            returnedRCA.setDefaultEditor(Object.class, null);
            returnedRCA.setModel(modelRCA);
    
            List<String> listOfStrings
            = new ArrayList<String>();
    
            List<String> list = functions.fromBooking(listOfStrings);
            //BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel modelRCA1 = (DefaultTableModel)returnedRCA.getModel();
            functions.toReturnedTable(list, modelRCA1);
            
            returnedRCA.setPreferredScrollableViewportSize(new Dimension(300, 130));
            returnedRCA.setFillsViewportHeight(true);
            returnedRCA.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            returnedRCA.setBackground(new Color(27, 28, 30));
            returnedRCA.setForeground(new Color(225,223,186));
            returnedRCA.setGridColor(new Color(225,223,186));
            returnedRCA.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            returnedRCA.setRowHeight(30);
            
            paneRCA1 = new JScrollPane(returnedRCA, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            paneRCA1.setVisible(true);

            returnedPnlRCA.setBounds(315, 220, 305, 155);
            returnedPnlRCA.setBorder(BorderFactory.createLineBorder(new Color(225,223,186)));
            returnedPnlRCA.add(paneRCA1);
        }
    }
            //Object[] rowReturns = new Object[4];

            {{//On Rent Table
            onRentTitleRCA.setText("CARS ON RENT");
            onRentTitleRCA.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            onRentTitleRCA.setSize(200, 22);
            onRentTitleRCA.setForeground(new Color(225,223,186));
            onRentTitleRCA.setBackground(new Color(27, 28, 30));
            onRentTitleRCA.setLocation(420, 13);

            Object columns[] = {"Username", "Model", "Return Date", "Status"};

            DefaultTableModel modelORCA = new DefaultTableModel(columns,0);
            onRentRCA = new JTable();
            onRentRCA.setModel(modelORCA);
    
            List<String> listOfStrings
            = new ArrayList<String>();
    
            List<String> list = functions.fromBooking(listOfStrings);

            //BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel modelORCA1 = (DefaultTableModel)onRentRCA.getModel();
            functions.toOnRentTable(list, modelORCA1);

            onRentRCA.setFocusable(false);
            onRentRCA.addMouseListener(new MouseAdapter() {
               public void mouseClicked(MouseEvent me) {
                  if (me.getClickCount() == 1) {     // to detect click row event
                     JTable target = (JTable)me.getSource();
                     int rowIndex = target.getSelectedRow();
                     txtUsernameRCA.setText(onRentRCA.getValueAt(rowIndex, 0).toString());
                     txtCarModelRCA.setText(onRentRCA.getValueAt(rowIndex, 1).toString());
                     txtDateRCA.setText(onRentRCA.getValueAt(rowIndex, 2).toString());
                  }
               }
            });
            onRentRCA.setPreferredScrollableViewportSize(new Dimension(300, 130));
            onRentRCA.setFillsViewportHeight(true);
            onRentRCA.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            onRentRCA.setBackground(new Color(27, 28, 30));
            onRentRCA.setForeground(new Color(225,223,186));
            onRentRCA.setGridColor(new Color(225,223,186));
            onRentRCA.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            onRentRCA.setRowHeight(30);
            
            paneRCA2 = new JScrollPane(onRentRCA, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            paneRCA2.setVisible(true);

            onRentPnlRCA.setBounds(305,35,315,155);
            onRentPnlRCA.setBorder(BorderFactory.createLineBorder(new Color(225,223,186)));
            onRentPnlRCA.add(paneRCA2);

            //Object[] rowRents = new Object[4];

            //Search Button
            btnProceedRCA.setText("Proceed");
            btnProceedRCA.setSize(90, 37);
            btnProceedRCA.setLocation(130, 320);
            btnProceedRCA.setForeground(new Color(225,223,186));
            btnProceedRCA.setBackground(new Color(27, 28, 30));
            btnProceedRCA.setBorder(borderRCA);
            btnProceedRCA.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnProceedRCA.setFocusable(false);
            btnProceedRCA.addMouseListener(this);

            //Refresh Button
            btnRefreshRCA.setText("Refresh");
            btnRefreshRCA.setSize(90, 37);
            btnRefreshRCA.setLocation(30, 320);
            btnRefreshRCA.setForeground(new Color(225,223,186));
            btnRefreshRCA.setBackground(new Color(27, 28, 30));
            btnRefreshRCA.setBorder(borderRCA);
            btnRefreshRCA.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnRefreshRCA.setFocusable(false);
            btnRefreshRCA.addMouseListener(this);

            //Components for return ID
            separator1RCA.setForeground(new Color(225,223,186));
            separator1RCA.setBackground(new Color(27, 28, 30));
            separator1RCA.setSize(180, 17);
            separator1RCA.setLocation(35, 105);

            txtUsernameRCA.setText("");
            txtUsernameRCA.setSize(180, 30);
            txtUsernameRCA.setBorder(null);
            txtUsernameRCA.setForeground(new Color(225,223,186));
            txtUsernameRCA.setBackground(new Color(27, 28, 30));
            txtUsernameRCA.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            txtUsernameRCA.setLocation(35,75);

            usernameRCA.setText("Username");
            usernameRCA.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            usernameRCA.setForeground(new Color(225,223,186));
            usernameRCA.setBackground(new Color(27, 28, 30));
            usernameRCA.setBorder(null);
            usernameRCA.setSize(180, 30);
            usernameRCA.setLocation(15, 45);

            //Components for Customer Username
            separator2RCA.setForeground(new Color(225,223,186));
            separator2RCA.setBackground(new Color(27, 28, 30));
            separator2RCA.setSize(180, 17);
            separator2RCA.setLocation(35, 175);

            txtCarModelRCA.setText("");
            txtCarModelRCA.setSize(180, 30);
            txtCarModelRCA.setBorder(null);
            txtCarModelRCA.setForeground(new Color(225,223,186));
            txtCarModelRCA.setBackground(new Color(27, 28, 30));
            txtCarModelRCA.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            txtCarModelRCA.setLocation(35,145);

            carModelRCA.setText("Car Model");
            carModelRCA.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            carModelRCA.setForeground(new Color(225,223,186));
            carModelRCA.setBackground(new Color(27, 28, 30));
            carModelRCA.setBorder(null);
            carModelRCA.setSize(180, 30);
            carModelRCA.setLocation(15,115);

            //Components for Return Date
            separator3RCA.setForeground(new Color(225,223,186));
            separator3RCA.setBackground(new Color(27, 28, 30));
            separator3RCA.setSize(180, 17);
            separator3RCA.setLocation(35, 245);

            txtDateRCA.setText("");
            txtDateRCA.setSize(180, 30);
            txtDateRCA.setBorder(null);
            txtDateRCA.setForeground(new Color(225,223,186));
            txtDateRCA.setBackground(new Color(27, 28, 30));
            txtDateRCA.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            txtDateRCA.setLocation(35,215);

            dateRCA.setText("Return Date");
            dateRCA.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            dateRCA.setForeground(new Color(225,223,186));
            dateRCA.setBackground(new Color(27, 28, 30));
            dateRCA.setBorder(null);
            dateRCA.setSize(180, 30);
            dateRCA.setLocation(15, 185);
            
            //Frame
            pnlRCA.setBackground(new Color(27, 28, 30));
            pnlRCA.setLayout(null);
            pnlRCA.setSize(725, 420);
            pnlRCA.setVisible(false);
            
            //Adding Components to Frame
            pnlRCA.add(usernameRCA);
            pnlRCA.add(carModelRCA);
            pnlRCA.add(dateRCA);
            pnlRCA.add(txtUsernameRCA);
            pnlRCA.add(txtCarModelRCA);
            pnlRCA.add(txtDateRCA);
            pnlRCA.add(separator1RCA);
            pnlRCA.add(separator2RCA);
            pnlRCA.add(separator3RCA);
            pnlRCA.add(btnRefreshRCA);
            pnlRCA.add(btnProceedRCA);
            pnlRCA.add(onRentPnlRCA);
            pnlRCA.add(returnedPnlRCA);
            pnlRCA.add(returnedTitleRCA);
            pnlRCA.add(onRentTitleRCA);
        }
    }   

        //Booking Page ✅
        {
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
            txtEndDateB.setText("2022-09-10");
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
            txtStartDateB.setText("2022-09-09");
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
            btnBookB.addMouseListener(this);
            btnBookB.setBorder(borderB);
    
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
            txtCarModelB.setText("Car Model");
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
        }
        
        //View Booking Request Page ✅
        {
            txtUserNameBR.setText(" ");
            txtUserNameBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            txtUserNameBR.setForeground(new Color(225,223,186));
            txtUserNameBR.setBackground(new Color(27, 28, 30));
            txtUserNameBR.setLocation(260, 210);
            txtUserNameBR.setSize(150, 26);

            txtStartTimeBR.setText(" ");
            txtStartTimeBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            txtStartTimeBR.setForeground(new Color(225,223,186));
            txtStartTimeBR.setBackground(new Color(27, 28, 30));
            txtStartTimeBR.setLocation(260, 276);
            txtStartTimeBR.setSize(150, 26);

            txtEndTimeBR.setText(" ");
            txtEndTimeBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            txtEndTimeBR.setForeground(new Color(225,223,186));
            txtEndTimeBR.setBackground(new Color(27, 28, 30));
            txtEndTimeBR.setLocation(260, 309);
            txtEndTimeBR.setSize(150, 26);

            txtCarInfoBR.setText(" ");
            txtCarInfoBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            txtCarInfoBR.setForeground(new Color(225,223,186));
            txtCarInfoBR.setBackground(new Color(27, 28, 30));
            txtCarInfoBR.setLocation(260, 243);
            txtCarInfoBR.setSize(150, 26);

            txtRentDateBR.setText(" ");
            txtRentDateBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            txtRentDateBR.setForeground(new Color(225,223,186));
            txtRentDateBR.setBackground(new Color(27, 28, 30));
            txtRentDateBR.setLocation(260, 342);
            txtRentDateBR.setSize(150, 26);

            txtReturnDateBR.setText(" ");
            txtReturnDateBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            txtReturnDateBR.setForeground(new Color(225,223,186));
            txtReturnDateBR.setBackground(new Color(27, 28, 30));
            txtReturnDateBR.setLocation(260, 373);
            txtReturnDateBR.setSize(150, 26);

            lblUserNameBR.setText("Username: ");
            lblUserNameBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            lblUserNameBR.setForeground(new Color(225,223,186));
            lblUserNameBR.setBackground(new Color(27, 28, 30));
            lblUserNameBR.setLocation(110, 210);
            lblUserNameBR.setSize(150, 26);

            lblStartTimeBR.setText("Start Time: ");
            lblStartTimeBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            lblStartTimeBR.setForeground(new Color(225,223,186));
            lblStartTimeBR.setBackground(new Color(27, 28, 30));
            lblStartTimeBR.setLocation(110, 276);
            lblStartTimeBR.setSize(150, 26);

            lblEndTimeBR.setText("End Time: ");
            lblEndTimeBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            lblEndTimeBR.setForeground(new Color(225,223,186));
            lblEndTimeBR.setBackground(new Color(27, 28, 30));
            lblEndTimeBR.setLocation(110, 309);
            lblEndTimeBR.setSize(150, 26);

            lblCarInfoBR.setText("Car Model: ");
            lblCarInfoBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            lblCarInfoBR.setForeground(new Color(225,223,186));
            lblCarInfoBR.setBackground(new Color(27, 28, 30));
            lblCarInfoBR.setLocation(110, 243);
            lblCarInfoBR.setSize(150, 26);

            lblRentDateBR.setText("Rental Date: ");
            lblRentDateBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            lblRentDateBR.setForeground(new Color(225,223,186));
            lblRentDateBR.setBackground(new Color(27, 28, 30));
            lblRentDateBR.setLocation(110, 342);
            lblRentDateBR.setSize(150, 26);

            lblReturnDateBR.setText("Return Date: ");
            lblReturnDateBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            lblReturnDateBR.setForeground(new Color(225,223,186));
            lblReturnDateBR.setBackground(new Color(27, 28, 30));
            lblReturnDateBR.setLocation(110, 373);
            lblReturnDateBR.setSize(150, 26);

            btnCancelBR.setText("Cancel");
            btnCancelBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            btnCancelBR.setForeground(new Color(225,223,186));
            btnCancelBR.setBackground(new Color(27, 28, 30));
            btnCancelBR.setLocation(500, 260);
            btnCancelBR.setSize(80, 26);
            btnCancelBR.setBorder(borderBR);
            btnCancelBR.addMouseListener(this);

            btnDeclineBR.setText("Decline");
            btnDeclineBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            btnDeclineBR.setForeground(new Color(225,223,186));
            btnDeclineBR.setBackground(new Color(27, 28, 30));
            btnDeclineBR.setLocation(500, 305);
            btnDeclineBR.setSize(80, 26);
            btnDeclineBR.setBorder(borderBR);
            btnDeclineBR.addMouseListener(this);

            btnAcceptBR.setText("Accept");
            btnAcceptBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
            btnAcceptBR.setForeground(new Color(225,223,186));
            btnAcceptBR.setBackground(new Color(27, 28, 30));
            btnAcceptBR.setLocation(500, 340);
            btnAcceptBR.setSize(80, 26);
            btnAcceptBR.setBorder(borderBR);
            btnAcceptBR.addMouseListener(this);

            Object columns[] = {"Username", "Model", "Start Time", "End Time", "Start Date", "Return Date", "Status"};

            DefaultTableModel modelBR = new DefaultTableModel(columns,0);
            tableBR = new JTable();
            tableBR.setModel(modelBR);
    
            List<String> listOfStrings
            = new ArrayList<String>();
    
            List<String> list = functions.fromBooking(listOfStrings);
            //BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel modelBR1 = (DefaultTableModel)tableBR.getModel();
            
            functions.toBookingRequestTable(list, modelBR1);
            
            tableBR.setFocusable(false);
            tableBR.addMouseListener(new MouseAdapter() {
               public void mouseClicked(MouseEvent me) {
                  if (me.getClickCount() == 1) {     // to detect click row event
                     JTable target = (JTable)me.getSource();
                     int rowIndex = target.getSelectedRow();
                     txtUserNameBR.setText(tableBR.getValueAt(rowIndex, 0).toString());
                     txtCarInfoBR.setText(tableBR.getValueAt(rowIndex, 1).toString());
                     txtStartTimeBR.setText(tableBR.getValueAt(rowIndex, 2).toString());
                     txtEndTimeBR.setText(tableBR.getValueAt(rowIndex, 3).toString());
                     txtRentDateBR.setText(tableBR.getValueAt(rowIndex,4).toString());
                     txtReturnDateBR.setText(tableBR.getValueAt(rowIndex, 5).toString());
                  }
               }
            });
            
            tableBR.setPreferredScrollableViewportSize(new Dimension(535, 100));
            tableBR.setFillsViewportHeight(true);
            tableBR.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tableBR.setBackground(new Color(27, 28, 30));
            tableBR.setForeground(new Color(225,223,186));
            tableBR.setGridColor(new Color(225,223,186));
            tableBR.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            tableBR.setRowHeight(30);
            
            paneBR = new JScrollPane(tableBR, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            paneBR.setVisible(true);

            tableBRPnl.setBounds(50, 60, 555, 125);
            tableBRPnl.setBorder(BorderFactory.createLineBorder(new Color(225,223,186)));
            tableBRPnl.add(paneBR);

            //Frame
            pnlBR.setBackground(new Color(27, 28, 30));
            pnlBR.setLayout(null);
            pnlBR.setSize(725, 420);
            pnlBR.setVisible(false);

            pnlBR.add(tableBRPnl);
            pnlBR.add(lblUserIDBR);
            pnlBR.add(lblUserNameBR);
            pnlBR.add(lblStartTimeBR);
            pnlBR.add(lblEndTimeBR);
            pnlBR.add(lblCarInfoBR);
            pnlBR.add(lblRentDateBR);
            pnlBR.add(lblReturnDateBR);
            pnlBR.add(txtUserIDBR);
            pnlBR.add(txtUserNameBR);
            pnlBR.add(txtStartTimeBR);
            pnlBR.add(txtEndTimeBR);
            pnlBR.add(txtCarInfoBR);
            pnlBR.add(txtRentDateBR);
            pnlBR.add(txtReturnDateBR);
            pnlBR.add(btnCancelBR);
            pnlBR.add(btnAcceptBR);
            pnlBR.add(btnDeclineBR);
            
        }

        //Change Password Page ✅
        {
            ImageIcon pwdCP = new ImageIcon("src\\Pics\\password.png");
            pwdPicCP.setIcon(pwdCP);
            pwdPicCP.setSize(256, 256);
            pwdPicCP.setLocation(420, 60);

            btnCancelCP.setText("Cancel");
            btnCancelCP.setSize(140, 44);
            btnCancelCP.setLocation(370, 320);
            btnCancelCP.setForeground(new Color(225,223,186));
            btnCancelCP.setBackground(new Color(27, 28, 30));
            Border borderCP = new LineBorder(new Color(225,223,186), 1, true);
            btnCancelCP.setBorder(borderCP);
            btnCancelCP.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnCancelCP.setFocusable(false);
            btnCancelCP.addMouseListener(this);

            btnChangeCP.setText("Change Password");
            btnChangeCP.setSize(140, 44);
            btnChangeCP.setLocation(220, 320);
            btnChangeCP.setForeground(new Color(225,223,186));
            btnChangeCP.setBackground(new Color(27, 28, 30));
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
            confirmPwdCP.setLocation(95, 210);
            confirmPwdCP.setBorder(null);
            confirmPwdCP.addMouseListener(this);
            confirmPwdCP.setEditable(true);

            separator2CP.setForeground(new Color(225,223,186));
            separator2CP.setBackground(new Color(27, 28, 30));
            separator2CP.setSize(180, 17);
            separator2CP.setLocation(95, 243);

            //First Password box
            passwordCP.setText("Password");
            passwordCP.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            passwordCP.setForeground(new Color(225,223,186));
            passwordCP.setBackground(new Color(27, 28, 30));
            passwordCP.setSize(180,30);
            passwordCP.setLocation(95, 110);
            passwordCP.setBorder(null);
            passwordCP.addMouseListener(this);
            passwordCP.setEditable(true);

            separator1CP.setForeground(new Color(225,223,186));
            separator1CP.setBackground(new Color(27, 28, 30));
            separator1CP.setSize(180, 17);
            separator1CP.setLocation(95, 143);

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
            pnlCP.add(btnCancelCP);
            pnlCP.add(pwdPicCP);
        }

        //Edit Profile Page ✅
        {
            //Car Picture
            ImageIcon carEP = new ImageIcon("src\\Pics\\sport-car.png");
            carPicEP.setIcon(carEP);
            carPicEP.setSize(256, 256);
            carPicEP.setLocation(300, 140);

            //Icon for Username
            ImageIcon userEP = new ImageIcon("src\\Pics\\user_1.png");
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
            btnChangeEP.addMouseListener(this);

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
            btnDefaultEP.addMouseListener(this);

            //Txt for Phone No.
            lblPhoneNumEP.setText(user.getPhoneNum());
            lblPhoneNumEP.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            lblPhoneNumEP.setForeground(new Color(225,223,186));
            lblPhoneNumEP.setBackground(new Color(27, 28, 30));
            lblPhoneNumEP.setSize(180,30);
            lblPhoneNumEP.setLocation(110, 250);
            lblPhoneNumEP.setBorder(null);
            lblPhoneNumEP.setCaretColor(new Color(225,223,186));

            separator3EP.setForeground(new Color(225,223,186));
            separator3EP.setBackground(new Color(27, 28, 30));
            separator3EP.setSize(180, 17);
            separator3EP.setLocation(110, 283);

            //Txt for Email
            lblEmailEP.setText(user.getEmail());
            lblEmailEP.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            lblEmailEP.setForeground(new Color(225,223,186));
            lblEmailEP.setBackground(new Color(27, 28, 30));
            lblEmailEP.setSize(180,30);
            lblEmailEP.setLocation(110, 170);
            lblEmailEP.setBorder(null);
            lblEmailEP.setCaretColor(new Color(225,223,186));

            separator2EP.setForeground(new Color(225,223,186));
            separator2EP.setBackground(new Color(27, 28, 30));
            separator2EP.setSize(180, 17);
            separator2EP.setLocation(110, 203);

            //Txt for Username
            lblUsernameEP.setText(user.getUsername());
            lblUsernameEP.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            lblUsernameEP.setForeground(new Color(225,223,186));
            lblUsernameEP.setBackground(new Color(27, 28, 30));
            lblUsernameEP.setSize(180,30);
            lblUsernameEP.setLocation(110, 90);
            lblUsernameEP.setBorder(null);
            lblUsernameEP.setCaretColor(new Color(225,223,186));

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

        //Add Car Admin Page ✅
        {
            //columns
            Object headers[] = { "Car Brand", "CarModel", "Car Plate Number","Car Year","Car Seats", "Price/Hr", "Status"};
            
            //setup table with column, 0 row 
            DefaultTableModel model = new DefaultTableModel(headers,0);
            tableAC = new JTable();
            tableAC.setModel(model);

            // arraylist to store strings
            List<String> listOfStrings
            = new ArrayList<String>();
   
            List<String> list = functions.fromCar(listOfStrings);
            //BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model1 = (DefaultTableModel)tableAC.getModel();
            functions.toAddCarTable(list, model1);

            tableAC.setFocusable(false);
            tableAC.addMouseListener(new MouseAdapter() {
               public void mouseClicked(MouseEvent me) {
                  if (me.getClickCount() == 1) {     // to detect click row event
                     JTable target = (JTable)me.getSource();
                     int rowIndex = target.getSelectedRow();
                     txtCarBrandAC.setText(tableAC.getValueAt(rowIndex, 0).toString());
                     txtCarModelAC.setText(tableAC.getValueAt(rowIndex, 1).toString());           
                     txtCarPlateNumAC.setText(tableAC.getValueAt(rowIndex, 2).toString());
                     txtCarYearAC.setText(tableAC.getValueAt(rowIndex, 3).toString());
                     txtCarSeatAC.setText(tableAC.getValueAt(rowIndex, 4).toString());
                     txtCarYearAC.setText(tableAC.getValueAt(rowIndex, 5).toString());
                     txtCarPriceAC.setText(tableAC.getValueAt(rowIndex, 6).toString());
                  }
               }
            });
        
            tableAC.setPreferredScrollableViewportSize(new Dimension(450, 250));
            tableAC.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tableAC.setFillsViewportHeight(true);
            tableAC.setBackground(new Color(27, 28, 30));
            tableAC.setForeground(new Color(225,223,186));
            tableAC.setGridColor(new Color(225,223,186));
            tableAC.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            tableAC.setLocation(0, 0);
            tableAC.setRowHeight(30);
            
            paneAC = new JScrollPane(tableAC, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            paneAC.setVisible(true);

            tablePnlAC.setBounds(210, 40, 475, 300);
            tablePnlAC.setBorder(BorderFactory.createLineBorder(new Color(225,223,186)));
            tablePnlAC.add(paneAC);

            //Add Button
            btnAddAC.setText("Add");
            btnAddAC.setSize(85, 37);
            btnAddAC.setLocation(415, 365);
            btnAddAC.setForeground(new Color(225,223,186));
            btnAddAC.setBackground(new Color(27, 28, 30));
            btnAddAC.setBorder(borderAC);
            btnAddAC.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnAddAC.setFocusable(false);
            btnAddAC.addMouseListener(this);

            //Edit Button
            btnEditAC.setText("Edit");
            btnEditAC.setSize(85, 37);
            btnEditAC.setLocation(515, 365);
            btnEditAC.setForeground(new Color(225,223,186));
            btnEditAC.setBackground(new Color(27, 28, 30));
            btnEditAC.setBorder(borderAC);
            btnEditAC.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnEditAC.setFocusable(false);
            btnEditAC.addMouseListener(this);
        
            //Delete Button
            btnDeleteAC.setText("Delete");
            btnDeleteAC.setSize(85, 37);
            btnDeleteAC.setLocation(615, 365);
            btnDeleteAC.setForeground(new Color(225,223,186));
            btnDeleteAC.setBackground(new Color(27, 28, 30));
            btnDeleteAC.setBorder(borderAC);
            btnDeleteAC.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnDeleteAC.setFocusable(false);
            btnDeleteAC.addMouseListener(this);

            //Cancel Button
            btnCancelAC.setText("Cancel");
            btnCancelAC.setSize(85, 37);
            btnCancelAC.setLocation(315, 365);
            btnCancelAC.setForeground(new Color(225,223,186));
            btnCancelAC.setBackground(new Color(27, 28, 30));
            btnCancelAC.setBorder(borderAC);
            btnCancelAC.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnCancelAC.setFocusable(false);
            btnCancelAC.addMouseListener(this);
            
            //Clear Button
            btnClearAC.setText("Clear");
            btnClearAC.setSize(85, 37);
            btnClearAC.setLocation(215, 365);
            btnClearAC.setForeground(new Color(225,223,186));
            btnClearAC.setBackground(new Color(27, 28, 30));
            btnClearAC.setBorder(borderAC);
            btnClearAC.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnClearAC.setFocusable(false);
            btnClearAC.addMouseListener(this);



            separator6AC.setForeground(new Color(225,223,186));
            separator6AC.setBackground(new Color(27, 28, 30));
            separator6AC.setSize(120, 17);
            separator6AC.setLocation(35, 400);

            txtCarPriceAC.setText("");
            txtCarPriceAC.setSize(120, 30);
            txtCarPriceAC.setBorder(null);
            txtCarPriceAC.setForeground(new Color(225,223,186));
            txtCarPriceAC.setBackground(new Color(27, 28, 30));
            txtCarPriceAC.setFont(new Font("TW Cen MT", Font.BOLD, 14));
            txtCarPriceAC.setLocation(35,370);

            carPriceAC.setText("Price/Hr");
            carPriceAC.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            carPriceAC.setForeground(new Color(225,223,186));
            carPriceAC.setBackground(new Color(27, 28, 30));
            carPriceAC.setBorder(null);
            carPriceAC.setSize(180, 30);
            carPriceAC.setLocation(15, 345);

            //Car seat text box and label 
            separator5AC.setForeground(new Color(225,223,186));
            separator5AC.setBackground(new Color(27, 28, 30));
            separator5AC.setSize(120, 17);
            separator5AC.setLocation(35, 335);

            txtCarSeatAC.setText("");
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

            txtCarYearAC.setText("");
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

            txtCarPlateNumAC.setText("");
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

            txtCarModelAC.setText("");
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

            txtCarBrandAC.setText("");
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
            pnlAC.add(carPriceAC);
            pnlAC.add(txtCarPriceAC);
            pnlAC.add(separator6AC);
            pnlAC.add(btnClearAC);
            pnlAC.add(btnCancelAC);
            pnlAC.add(btnAddAC);
            pnlAC.add(btnEditAC);
            pnlAC.add(btnDeleteAC);
            pnlAC.add(tablePnlAC);
        }

        //Registration Page ✅
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
            ImageIcon icnUserR = new ImageIcon("src\\Pics\\user_1.png");
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

        //View All Car Page ✅
        {
            //columns
            Object headersA[] = {"Car Brand", "CarModel", "Car Year", "Car Seats", "Price/Hr"};
            
            //setup table with column, 0 row 
            DefaultTableModel modelA = new DefaultTableModel(headersA,0);
            tableA = new JTable();
            tableA.setModel(modelA);

            // arraylist to store strings
            List<String> listOfStrings
            = new ArrayList<String>();
   
            listOfStrings = functions.fromCar(listOfStrings);
            //BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel modelA1 = (DefaultTableModel)tableA.getModel();

            functions.toViewAllCarTable(listOfStrings, modelA1);

            tableA.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent me) {
                   if (me.getClickCount() == 1) {     // to detect click row event
                      JTable target = (JTable)me.getSource();
                      int rowIndex = target.getSelectedRow();
                      txtCarModel.setText(tableA.getValueAt(rowIndex, 0).toString() + " " + tableA.getValueAt(rowIndex, 1).toString());
                      txtCarYear.setText(tableA.getValueAt(rowIndex, 2).toString());
                      txtCarSeats.setText(tableA.getValueAt(rowIndex, 3).toString());
                      txtCarPrice.setText(tableA.getValueAt(rowIndex, 4).toString());
                   }
                }
             });
        
            tableA.setPreferredScrollableViewportSize(new Dimension(379, 292));
            tableA.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tableA.setFillsViewportHeight(true);
            tableA.setBackground(new Color(27, 28, 30));
            tableA.setForeground(new Color(225,223,186));
            tableA.setGridColor(new Color(225,223,186));
            tableA.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            tableA.setRowHeight(30);
            
            paneACP = new JScrollPane(tableA, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            paneACP.setVisible(true);

            tablePnlACP.setBounds(280, 50, 410, 317);
            tablePnlACP.setBorder(BorderFactory.createLineBorder(new Color(225,223,186)));
            tablePnlACP.add(paneACP);
            
            //Learn More Button
            btnLearnMoreACP.setText("Learn More");
            btnLearnMoreACP.setSize(90, 37);
            btnLearnMoreACP.setLocation(100, 350);
            btnLearnMoreACP.setForeground(new Color(225,223,186));
            btnLearnMoreACP.setBackground(new Color(27, 28, 30));
            btnLearnMoreACP.setBorder(borderAC);
            btnLearnMoreACP.setFont(new Font("TW Cen MT", Font.BOLD, 15));
            btnLearnMoreACP.setFocusable(false);
            btnLearnMoreACP.addMouseListener(this);

            lblCarModel.setText("Car Model: ");
            lblCarModel.setSize(100, 30);
            lblCarModel.setBorder(null);
            lblCarModel.setForeground(new Color(225,223,186));
            lblCarModel.setBackground(new Color(27, 28, 30));
            lblCarModel.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            lblCarModel.setLocation(25, 30);

            lblCarYear.setText("Car Year: ");
            lblCarYear.setSize(100, 30);
            lblCarYear.setBorder(null);
            lblCarYear.setForeground(new Color(225,223,186));
            lblCarYear.setBackground(new Color(27, 28, 30));
            lblCarYear.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            lblCarYear.setLocation(25, 120);

            lblCarSeats.setText("Car Seats: ");
            lblCarSeats.setSize(100, 30);
            lblCarSeats.setBorder(null);
            lblCarSeats.setForeground(new Color(225,223,186));
            lblCarSeats.setBackground(new Color(27, 28, 30));
            lblCarSeats.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            lblCarSeats.setLocation(25, 210);

            lblCarPrice.setText("Price/Hr: ");
            lblCarPrice.setSize(100, 30);
            lblCarPrice.setBorder(null);
            lblCarPrice.setForeground(new Color(225,223,186));
            lblCarPrice.setBackground(new Color(27, 28, 30));
            lblCarPrice.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            lblCarPrice.setLocation(25, 300);

            txtCarModel.setText(" ");
            txtCarModel.setSize(160, 30);
            txtCarModel.setBorder(null);
            txtCarModel.setForeground(new Color(225,223,186));
            txtCarModel.setBackground(new Color(27, 28, 30));
            txtCarModel.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            txtCarModel.setLocation(130, 30);

            txtCarYear.setText(" ");
            txtCarYear.setSize(100, 30);
            txtCarYear.setBorder(null);
            txtCarYear.setForeground(new Color(225,223,186));
            txtCarYear.setBackground(new Color(27, 28, 30));
            txtCarYear.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            txtCarYear.setLocation(130, 120);

            txtCarSeats.setText(" ");
            txtCarSeats.setSize(100, 30);
            txtCarSeats.setBorder(null);
            txtCarSeats.setForeground(new Color(225,223,186));
            txtCarSeats.setBackground(new Color(27, 28, 30));
            txtCarSeats.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            txtCarSeats.setLocation(130, 210);

            txtCarPrice.setText(" ");
            txtCarPrice.setSize(100, 30);
            txtCarPrice.setBorder(null);
            txtCarPrice.setForeground(new Color(225,223,186));
            txtCarPrice.setBackground(new Color(27, 28, 30));
            txtCarPrice.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            txtCarPrice.setLocation(130, 300);

            pnlViewAllCar.setSize(725, 420);
            pnlViewAllCar.setBackground(new Color(27, 28, 30));
            pnlViewAllCar.setLayout(null);
            pnlViewAllCar.setVisible(false);

            pnlViewAllCar.add(tablePnlACP);
            pnlViewAllCar.add(lblCarModel);
            pnlViewAllCar.add(lblCarYear);
            pnlViewAllCar.add(lblCarSeats);
            pnlViewAllCar.add(lblCarPrice);
            pnlViewAllCar.add(txtCarModel);
            pnlViewAllCar.add(txtCarYear);
            pnlViewAllCar.add(txtCarSeats);
            pnlViewAllCar.add(txtCarPrice);
            pnlViewAllCar.add(btnLearnMoreACP);
        }

        //View Monthly Report Page ✅
        {
            Object columns[] = {"Username", "Model", "End Time", "End Date","Payment method", "Total Price","Status"};
            DefaultTableModel modelMR = new DefaultTableModel(columns,0);
            tableMR = new JTable();
            tableMR.setCellSelectionEnabled(false); 
            tableMR.setDefaultEditor(Object.class, null);
            tableMR.setModel(modelMR);

            List<String> listOfStrings
            = new ArrayList<String>();
    
            List<String> list = functions.fromReport(listOfStrings);
            //BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel modelMR1 = (DefaultTableModel)tableMR.getModel();
            functions.toViewMonthlyReportTable(list, modelMR1,"Completed");
            double income = 0;
            for(int k = 0;k<tableMR.getModel().getRowCount();k++){
                income = income + Double.parseDouble(tableMR.getModel().getValueAt(k,5).toString());
            }
            tableMR.setPreferredScrollableViewportSize(new Dimension(597, 1500));
            tableMR.setFillsViewportHeight(true);
            tableMR.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tableMR.setBackground(new Color(27, 28, 30));
            tableMR.setForeground(new Color(225,223,186));
            tableMR.setGridColor(new Color(225,223,186));
            tableMR.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            tableMR.setRowHeight(30);
            
            pane = new JScrollPane(tableMR, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            pane.setVisible(true);

            tablePnl.setBounds(50, 155, 597, 300);
            tablePnl.setBorder(BorderFactory.createLineBorder(new Color(225,223,186)));
            tablePnl.add(pane);

            //Object[] rowReturns = new Object[4];

            //Cancel Button
            btnSearchMR.setText("Search");
            btnSearchMR.setSize(85, 37);
            btnSearchMR.setLocation(155, 100);
            btnSearchMR.setForeground(new Color(225,223,186));
            btnSearchMR.setBackground(new Color(27, 28, 30));
            btnSearchMR.setBorder(borderVMP);
            btnSearchMR.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            btnSearchMR.setFocusable(false);
            btnSearchMR.addMouseListener(this);
            
            //Clear Button
            btnClearMR.setText("Clear");
            btnClearMR.setSize(85, 37);
            btnClearMR.setLocation(50, 100);
            btnClearMR.setForeground(new Color(225,223,186));
            btnClearMR.setBackground(new Color(27, 28, 30));
            btnClearMR.setBorder(borderVMP);
            btnClearMR.setFont(new Font("TW Cen MT", Font.BOLD, 16));
            btnClearMR.setFocusable(false);
            btnClearMR.addMouseListener(this);

            //Text Total income (Manipulate)
            txtTotalIncome.setText("RM "+income);
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
            uncompleted.addMouseListener(this);

            //CheckBox for completed
            completed.setText("Completed");
            completed.setForeground(new Color(225,223,186));
            completed.setBackground(new Color(27, 28, 30));
            completed.setSize(98, 25);
            completed.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            completed.setLocation(60, 30);
            completed.setFocusable(false);
            completed.addMouseListener(this);

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
            pnlVMP.add(btnClearMR);
            pnlVMP.add(btnSearchMR);
            pnlVMP.add(tablePnl);
        }

        //Add Page ✅
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

        //Profile Page ✅
        {   
            ImageIcon pic = new ImageIcon("src\\Pics\\car-rental.png");
            carPic.setIcon(pic);
            carPic.setSize(256,256);
            carPic.setLocation(400, 25);

            List<String> listOfStrings1 = new ArrayList<String>();
            listOfStrings1 = functions.fromBooking(listOfStrings1);
            int index = listOfStrings1.size();

            message.setText("Your booked service for: ");
            message.setFont(new Font("TW Cen MT", Font.BOLD, 22));
            message.setForeground(new Color(225,223,186));
            message.setBackground(new Color(27, 28, 30));
            message.setLocation(370, 310);
            message.setSize(250, 26);

            message2.setText(listOfStrings1.get(index-7));
            message2.setFont(new Font("TW Cen MT", Font.PLAIN, 20));
            message2.setForeground(new Color(225,223,186));
            message2.setBackground(new Color(27, 28, 30));
            message2.setLocation(400, 335);
            message2.setSize(250, 26);

            message3.setText(functions.setBookingStatusTxt(listOfStrings1, index));
            message3.setFont(new Font("TW Cen MT", Font.PLAIN, 20));
            message3.setForeground(new Color(225,223,186));
            message3.setBackground(new Color(27, 28, 30));
            message3.setLocation(400, 360);
            message3.setSize(250, 26);

            

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

            ImageIcon icnUser = new ImageIcon("src\\Pics\\user_1.png");
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
            lblPhoneNum.setText(user.getPhoneNum());
            lblPhoneNum.setFont(new Font("Segoe UI", Font.PLAIN, 15));
            lblPhoneNum.setForeground(new Color(225,223,186));
            lblPhoneNum.setSize(150,25);
            lblPhoneNum.setLocation(125, 210);

            //Txt for Email
            lblEmail.setText(user.getEmail());
            lblEmail.setFont(new Font("Segoe UI", Font.PLAIN, 15));
            lblEmail.setForeground(new Color(225,223,186));
            lblEmail.setSize(200,25);
            lblEmail.setLocation(125, 150);

            //Txt for Username
            lblUsername.setText(user.getUsername());
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
            pnlProfile.add(titleProfile);
            pnlProfile.add(icnPhoneNum);
            pnlProfile.add(icnEmail);
            pnlProfile.add(icnUsername);
            pnlProfile.add(btnEdit);
            pnlProfile.add(lblUsername);
            pnlProfile.add(lblEmail);
            pnlProfile.add(lblPhoneNum);
            pnlProfile.add(border);
            pnlProfile.add(border2);
            pnlProfile.add(message);
            pnlProfile.add(message2);
            pnlProfile.add(message3);
            pnlProfile.add(carPic);
        }

        //pnl2Cus ✅
        {
            //Booking icon
            ImageIcon bookingCus = new ImageIcon("src\\Pics\\online-booking.png");
            btnBookingCus.setIcon(bookingCus);
            btnBookingCus.setBackground(new Color(127, 126, 144));
            btnBookingCus.setFocusable(false);
            btnBookingCus.setSize(64, 64);
            btnBookingCus.setLocation(180, 7);
            btnBookingCus.setBorder(null);
            btnBookingCus.addMouseListener(this);

            //Profile icon
            ImageIcon profileCus = new ImageIcon("src\\Pics\\account.png");
            btnProfileCus.setIcon(profileCus);
            btnProfileCus.setBackground(new Color(127, 126, 144));
            btnProfileCus.setFocusable(false);
            btnProfileCus.setSize(64, 64);
            btnProfileCus.setLocation(475, 3);
            btnProfileCus.setBorder(null);
            btnProfileCus.addMouseListener(this);

            //Bottom Panel / Menu
            pnl2Cus.setBackground(new Color(127, 126, 144));
            pnl2Cus.setLayout(null);
            pnl2Cus.setBounds(0, 420, 805, 108);
            pnl2Cus.setVisible(false);

            pnl2Cus.add(btnBookingCus);
            pnl2Cus.add(btnProfileCus);
        }
        
        //Admin Home Page ✅
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

            separator2RBP.setForeground(new Color(225,223,186));
            separator2RBP.setBackground(new Color(27, 28, 30));
            separator2RBP.setSize(724, 30);
            separator2RBP.setLocation(0, 211);

            separator1RBP.setForeground(new Color(225,223,186));
            separator1RBP.setBackground(new Color(27, 28, 30));
            separator1RBP.setSize(10, 420);
            separator1RBP.setLocation(363, 0);

            txtReturnCar.setText("View Rented Cars");
            txtReturnCar.setSize(150, 37);
            txtReturnCar.setLocation(300, 124);
            txtReturnCar.setBackground(new Color(27, 28, 30));
            txtReturnCar.setForeground(new Color(225,223,186));
            txtReturnCar.setFont(new Font("TW Cent", Font.PLAIN, 16));

            txtReport.setText("View Reports");
            txtReport.setSize(150, 37);
            txtReport.setLocation(133, 124);
            txtReport.setBackground(new Color(27, 28, 30));
            txtReport.setForeground(new Color(225,223,186));
            txtReport.setFont(new Font("TW Cent", Font.PLAIN, 16));

            txtBook.setText("View Booking Request");
            txtBook.setSize(180, 37);
            txtBook.setLocation(103, 124);
            txtBook.setBackground(new Color(27, 28, 30));
            txtBook.setForeground(new Color(225,223,186));
            txtBook.setFont(new Font("TW Cent", Font.PLAIN, 16));

            ImageIcon carPic = new ImageIcon("src\\Pics\\electric-car.png");
            btnReturnCar.setIcon(carPic);
            btnReturnCar.setSize(64, 64);
            btnReturnCar.setBackground(new Color(27, 28, 30));
            btnReturnCar.setLocation(330, 60);
            btnReturnCar.setFocusable(false);
            btnReturnCar.setBorder(null);
            btnReturnCar.addMouseListener(this);

            ImageIcon cus = new ImageIcon("src\\Pics\\online-booking2.png");
            btnBook.setIcon(cus);
            btnBook.setSize(64, 64);
            btnBook.setBackground(new Color(27, 28, 30));
            btnBook.setLocation(150, 60);
            btnBook.setFocusable(false);
            btnBook.setBorder(null);
            btnBook.addMouseListener(this);

            ImageIcon car = new ImageIcon("src\\Pics\\clipboard.png");
            btnReport.setIcon(car);
            btnReport.setSize(64, 64);
            btnReport.setBackground(new Color(27, 28, 30));
            btnReport.setLocation(150, 60);
            btnReport.setFocusable(false);
            btnReport.setBorder(null);
            btnReport.addMouseListener(this);

            pnlDownRBP.setBackground(new Color(27, 28, 30));
            pnlDownRBP.setBounds(0, 212, 724, 210);
            pnlDownRBP.setLayout(null);

            pnlRightRBP.setBackground(new Color(27, 28, 30));
            pnlRightRBP.setBounds(364, 0, 362, 210);
            pnlRightRBP.setLayout(null);

            pnlLeftRBP.setBackground(new Color(27, 28, 30));
            pnlLeftRBP.setBounds(0, 0, 362, 210);
            pnlLeftRBP.setLayout(null);

            pnlRightRBP.add(txtBook);
            pnlRightRBP.add(btnBook);
            pnlLeftRBP.add(txtReport);
            pnlLeftRBP.add(btnReport);
            pnlDownRBP.add(txtReturnCar);
            pnlDownRBP.add(btnReturnCar);

            //Bottom Panel / Menu
            pnl2Admin.setBackground(new Color(127, 126, 144));
            pnl2Admin.setLayout(null);
            pnl2Admin.setBounds(0, 420, 725, 108);
            pnl2Admin.setVisible(false);

            //Top Panel
            pnl1Admin.setBackground(new Color(27, 28, 30));
            pnl1Admin.setLayout(null);
            pnl1Admin.setBounds(0, 0, 725, 420);
            
            //Main Panel
            adminHome.setLayout(null);
            adminHome.setSize(725, 528);
            adminHome.setVisible(false);

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
            pnl1Admin.add(pnlLeftRBP);
            pnl1Admin.add(pnlRightRBP);
            pnl1Admin.add(pnlDownRBP);
            pnl1Admin.add(separator1RBP);
            pnl1Admin.add(separator2RBP);

            pnl2Admin.add(btnHome);
            pnl2Admin.add(btnBooking);
            pnl2Admin.add(btnRegistration);
            pnl2Admin.add(btnReports);
            pnl2Admin.add(btnProfile);
            
            //Adding Components to Main Frame
            adminHome.add(pnl1Admin);
        }    

        //Pages
        this.add(pnl2Cus);
        this.add(pnl2Admin);
        this.add(adminHome);
        this.add(pnlRCA);
        this.add(pnlB);
        this.add(pnlBR);
        this.add(pnlCP);
        this.add(pnlEP);
        this.add(pnlAC);
        this.add(pnlR);
        this.add(pnlViewAllCar);
        this.add(pnlVMP);
        this.add(pnlAdd);
        this.add(pnlProfile);
        this.add(pnlBill);

        String role = user.getRole();
        if(role.equals("Admin")) {
            pnl2Admin.setVisible(true);
            adminHome.setVisible(true);
            pnl2Cus.setVisible(false);
        } else {
            pnl2Admin.setVisible(false);
            adminHome.setVisible(false);
            pnl2Cus.setVisible(true);
            pnlViewAllCar.setVisible(true);
        }

        Functions function = new Functions();
        function.returnStatus();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == btnProfileCus) {
            pnlProfile.setVisible(true);
            pnlVMP.setVisible(false);
            pnlAdd.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlBill.setVisible(false);
            pnlR.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlBR.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        } //Booking Button
        else if(e.getSource() == btnBookingCus) {
            pnlViewAllCar.setVisible(true);
            pnlVMP.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlBill.setVisible(false);
            pnlR.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlBR.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        }
        // Profile Button
        else if(e.getSource() == btnProfile) {
            pnlProfile.setVisible(true);
            adminHome.setVisible(false);
            pnlVMP.setVisible(false);
            pnlAdd.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlBill.setVisible(false);
            pnlR.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlBR.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        } //Home Button
        else if(e.getSource() == btnHome) {
            adminHome.setVisible(true);
            pnlProfile.setVisible(false);
            pnlAdd.setVisible(false);
            pnlVMP.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlBill.setVisible(false);
            pnlR.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlBR.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        } //Registration Button 
        else if(e.getSource() == btnRegistration) {
            pnlAdd.setVisible(true);
            adminHome.setVisible(false);
            pnlVMP.setVisible(false);
            pnlProfile.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlBill.setVisible(false);
            pnlR.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlBR.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        } //Reports Button
        else if(e.getSource() == btnReports) {
            pnlBill.setVisible(false);
            pnlVMP.setVisible(true);
            adminHome.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlR.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlBR.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        } //Booking Button
        else if(e.getSource() == btnBooking) {
            pnlViewAllCar.setVisible(true);
            pnlVMP.setVisible(false);
            adminHome.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlBill.setVisible(false);
            pnlR.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlBR.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        } //Register Customer Page Button
        //Registration Button
        else if(e.getSource() == btnAddCus) {
            pnlR.setVisible(true);
            pnlViewAllCar.setVisible(false);
            pnlVMP.setVisible(false);
            adminHome.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlBill.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlBR.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        } //Add Car Button (Admin)
        else if(e.getSource() == btnAddCar) {
            pnlAC.setVisible(true);
            pnlR.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlVMP.setVisible(false);
            adminHome.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlBill.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlBR.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        } //Edit Button in Profile Page
        else if(e.getSource() == btnEdit) {
            pnlEP.setVisible(true);
            pnlAC.setVisible(false);
            pnlR.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlVMP.setVisible(false);
            adminHome.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlBill.setVisible(false);
            pnlCP.setVisible(false);
            pnlBR.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        } 
        //Change Password Button (Change Details Page)
        else if(e.getSource() == btnChangePwdEP) {
            pnlCP.setVisible(true);
            pnlEP.setVisible(false);
            pnlAC.setVisible(false);
            pnlR.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlVMP.setVisible(false);
            adminHome.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlBill.setVisible(false);
            pnlBR.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        } 
        //View Monthly Reports Button
        else if(e.getSource() == btnReport) {
            pnlVMP.setVisible(true);
            pnlCP.setVisible(false);
            pnlEP.setVisible(false);
            pnlAC.setVisible(false);
            pnlR.setVisible(false);
            pnlViewAllCar.setVisible(false);
            adminHome.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlBill.setVisible(false);
            pnlBR.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        }  
        //View Bookings Button
        else if(e.getSource() == btnBook) {
            pnlBR.setVisible(true);
            pnlCP.setVisible(false);
            pnlEP.setVisible(false);
            pnlAC.setVisible(false);
            pnlR.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlVMP.setVisible(false);
            adminHome.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlBill.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        } //Learn More button in All Car Page
        else if(e.getSource() == btnLearnMoreACP) {
            txtCarModelB.setText(txtCarModel.getText());

            pnlB.setVisible(true);
            pnlViewAllCar.setVisible(false);
            pnlBR.setVisible(false);
            pnlCP.setVisible(false);
            pnlEP.setVisible(false);
            pnlAC.setVisible(false);
            pnlR.setVisible(false);
            pnlVMP.setVisible(false);
            adminHome.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlBill.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
            pnlBill.setVisible(false);
        } else if(e.getSource() == btnReturnCar) {
            pnlRCA.setVisible(true);
            pnlB.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlBR.setVisible(false);
            pnlCP.setVisible(false);
            pnlEP.setVisible(false);
            pnlAC.setVisible(false);
            pnlR.setVisible(false);
            pnlVMP.setVisible(false);
            adminHome.setVisible(false);
            pnlAdd.setVisible(false);
            pnlProfile.setVisible(false);
            pnlBill.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlBill.setVisible(false);
        }else if(e.getSource() == btnHourB) {
            pnlHour.setVisible(true);
            pnlDate.setVisible(false);
        } else if(e.getSource() == btnDateB) {
            pnlDate.setVisible(true);
            pnlHour.setVisible(false);
        }
        //Button add in add car page
        else if(e.getSource()==btnAddAC){
            String brand = txtCarBrandAC.getText();
            String model = txtCarModelAC.getText();
            String plate = txtCarPlateNumAC.getText();
            String year = txtCarYearAC.getText();
            String seat = txtCarSeatAC.getText();
            String priceHr = txtCarPriceAC.getText();
            
            Car car = new Car(brand, model, plate, year, seat, priceHr);
            
            String[] row = {car.getBrand(), car.getModel(), car.getPlate(), 
                car.getYear(), car.getSeat(), car.getPrice(), "Available", "\n"};

            functions.toCar(row);
            DefaultTableModel updatedModel = (DefaultTableModel)tableAC.getModel();
                    updatedModel.addRow(row);
        } 
        else if(e.getSource()==btnDeleteAC){
            String brand = txtCarBrandAC.getText();
            String model = txtCarModelAC.getText();
            String plate = txtCarPlateNumAC.getText();
            String year = txtCarYearAC.getText();
            String seat = txtCarSeatAC.getText();
            String priceHr = txtCarPriceAC.getText();
            
            Car car = new Car(brand, model, plate, year, seat, priceHr);

            List<String> listOfStrings
            = new ArrayList<String>();

            String tempFile = "temp.txt";
            File newFile = new File(tempFile);

            try (// load content of file based on specific delimiter

                FileWriter fw = new FileWriter(tempFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw); 
                Scanner sc = new Scanner(new FileReader("src\\Text Files\\Car.txt"))
                                .useDelimiter(", \\s*")) {
      
                // checking end of file
                while (sc.hasNext()) {
                    String str = sc.next();
            
                    // adding each string to arraylist
                    listOfStrings.add(str);
                }
                for(int i = 7; i<listOfStrings.size(); i+=7) { 
                    if(!listOfStrings.get(i-5).equals(plate)){
                        String[] array = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-5), listOfStrings.get(i-4), listOfStrings.get(i-3), listOfStrings.get(i-2), listOfStrings.get(i-1),"\n"};
                        listOfStrings.remove(i);
                        for(int j=0;j < array.length; j++){
                            pw.write(array[j]+", ");
                        }
                    }
                          
                }
                sc.close();
                pw.flush();
                pw.close();
                try {
                    String filePath = "src\\Text Files\\Car.txt";
                    File fileToDelete = new File(filePath);
                    fileToDelete.delete();
                    File dumpFile = new File(filePath);
                    newFile.renameTo(dumpFile);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }     
                
        else if(e.getSource()==btnCancelAC){
            adminHome.setVisible(true);
            pnlProfile.setVisible(false);
            pnlAdd.setVisible(false);
            pnlVMP.setVisible(false);
            pnlViewAllCar.setVisible(false);
            pnlBill.setVisible(false);
            pnlR.setVisible(false);
            pnlAC.setVisible(false);
            pnlEP.setVisible(false);
            pnlCP.setVisible(false);
            pnlBR.setVisible(false);
            pnlB.setVisible(false);
            pnlHour.setVisible(false);
            pnlDate.setVisible(false);
            pnlRCA.setVisible(false);
        }else if(e.getSource()==btnClearAC){
            txtCarBrandAC.setText("");
            txtCarModelAC.setText("");
            txtCarYearAC.setText("");
            txtCarPlateNumAC.setText("");
            txtCarSeatAC.setText("");
            txtCarPriceAC.setText("");
        } else if(e.getSource() == btnRegisterR) {
            // arraylist to store strings
            List<String> listOfStrings
            = new ArrayList<String>();
   
            listOfStrings = functions.fromUserDetails(listOfStrings);
            if (listOfStrings.contains(txtUsernameR.getText())) {
                JOptionPane.showMessageDialog(null, "Username has been taken! Try another!", "Username Taken!!!", JOptionPane.WARNING_MESSAGE);
            } else {
                String[] array = {txtUsernameR.getText(), txtPasswordR.getText(), txtEmailR.getText(), txtPhoneNumR.getText(), "\n"};
                functions.toUserDetails(array);
            } 
        } else if(e.getSource() == txtUsernameR) {
            txtUsernameR.setText("");
        } else if(e.getSource() == txtPasswordR) {
            txtPasswordR.setText("");
        } else if(e.getSource() == txtEmailR) {
            txtEmailR.setText("");
        } else if(e.getSource() == txtPhoneNumR) {
            txtPhoneNumR.setText("");
        } else if(e.getSource() == txtEndHourB) {
            txtEndHourB.setText("");
        } else if(e.getSource() == txtStartHourB) {
            txtStartHourB.setText("");
        } else if(e.getSource() == btnProceedBill) {
            int rowIndex = tableA.getSelectedRow();
            String[] selected = {tableA.getValueAt(rowIndex, 0).toString(), tableA.getValueAt(rowIndex, 1).toString(), tableA.getValueAt(rowIndex, 2).toString(), tableA.getValueAt(rowIndex, 3).toString(), tableA.getValueAt(rowIndex, 4).toString()};
            List<String> listOfStrings = new ArrayList<String>();
            listOfStrings = functions.fromCar(listOfStrings);
            //Check if Car Brand in list
            if (listOfStrings.contains(selected[0])) {
                int ind = listOfStrings.indexOf(selected[0]) + 1;
                //Check if Car Model in list
                if (listOfStrings.get(ind).equals(selected[1])) {
                    //Check if Car Year in list
                    if (listOfStrings.get(ind+2).equals(selected[2])) {
                        //Check if Car Seats in list
                        if (listOfStrings.get(ind+3).equals(selected[3])) {
                            //Check if Car price in list
                            if (listOfStrings.get(ind+4).equals(selected[4])) {
                                //Check if Car is available
                                if (listOfStrings.get(ind+5).equals("Available")) {
                                    for (Enumeration<AbstractButton> buttons = btnGroupBill.getElements(); buttons.hasMoreElements();) {
                                        AbstractButton button = buttons.nextElement();
                                        if (button.isSelected()) {
                                            JOptionPane.showMessageDialog(null, "Press the 'Continue using the sponsored version' button to speed up the process", "Information", JOptionPane.INFORMATION_MESSAGE);
                                            String choice = button.getText();
                                            listOfStrings.set(ind+5, "Not Available");
                                            //Adding booking entry to booking file
                                            String[] array1 = functions.returnArray();
                                            functions.toBooking(array1);

                                            // convert any arraylist to array
                                            for(int k = 7; k < listOfStrings.size(); k+=8){
                                                listOfStrings.set(k, "\n");
                                            }
                                            String[] array = listOfStrings.toArray(new String[0]);
                                            functions.forCarBooking(array);

                                            //for report   
                                            array1[2] = array1[3];//end time
                                            array1[3] = array1[4];//end date
                                            array1[4] = choice;//payment method
                                            array1[5] = Double.toString(functions.returnPrice());
                                            array1[6] = "Uncompleted";                       
                                            functions.forReport(array1);

                                            //Print Receipt
                                            //Need to do JOptionPane validation
                                            int ans = JOptionPane.showConfirmDialog(null, "Would you like to save your receipt?", "Receipt", JOptionPane.YES_NO_OPTION);
                                            if(ans==0) {
                                                double finalPrice = functions.returnPrice();
                                                new Receipt(txtcarInfoBill.getText(), finalPrice, choice);
                                                pnlViewAllCar.setVisible(true);
                                                pnlB.setVisible(false);
                                                pnlBill.setVisible(false);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Alright! Have a nice day!", "Good Bye!", JOptionPane.PLAIN_MESSAGE);
                                                pnlViewAllCar.setVisible(true);
                                                pnlB.setVisible(false);
                                                pnlBill.setVisible(false);
                                            }
                                        } else if(!button.isSelected()) {
                                            JOptionPane.showMessageDialog(null, "Please Select a Payment Method", "Payment Method", JOptionPane.WARNING_MESSAGE);
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Car Unavailable...Bringing you back...", "Car Unavailable", JOptionPane.INFORMATION_MESSAGE);
                                    pnlViewAllCar.setVisible(true);
                                    pnlB.setVisible(false);
                                    pnlBill.setVisible(false);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Car Unavailable...Bringing you back...", "Car Unavailable", JOptionPane.INFORMATION_MESSAGE);
                                pnlViewAllCar.setVisible(true);
                                pnlB.setVisible(false);
                                pnlBill.setVisible(false);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Car Unavailable...Bringing you back...", "Car Unavailable", JOptionPane.INFORMATION_MESSAGE);
                            pnlViewAllCar.setVisible(true);
                            pnlB.setVisible(false);
                            pnlBill.setVisible(false);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Car Unavailable...Bringing you back...", "Car Unavailable", JOptionPane.INFORMATION_MESSAGE);
                        pnlViewAllCar.setVisible(true);
                        pnlB.setVisible(false);
                        pnlBill.setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Car Unavailable...Bringing you back...", "Car Unavailable", JOptionPane.INFORMATION_MESSAGE);
                    pnlViewAllCar.setVisible(true);
                    pnlB.setVisible(false);
                    pnlBill.setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Car Unavailable...Bringing you back...", "Car Unavailable", JOptionPane.INFORMATION_MESSAGE);
                pnlViewAllCar.setVisible(true);
                pnlB.setVisible(false);
                pnlBill.setVisible(false);
            }
        } else if(e.getSource() == btnCancelBill) {
            pnlB.setVisible(true);
            pnlBill.setVisible(false); 
        } else if(e.getSource() == btnBookB) {
            String model = txtCarModelB.getText();
            String start = "";
            String end = "";
            String today = java.time.LocalDate.now().toString();    

            if(pnlHour.isVisible()) {
                start = txtStartHourB.getText();
                end = txtEndHourB.getText();
                String[] array = {lblUsernameEP.getText(), model, start, end, today, today, "Pending", "\n"};
                functions.storeArray(array);
                txtrentalDurationBill.setText(start + " to " + end + ", " + today); 
                txtcarInfoBill.setText(model); 
                double priceHr = Double.parseDouble(txtCarPrice.getText());
                int startTime = functions.toHours(start);
                int endTime = functions.toHours(end);
                String finalPrice = Double.toString(priceHr * (endTime-startTime));
                functions.storePrice(finalPrice);
                txtpriceBill.setText("RM " + finalPrice);
            } else if(pnlDate.isVisible()) {
                start = txtStartDateB.getText();
                end = txtEndDateB.getText();
                String[] array = {lblUsernameEP.getText(), model, "N/A", "N/A", start, end, "Pending", "\n"};
                functions.storeArray(array);
                
                txtrentalDurationBill.setText(start + " to " + end);
                txtcarInfoBill.setText(model); 
                double priceHr = Double.parseDouble(txtCarPrice.getText());
                int numOfDays = functions.fromDate(start, end);

                if (numOfDays == 0) {
                    numOfDays = 1;
                    String finalPrice = Double.toString(priceHr * (24 * numOfDays));
                    functions.storePrice(finalPrice);
                    txtpriceBill.setText("RM " + finalPrice);
                } else {
                    String finalPrice = Double.toString(priceHr * (24 * numOfDays));
                    functions.storePrice(finalPrice);
                    txtpriceBill.setText("RM " + finalPrice);
                }
                
            }
            pnlB.setVisible(false);
            pnlBill.setVisible(true);
            
        } else if(e.getSource() == btnDefaultEP) {
            lblUsernameEP.setText(lblUsername.getText());
            lblEmailEP.setText(lblEmail.getText());
            lblPhoneNumEP.setText(lblPhoneNum.getText());
        } else if(e.getSource() == btnChangeEP) {
            // arraylist to store strings
            List<String> listOfStrings
            = new ArrayList<String>();

            listOfStrings = functions.fromUserDetails(listOfStrings);

            if (listOfStrings.contains(lblUsernameEP.getText())) {
                JOptionPane.showMessageDialog(null, "Username chosen exists. Please chosse another", "Username Issues", JOptionPane.WARNING_MESSAGE);
                lblUsernameEP.setText("");
            } else {
                int index = listOfStrings.indexOf(lblUsername.getText());
                listOfStrings.set(index, lblUsernameEP.getText());
                listOfStrings.set(index+2, lblEmailEP.getText());
                listOfStrings.set(index+3, lblPhoneNumEP.getText());

                for(int k = 5; k < listOfStrings.size(); k+=5){
                    listOfStrings.set(k, "\n");
                }
                // convert any arraylist to array
                String[] array = listOfStrings.toArray(new String[0]);

                functions.toUserDetailsRewrite(array);
                JOptionPane.showMessageDialog(null, "Profile Details have been changed!", "Profile Change Successful", JOptionPane.INFORMATION_MESSAGE);
                pnlEP.setVisible(false);
                pnlProfile.setVisible(true);
            }
            
        } else if(e.getSource() == btnChangeCP) {

            if(passwordCP.getText().equals(confirmPwdCP.getText())) {
                // arraylist to store strings
                List<String> listOfStrings
                = new ArrayList<String>();
    
                listOfStrings = functions.fromUserDetails(listOfStrings);

                int index = listOfStrings.indexOf(lblUsername.getText());
                listOfStrings.set(index+1, passwordCP.getText());

                for(int k = 5; k < listOfStrings.size(); k+=5){
                    listOfStrings.set(k, "\n");
                }
                // convert any arraylist to array
                String[] array = listOfStrings.toArray(new String[0]);

                functions.toUserDetailsRewrite(array);
                JOptionPane.showMessageDialog(null, "Password has been changed!", "Password Change Successful", JOptionPane.INFORMATION_MESSAGE);
                pnlCP.setVisible(false);
                pnlProfile.setVisible(true);
            }else if(!passwordCP.getText().equals(confirmPwdCP.getText())) {
                JOptionPane.showMessageDialog(null, "Passwords must be identical. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else if(e.getSource() == passwordCP) {
            passwordCP.setText("");
        } else if(e.getSource() == confirmPwdCP) {
            confirmPwdCP.setText("");
        } else if(e.getSource() == btnCancelCP) {
            pnlCP.setVisible(false);
            pnlEP.setVisible(true);
        } else if(e.getSource() == btnCancelBR){
            txtUserNameBR.setText("");
            txtCarInfoBR.setText("");
            txtStartTimeBR.setText("");
            txtEndTimeBR.setText("");
            txtRentDateBR.setText("");
            txtReturnDateBR.setText("");
        } else if(e.getSource()== btnAcceptBR){
            String username = txtUserNameBR.getText();
            String CarInfo = txtCarInfoBR.getText();
            String StartTime = txtStartTimeBR.getText();
            String EndTime = txtEndTimeBR.getText();
            String RentDate = txtRentDateBR.getText();
            String ReturnDate = txtReturnDateBR.getText();
            //username.equals(sc.next())&&(CarInfo.equals(sc.next()))&&(StartTime.equals(sc.next()))&&(EndTime.equals(sc.next()))&&(RentDate.equals(sc.next()))&&(ReturnDate.equals(sc.next()))&&(sc.next().equals("Pending"))
    
            if(username.trim().equals("") || CarInfo.trim().equals("") || StartTime.trim().equals("")|| EndTime.trim().equals("") || RentDate.trim().equals("")|| ReturnDate.trim().equals("")){
                JOptionPane.showMessageDialog(null, "Blank entry detected! please select a row. ", "ERROR", JOptionPane.WARNING_MESSAGE);   
            }else{
                List<String> listOfStrings
                = new ArrayList<String>();

                String tempFile = "temp.txt";
                File newFile = new File(tempFile);
                
                try (// load content of file based on specific delimiter

                    FileWriter fw = new FileWriter(tempFile,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw); 

                    Scanner sc = new Scanner(new FileReader("src\\Text Files\\Booking.txt"))
                                    .useDelimiter(", \\s*")) {
          
                    // checking end of file
                    while (sc.hasNext()) {
                        String str = sc.next();
                
                        // adding each string to arraylist
                        listOfStrings.add(str);
                    }
                    for(int i = 7; i<listOfStrings.size(); i+=7) {  //forced to do this way to get distinct data, cus we dont hv unique id for rental.
                        if((listOfStrings.get(i-7).equals(username))&&
                        (listOfStrings.get(i-6).equals(CarInfo))&&
                        (listOfStrings.get(i-5).equals(StartTime))&&
                        (listOfStrings.get(i-4).equals(EndTime))&&
                        (listOfStrings.get(i-3).equals(RentDate))&&
                        (listOfStrings.get(i-2).equals(ReturnDate))&&
                        (listOfStrings.get(i-1).equals("Pending")) ){
                            String[] array = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-5), listOfStrings.get(i-4), listOfStrings.get(i-3), listOfStrings.get(i-2), "Accepted","\n"};
                            listOfStrings.remove(i);
                            for(int j=0;j < array.length; j++){
                                pw.write(array[j]+", ");
                            }
                        //update BR table
                        DefaultTableModel updatedBRtable = (DefaultTableModel)tableBR.getModel();
                        for(int k = 0;k<tableBR.getModel().getRowCount();k++)
                            {
                                if((tableBR.getModel().getValueAt(k,0).toString().equals(username))&&
                                (tableBR.getModel().getValueAt(k,1).toString().equals(CarInfo))&&
                                (tableBR.getModel().getValueAt(k,2).toString().equals(StartTime))&&
                                (tableBR.getModel().getValueAt(k,3).toString().equals(EndTime))&&
                                (tableBR.getModel().getValueAt(k,4).toString().equals(RentDate))&&
                                (tableBR.getModel().getValueAt(k,5).toString().equals(ReturnDate))){
                                    updatedBRtable.removeRow(k);
                                }
                            }
                        }
                        else{
                            String[] array = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-5), listOfStrings.get(i-4), listOfStrings.get(i-3), listOfStrings.get(i-2), listOfStrings.get(i-1),"\n"};
                            listOfStrings.remove(i);
                            for(int j=0;j < array.length; j++){
                                pw.write(array[j]+", ");
                            }
                            }
                    }
                    sc.close();
                    pw.flush();
                    pw.close();
                    try {
                        String filePath = "src\\Text Files\\Booking.txt";
                        File fileToDelete = new File(filePath);
                        fileToDelete.delete();
                        File dumpFile = new File(filePath);
                        newFile.renameTo(dumpFile);
                        JOptionPane.showMessageDialog(null, "The booking accepted!", "Booking Successfull", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }

                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                }
                        
            
        
        }else if(e.getSource()==btnRefreshRCA){
            //to ensure that the TODAY's returning data updated in table
            JOptionPane.showMessageDialog(null, "Done refresh", "Refreshing", JOptionPane.INFORMATION_MESSAGE);
            List<String> listOfStrings
            = new ArrayList<String>();
    
            List<String> list = functions.fromBooking(listOfStrings);
            DefaultTableModel modelORCA1 = (DefaultTableModel)onRentRCA.getModel();
            modelORCA1.setRowCount(0);
            functions.toOnRentTable(list, modelORCA1);

        }else if(e.getSource()==btnDeclineBR){
            String username = txtUserNameBR.getText();
            String CarInfo = txtCarInfoBR.getText();
            String StartTime = txtStartTimeBR.getText();
            String EndTime = txtEndTimeBR.getText();
            String RentDate = txtRentDateBR.getText();
            String ReturnDate = txtReturnDateBR.getText();
            //username.equals(sc.next())&&(CarInfo.equals(sc.next()))&&(StartTime.equals(sc.next()))&&(EndTime.equals(sc.next()))&&(RentDate.equals(sc.next()))&&(ReturnDate.equals(sc.next()))&&(sc.next().equals("Pending"))
    
            if(username.trim().equals("") || CarInfo.trim().equals("") || StartTime.trim().equals("")|| EndTime.trim().equals("") || RentDate.trim().equals("")|| ReturnDate.trim().equals("")){
                JOptionPane.showMessageDialog(null, "Blank entry detected! please select a row. ", "ERROR", JOptionPane.WARNING_MESSAGE);   
            }else{
                List<String> listOfStrings
                = new ArrayList<String>();

                String tempFile = "temp.txt";
                File newFile = new File(tempFile);
                
                try (// load content of file based on specific delimiter

                    FileWriter fw = new FileWriter(tempFile,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw); 

                    Scanner sc = new Scanner(new FileReader("src\\Text Files\\Booking.txt"))
                                    .useDelimiter(", \\s*")) {
          
                    // checking end of file
                    while (sc.hasNext()) {
                        String str = sc.next();
                
                        // adding each string to arraylist
                        listOfStrings.add(str);
                    }
                    for(int i = 7; i<listOfStrings.size(); i+=7) {  //forced to do this way to get distinct data, cus we dont hv unique id for rental.
                        if((listOfStrings.get(i-7).equals(username))&&
                        (listOfStrings.get(i-6).equals(CarInfo))&&
                        (listOfStrings.get(i-5).equals(StartTime))&&
                        (listOfStrings.get(i-4).equals(EndTime))&&
                        (listOfStrings.get(i-3).equals(RentDate))&&
                        (listOfStrings.get(i-2).equals(ReturnDate))&&
                        (listOfStrings.get(i-1).equals("Pending")) ){
                            String[] array = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-5), listOfStrings.get(i-4), listOfStrings.get(i-3), listOfStrings.get(i-2), "Declined","\n"};
                            listOfStrings.remove(i);
                            for(int j=0;j < array.length; j++){
                                pw.write(array[j]+", ");
                            }
                        //update BR table
                        DefaultTableModel updatedBRtable = (DefaultTableModel)tableBR.getModel();
                        for(int k = 0;k<tableBR.getModel().getRowCount();k++)
                            {
                                if((tableBR.getModel().getValueAt(k,0).toString().equals(username))&&
                                (tableBR.getModel().getValueAt(k,1).toString().equals(CarInfo))&&
                                (tableBR.getModel().getValueAt(k,2).toString().equals(StartTime))&&
                                (tableBR.getModel().getValueAt(k,3).toString().equals(EndTime))&&
                                (tableBR.getModel().getValueAt(k,4).toString().equals(RentDate))&&
                                (tableBR.getModel().getValueAt(k,5).toString().equals(ReturnDate))){
                                    updatedBRtable.removeRow(k);
                                }
                            }
                        }
                        else{
                            String[] array = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-5), listOfStrings.get(i-4), listOfStrings.get(i-3), listOfStrings.get(i-2), listOfStrings.get(i-1),"\n"};
                            listOfStrings.remove(i);
                            for(int j=0;j < array.length; j++){
                                pw.write(array[j]+", ");
                            }
                            }
                    }
                    sc.close();
                    pw.flush();
                    pw.close();
                    try {
                        String filePath = "src\\Text Files\\Booking.txt";
                        File fileToDelete = new File(filePath);
                        fileToDelete.delete();
                        File dumpFile = new File(filePath);
                        newFile.renameTo(dumpFile);
                        JOptionPane.showMessageDialog(null, "The booking declined!", "Booking Unsuccessfull", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }

                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                }
        }else if(e.getSource()==btnProceedRCA){
            String Username = txtUsernameRCA.getText();
            String Model = txtCarModelRCA.getText();
            String ReturnDate = txtDateRCA.getText();
    
            if(Username.trim().equals("") || Model.trim().equals("") || ReturnDate.trim().equals("")){
                JOptionPane.showMessageDialog(null, "Blank entry detected! please select a row. ", "ERROR", JOptionPane.WARNING_MESSAGE);   
            }else{
                List<String> listOfStrings
                = new ArrayList<String>();

                String tempFile = "temp.txt";
                File newFile = new File(tempFile);
                
                try (// load content of file based on specific delimiter

                    FileWriter fw = new FileWriter(tempFile,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw); 

                    Scanner sc = new Scanner(new FileReader("src\\Text Files\\Booking.txt"))
                                    .useDelimiter(", \\s*")) {
          
                    // checking end of file
                    while (sc.hasNext()) {
                        String str = sc.next();
                
                        // adding each string to arraylist
                        listOfStrings.add(str);
                    }
                    for(int i = 7; i<listOfStrings.size(); i+=7) {  //forced to do this way to get distinct data, cus we dont hv unique id for rental.
                        if((listOfStrings.get(i-7).equals(Username))&&
                        (listOfStrings.get(i-6).equals(Model))&&
                        (listOfStrings.get(i-2).equals(ReturnDate))&&
                        (listOfStrings.get(i-1).equals("Returning")) ){
                            String[] array = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-5), listOfStrings.get(i-4), listOfStrings.get(i-3), listOfStrings.get(i-2), "Returned","\n"};
                            listOfStrings.remove(i);
                            for(int j=0;j < array.length; j++){
                                pw.write(array[j]+", ");
                            }
                        //update returned table
                        String[] row = {Username,Model,ReturnDate,"Returned"};
                        DefaultTableModel updatedReturned = (DefaultTableModel)returnedRCA.getModel();
                        updatedReturned.addRow(row);
                        //update on rent table
                        DefaultTableModel updatedOnrent = (DefaultTableModel)onRentRCA.getModel();
                        for(int k = 0;k<onRentRCA.getModel().getRowCount();k++)
                            {
                                if((onRentRCA.getModel().getValueAt(k,0).toString().equals(Username))&&
                                (onRentRCA.getModel().getValueAt(k,1).toString().equals(Model))&&
                                (onRentRCA.getModel().getValueAt(k,2).toString().equals(ReturnDate))){
                                    updatedOnrent.removeRow(k);
                                }
                            }
                        }
                        else{
                            String[] array = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-5), listOfStrings.get(i-4), listOfStrings.get(i-3), listOfStrings.get(i-2), listOfStrings.get(i-1),"\n"};
                            listOfStrings.remove(i);
                            for(int j=0;j < array.length; j++){
                                pw.write(array[j]+", ");
                            }
                            }                           
                    }
                    sc.close();
                    pw.flush();
                    pw.close();
                    try {
                        String filePath = "src\\Text Files\\Booking.txt";
                        File fileToDelete = new File(filePath);
                        fileToDelete.delete();
                        File dumpFile = new File(filePath);
                        newFile.renameTo(dumpFile);
                        JOptionPane.showMessageDialog(null, "The car returned!", "Returning Successfull", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }

                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }



                // uncompleted to completed 
                List<String> listOfStrings2
                = new ArrayList<String>();

                String tempFile2 = "temp.txt";
                File newFile2 = new File(tempFile2);

                try (// load content of file based on specific delimiter

                FileWriter fw = new FileWriter(tempFile2,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw); 

                Scanner sc = new Scanner(new FileReader("src\\Text Files\\Report.txt"))
                                .useDelimiter(", \\s*")) {
      
                // checking end of file
                while (sc.hasNext()) {
                    String str = sc.next();
            
                    // adding each string to arraylist
                    listOfStrings2.add(str);
                }
                for(int i = 7; i<listOfStrings2.size(); i+=7) {  //forced to do this way to get distinct data, cus we dont hv unique id for rental.
                    if((listOfStrings2.get(i-7).equals(Username))&&
                    (listOfStrings2.get(i-6).equals(Model))&&
                    (listOfStrings2.get(i-4).equals(ReturnDate))&&
                    (listOfStrings2.get(i-1).equals("Uncompleted")) ){
                        String[] array = {listOfStrings2.get(i-7), listOfStrings2.get(i-6), listOfStrings2.get(i-5), listOfStrings2.get(i-4), listOfStrings2.get(i-3), listOfStrings2.get(i-2), "Completed","\n"};
                        listOfStrings2.remove(i);
                        for(int j=0;j < array.length; j++){
                            pw.write(array[j]+", ");
                        }
                    }
                    else{
                        String[] array = {listOfStrings2.get(i-7), listOfStrings2.get(i-6), listOfStrings2.get(i-5), listOfStrings2.get(i-4), listOfStrings2.get(i-3), listOfStrings2.get(i-2), listOfStrings2.get(i-1),"\n"};
                        listOfStrings2.remove(i);
                        for(int j=0;j < array.length; j++){
                            pw.write(array[j]+", ");
                        }
                        }                           
                }
                sc.close();
                pw.flush();
                pw.close();
                try {
                    String filePath = "src\\Text Files\\Report.txt";
                    File fileToDelete = new File(filePath);
                    fileToDelete.delete();
                    File dumpFile = new File(filePath);
                    newFile2.renameTo(dumpFile);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }

            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }


                }
        }else if(e.getSource()==btnSearchMR){
            List<String> listOfStrings
            = new ArrayList<String>();
            List<String> list = functions.fromReport(listOfStrings);
            //BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel modelMR1 = (DefaultTableModel)tableMR.getModel();

            if(completed.isSelected()&&(uncompleted.isSelected())){
                modelMR1.setRowCount(0);
                functions.toViewMonthlyReportTable(list, modelMR1,"Completed");
                listOfStrings.clear();
                List<String> list2 = functions.fromReport(listOfStrings);
                functions.toViewMonthlyReportTable(list2, modelMR1,"Uncompleted");
                double income = 0;
                for(int k = 0;k<tableMR.getModel().getRowCount();k++){
                    income = income + Double.parseDouble(tableMR.getModel().getValueAt(k,5).toString());
                }
                txtTotalIncome.setText("RM "+income);
            }else if(completed.isSelected()&&(!uncompleted.isSelected())){
                modelMR1.setRowCount(0);
                functions.toViewMonthlyReportTable(list, modelMR1,"Completed");
                double income = 0;
                for(int k = 0;k<tableMR.getModel().getRowCount();k++){
                    income = income + Double.parseDouble(tableMR.getModel().getValueAt(k,5).toString());
                }
                txtTotalIncome.setText("RM "+income);
            }else if(!completed.isSelected()&&(uncompleted.isSelected())){
                modelMR1.setRowCount(0);
                functions.toViewMonthlyReportTable(list, modelMR1,"Uncompleted");
                double income = 0;
                for(int k = 0;k<tableMR.getModel().getRowCount();k++){
                    income = income + Double.parseDouble(tableMR.getModel().getValueAt(k,5).toString());
                }
                txtTotalIncome.setText("RM "+income);
            }
            else {
                JOptionPane.showMessageDialog(null, "Please choose one report to be displayed", "BLANK INPUT", JOptionPane.WARNING_MESSAGE);
            }
        }else if(e.getSource()==btnClearMR){
            DefaultTableModel modelMR1 = (DefaultTableModel)tableMR.getModel();
            modelMR1.setRowCount(0);
            completed.setSelected(false);
            uncompleted.setSelected(false);
            txtTotalIncome.setText("");
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
