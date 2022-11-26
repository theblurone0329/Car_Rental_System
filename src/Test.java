import java.util.ArrayList;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test extends JFrame{

    private Double totalAmount=0.0;
    private static Double bHeight=0.0;
    private String item;
    private String price;
    private String paymentMethod;
    
    private static ArrayList<String> itemName = new ArrayList<>();
    private ArrayList<String> quantity = new ArrayList<>();
    private ArrayList<String> itemPrice = new ArrayList<>();
    private ArrayList<String> subtotal = new ArrayList<>();

    public static void main(String[] args) {
        bHeight = Double.valueOf(itemName.size());
        JOptionPane.showMessageDialog(rootPane, bHeight);
        
        PrinterJob pj = PrinterJob.getPrinterJob();        
        pj.setPrintable(new BillPrintable(),getPageFormat(pj));
        try {
             pj.print();
          
        }
         catch (PrinterException ex) {
                 ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //Useful 
    public PageFormat getPageFormat(PrinterJob pj) {
        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();    

        double bodyHeight = bHeight;  
        double headerHeight = 5.0;                  
        double footerHeight = 5.0;        
        double width = cm_to_pp(8); 
        double height = cm_to_pp(headerHeight+bodyHeight+footerHeight); 
        paper.setSize(width, height);
        paper.setImageableArea(0,10,width,height - cm_to_pp(1));  
                
        pf.setOrientation(PageFormat.PORTRAIT);  
        pf.setPaper(paper);    

        return pf;
    }

    protected static double cm_to_pp(double cm) {            
	    return toPPI(cm * 0.393600787);            
    }
 
    protected static double toPPI(double inch) {            
	    return inch * 72d;            
    }

    public class BillPrintable implements Printable {
     
        public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) throws PrinterException {    
            int r= itemName.size();
            ImageIcon icon=new ImageIcon("src\\Pics\\Logo.png"); 
            int result = NO_SUCH_PAGE;    
              if (pageIndex == 0) {                    
              
                  Graphics2D g2d = (Graphics2D) graphics;                    
                  double width = pageFormat.getImageableWidth();                               
                  g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 
      
      
      
                //  FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
              
              try{
                  int y=20;
                  int yShift = 10;
                  int headerRectHeight=15;
                 // int headerRectHeighta=40;
                  
                      
                  g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
                  g2d.drawImage(icon.getImage(), 50, 20, 90, 30, rootPane);y+=yShift+30;
                  g2d.drawString("-------------------------------------",12,y);y+=yShift;
                  g2d.drawString(" Item Name                  Price   ",10,y);y+=yShift;
                  g2d.drawString("-------------------------------------",10,y);y+=headerRectHeight;
           
                  g2d.drawString(" "+item+"                    "+price+"   ",10,y);y+=yShift;
                
                  g2d.drawString("-------------------------------------",10,y);y+=yShift;
                  g2d.drawString(" Total amount:               "+totalAmount+"   ",10,y);y+=yShift;
                  g2d.drawString("-------------------------------------",10,y);y+=yShift;
                  g2d.drawString(" Payment Method:             "+paymentMethod+"   ",10,y);y+=yShift;
                  g2d.drawString("-------------------------------------",10,y);y+=yShift;

                  g2d.drawString("*************************************",10,y);y+=yShift;
                  g2d.drawString("              THANK YOU!             ",10,y);y+=yShift;
                  g2d.drawString("*************************************",10,y);y+=yShift;
                  g2d.drawString("       SOFTWARE BY:CODEGUID          ",10,y);y+=yShift;
                  g2d.drawString("   CONTACT: contact@codeguid.com       ",10,y);y+=yShift;       
          }
          catch(Exception e){
          e.printStackTrace();
          }
                result = PAGE_EXISTS;    
                }    
                return result;    
            }
         }
}
