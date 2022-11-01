import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class EditProfileDetails extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new EditProfileDetails();
    }

    private JTextField lblUsername = new JTextField();
    private JTextField lblPhoneNum = new JTextField();
    private JTextField lblEmail = new JTextField();
    private JButton btnChange = new JButton();
    private JButton btnChangePwd = new JButton();
    private JButton btnDefault = new JButton();
    private JLabel pageTitle = new JLabel();
    private JSeparator separator1 = new JSeparator();
    private JSeparator separator2 = new JSeparator();
    private JSeparator separator3 = new JSeparator();
    private JLabel icnUsername = new JLabel();
    private JLabel icnPhoneNum = new JLabel();
    private JLabel icnEmail = new JLabel();
    private JLabel carPic = new JLabel();

    EditProfileDetails() {

        //Car Picture
        ImageIcon car = new ImageIcon("src\\Pics\\sport-car.png");
        carPic.setIcon(car);
        carPic.setSize(256, 256);
        carPic.setLocation(300, 140);

        //Icon for Username
        ImageIcon user = new ImageIcon("src\\Pics\\user.png");
        icnUsername.setIcon(user);
        icnUsername.setSize(32, 32);
        icnUsername.setLocation(70, 93);

        //Icon for Email
        ImageIcon email = new ImageIcon("src\\Pics\\email.png");
        icnEmail.setIcon(email);
        icnEmail.setSize(32, 32);
        icnEmail.setLocation(70, 173);

        //Icon for Phone
        ImageIcon phone = new ImageIcon("src\\Pics\\smartphone.png");
        icnPhoneNum.setIcon(phone);
        icnPhoneNum.setSize(32, 32);
        icnPhoneNum.setLocation(70, 253);

        //Page Title
        pageTitle.setText("Change Details");
        pageTitle.setFont(new Font("TW Cen MT", Font.PLAIN, 28));
        pageTitle.setForeground(new Color(225,223,186));
        pageTitle.setBackground(new Color(27, 28, 30));
        pageTitle.setSize(200, 27);
        pageTitle.setLocation(280, 10);

        //Change Button
        btnChange.setText("Change Details");
        btnChange.setSize(140, 44);
        btnChange.setLocation(520, 130);
        btnChange.setForeground(new Color(225,223,186));
        btnChange.setBackground(new Color(27, 28, 30));
        Border border = new LineBorder(new Color(225,223,186), 1, true);
        btnChange.setBorder(border);
        btnChange.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        btnChange.setFocusable(false);

        //Change Password Button
        btnChangePwd.setText("Change Password");
        btnChangePwd.setSize(140, 44);
        btnChangePwd.setLocation(520, 185);
        btnChangePwd.setForeground(new Color(225,223,186));
        btnChangePwd.setBackground(new Color(27, 28, 30));
        Border border1 = new LineBorder(new Color(225,223,186), 1, true);
        btnChangePwd.setBorder(border1);
        btnChangePwd.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        btnChangePwd.setFocusable(false);

        //Reset Button
        btnDefault.setText("Back to Default");
        btnDefault.setSize(140, 44);
        btnDefault.setLocation(520, 240);
        btnDefault.setForeground(new Color(225,223,186));
        btnDefault.setBackground(new Color(27, 28, 30));
        Border border2 = new LineBorder(new Color(225,223,186), 1, true);
        btnDefault.setBorder(border2);
        btnDefault.setFont(new Font("TW Cen MT", Font.BOLD, 15));
        btnDefault.setFocusable(false);

        //Txt for Phone No.
        lblPhoneNum.setText("011-1087 8646");
        lblPhoneNum.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblPhoneNum.setForeground(new Color(225,223,186));
        lblPhoneNum.setBackground(new Color(27, 28, 30));
        lblPhoneNum.setSize(180,30);
        lblPhoneNum.setLocation(110, 250);
        lblPhoneNum.setBorder(null);

        separator3.setForeground(new Color(225,223,186));
        separator3.setBackground(new Color(27, 28, 30));
        separator3.setSize(180, 17);
        separator3.setLocation(110, 283);

        //Txt for Email
        lblEmail.setText("adrianfwl@gmail.com");
        lblEmail.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblEmail.setForeground(new Color(225,223,186));
        lblEmail.setBackground(new Color(27, 28, 30));
        lblEmail.setSize(180,30);
        lblEmail.setLocation(110, 170);
        lblEmail.setBorder(null);

        separator2.setForeground(new Color(225,223,186));
        separator2.setBackground(new Color(27, 28, 30));
        separator2.setSize(180, 17);
        separator2.setLocation(110, 203);

        //Txt for Username
        lblUsername.setText("Adrian_Fu");
        lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblUsername.setForeground(new Color(225,223,186));
        lblUsername.setBackground(new Color(27, 28, 30));
        lblUsername.setSize(180,30);
        lblUsername.setLocation(110, 90);
        lblUsername.setBorder(null);

        separator1.setForeground(new Color(225,223,186));
        separator1.setBackground(new Color(27, 28, 30));
        separator1.setSize(180, 17);
        separator1.setLocation(110, 123);
        
        //Frame
        ImageIcon icon = new ImageIcon("src\\Pics\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        //Adding Components to Frame
        this.add(lblUsername);
        this.add(lblEmail);
        this.add(lblPhoneNum);
        this.add(btnChange);
        this.add(btnChangePwd);
        this.add(btnDefault);
        this.add(pageTitle);
        this.add(separator1);
        this.add(separator2);
        this.add(separator3);
        this.add(icnUsername);
        this.add(icnEmail);
        this.add(icnPhoneNum);
        this.add(carPic);
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
