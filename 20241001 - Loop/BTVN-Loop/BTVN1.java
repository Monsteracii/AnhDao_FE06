import java.util.Scanner;

public class BTVN1 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.print("Please input a text: ");
        String myText = myscanner.next();

        System.out.print("Please input a number: ");
        int myNumber = myscanner.nextInt();

        for (int n = 1; n <= myNumber; n++) {
            System.out.print(myText + " - ");
        }
    }
}