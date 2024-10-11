public class stringlab2 {
    public static boolean palindromecheck (String str1, String str2) {
        int left = 0; 
        str1.length(); 
        while (left < str1.length()) {
            if (str1.length() != str2.length()) {
                return false;
            }
            left++;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "fedcba";

        if (palindromecheck(str1, str2)) {
            System.out.println(str1 + " va " + str2 + " la chuoi nghich dao.");
        } else {
            System.out.println(str1 + " va " + str2 + " khong phai la chuoi nghich dao.");
        }
    }
}
