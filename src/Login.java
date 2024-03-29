import java.awt.event.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Login extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new Login();
    }

    //Declare Frame components
    JFrame frame = new JFrame("RentiZen");
    JPanel pnl1 = new JPanel();
    JPanel pnl2 = new JPanel();
    JLabel picLogo = new JLabel();
    JLabel picUsername = new JLabel();
    JLabel picPassword = new JLabel();
    JLabel btnLogin = new JLabel();
    JTextField txtUsername = new JTextField("Username");
    JPasswordField txtPassword = new JPasswordField();
    JSeparator separator1 = new JSeparator();
    JSeparator separator2 = new JSeparator();
    JButton btnLogin1 = new JButton();

    Login() {

        //Login Button
        btnLogin1.setText("Login");
        btnLogin1.setForeground(new Color(27, 28, 30));
        btnLogin1.setBackground(new Color(127,126,144));
        btnLogin1.setSize(52, 29);
        btnLogin1.setHorizontalTextPosition(JLabel.CENTER);
        btnLogin1.setLocation(140, 210);
        btnLogin1.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnLogin1.addMouseListener(this);
        btnLogin1.setBorder(null);
        btnLogin1.setFocusable(false);

        //Line below Password txt box
        separator2.setForeground(new Color(27, 28, 30));
        separator2.setBackground(new Color(127,126,144));
        separator2.setSize(155, 15);
        separator2.setLocation(105, 179);

        //Line below Username txt box
        separator1.setForeground(new Color(27, 28, 30));
        separator1.setBackground(new Color(127,126,144));
        separator1.setSize(155, 15);
        separator1.setLocation(105, 100);

        //Text Box for Password
        txtPassword.setBorder(null);
        txtPassword.setText("Password");
        txtPassword.setHorizontalAlignment(JPasswordField.LEADING);
        txtPassword.setLocation(105, 137);
        txtPassword.setForeground(new Color(27, 28, 30));
        txtPassword.setBackground(new Color(127,126,144));
        txtPassword.setSize(155, 40);
        txtPassword.addMouseListener(this);
        txtPassword.setCaretColor(new Color(27, 28, 30));

        //Logo for Password next to Password txt box
        ImageIcon iconPassword = new ImageIcon("src\\Pics\\key.png");
        picPassword.setIcon(iconPassword);
        picPassword.setSize(32, 40);
        picPassword.setLocation(66, 135);

        //Logo for Username next to Username txt box
        ImageIcon iconUsername = new ImageIcon("src\\Pics\\user.png");
        picUsername.setIcon(iconUsername);
        picUsername.setSize(32, 40);
        picUsername.setLocation(70, 58);

        //Text Box for Username
        txtUsername.setText("Username");
        txtUsername.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtUsername.setHorizontalAlignment(JTextField.LEADING);
        txtUsername.setLocation(105, 58);
        txtUsername.setForeground(new Color(27, 28, 30));
        txtUsername.setBackground(new Color(127,126,144));
        txtUsername.setSize(155, 40);
        txtUsername.setBorder(null);
        txtUsername.addMouseListener(this);
        txtUsername.setCaretColor(new Color(27, 28, 30));

        //Rentizen Logo in left panel
        picLogo.setSize(350, 310);
        ImageIcon logo = new ImageIcon("src\\Pics\\Logo.png");
        picLogo.setIcon(logo);
        
        //Left panel
        pnl1.setLayout(null);
        pnl1.setBounds(0, 0, 345, 310);
        pnl1.setBackground(new Color(27, 28, 30));
        
        //Location for Rentizen logo
        picLogo.setLocation(0, 0);

        //Right panel
        pnl2.setLayout(null);
        pnl2.setBounds(345, 0, 345, 310);
        pnl2.setBackground(new Color(127,126,144));

        //Frame settings
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        this.setSize(690, 349);
        this.setIconImage(logo.getImage());
        this.setResizable(false);
        this.setVisible(true);

        //Adding to Frame
        pnl2.add(separator2);
        pnl2.add(separator1);
        pnl2.add(btnLogin1);
        pnl2.add(picPassword);
        pnl2.add(picUsername);
        pnl2.add(txtUsername);
        pnl2.add(txtPassword);
        pnl1.add(picLogo);
        this.add(pnl1);
        this.add(pnl2);
    }

    @Override
    public void mouseClicked(MouseEvent e){
        // TODO Auto-generated method stub
        if(e.getSource() == btnLogin1) {
            String pwd = String.valueOf(txtPassword.getPassword());
            String user = txtUsername.getText();
            // arraylist to store strings
            List<String> listOfStrings
            = new ArrayList<String>();
   
            Functions function = new Functions();
            List<String> list = function.fromUserDetails(listOfStrings);

            //Validation
            if(list.contains(user)) {
                int index = list.indexOf(user);
                if(pwd.equals(list.get(index + 1))) {
                    JOptionPane.showMessageDialog(null, "Login Successful", "Login", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    User user1 = new User(user, pwd, list.get(index + 2), list.get(index + 3), list.get(index - 1));
                    App hP;
                    try {
                        hP = new App(user1);
                        hP.setVisible(true);
                    } catch (FileNotFoundException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "You have input the wrong credentials. Try Again", "Wrong Credentials", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "You have input the wrong credentials. Try Again", "Wrong Credentials", JOptionPane.WARNING_MESSAGE);
            }
            
        } else if(e.getSource() == txtUsername) {
            txtUsername.setText("");
        } else if(e.getSource() == txtPassword) {
            txtPassword.setText("");
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
