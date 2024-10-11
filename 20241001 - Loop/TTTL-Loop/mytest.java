import java.util.ArrayList;

public class mytest {
    public static void main(String[] args) {
        ArrayList<String> myData = new ArrayList<String>();
        myData.add("1");
        myData.add("0");
        myData.add("1");
        System.out.println(myConverter(myData));
    }

    private static String myConverter(ArrayList<String> arrayInput) {
        String stringOutput = "";
       //arrayInput = new ArrayList<String>();

        for (int i = 0; i < arrayInput.size(); i++ ) {
            if (Integer.parseInt(arrayInput.get(i)) == 1) {
                stringOutput += "A";          
            } else {
                stringOutput += "B";
            }
        }
        return stringOutput;
    }


    /*public private int binarytoInteger(String binaryStr) {
        int num = 0;
        for (int i = 1; i <= binaryStr.length(); i++) {
            if ()
        }
        return num;
    }*/
}
