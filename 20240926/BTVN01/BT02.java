import java.util.Scanner;

public class BT02 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.print("Nhập bán kính: ");
        double radius = myscanner.nextDouble();

        double circumference = (double)radius * Math.PI * 2;
        double area = (double)radius * (double)radius * Math.PI;

        System.out.println ("Chu vi hình tròn là: " + circumference);
        System.out.println ("Diện tích hình tròn là: " + area);
        myscanner.close();
    }

}
