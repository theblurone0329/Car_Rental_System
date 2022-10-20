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

    //Declare Form Components
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

        //Status text
        status.setText("Status: Rent Request Pending");
        status.setForeground(new Color(225,223,186));
        status.setBackground(new Color(54,41,44));
        status.setFont(new Font("Segoe UI", Font.BOLD, 16));
        status.setSize(230, 35);
        status.setLocation(155, 260);

        //Progress Bar Images
        ImageIcon prog0 = new ImageIcon("src\\1.png");
        ImageIcon prog25 = new ImageIcon("src\\5.png");
        ImageIcon prog50 = new ImageIcon("src\\2.png");
        ImageIcon prog75 = new ImageIcon("src\\3.png");
        ImageIcon prog100 = new ImageIcon("src\\4.png");

        picProgBar_0.setIcon(prog0);
        picProgBar_0.setSize(246, 243);
        picProgBar_0.setLocation(400, 95);

        picProgBar_25.setIcon(prog25);
        picProgBar_25.setSize(246, 243);
        picProgBar_25.setLocation(400, 95);

        picProgBar_50.setIcon(prog50);
        picProgBar_50.setSize(246, 243);
        picProgBar_50.setLocation(400, 95);

        picProgBar_75.setIcon(prog75);
        picProgBar_75.setSize(246, 243);
        picProgBar_75.setLocation(400, 95);

        picProgBar_100.setIcon(prog100);
        picProgBar_100.setSize(246, 243);
        picProgBar_100.setLocation(400, 95);

        // Car Picture
        ImageIcon car = new ImageIcon("src\\Tesla_Model_S_Logo.png");
        picCar.setIcon(car);
        picCar.setSize(236, 125);
        picCar.setLocation(150, 130);

        //Bottom Panel / Menu
        pnl2.setBackground(new Color(127, 126, 144));
        pnl2.setLayout(null);
        pnl2.setBounds(0, 420, 805, 108);

        //Top Panel
        pnl1.setBackground(new Color(27, 28, 30));
        pnl1.setLayout(null);
        pnl1.setBounds(0, 0, 805, 420);

        //Frame
        ImageIcon icon = new ImageIcon("src\\Company Logo.png");
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(805, 528);
        this.setVisible(true);
        
        //Add Stuff
        pnl1.add(status);
        pnl1.add(picProgBar_100);
        pnl1.add(picProgBar_75);
        pnl1.add(picProgBar_50);
        pnl1.add(picProgBar_25);
        pnl1.add(picProgBar_0);
        pnl1.add(picCar);
        this.add(pnl2);
        this.add(pnl1);

        picProgBar_100.setVisible(false);
        picProgBar_75.setVisible(false);
        picProgBar_50.setVisible(false);
        picProgBar_25.setVisible(false);
        
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
