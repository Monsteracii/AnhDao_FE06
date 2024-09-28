import java.util.Scanner;

public class BT03 {
   
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        byte num1 = myscanner.nextByte();

        System.out.print("Nhập số thứ hai: ");
        byte num2 = myscanner.nextByte();

        System.out.print("Nhập số thứ ba: ");
        byte num3 = myscanner.nextByte();

        System.out.print("Nhập số thứ tư: ");
        byte num4 = myscanner.nextByte();

        byte max_value = num1;
        if (num2 > max_value) max_value = num2;
        if (num3 > max_value) max_value = num3;
        if (num4 > max_value) max_value = num4;

        System.out.println("Số lớn nhất trong bốn chữ số là: " + max_value);
        myscanner.close();
    }   
}
