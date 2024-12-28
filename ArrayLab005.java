/*
*  Shift odd elements to left and even elements to right using same array
 */

import java.util.Arrays;

public class ArrayLab005 {
    public static void main(String[] args) {
        int[] arr = {13, 15, 17, 18, 21, 33, 46};
        arrangeArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void arrangeArray(int[] arr) {
        int len = arr.length;
        int temp;
        for(int i = 0, j = len-1; i<j; i++, j--){
            if (arr[i] % 2 == 0){
                if(arr[j] % 2 !=0 ){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else i--;
            } else if (arr[j] % 2 != 0) {
                j++;

            }
        }

    }
}
