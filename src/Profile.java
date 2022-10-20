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

    Profile() {

        ImageIcon btn = new ImageIcon("src\\btnEdit2.png");
        btnEdit.setIcon(btn);
        btnEdit.setSize(78, 39);
        btnEdit.setLocation(317, 310);
        btnEdit.addMouseListener(this);

        lblPhoneNum.setText("Phone No.");
        lblPhoneNum.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblPhoneNum.setForeground(new Color(225,223,186));
        lblPhoneNum.setSize(88,25);
        lblPhoneNum.setLocation(290, 270);

        lblEmail.setText("Email");
        lblEmail.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblEmail.setForeground(new Color(225,223,186));
        lblEmail.setSize(88,25);
        lblEmail.setLocation(290, 230);

        lblUsername.setText("Username");
        lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblUsername.setForeground(new Color(225,223,186));
        lblUsername.setSize(88,25);
        lblUsername.setLocation(290, 190);
        
        ImageIcon icon = new ImageIcon("src\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        this.add(btnEdit);
        this.add(lblUsername);
        this.add(lblEmail);
        this.add(lblPhoneNum);
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
