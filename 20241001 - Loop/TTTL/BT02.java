import java.util.Random;
import java.util.Scanner;

public class BT02 {
    public static void main(String [] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.print ("Nhập một số bất kì: ");
        int number = myscanner.nextInt();

        Random random = new Random();
        int randomNumber = (random.nextInt(100)+1);

        String result = (number > randomNumber) ? "Số bạn đã nhập lớn hơn Số được sinh ngẫu nhiên." :
         "Số bạn đã nhập nhỏ hơn Số sinh ra ngẫu nhiên.";

        System.out.println("Số bạn đã nhập là: " + number);
        System.out.println("Số sinh ra ngẫu nhiên là: " + randomNumber);
        System.out.println("Kết quả của phép so sánh là: " + result);
        
        myscanner.close();

    }
}