import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số: ");
        int num = scanner.nextInt();

        switch (num) {
            case 2000: 
                System.out.println("Tra da");
                break;
            case 8000:
                System.out.println("Sting dau");
                break;
            case 10000:
                System.out.println("Ca phe da");
                break;
            case 12000:
                System.out.println("Ca phe sua");
                break;
            default:
                System.out.println("Khong co trong menu");
        }
        scanner.close();
    }
}