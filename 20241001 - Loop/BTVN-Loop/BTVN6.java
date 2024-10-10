import java.util.Scanner;

public class BTVN6 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen duong bat ky: ");
        int num = myscanner.nextInt();

        int sum = sumOfDivisors(num);
        System.out.println("Tong cac uoc so cua " + num + " la " + sum);

        myscanner.close();
    }

    private static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                System.out.println("Uoc cua " + num + " la: " + i);
            }
        }
        return sum;
    }
}
