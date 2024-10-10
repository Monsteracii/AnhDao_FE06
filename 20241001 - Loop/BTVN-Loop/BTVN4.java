import java.util.Scanner;

public class BTVN4 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Nhap mot so duong bat ki: ");
        int num = myscanner.nextInt();

        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int num) {
        boolean result = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        } 
        return result;
    }
}