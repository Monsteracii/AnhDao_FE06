import java.util.Scanner;
//Nhập số n và dãy các số nguyên a[0], a[1],..., a[n-1] rồi sắp xếp dãy trên theo thứ tự tăng dần.

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Please input a number: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + "-th element: ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
                }
            }
        }

        System.out.println("The following series of numbers after arranging in ascending order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}