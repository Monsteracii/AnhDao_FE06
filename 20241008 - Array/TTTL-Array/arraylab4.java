import java.util.Scanner;

public class arraylab4 {
    public static boolean checkValue(int[] myarr, int myvalue) {
        for (int i = 0; i < myarr.length; i++) {
            if (myarr[i] == myvalue) {
                return true;  
            }
        }
        return false;  
    }

    public static void main(String[] args) {
        int[] myarr = {2, 3, 4, 5, 6, 10, 12, 17};

        Scanner myscanner = new Scanner(System.in);

        System.out.print("Please input a number: ");
        int myvalue = myscanner.nextInt();

        System.out.println(checkValue(myarr, myvalue));
    }
}
