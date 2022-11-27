import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import javax.swing.ImageIcon;

public class printReceipt implements Printable{

    String item;
    String price;
    String totalAmount;
    String paymentMethod; 

    printReceipt(String item, String price, String totalAmount, String paymentMethod) {
        this.item = item;
        this.price = price;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
    }

    public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) throws PrinterException {    
        ImageIcon icon=new ImageIcon("src\\Pics\\Logo.png"); 
        int result = NO_SUCH_PAGE;    
          if (pageIndex == 0) {                    
          
              Graphics2D receipt = (Graphics2D) graphics;                    
              double width = pageFormat.getImageableWidth();                               
              receipt.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 
  
  
  
            //  FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
          
          try{
              int y=20;
              int yShift = 10;
              int headerRectHeight=15;
             // int headerRectHeighta=40;
              
                  
              receipt.setFont(new Font("Segoe UI",Font.PLAIN,9));
              receipt.drawImage(icon.getImage(), 115, 0, 65, 50, null);y+=yShift+30;
              receipt.drawString("--------------------------------------------------------------------------------------",12,y);y+=yShift;
              receipt.drawString(" Rental Item                    Price                      ",10,y);y+=yShift;
              receipt.drawString("--------------------------------------------------------------------------------------",10,y);y+=headerRectHeight;
       
              receipt.drawString(" "+item+"                     "+price+"              ",10,y);y+=yShift;
            
              receipt.drawString("\n",10,y);y+=yShift;
              receipt.drawString("\n",10,y);y+=yShift;
              receipt.drawString("\n",10,y);y+=yShift;
              receipt.drawString("\n",10,y);y+=yShift;
              receipt.drawString("\n",10,y);y+=yShift;
              receipt.drawString("\n",10,y);y+=yShift;

              receipt.drawString("--------------------------------------------------------------------------------",10,y);y+=yShift;
              receipt.drawString(" Total amount:                                                             "+totalAmount+"   ",10,y);y+=yShift;
              receipt.drawString("--------------------------------------------------------------------------------------",10,y);y+=yShift;
              receipt.drawString(" Payment Method:                                               "+paymentMethod+"   ",10,y);y+=yShift;
              receipt.drawString("--------------------------------------------------------------------------------------",10,y);y+=yShift;

              receipt.drawString("*******************************************************************************",10,y);y+=yShift;
              receipt.drawString("                                               THANK YOU!                                       ",10,y);y+=yShift;
              receipt.drawString("*******************************************************************************",10,y);y+=yShift;   
      }
      catch(Exception e){
      e.printStackTrace();
      }
            result = PAGE_EXISTS;    
        }    
        return result;    
    }
}

