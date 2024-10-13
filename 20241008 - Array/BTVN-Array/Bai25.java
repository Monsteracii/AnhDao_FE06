import java.util.Scanner;
//Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0). 
//Đếm xem trong mảng có bao nhiêu số lẻ và bao nhiêu số chẵn.

public class Bai25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Please input a number: ");
        int n = scanner.nextInt(); 
        int arr[] = new int[n]; 
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + "-th element: ");
            arr[i] = scanner.nextInt();
        }

        /* for (int i = 0; i < n; i++) {
            if (i % 2 == 0) countEven++;
                else countOdd++;
            } */
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) countEven++;
            if (i % 2 != 0) countOdd++;
        }
        
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);
    }     
}
