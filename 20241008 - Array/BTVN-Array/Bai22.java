import java.util.Arrays;
import java.util.Scanner;

public class Bai22 {
    //Nhập mảng số nguyên a với N phần tử, thực hiện xóa 1 phần tử ở vị trí k, với k là số nguyên nhập vào từ bàn phím.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Please input a number: ");
        int n = scanner.nextInt(); 
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " -th element: ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Please enter the position of the element to delete: ");
        int k = scanner.nextInt(); 
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != k) {
                newArr[j++] = arr[i];
            }
        }
        
        System.out.println("Before deletion: " + Arrays.toString(arr));
        System.out.println("After deletion: " + Arrays.toString(newArr));
    }
}
