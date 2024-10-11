import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);

        System.out.print("Nhap vao mot so: ");
        int num = myscanner.nextInt();

        if (num%3 == 0 && num%5 == 0){
            System.out.println("Chia het cho 3 va 5");
        }
        else {
            System.out.println("Khong chia het cho 3 va 5");
        }
    }
 }