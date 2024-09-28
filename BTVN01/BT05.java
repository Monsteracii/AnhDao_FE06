import java.text.DecimalFormat;
import java.util.Scanner;

public class BT05 {
    public static void main(String[] args){

        Scanner myscanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
    
        System.out.print ("Nhập số nguyên thứ nhất: ");
        int num1 = myscanner.nextInt();

        System.out.print ("Nhập số nguyên thứ hai: ");
        int num2 = myscanner.nextInt();

        double multi = (double) num1 / num2;
        //double roundoff = Math.round(multi * 1000.0) / 1000.0;
        String roundoff = df.format(multi);
       
        System.out.println ("Thương của hai số " + num1 + " và " + num2 + " là: " + roundoff);
        myscanner.close();
    }
}
