import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Dimension;

public class ViewMonthlyReport extends JFrame implements MouseListener{
    public static void main(String[] args) {
         new ViewMonthlyReport();
    }

    private JButton btnClear = new JButton();
    private JButton btnSearch = new JButton();
    private JLabel totalIncome = new JLabel();
    private JLabel txtTotalIncome = new JLabel();
    private JRadioButton completed = new JRadioButton();
    private JRadioButton uncompleted = new JRadioButton();
    private JTable table = new JTable();
    private JScrollPane pane = new JScrollPane();
    private JPanel tablePnl = new JPanel();
    private Border border = new LineBorder(new Color(225,223,186), 1, true);

    ViewMonthlyReport() {

        //Table
        String[] columnsReturn = {"First", "Second", "Third", "Fourth"};
        String[][] rowsReturn = {};

        table = new JTable(rowsReturn, columnsReturn){
            public boolean isCellEditable(int rows, int columns) {
                return false;
            }
        };

        table.setPreferredScrollableViewportSize(new Dimension(597, 1500));
        table.setFillsViewportHeight(true);
        table.setBackground(new Color(27, 28, 30));
        table.setForeground(new Color(225,223,186));
        table.setGridColor(new Color(225,223,186));
        table.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        table.setRowHeight(30);
        
        pane = new JScrollPane(table);

        tablePnl.setBounds(50, 155, 597, 300);
        tablePnl.setBorder(BorderFactory.createLineBorder(new Color(225,223,186)));
        tablePnl.add(pane);

        //Object[] rowReturns = new Object[4];

        //Cancel Button
        btnSearch.setText("Search");
        btnSearch.setSize(85, 37);
        btnSearch.setLocation(155, 100);
        btnSearch.setForeground(new Color(225,223,186));
        btnSearch.setBackground(new Color(27, 28, 30));
        btnSearch.setBorder(border);
        btnSearch.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        btnSearch.setFocusable(false);
        btnSearch.addMouseListener(this);
        
        //Clear Button
        btnClear.setText("Clear");
        btnClear.setSize(85, 37);
        btnClear.setLocation(50, 100);
        btnClear.setForeground(new Color(225,223,186));
        btnClear.setBackground(new Color(27, 28, 30));
        btnClear.setBorder(border);
        btnClear.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        btnClear.setFocusable(false);
        btnClear.addMouseListener(this);

        //Text Total income (Manipulate)
        txtTotalIncome.setText("RM 4,230.00");
        txtTotalIncome.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        txtTotalIncome.setForeground(new Color(225,223,186));
        txtTotalIncome.setBackground(new Color(27, 28, 30));
        txtTotalIncome.setSize(193, 26);
        txtTotalIncome.setLocation(553, 60);

        //Text total income
        totalIncome.setText("TOTAL INCOME (MONTH): ");
        totalIncome.setFont(new Font("TW Cen MT", Font.BOLD, 16));
        totalIncome.setForeground(new Color(225,223,186));
        totalIncome.setBackground(new Color(27, 28, 30));
        totalIncome.setSize(193, 26);
        totalIncome.setLocation(360, 60);

        //Radio button for uncompleted
        uncompleted.setText("Uncompleted");
        uncompleted.setForeground(new Color(225,223,186));
        uncompleted.setBackground(new Color(27, 28, 30));
        uncompleted.setSize(110, 25);
        uncompleted.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        uncompleted.setLocation(60, 60);
        uncompleted.setFocusable(false);

        //Radio button for completed
        completed.setText("Completed");
        completed.setForeground(new Color(225,223,186));
        completed.setBackground(new Color(27, 28, 30));
        completed.setSize(98, 25);
        completed.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        completed.setLocation(60, 30);
        completed.setFocusable(false);

        //Frame
        ImageIcon icon = new ImageIcon("src\\Logo1.png");
        this.getContentPane().setBackground(new Color(27, 28, 30));
        this.setIconImage(icon.getImage());
        this.setTitle("RentiZen");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(725, 420);
        this.setVisible(true);

        //Adding components to Frame
        this.add(completed);
        this.add(uncompleted);
        this.add(totalIncome);
        this.add(txtTotalIncome);
        this.add(btnClear);
        this.add(btnSearch);
        this.add(tablePnl);
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
