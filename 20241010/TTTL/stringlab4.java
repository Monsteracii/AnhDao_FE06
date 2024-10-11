public class stringlab4 {
    
    public static String findlongestString(String[] arr) {
        String longestString = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > longestString.length()) {
                longestString = arr[i];
            }
        }
        return longestString;
    }

    public static void main(String[] args) {
        String[] arr = {"hello", "world", "java", "programming"}; 
        String longestString = findlongestString(arr); 
        System.out.println("Chuoi dai nhat trong mang la: " + longestString);
    }
}
