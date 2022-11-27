import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import javax.swing.ImageIcon;

public class BillPrintable implements Printable{

    String item;
    String price;
    String totalAmount;
    String paymentMethod; 

    BillPrintable(String item, String price, String totalAmount, String paymentMethod) {
        this.item = item;
        this.price = price;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
    }

    public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) throws PrinterException {    
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
              g2d.drawImage(icon.getImage(), 50, 20, 90, 30, null);y+=yShift+30;
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

