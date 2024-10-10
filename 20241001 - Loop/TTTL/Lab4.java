import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);
        
        System.out.print("Nhap so thu 1: ");
        int num1 = myscanner.nextInt();

        System.out.print("Nhap so thu 2: ");
        int num2 = myscanner.nextInt();

        System.out.print("Nhap so thu 3: ");
        int num3 = myscanner.nextInt();

        if (num1 > (num2 + num3)) {
            System.out.println("So thu 1 lon hon tong cua so thu 2 va so thu 3.");
        }
        else {
            System.out.println("So thu 1 nho hon tong cua so thu 2 va so thu 3.");
        }
    }
}
