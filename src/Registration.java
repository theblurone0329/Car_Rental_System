import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Registration extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new Registration();
    }

    //Declare Form Components
    JButton btnRegister = new JButton();
    JSeparator separator1 = new JSeparator();
    JSeparator separator2 = new JSeparator();
    JSeparator separator3 = new JSeparator();
    JSeparator separator4 = new JSeparator();
    JTextField txtUsername = new JTextField();
    JTextField txtPassword = new JTextField();
    JTextField txtEmail= new JTextField();
    JTextField txtPhoneNum = new JTextField();
    JLabel pageTitle = new JLabel();
    JLabel car1 = new JLabel();
    JLabel car2 = new JLabel();

    Registration() {

        ImageIcon car_2 = new ImageIcon("src\\car2.png");
        car2.setIcon(car_2);
        car2.setSize(400, 200);
        car2.setLocation(470,220);

        ImageIcon car_1 = new ImageIcon("src\\car1.png");
        car1.setIcon(car_1);
        car1.setSize(400, 200);
        car1.setLocation(-110,220);

        //Register Button
        btnRegister.setText("Register User");
        btnRegister.setFont(new Font("TW Cen MT", Font.BOLD, 18));
        btnRegister.setBorder(null);
        btnRegister.setFocusable(false);
        btnRegister.setForeground(new Color(225,223,186));
        btnRegister.setBackground(new Color(27, 28, 30));
        btnRegister.setSize(158, 44);
        btnRegister.setLocation(270, 285);
        btnRegister.addMouseListener(this);

        //Separators under each textboxes
        separator4.setForeground(new Color(225,223,186));
        separator4.setBackground(new Color(27, 28, 30));
        separator4.setSize(195, 17);
        separator4.setLocation(400, 240);

        separator3.setForeground(new Color(225,223,186));
        separator3.setBackground(new Color(27, 28, 30));
        separator3.setSize(195, 17);
        separator3.setLocation(125, 240);

        separator2.setForeground(new Color(225,223,186));
        separator2.setBackground(new Color(27, 28, 30));
        separator2.setSize(195, 17);
        separator2.setLocation(400, 130);

        separator1.setForeground(new Color(225,223,186));
        separator1.setBackground(new Color(27, 28, 30));
        separator1.setSize(195, 17);
        separator1.setLocation(125, 130);

        //Text Box for Phone Num
        txtPhoneNum.setText("Phone No.");
        txtPhoneNum.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        txtPhoneNum.setForeground(new Color(225,223,186));
        txtPhoneNum.setBackground(new Color(27, 28, 30));
        txtPhoneNum.setSize(195, 44);
        txtPhoneNum.setLocation(400, 195);
        txtPhoneNum.setBorder(null);
        txtPhoneNum.addMouseListener(this);

        //Text Box for Password
        txtPassword.setText("Password");
        txtPassword.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        txtPassword.setForeground(new Color(225,223,186));
        txtPassword.setBackground(new Color(27, 28, 30));
        txtPassword.setSize(195, 44);
        txtPassword.setLocation(400, 85);
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(this);

        //Text Box for Email
        txtEmail.setText("Email");
        txtEmail.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        txtEmail.setForeground(new Color(225,223,186));
        txtEmail.setBackground(new Color(27, 28, 30));
        txtEmail.setSize(195, 44);
        txtEmail.setLocation(125, 195);
        txtEmail.setBorder(null);
        txtEmail.addMouseListener(this);

        //Text Box for Username
        txtUsername.setText("Username");
        txtUsername.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        txtUsername.setForeground(new Color(225,223,186));
        txtUsername.setBackground(new Color(27, 28, 30));
        txtUsername.setSize(195, 44);
        txtUsername.setLocation(125, 85);
        txtUsername.setBorder(null);
        txtUsername.addMouseListener(this);

        //Text for Page Title
        pageTitle.setText("Registration");
        pageTitle.setFont(new Font("TW Cen MT", Font.PLAIN, 24));
        pageTitle.setForeground(new Color(225,223,186));
        pageTitle.setBackground(new Color(27, 28, 30));
        pageTitle.setSize(122, 27);
        pageTitle.setLocation(290, 10);

        //Form
        ImageIcon icon = new ImageIcon("src\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        //Adding Components to form
        this.add(btnRegister);
        this.add(separator4);
        this.add(separator3);
        this.add(separator2);
        this.add(separator1);
        this.add(txtPhoneNum);
        this.add(txtPassword);
        this.add(txtEmail);
        this.add(txtUsername);
        this.add(pageTitle);
        this.add(car1);
        this.add(car2);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == btnRegister) {
            System.out.println("Username: " + txtUsername.getText() + "\nPassword: " + txtPassword.getText() + 
            "\nEmail: " + txtEmail.getText() + "\nPhone No.: " + txtPhoneNum.getText());
        } else if(e.getSource() == txtUsername) {
            txtUsername.setText("");
        } else if(e.getSource() == txtPassword) {
            txtPassword.setText("");
        } else if(e.getSource() == txtEmail) {
            txtEmail.setText("");
        } else if(e.getSource() == txtPhoneNum) {
            txtPhoneNum.setText("");
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
