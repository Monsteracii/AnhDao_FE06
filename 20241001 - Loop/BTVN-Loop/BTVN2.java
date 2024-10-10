import java.util.Scanner;

public class BTVN2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int num = 0; num <= 100; num++){
            if (num % 5 == 0)
            sum += num;
        }
    System.out.println("Tong cac so chia het cho 5 tu 0 -> 100 la: " + sum);
    }
}
