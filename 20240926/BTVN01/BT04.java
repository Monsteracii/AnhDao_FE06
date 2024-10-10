import java.util.Scanner;

public class BT04 {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        System.out.print ("Nhập một số dương bất kì: ");
        int number = myscanner.nextInt();

        double squareRoot = Math.sqrt(number);
        double roundoff = Math.round(squareRoot * 1000.0) / 1000.0;

        System.out.println("Căn của " + number + " là: " + roundoff);
        myscanner.close();
    } 
}
