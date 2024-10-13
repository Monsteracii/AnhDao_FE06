import java.util.Scanner;
//Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0). 
//Thực hiện sắp xếp mảng theo thứ tự giảm dần.
public class Bai24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Please input a number: ");
        int n = scanner.nextInt(); 
        int arr[] = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + "-th element: ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
                }
            }
        }

        System.out.println("The following series of numbers after arranging in descending order: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
