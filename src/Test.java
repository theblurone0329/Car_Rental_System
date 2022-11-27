import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JFrame;

public class Test extends JFrame{

    private static Double totalAmount=0.0;
    private static Double bHeight=0.0;
    private static String item = "Perodua Myvi";
    private static String price = "70";
    private static String paymentMethod = "Online Banking";

    public static void main(String[] args) {
        PrinterJob pj = PrinterJob.getPrinterJob();     

        
        totalAmount = Double.parseDouble(price);
        pj.setPrintable(new BillPrintable(item, price, totalAmount.toString(), paymentMethod),getPageFormat(pj));
        try {
             pj.print();
          
        }
         catch (PrinterException ex) {
                 ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //Useful 
    public static PageFormat getPageFormat(PrinterJob pj) {
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

}


