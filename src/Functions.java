import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Functions {
    public static void main(String[] args) {
        String today = java.time.LocalDate.now().toString(); 
        System.out.println(today);
        Functions func = new Functions();
        func.returnStatus();
    }

    private String today = java.time.LocalDate.now().toString(); 
    private String finalPrice;
    String[] array;
    
    Functions() {

    }

    public void returnStatus() {
        List<String> listOfStrings
        = new ArrayList<String>();

        try (// load content of file based on specific delimiter
        Scanner sc = new Scanner(new FileReader("src\\Text Files\\Booking.txt"))
                        .useDelimiter(", \\s*")) {
            String str;
  
            // checking end of file
            while (sc.hasNext()) {
                str = sc.next();
            
                // adding each string to arraylist
                listOfStrings.add(str);
            }
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        for(int i = 5; i < listOfStrings.size(); i+=8){
            if((listOfStrings.get(i).equals(today))&&(listOfStrings.get(i+1).equals("Accepted"))) {
                listOfStrings.set(i+1, "Returning");
            } else {
            }
        }

        for(int i = 7; i < listOfStrings.size(); i+=8) {
            listOfStrings.set(i, "\n");
        }

        try (FileWriter fw = new FileWriter("src\\Text Files\\Booking.txt")) {
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);    

            for (int i = 0; i < listOfStrings.size() ; i++)
            {
                pw.write(listOfStrings.get(i) + ", ");
            }
            pw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void toBooking(String[] array) {
        try
        {
            FileWriter fw = new FileWriter("src\\Text Files\\Booking.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);    

            for (int i = 0; i < array.length ; i++)
            {
                pw.write(array[i] + ", ");
            }
            pw.close();
            JOptionPane.showMessageDialog(null, "Booking Made Successful. Awaiting approval", "Booking Succesful", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception f)
        {
            f.printStackTrace();
            System.out.println("No such file exists.");
        }
    }

    public void toCar(String[] row) {
        try
        {
            FileWriter fw = new FileWriter("src\\Text Files\\Car.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);    

            for (int i = 0; i < row.length ; i++)
            {
                pw.write(row[i] + ", ");
            }
            pw.close();
        
        }
        catch (Exception f)
        {
            f.printStackTrace();
            System.out.println("No such file exists.");
        }
    } 
    
    public void toCarRewrite(String[] row) {
        try
        {
            FileWriter fw = new FileWriter("src\\Text Files\\Car.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);    

            for (int i = 0; i < row.length ; i++)
            {
                pw.write(row[i] + ", ");
            }
            pw.close();
        
        }
        catch (Exception f)
        {
            f.printStackTrace();
            System.out.println("No such file exists.");
        }
    } 
    
    public void forCarBooking(String[] row) {
        try
        {
            FileWriter fw = new FileWriter("src\\Text Files\\Car.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);    

            for (int i = 0; i < row.length ; i++)
            {
                pw.write(row[i] + ", ");
            }
            pw.close();
            JOptionPane.showMessageDialog(null, "Car Booked Successfully!", "Successful", JOptionPane.INFORMATION_MESSAGE);   
        
        }
        catch (Exception f)
        {
            f.printStackTrace();
            System.out.println("No such file exists.");
        }
    }

    public void forReport(String[] arrayReport) {
    try
    {   

        FileWriter fw = new FileWriter("src\\Text Files\\Report.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);                                    
        for (int k = 0; k < arrayReport.length ; k++)
        {
            pw.write(arrayReport[k] + ", ");
        }
        pw.close();
    }
    catch (Exception f)
    {
        f.printStackTrace();
        System.out.println("No such file exists.");
    }
}

    public void toUserDetails(String[] array) {
        try
        {
            FileWriter fw = new FileWriter("src\\Text Files\\userDetails.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);    

            for (int i = 0; i < array.length ; i++)
            {
                pw.write(array[i] + ", ");
            }
            pw.close();
        }
        catch (Exception f)
        {
            f.printStackTrace();
            System.out.println("No such file exists.");
        }
    }

    public void toUserDetailsRewrite(String[] array) {
        try
        {
            FileWriter fw = new FileWriter("src\\Text Files\\userDetails.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);    

            for (int i = 0; i < array.length ; i++)
            {
                pw.write(array[i] + ", ");
            }
            pw.close();
        }
        catch (Exception f)
        {
            f.printStackTrace();
            System.out.println("No such file exists.");
        }
    }

    public void toReturnedTable(List<String> listOfStrings,DefaultTableModel modelRCA1){
        for(int i = 7; i<listOfStrings.size(); i+=7) {
            if(listOfStrings.get(i-1).equals("Returned")) {
                Object[] tableLines = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-2), listOfStrings.get(i-1)};
                modelRCA1.addRow(tableLines);
                listOfStrings.remove(i);
        } else {
            String[] arrayAccepted = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-2), "Accepted","\n"};
            try
            {
                FileWriter fw1 = new FileWriter("src\\Text Files\\Dummy.txt");
                BufferedWriter bw1 = new BufferedWriter(fw1);
                PrintWriter pw1 = new PrintWriter(bw1);    

                listOfStrings.remove(i);
                for(int j = 0; j < arrayAccepted.length; j++){
                    pw1.write(arrayAccepted[j] + ", ");
                }
                pw1.close();
            }
            catch (Exception f)
            {
                f.printStackTrace();
                System.out.println("No such file exists.");
            }
            continue;
        }
    }
    }

    public void toOnRentTable(List<String>listOfStrings, DefaultTableModel modelORCA1){
        for(int i = 7; i<listOfStrings.size(); i+=7) {
            if(listOfStrings.get(i-1).equals("Returning")) {
                Object[] tableLines = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-2), listOfStrings.get(i-1)};
                modelORCA1.addRow(tableLines);
                listOfStrings.remove(i);
        } else{
            String[] arrayAccepted = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-2), "Accepted","\n"};
            try
            {
                FileWriter fw1 = new FileWriter("src\\Text Files\\Dummy.txt");
                BufferedWriter bw1 = new BufferedWriter(fw1);
                PrintWriter pw1 = new PrintWriter(bw1);    

                listOfStrings.remove(i);
                for(int j = 0; j < arrayAccepted.length; j++){
                    pw1.write(arrayAccepted[j] + ", ");
                }
                pw1.close();
            }
            catch (Exception f)
            {
                f.printStackTrace();
                System.out.println("No such file exists.");
            }
            continue;
        }
    }
}

    public void toAddCarTable(List<String>listOfStrings,DefaultTableModel model1){
    for(int i = 7; i<listOfStrings.size(); i+=7) {
        Object[] tableLines = {listOfStrings.get(i-7), listOfStrings.get(i-6), 
            listOfStrings.get(i-5), listOfStrings.get(i-4), listOfStrings.get(i-3), 
            listOfStrings.get(i-2), listOfStrings.get(i-1)};
        listOfStrings.remove(i);
        model1.addRow(tableLines);
        }
    }

    public void toViewAllCarTable(List<String> listOfStrings, DefaultTableModel modelA1) {
        for(int i = 7; i<listOfStrings.size(); i+=7) {
            if(listOfStrings.get(i-1).equals("Available")) {
                Object[] tableLines = {listOfStrings.get(i-7), listOfStrings.get(i-6), 
                    listOfStrings.get(i-4), listOfStrings.get(i-3), listOfStrings.get(i-2)};
                listOfStrings.remove(i);
                modelA1.addRow(tableLines);
            } else {
                listOfStrings.remove(i);
                continue;
            }
        }
    }

    public void toBookingRequestTable(List<String> listOfStrings, DefaultTableModel modelBR1) {
        for(int i = 7; i<listOfStrings.size(); i+=7) {
            if(listOfStrings.get(i-1).equals("Pending")) {
                Object[] tableLines = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-5), listOfStrings.get(i-4), listOfStrings.get(i-3), listOfStrings.get(i-2), listOfStrings.get(i-1)};
                modelBR1.addRow(tableLines);
                listOfStrings.remove(i);
            } else{
                String[] arrayAccepted = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-5), listOfStrings.get(i-4), listOfStrings.get(i-3), listOfStrings.get(i-2), "Accepted","\n"};
                try
                {
                    FileWriter fw1 = new FileWriter("src\\Text Files\\Dummy.txt");
                    BufferedWriter bw1 = new BufferedWriter(fw1);
                    PrintWriter pw1 = new PrintWriter(bw1);    
    
                    listOfStrings.remove(i);
                    for(int j = 0; j < arrayAccepted.length; j++){
                        pw1.write(arrayAccepted[j] + ", ");
                    }
                    pw1.close();
                }
                catch (Exception f)
                {
                    f.printStackTrace();
                    System.out.println("No such file exists.");
                }
                continue;
            } 
        }
    }

    public void toViewMonthlyReportTable(List<String> listOfStrings, DefaultTableModel modelMR1,String status) {
        for(int i = 7; i<listOfStrings.size(); i+=7) {
            if(listOfStrings.get(i-1).equals(status)) {
                Object[] tableLines = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-5), listOfStrings.get(i-4), listOfStrings.get(i-3),listOfStrings.get(i-2),listOfStrings.get(i-1)};
                modelMR1.addRow(tableLines);
                listOfStrings.remove(i);
            } else {//dummy file 
                String[] arrayAccepted = {listOfStrings.get(i-7), listOfStrings.get(i-6), listOfStrings.get(i-2), "Accepted","\n"};
                try
                {
                    FileWriter fw1 = new FileWriter("src\\Text Files\\Dummy.txt");
                    BufferedWriter bw1 = new BufferedWriter(fw1);
                    PrintWriter pw1 = new PrintWriter(bw1);    

                    listOfStrings.remove(i);
                    for(int j = 0; j < arrayAccepted.length; j++){
                        pw1.write(arrayAccepted[j] + ", ");
                    }
                    pw1.close();
                }
                catch (Exception f)
                {
                    f.printStackTrace();
                    System.out.println("No such file exists.");
                }
                continue;
            }
    }
    }

    public List<String> fromUserDetails(List<String> listOfStrings) {

        try (// load content of file based on specific delimiter
        Scanner sc = new Scanner(new FileReader("src\\Text Files\\userDetails.txt"))
                        .useDelimiter(", \\s*")) {
            String str;
  
            // checking end of file
            while (sc.hasNext()) {
                str = sc.next();
            
                // adding each string to arraylist
                listOfStrings.add(str);
            }
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return listOfStrings;
    }

    public List<String> fromBooking(List<String> listOfStrings) {

        try (// load content of file based on specific delimiter
        Scanner sc = new Scanner(new FileReader("src\\Text Files\\Booking.txt"))
                        .useDelimiter(", \\s*")) {
            String str;
  
            // checking end of file
            while (sc.hasNext()) {
                str = sc.next();
            
                // adding each string to arraylist
                listOfStrings.add(str);
            }

        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return listOfStrings;
    }

    public List<String> fromReport(List<String> listOfStrings) {

        try (// load content of file based on specific delimiter
        Scanner sc = new Scanner(new FileReader("src\\Text Files\\Report.txt"))
                        .useDelimiter(", \\s*")) {
            String str;
  
            // checking end of file
            while (sc.hasNext()) {
                str = sc.next();
            
                // adding each string to arraylist
                listOfStrings.add(str);
            }

        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return listOfStrings;
    }

    public List<String> fromCar(List<String> listOfStrings) {
        try (// load content of file based on specific delimiter
        Scanner sc = new Scanner(new FileReader("src\\Text Files\\Car.txt"))
                        .useDelimiter(", \\s*")) {
            String str;
  
            // checking end of file
            while (sc.hasNext()) {
                str = sc.next();
            
                // adding each string to arraylist
                listOfStrings.add(str);
            }
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return listOfStrings;
    }

    public int toHours(String s) {
        String[] hourMin = s.split(":");
        int hour = Integer.parseInt(hourMin[0]);
        int mins = Integer.parseInt(hourMin[1]);
        int minsInHours = mins / 60;
        return hour + minsInHours;
    }

    public int fromDate(String start, String end) {
        String[] startDate = start.split("-");
        String[] endDate = end.split("-");
        int startDay = Integer.parseInt(startDate[2]);
        int endDay = Integer.parseInt(endDate[2]);
        int numOfDays = endDay - startDay;
        return numOfDays;
    }

    public void storeArray(String[] array) {
        this.array = array;
    }

    public String[] returnArray() {
        return array;
    }

    public void storePrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double returnPrice() {
        return Double.parseDouble(finalPrice);
    }

    public String setBookingStatusTxt(List<String> listOfStrings1, int index){
        String text = "";
        if (listOfStrings1.get(index+6).equals("Pending")){
            text = "is currently pending";
        } else if (listOfStrings1.get(index+6).equals("Accepted")){
            text = "has been accepted!";
        } else if (listOfStrings1.get(index+6).equals("Declined")){
            text = "has been declined!";
        } else if (listOfStrings1.get(index+6).equals("Returning")){
            text = "is completing";
        } else if (listOfStrings1.get(index+6).equals("Returned")){
            text = "is completed!";
        }
        return text;
    }
    
}
