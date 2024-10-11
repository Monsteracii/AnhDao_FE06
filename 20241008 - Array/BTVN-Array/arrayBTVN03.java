import java.util.Random;

public class arrayBTVN03 {
    public static void main(String[] args) {
        Random myRandom = new Random(); 
        int n = myRandom.nextInt();

        String myHex = Integer.toHexString(n);
        System.out.println("A random Color Hex Code is: #" + myHex);
    }
}
