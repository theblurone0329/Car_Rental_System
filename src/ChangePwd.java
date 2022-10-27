import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class ChangePwd extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new ChangePwd();
    }

    private JTextField password = new JTextField();
    private JTextField confirmPwd = new JTextField(); 
    private JLabel pageTitle = new JLabel();
    private JLabel pwdPic = new JLabel();
    private JSeparator separator1 = new JSeparator();
    private JSeparator separator2 = new JSeparator();
    private JButton btnChange = new JButton();
    
    ChangePwd() {

        ImageIcon pwd = new ImageIcon("src\\password.png");
        pwdPic.setIcon(pwd);
        pwdPic.setSize(256, 256);
        pwdPic.setLocation(420, 60);

        btnChange.setText("Change Password");
        btnChange.setSize(140, 44);
        btnChange.setLocation(290, 300);
        btnChange.setForeground(new Color(225,223,186));
        btnChange.setBackground(new Color(27, 28, 30));
        Border border = new LineBorder(new Color(225,223,186), 1, true);
        btnChange.setBorder(border);
        btnChange.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        btnChange.setFocusable(false);
        btnChange.addMouseListener(this);

        pageTitle.setText("Change Password");
        pageTitle.setFont(new Font("TW Cen MT", Font.PLAIN, 28));
        pageTitle.setForeground(new Color(225,223,186));
        pageTitle.setBackground(new Color(27, 28, 30));
        pageTitle.setSize(200, 27);
        pageTitle.setLocation(270, 10);

        //Confirm Password box
        confirmPwd.setText("Confirm Password");
        confirmPwd.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        confirmPwd.setForeground(new Color(225,223,186));
        confirmPwd.setBackground(new Color(27, 28, 30));
        confirmPwd.setSize(180,30);
        confirmPwd.setLocation(125, 210);
        confirmPwd.setBorder(null);
        confirmPwd.addMouseListener(this);

        separator2.setForeground(new Color(225,223,186));
        separator2.setBackground(new Color(27, 28, 30));
        separator2.setSize(180, 17);
        separator2.setLocation(125, 243);

        //First Password box
        password.setText("Password");
        password.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        password.setForeground(new Color(225,223,186));
        password.setBackground(new Color(27, 28, 30));
        password.setSize(180,30);
        password.setLocation(125, 110);
        password.setBorder(null);
        password.addMouseListener(this);

        separator1.setForeground(new Color(225,223,186));
        separator1.setBackground(new Color(27, 28, 30));
        separator1.setSize(180, 17);
        separator1.setLocation(125, 143);

        ImageIcon icon = new ImageIcon("src\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        this.add(password);
        this.add(confirmPwd);
        this.add(separator1);
        this.add(separator2);
        this.add(pageTitle);
        this.add(btnChange);
        this.add(pwdPic);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == password) {
            password.setText("");
        } else if(e.getSource() == confirmPwd) {
            confirmPwd.setText("");
        } else if(e.getSource() == btnChange) {
            if(password.getText().equals(confirmPwd.getText())) {
                System.out.println("Password: " + password.getText() + "\nConfirm Password: " + confirmPwd.getText());
            } else {
                System.out.println("Passwords are not the same");
            }
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
