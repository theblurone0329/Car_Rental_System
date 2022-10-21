import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Profile extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new Profile();
    }

    JLabel lblUsername = new JLabel();
    JLabel lblEmail = new JLabel();
    JLabel lblPhoneNum = new JLabel();
    JLabel btnEdit = new JLabel();
    JLabel border = new JLabel();
    JLabel border2 = new JLabel();
    JLabel user = new JLabel();
    JLabel progBar0 = new JLabel();
    JLabel car_Profile = new JLabel();
    JLabel btnView = new JLabel();
    
    Profile() {

        ImageIcon btn_View = new ImageIcon("src\\file.png");
        btnView.setIcon(btn_View);
        btnView.setSize(64, 64);
        btnView.setLocation(555, 220);

        ImageIcon car = new ImageIcon("src\\Car_profile.png");
        car_Profile.setIcon(car);
        car_Profile.setSize(174, 100);
        car_Profile.setLocation(435, 95);

        ImageIcon progBar_0 = new ImageIcon("src\\1_1.png");
        progBar0.setIcon(progBar_0);
        progBar0.setSize(135, 139);
        progBar0.setLocation(410, 190);

        ImageIcon br1 = new ImageIcon("src\\Border.png");
        border2.setIcon(br1);
        border2.setSize(400, 320);
        border2.setLocation(390, 50);

        ImageIcon br = new ImageIcon("src\\Border.png");
        border.setIcon(br);
        border.setSize(400, 320);
        border.setLocation(50, 5);

        ImageIcon btn = new ImageIcon("src\\btnEdit2.png");
        btnEdit.setIcon(btn);
        btnEdit.setSize(78, 39);
        btnEdit.setLocation(145, 240);
        btnEdit.addMouseListener(this);

        lblPhoneNum.setText("011-1087 8646");
        lblPhoneNum.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblPhoneNum.setForeground(new Color(225,223,186));
        lblPhoneNum.setSize(100,25);
        lblPhoneNum.setLocation(115, 190);

        lblEmail.setText("adrianfwl@gmail.com");
        lblEmail.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblEmail.setForeground(new Color(225,223,186));
        lblEmail.setSize(150,25);
        lblEmail.setLocation(115, 130);

        lblUsername.setText("Adrian_Fu");
        lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblUsername.setForeground(new Color(225,223,186));
        lblUsername.setSize(88,25);
        lblUsername.setLocation(115, 70);
        
        ImageIcon icon = new ImageIcon("src\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        this.add(btnView);
        this.add(car_Profile);
        this.add(progBar0);
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
