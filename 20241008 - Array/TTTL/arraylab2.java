import java.util.Scanner;

public class arraylab2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 10, 12, 17};
        
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (isPrime(arr[i])) {
                sum += arr[i]; 
                System.out.println("So nguyen to: " + arr[i]);
            }
        }
        System.out.println("Tong tat ca cac so nguyen to trong mang la: " + sum);
        }

    private static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
