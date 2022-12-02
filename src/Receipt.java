import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class Receipt{

    private Double bHeight = 0.0;

    Receipt(String item, double price, String paymentMethod) {

        PrinterJob pj = PrinterJob.getPrinterJob();  
        String today = java.time.LocalDate.now().toString();     
        pj.setJobName("Receipt "+ today);
        pj.setPrintable(new printReceipt(item, price, paymentMethod), 
            getPageFormat(pj));
        
        try {
             pj.print();
        }
         catch (PrinterException ex) {
                 ex.printStackTrace();
        } 
    }

    //Useful 
    public PageFormat getPageFormat(PrinterJob pj) {
        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();    

        double bodyHeight = bHeight;  
        double headerHeight = 5.0;                  
        double footerHeight = 5.0;        
        double width = cm_to_pp(10); 
        double height = cm_to_pp(headerHeight+bodyHeight+footerHeight); 
        paper.setSize(width, height);
        paper.setImageableArea(0,10,width,height - cm_to_pp(1));  
                
        pf.setOrientation(PageFormat.PORTRAIT);  
        pf.setPaper(paper);    

        return pf;
    }

    protected double cm_to_pp(double cm) {            
	    return toPPI(cm * 0.393600787);            
    }
 
    protected  double toPPI(double inch) {            
	    return inch * 72d;            
    }

}


