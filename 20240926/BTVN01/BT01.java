import java.util.Scanner;

public class BT01 {

    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        int length = myscanner.nextInt();

        System.out.print("Nhập chiều rộng: ");
        int width = myscanner.nextInt();

        int perim = (length + width) * 2;
        int area = length * width;

        System.out.println ("Chu vi hình chữ nhật là: " + perim);
        System.out.println ("Diện tích hình chữ nhật là: " + area);
        myscanner.close();
    }
}
