public class Bai2 {
    public static boolean isPrime (int num) {
        boolean result = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i ==0) {
                return false;
            }
        }
        return result;
    }

    public static boolean allDigitsPrime (int num) {
        while (num > 0) {
            int digit = num % 10; 
            if (digit != 2 && digit != 3 && digit != 5 && digit !=7) { 
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static boolean isSymmetry (int num) {
        int temp = num;
        int reverseNum = 0; 
        while (temp > 0) {
            reverseNum = reverseNum * 10 + temp % 10;
            temp /= 10; 
        }
        return reverseNum == num;
    }
    
    public static void main(String[] args) {
    int min = 1000000;
    int max = 9999999;
    int sum = 0;
    for (int i = min; i <= max; i++) {
        int num = i; 
        if (isPrime(num) && allDigitsPrime(num) && isSymmetry(num)) {
            System.out.println("Cac so thoa dieu kien la: " + num);
            sum += 1;
            }
        }
    System.out.println("In total we have: " + sum + " so");
    }
}