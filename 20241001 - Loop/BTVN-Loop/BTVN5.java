import java.util.Scanner;

public class BTVN5 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in); 
        System.out.print("Nhap mot so nguyen duong bat ky: ");
        int num = myscanner.nextInt();
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                sum += i; 
                System.out.println("So nguyen to: " + i);
            }
        }
        System.out.println("Tong tat ca cac so nguyen to la: " + sum);
    }
    
    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

