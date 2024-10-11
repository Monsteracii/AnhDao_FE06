public class stringlab3 {
    public static int countUppercase(String str) {
        int uppercase = 0; 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <='Z') {
                uppercase++; 
            }
        }
        return uppercase;
    }
    
    public static int countDigit(String str) {
        int digit = 0; 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digit++;
            }
        }  
        return digit;
    }

    public static void main(String[] args) {
        String str = "Abc1234Def"; 
        System.out.println("So ky tu viet hoa trong chuoi: " + countUppercase(str));
        System.out.println("So tu ky so trong chuoi: " + countDigit(str));
    }
}
