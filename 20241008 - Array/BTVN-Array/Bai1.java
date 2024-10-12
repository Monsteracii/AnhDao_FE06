public class Bai1 {
    public static boolean palindrome (String num1) {
        int left = 0;
        int right = num1.length() - 1; 
        char[] myChar1 = num1.toCharArray(); 

        while (left < right) {
            if (myChar1[left] != myChar1[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isIncluded068 (String num2) {
        char[] myChar2 = num2.toCharArray();
        String myStr = "";
        for (int i = 0; i < myChar2.length; i++) {
            if (myChar2[i] == '0' || myChar2[i] == '6' || myChar2[i] == '8') {
                myStr += myChar2[i];
            }
        }
        //System.out.println(myStr);
        if (myStr.contains("0") && myStr.contains("6") && myStr.contains("8")) {
            return true;
        }
        return false;
    } 

    public static boolean isDivisibleby10 (String num3) {
        int sum = 0; 
        char[] myChar3 = num3.toCharArray();
        for (int i = 0; i < num3.length(); i++) {
            sum += myChar3[i] - '0';
        }
        if (sum % 10 == 0) {
            //System.out.println(sum);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int min = 1000000;
        int max = 999999999;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            String num = Integer.toString(i);

            //System.out.println(num);
            if (palindrome(num) && isIncluded068(num) && isDivisibleby10(num)) {
                System.out.println("Cac so thoa dieu kien la: " + num);
                sum += 1;
            }
        }
        System.out.println("In total we have: " + sum + " so");
    }
}
