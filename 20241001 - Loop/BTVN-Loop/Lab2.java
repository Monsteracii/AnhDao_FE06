import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Input month of the year: ");
        
        int month = myscanner.nextInt();        

        switch (month) {
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Summer");
                break;
            case 5:
                System.out.println("Summer");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Autumn");
                break;
            case 8: 
                System.out.println("Autumn");
                break;
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
                System.out.println("Winter");
                break;
            case 11:
                System.out.println("Winter");
                break;
            case 12: 
                System.out.println("Winter");
                break;
            default:
                System.out.println("Please input any number from 1 to 12");
                break;
        }
    }
}
