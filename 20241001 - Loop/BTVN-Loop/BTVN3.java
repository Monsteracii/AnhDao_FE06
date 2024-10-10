import java.util.Scanner;

public class BTVN3 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("Nhap so nguyen thu 1: ");
        int num1 = myscanner.nextInt();

        System.out.print("Nhap so nguyen thu 2: ");
        int num2 = myscanner.nextInt();

        for (int num = num1 + 1; num < num2; num++) {
            sum += num;
        }
        System.out.println("Tong tat ca cac so nguyen nam giua " + num1 + " va " + num2 + " la: " + sum);
    }
}
