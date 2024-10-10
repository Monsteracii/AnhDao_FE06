public class arraylab5 {
    public static int [] removeElement(int[] myarr, int myvalue) {
        int new_length = 0;
        for (int i = 0; i < myarr.length; i++) {
            if (myarr[i] != myvalue) {
                new_length++;
            }
        }
        int[] newArr = new int[new_length];

        int index = 0; 
        for (int i = 0; i < myarr.length; i++) {
            if (myarr[i] != myvalue) {
                if (myarr[i] != myvalue) {
                    newArr[index] = myarr[i];
                    index++;
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] myarr = {10, 30, 10, 50, 40, 6, 9};

        int myvalue;
        int[] newArr = removeElement(myarr, myvalue);

        for (int element : newArr) {
            System.out.println(element);
        }
    }
}
