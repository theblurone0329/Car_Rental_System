import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    private Border border = new LineBorder(new Color(225,223,186), 1, true);

    ViewBookingRequest() {

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
        btnCancelBR.setBorder(border);

        btnDeclineBR.setText("Decline");
        btnDeclineBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
        btnDeclineBR.setForeground(new Color(225,223,186));
        btnDeclineBR.setBackground(new Color(27, 28, 30));
        btnDeclineBR.setLocation(500, 285);
        btnDeclineBR.setSize(80, 26);
        btnDeclineBR.setBorder(border);

        btnAcceptBR.setText("Accept");
        btnAcceptBR.setFont(new Font("TW Cen MT", Font.PLAIN, 16));
        btnAcceptBR.setForeground(new Color(225,223,186));
        btnAcceptBR.setBackground(new Color(27, 28, 30));
        btnAcceptBR.setLocation(500, 320);
        btnAcceptBR.setSize(80, 26);
        btnAcceptBR.setBorder(border);


        //Table

        // String[] columnsReturn = {"Return ID", "Username", "Status", "Return Date"};
        // String[][] rowsReturn = {{"R01", "Hamid_Karim_123", "Returned", "04-10-2022"}, 
        //                     {"R02", "Adrian_Fu", "Not Returned", "N/A"},
        //                     {"R02", "Adrian_Fu", "Not Returned", "N/A"},
        //                     {"R02", "Adrian_Fu", "Not Returned", "N/A"}, 
        //                     {"R02", "Adrian_Fu", "Not Returned", "N/A"}};

        // tableBR = new JTable(rowsReturn, columnsReturn){
        //     public boolean isCellEditable(int rows, int columns) {
        //         return false;
        //     }
        // };
        Object columns[] = {"Username", "Model", "Start Date", "Return Date", "Status"};
        DefaultTableModel modelBR = new DefaultTableModel(columns,0);
        tableBR = new JTable();
        tableBR.setModel(modelBR);

        List<String> listOfStrings
        = new ArrayList<String>();

        try (// load content of file based on specific delimiter
        Scanner sc = new Scanner(new FileReader("src\\Text Files\\Booking.txt"))
                        .useDelimiter(", \\s*")) {
            String str;
  
            // checking end of file
            while (sc.hasNext()) {
                str = sc.next();
            
                // adding each string to arraylist
                listOfStrings.add(str);
            }
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        // convert any arraylist to array
        String[] array
            = listOfStrings.toArray(new String[0]);

            modelBR = (DefaultTableModel)tableBR.getModel();
        for(int i = 0; i < array.length; i++) {
            if("Pending".equals(array[i+6])) {
                String line = array[i]+"\t"+array[i+1]+"\t"+array[i+2]+"\t"+array[i+3]+"\t"+array[i+6];
                String[] dataRow = line.split("\t");
                modelBR.addRow(dataRow);
            } 

        tableBR.setPreferredScrollableViewportSize(new Dimension(450, 151));
        tableBR.setFillsViewportHeight(true);
        tableBR.setBackground(new Color(27, 28, 30));
        tableBR.setForeground(new Color(225,223,186));
        tableBR.setGridColor(new Color(225,223,186));
        tableBR.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        tableBR.setRowHeight(30);
        
        paneBR = new JScrollPane(tableBR, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        tableBRPnl.setSize(450, 145);
        tableBRPnl.setLocation(130, 60);
        tableBRPnl.setBorder(BorderFactory.createLineBorder(new Color(225,223,186)));
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
        this.add(txtUserIDBR);
        this.add(txtUserNameBR);
        this.add(txtPhoneNumBR);
        this.add(txtCarInfoBR);
        this.add(txtRentDateBR);
        this.add(txtReturnDateBR);
        this.add(btnCancelBR);
        this.add(btnAcceptBR);
        this.add(btnDeclineBR);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==btnCancelBR){
            txtUserNameBR.setText("");
            txtCarInfoBR.setText("");
            // txtStartTimeBR.setText("");
            // txtEndTimeBR.setText("");
            txtRentDateBR.setText("");
            txtReturnDateBR.setText("");
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
