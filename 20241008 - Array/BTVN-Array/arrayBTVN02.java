import java.util.ArrayList;
import java.util.Scanner;

public class arrayBTVN02 {

    private static  ArrayList<Integer> getElementGreater(ArrayList<Integer> inputArr, int myNumber) {
        ArrayList<Integer> resultArr = new ArrayList<Integer>();
        for (int i = 0; i < inputArr.size(); i++) {
            if (inputArr.get(i) > myNumber) {
                resultArr.add(inputArr.get(i));
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); 
        System.out.print("Nhap mot so bat ky: ");
        int myNumber = myScanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        arr.add(1); 
        arr.add(2); 
        arr.add(3); 
        arr.add(4); 
        arr.add(5); 
        arr.add(6); 
        arr.add(7); 
        ArrayList<Integer> ansArr = getElementGreater(arr, myNumber);
        //System.out.println(ansArr.length);
        for (int i = 0; i < ansArr.size(); i++) {
            System.out.print(ansArr.get(i) + ",");
        }
    }
}
