import java.util.Scanner;

public class Bai26 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int n = scanner.nextInt(); 
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + "-th element: ");
            arr[i] = scanner.nextInt(); 
        }
        System.out.print("Enter the x value to count: ");
        int x = scanner.nextInt(); 
        int count = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) count++; 
        }
        System.out.println("The number of occurrences of "+ x + " in the array is: " + count);
    }
}