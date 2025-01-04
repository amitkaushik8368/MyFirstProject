/*
*Program to find the largest and smallest integer inside an array
 */

public class ArrayLab007 {
    public static void main(String[] args) {
        int[] arr = {10, 99, 9, 23, 65, 12, 44, 87, 10};
        System.out.println("Smallest integer inside array : " + smallInteger(arr));
        System.out.println("Largest Integer inside array : " + largeInteger(arr));
    }

    private static int largeInteger(int[] arr) {
        int largeInt = arr[0];
        for(int num:arr){
            if (num >largeInt) largeInt = num;
        }
        return largeInt;
    }

    private static String smallInteger(int[] arr) {
        int smallInt = arr[0];
        for (int num : arr){
            if(num<smallInt) smallInt = num;
        }
        return String.valueOf(smallInt);
    }

}
