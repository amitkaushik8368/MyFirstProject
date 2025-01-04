/*
*  Shift odd elements to left and even elements to right using same array
 */

import java.util.Arrays;

public class ArrayLab005 {
    public static void main(String[] args) {
        int[] arr = {12, 22, 33, 42, 45, 44, 76, 77, 98, 99, 104};
        arrangeArray(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void arrangeArray(int[] arr) {
        int len = arr.length;
        int temp;
        int i = 0,   j = len-1;

        while( i<j ){
            if (arr[i] % 2 == 0 && arr[j] % 2 !=0 )
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                } else if(arr[i] %2 != 0){
                i++;
                }
             else if (arr[j] % 2 == 0) j--;
            }
        }

    }

