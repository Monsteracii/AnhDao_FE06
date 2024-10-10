import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Enter a value between 0 and 100: ");
        int markvalue = myscanner.nextInt();

        if (markvalue > 100 || markvalue < 0) {
            System.out.println("Invalid value");
        }
        else if (markvalue >=85){
            System.out.println("Hooray!! You got an A.");
        }
        else if (markvalue >=70 && markvalue <85) {
            System.out.println("Good job! You got a B.");
        }
        else if (markvalue>=40 && markvalue <70){
            System.out.println("Well, a C for you.");
        }
        else {
            System.out.println("So bad, you got a D!!!");
        }
    }
}
