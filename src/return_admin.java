import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

public class return_admin extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new return_admin();
    }

    private JLabel returnID = new JLabel();
    private JLabel cusUsername = new JLabel();
    private JLabel returnStatus = new JLabel();
    private JLabel returnDate = new JLabel();
    private JLabel onRentTitle = new JLabel();
    private JLabel returnedTitle = new JLabel();
    private JTable onRent = new JTable();
    private JTable returned = new JTable(); 
    private JTextField txtReturnID = new JTextField();
    private JTextField txtCusUsername = new JTextField();
    private JTextField txtReturnStatus = new JTextField();
    private JTextField txtReturnDate = new JTextField();
    private JButton btnReset = new JButton();
    private JButton btnSearch = new JButton();
    private JSeparator separator1 = new JSeparator();
    private JSeparator separator2 = new JSeparator();
    private JSeparator separator3 = new JSeparator();
    private JSeparator separator4 = new JSeparator();
    private JScrollPane pane = new JScrollPane();
    private JPanel onRentPnl = new JPanel();
    private JPanel returnedPnl = new JPanel();
    private Border border = new LineBorder(new Color(225,223,186), 1, true);

    return_admin() {

        //Returned Table
        returnedTitle.setText("RETURNED CARS");
        returnedTitle.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        returnedTitle.setSize(200, 22);
        returnedTitle.setForeground(new Color(225,223,186));
        returnedTitle.setBackground(new Color(27, 28, 30));
        returnedTitle.setLocation(420, 198);

        String[] columnsReturn = {"Return ID", "Username", "Status", "Return Date"};
        String[][] rowsReturn = {{"R01", "Hamid_Karim_123", "Returned", "04-10-2022"}, 
                            {"R02", "Adrian_Fu", "Not Returned", "N/A"},
                            {"R02", "Adrian_Fu", "Not Returned", "N/A"},
                            {"R02", "Adrian_Fu", "Not Returned", "N/A"}, 
                            {"R02", "Adrian_Fu", "Not Returned", "N/A"}};

        returned = new JTable(rowsReturn, columnsReturn){
            public boolean isCellEditable(int rows, int columns) {
                return false;
            }
        };

        returned.setPreferredScrollableViewportSize(new Dimension(400, 151));
        returned.setFillsViewportHeight(true);
        returned.setBackground(new Color(27, 28, 30));
        returned.setForeground(new Color(225,223,186));
        returned.setGridColor(new Color(225,223,186));
        returned.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        returned.setRowHeight(30);
        
        pane = new JScrollPane(returned);

        returnedPnl.setSize(400, 155);
        returnedPnl.setLocation(280, 220);
        returnedPnl.add(pane);

        Object[] rowReturns = new Object[4];

        //On Rent Table
        onRentTitle.setText("CARS ON RENT");
        onRentTitle.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        onRentTitle.setSize(200, 22);
        onRentTitle.setForeground(new Color(225,223,186));
        onRentTitle.setBackground(new Color(27, 28, 30));
        onRentTitle.setLocation(420, 13);

        String[] columnsRent = {"Return ID", "Username", "Status", "Return Date"};
        String[][] rowsRent = {{"R01", "Hamid_Karim_123", "Returned", "04-10-2022"}, 
                            {"R02", "Adrian_Fu", "Not Returned", "N/A"},
                            {"R02", "Adrian_Fu", "Not Returned", "N/A"},
                            {"R02", "Adrian_Fu", "Not Returned", "N/A"}, 
                            {"R02", "Adrian_Fu", "Not Returned", "N/A"}};

        onRent = new JTable(rowsRent, columnsRent){
            public boolean isCellEditable(int rows, int columns) {
                return false;
            }
        };

        onRent.setPreferredScrollableViewportSize(new Dimension(400, 151));
        onRent.setFillsViewportHeight(true);
        onRent.setBackground(new Color(27, 28, 30));
        onRent.setForeground(new Color(225,223,186));
        onRent.setGridColor(new Color(225,223,186));
        onRent.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        onRent.setRowHeight(30);
        
        pane = new JScrollPane(onRent);

        onRentPnl.setSize(400, 155);
        onRentPnl.setLocation(280, 35);
        onRentPnl.add(pane);

        Object[] rowRents = new Object[4];

        //Search Button
        btnSearch.setText("Search");
        btnSearch.setSize(90, 37);
        btnSearch.setLocation(130, 320);
        btnSearch.setForeground(new Color(225,223,186));
        btnSearch.setBackground(new Color(27, 28, 30));
        btnSearch.setBorder(border);
        btnSearch.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        btnSearch.setFocusable(false);
        btnSearch.addMouseListener(this);

        //Reset Button
        btnReset.setText("Reset");
        btnReset.setSize(90, 37);
        btnReset.setLocation(30, 320);
        btnReset.setForeground(new Color(225,223,186));
        btnReset.setBackground(new Color(27, 28, 30));
        btnReset.setBorder(border);
        btnReset.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        btnReset.setFocusable(false);
        btnReset.addMouseListener(this);

        //Components for return ID
        separator1.setForeground(new Color(225,223,186));
        separator1.setBackground(new Color(27, 28, 30));
        separator1.setSize(180, 17);
        separator1.setLocation(35, 85);

        txtReturnID.setText("eg: R01");
        txtReturnID.setSize(180, 30);
        txtReturnID.setBorder(null);
        txtReturnID.setForeground(new Color(225,223,186));
        txtReturnID.setBackground(new Color(27, 28, 30));
        txtReturnID.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        txtReturnID.setLocation(35,55);

        returnID.setText("Return ID");
        returnID.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        returnID.setForeground(new Color(225,223,186));
        returnID.setBackground(new Color(27, 28, 30));
        returnID.setBorder(null);
        returnID.setSize(180, 30);
        returnID.setLocation(15, 25);

        //Components for Customer Username
        separator2.setForeground(new Color(225,223,186));
        separator2.setBackground(new Color(27, 28, 30));
        separator2.setSize(180, 17);
        separator2.setLocation(35, 155);

        txtCusUsername.setText("eg: Hamid_Karim_123");
        txtCusUsername.setSize(180, 30);
        txtCusUsername.setBorder(null);
        txtCusUsername.setForeground(new Color(225,223,186));
        txtCusUsername.setBackground(new Color(27, 28, 30));
        txtCusUsername.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        txtCusUsername.setLocation(35,125);

        cusUsername.setText("Customer Username");
        cusUsername.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        cusUsername.setForeground(new Color(225,223,186));
        cusUsername.setBackground(new Color(27, 28, 30));
        cusUsername.setBorder(null);
        cusUsername.setSize(180, 30);
        cusUsername.setLocation(15, 95);

        //Components for Return Status
        separator3.setForeground(new Color(225,223,186));
        separator3.setBackground(new Color(27, 28, 30));
        separator3.setSize(180, 17);
        separator3.setLocation(35, 225);

        txtReturnStatus.setText("eg: Returned / Not Returned");
        txtReturnStatus.setSize(180, 30);
        txtReturnStatus.setBorder(null);
        txtReturnStatus.setForeground(new Color(225,223,186));
        txtReturnStatus.setBackground(new Color(27, 28, 30));
        txtReturnStatus.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        txtReturnStatus.setLocation(35,195);

        returnStatus.setText("Return Status");
        returnStatus.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        returnStatus.setForeground(new Color(225,223,186));
        returnStatus.setBackground(new Color(27, 28, 30));
        returnStatus.setBorder(null);
        returnStatus.setSize(180, 30);
        returnStatus.setLocation(15, 165);

        //Components for Return Date
        separator4.setForeground(new Color(225,223,186));
        separator4.setBackground(new Color(27, 28, 30));
        separator4.setSize(180, 17);
        separator4.setLocation(35, 295);

        txtReturnDate.setText("eg: 04-10-2022");
        txtReturnDate.setSize(180, 30);
        txtReturnDate.setBorder(null);
        txtReturnDate.setForeground(new Color(225,223,186));
        txtReturnDate.setBackground(new Color(27, 28, 30));
        txtReturnDate.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        txtReturnDate.setLocation(35,265);

        returnDate.setText("Return Date");
        returnDate.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        returnDate.setForeground(new Color(225,223,186));
        returnDate.setBackground(new Color(27, 28, 30));
        returnDate.setBorder(null);
        returnDate.setSize(180, 30);
        returnDate.setLocation(15, 235);
        
        //Frame
        ImageIcon icon = new ImageIcon("src\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);
        
        //Adding Components to Frame
        this.add(returnID);
        this.add(cusUsername);
        this.add(returnStatus);
        this.add(returnDate);
        this.add(txtReturnID);
        this.add(txtCusUsername);
        this.add(txtReturnDate);
        this.add(txtReturnStatus);
        this.add(separator1);
        this.add(separator2);
        this.add(separator3);
        this.add(separator4);
        this.add(btnReset);
        this.add(btnSearch);
        this.add(onRentPnl);
        this.add(returnedPnl);
        this.add(returnedTitle);
        this.add(onRentTitle);
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
