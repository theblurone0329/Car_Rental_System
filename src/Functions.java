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

public class Functions {
    
    private String today = java.time.LocalDate.now().toString(); 

    public static void main(String[] args) {
        String today = java.time.LocalDate.now().toString(); 
        System.out.println(today);
        Functions func = new Functions();
        func.returnStatus();
    }

    
    Functions() {

    }

    public void returnStatus() {
        int j = 1;
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
            if(listOfStrings.get(i).equals(today)) {
                listOfStrings.set(i+1, "Returning");
            } else {
                j = 0;
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
            JOptionPane.showMessageDialog(null, "Car Added Successfully!", "Successful", JOptionPane.INFORMATION_MESSAGE);   
        
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
}
