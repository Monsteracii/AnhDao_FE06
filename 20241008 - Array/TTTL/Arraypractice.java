public class Arraypractice {
    public static void main(String[] args) {
        int[] arr;
        arr = new int [6];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        System.out.println("Length of array: " + arr.length);

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + "; ");
        }
    }
}
