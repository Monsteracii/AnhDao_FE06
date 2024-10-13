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

    public static boolean alldigitsPrime (int num) {
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
        if (reverseNum != num) return false;
        
        if (reverseNum < 2) return false; 
        for (int i = 2; i < Math.sqrt(reverseNum); i++) {
            if (num % i == 2) return false; 
        }
        return true;
    }
    
    public static void main(String[] args) {
    int min = 1000000;
    int max = 9999999;
    int sum = 0;
    for (int i = min; i <= max; i++) {
        int num = i; 
        if (isPrime(num) && alldigitsPrime(num) && isSymmetry(num)) {
            System.out.println("Cac so thoa dieu kien la: " + num);
            sum += 1;
            }
        }
    System.out.println("In total we have: " + sum + " so");
    }
}