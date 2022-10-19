import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePage extends JFrame implements MouseListener{
    public static void main(String[] args) {
        new HomePage();
    }

    JPanel pnl1 = new JPanel();
    JPanel pnl2 = new JPanel();
    JLabel picCar = new JLabel();
    JLabel picProgBar_0 = new JLabel();
    JLabel picProgBar_25 = new JLabel();
    JLabel picProgBar_50 = new JLabel();
    JLabel picProgBar_75 = new JLabel();
    JLabel picProgBar_100 = new JLabel();
    JLabel status = new JLabel();

    HomePage() {
        status.setText("Status: Rent Request Pending");
        status.setForeground(new Color(225,223,186));
        status.setBackground(new Color(54,41,44));
        status.setFont(new Font("Segoe UI", Font.BOLD, 16));
        status.setSize(230, 35);
        status.setLocation(185, 260);

        ImageIcon prog0 = new ImageIcon("src\\0_Percent.png");
        ImageIcon prog25 = new ImageIcon("src\\25_Percent.png");
        ImageIcon prog50 = new ImageIcon();
        ImageIcon prog75 = new ImageIcon();
        ImageIcon prog100 = new ImageIcon();

        picProgBar_0.setIcon(prog0);
        picProgBar_0.setSize(246, 243);
        picProgBar_0.setLocation(430, 95);

        picProgBar_25.setIcon(prog25);
        picProgBar_25.setSize(246, 243);
        picProgBar_25.setLocation(430, 95);

        picProgBar_50.setIcon(prog50);
        picProgBar_75.setIcon(prog75);
        picProgBar_100.setIcon(prog100);

        ImageIcon car = new ImageIcon("src\\Tesla_Model_S_Logo.png");
        picCar.setIcon(car);
        picCar.setSize(236, 125);
        picCar.setLocation(180, 130);

        pnl2.setBackground(new Color(127, 126, 144));
        pnl2.setLayout(null);
        pnl2.setBounds(0, 420, 855, 108);

        pnl1.setBackground(new Color(54,41,44));
        pnl1.setLayout(null);
        pnl1.setBounds(0, 0, 855, 420);

        ImageIcon icon = new ImageIcon("src\\Logo1.png");
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(855, 528);
        this.setVisible(true);
        
        pnl1.add(status);
        pnl1.add(picProgBar_100);
        pnl1.add(picProgBar_75);
        pnl1.add(picProgBar_50);
        pnl1.add(picProgBar_25);
        pnl1.add(picProgBar_0);
        pnl1.add(picCar);
        this.add(pnl2);
        this.add(pnl1);
        
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
