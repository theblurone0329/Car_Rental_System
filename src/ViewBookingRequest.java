import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

public class ViewBookingRequest extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new ViewBookingRequest();
    }

    JLabel lblSearchBR = new JLabel();
    JTextArea txtSearchBR = new JTextArea();
    JSeparator separator1BR = new JSeparator();
    JLabel lblUserIDBR = new JLabel();
    JLabel lblUserNameBR = new JLabel();
    JLabel lblPhoneNumBR = new JLabel();
    JLabel lblCarInfoBR = new JLabel();
    JLabel lblRentDateBR = new JLabel();
    JLabel lblReturnDateBR = new JLabel();
    JLabel txtUserIDBR = new JLabel();
    JLabel txtUserNameBR = new JLabel();
    JLabel txtPhoneNumBR = new JLabel();
    JLabel txtCarInfoBR = new JLabel();
    JLabel txtRentDateBR = new JLabel();
    JLabel txtReturnDateBR = new JLabel();
    JButton btnCancelBR = new JButton();
    JButton btnDeclineBR = new JButton();
    JButton btnAcceptBR = new JButton();
    JTable tableBR = new JTable();
    JScrollPane paneBR = new JScrollPane();
    JPanel tableBRPnl = new JPanel();

    ViewBookingRequest() {

        lblUserIDBR.setText("User ID: ");
        lblUserIDBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
        lblUserIDBR.setForeground(new Color(225,223,186));
        lblUserIDBR.setBackground(new Color(27, 28, 30));
        lblUserIDBR.setLocation(60, 215);
        lblUserIDBR.setSize(150, 26);

        lblUserNameBR.setText("Username: ");
        lblUserNameBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
        lblUserNameBR.setForeground(new Color(225,223,186));
        lblUserNameBR.setBackground(new Color(27, 28, 30));
        lblUserNameBR.setLocation(60, 242);
        lblUserNameBR.setSize(150, 26);

        lblPhoneNumBR.setText("Phone Number: ");
        lblPhoneNumBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
        lblPhoneNumBR.setForeground(new Color(225,223,186));
        lblPhoneNumBR.setBackground(new Color(27, 28, 30));
        lblPhoneNumBR.setLocation(60, 269);
        lblPhoneNumBR.setSize(150, 26);

        lblCarInfoBR.setText("Car Information: ");
        lblCarInfoBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
        lblCarInfoBR.setForeground(new Color(225,223,186));
        lblCarInfoBR.setBackground(new Color(27, 28, 30));
        lblCarInfoBR.setLocation(60, 296);
        lblCarInfoBR.setSize(150, 26);

        lblRentDateBR.setText("Rental Date: ");
        lblRentDateBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
        lblRentDateBR.setForeground(new Color(225,223,186));
        lblRentDateBR.setBackground(new Color(27, 28, 30));
        lblRentDateBR.setLocation(60, 323);
        lblRentDateBR.setSize(150, 26);

        lblReturnDateBR.setText("Return Date: ");
        lblReturnDateBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
        lblReturnDateBR.setForeground(new Color(225,223,186));
        lblReturnDateBR.setBackground(new Color(27, 28, 30));
        lblReturnDateBR.setLocation(60, 350);
        lblReturnDateBR.setSize(150, 26);

        btnCancelBR.setText("Cancel");

        btnDeclineBR.setText("Decline");

        btnAcceptBR.setText("Accept");

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
        ImageIcon icon = new ImageIcon("src\\Pics\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        this.add(lblSearchBR);
        this.add(txtSearchBR);
        this.add(separator1BR);
        this.add(tableBRPnl);
        this.add(lblUserIDBR);
        this.add(lblUserNameBR);
        this.add(lblPhoneNumBR);
        this.add(lblCarInfoBR);
        this.add(lblRentDateBR);
        this.add(lblReturnDateBR);
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
