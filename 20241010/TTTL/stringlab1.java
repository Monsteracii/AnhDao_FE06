public class stringlab1 {

    public static String toUpperCase(String myString) {
        return myString.toUpperCase();
    }
    public static void main(String[] args) {
        String myString = "hello miu"; 

        String upperStr = toUpperCase(myString);
        System.out.println(myString);
        System.out.println(upperStr);
    }
}