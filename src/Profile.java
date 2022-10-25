import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Profile extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new Profile();
    }

    JLabel lblUsername = new JLabel();
    JLabel lblEmail = new JLabel();
    JLabel lblPhoneNum = new JLabel();
    JButton btnEdit = new JButton();
    JLabel border = new JLabel();
    JLabel border2 = new JLabel();
    JLabel user = new JLabel();
    JLabel progBar0 = new JLabel();
    JLabel progBar25 = new JLabel();
    JLabel progBar50 = new JLabel();
    JLabel progBar75 = new JLabel();
    JLabel progBar100 = new JLabel();
    JLabel car_Profile = new JLabel();
    JButton btnView = new JButton();
    
    Profile() {

        //View button to show current booked service
        ImageIcon btn_View = new ImageIcon("src\\file.png");
        btnView.setIcon(btn_View);
        btnView.setSize(32, 32);
        btnView.setLocation(560, 247);
        btnView.setFocusable(false);
        btnView.setBorder(null);
        btnView.setBackground(new Color(27, 28, 30));

        //Current booked car picture
        ImageIcon car = new ImageIcon("src\\Car_profile.png");
        car_Profile.setIcon(car);
        car_Profile.setSize(174, 100);
        car_Profile.setLocation(435, 95);

        //Current service progress
        ImageIcon progBar_0 = new ImageIcon("src\\1_1.png");
        progBar0.setIcon(progBar_0);
        progBar0.setSize(135, 139);
        progBar0.setLocation(430, 190);

        ImageIcon progBar_25 = new ImageIcon("src\\1_2.png");
        progBar25.setIcon(progBar_25);
        progBar25.setSize(135, 139);
        progBar25.setLocation(430, 190);

        ImageIcon progBar_50 = new ImageIcon("src\\1_3.png");
        progBar50.setIcon(progBar_50);
        progBar50.setSize(135, 139);
        progBar50.setLocation(430, 190);

        ImageIcon progBar_75 = new ImageIcon("src\\1_4.png");
        progBar75.setIcon(progBar_75);
        progBar75.setSize(135, 139);
        progBar75.setLocation(430, 190);

        ImageIcon progBar_100 = new ImageIcon("src\\1_5.png");
        progBar100.setIcon(progBar_100);
        progBar100.setSize(135, 139);
        progBar100.setLocation(430, 190);

        //Gradient Border on the right
        ImageIcon br1 = new ImageIcon("src\\Border.png");
        border2.setIcon(br1);
        border2.setSize(400, 320);
        border2.setLocation(390, 50);

        //Gradient Border on the left
        ImageIcon br = new ImageIcon("src\\Border.png");
        border.setIcon(br);
        border.setSize(400, 320);
        border.setLocation(50, 5);

        //Edit button for editing profile details
        ImageIcon btn = new ImageIcon("src\\btnEdit2.png");
        btnEdit.setIcon(btn);
        btnEdit.setSize(78, 39);
        btnEdit.setLocation(145, 240);
        btnEdit.addMouseListener(this);
        btnEdit.setFocusable(false);
        btnEdit.setBorder(null);

        //Txt for Phone No.
        lblPhoneNum.setText("011-1087 8646");
        lblPhoneNum.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblPhoneNum.setForeground(new Color(225,223,186));
        lblPhoneNum.setSize(100,25);
        lblPhoneNum.setLocation(115, 190);

        //Txt for Email
        lblEmail.setText("adrianfwl@gmail.com");
        lblEmail.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblEmail.setForeground(new Color(225,223,186));
        lblEmail.setSize(150,25);
        lblEmail.setLocation(115, 130);

        //Txt for Username
        lblUsername.setText("Adrian_Fu");
        lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblUsername.setForeground(new Color(225,223,186));
        lblUsername.setSize(88,25);
        lblUsername.setLocation(115, 70);
        
        //Frame
        ImageIcon icon = new ImageIcon("src\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        //Adding items to frame
        this.add(btnView);
        this.add(car_Profile);
        this.add(progBar100);
        this.add(progBar0);
        this.add(progBar25);
        this.add(progBar50);
        this.add(progBar75);
        this.add(btnEdit);
        this.add(lblUsername);
        this.add(lblEmail);
        this.add(lblPhoneNum);
        this.add(border);
        this.add(border2);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == btnEdit) {
            System.out.println("editing...");
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
