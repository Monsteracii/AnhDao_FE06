import java.util.Scanner;
//Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0) và một giá trị thực x. 
//Thực hiện sắp xếp mảng a theo thứ tự tăng dần và chèn giá trị x vào trong mảng a sao cho vẫn giữ được tính sắp xếp của mảng.

public class Bai23 {
    // add x to arr
    // sort that arr
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Please enter a number: ");
        int n = scanner.nextInt(); 
        int arr[] = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + "-th element: ");
            arr[i] = scanner.nextInt(); 
        }
        System.out.print("Please enter the X number: ");

        int x = scanner.nextInt();
        arr = addX(arr, x);

        System.out.println("new arr size: " + arr.length);
        System.out.println("My new array is: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

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
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] addX(int arr[], int x) {
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i]; 
        }
        newArr[arr.length] = x;
        return newArr;
    }
}