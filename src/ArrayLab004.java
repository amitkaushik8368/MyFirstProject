/*
* Program to shift odd numbers to left and even numbers to right with taking another array
 */

import java.util.Arrays;

public class ArrayLab004 {
    public static void main(String[] args) {
        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
        int len = arr.length;
        int count =0;
        int count1 = len-1;
        int[] res = new int[len];
        for(int i =0 ; i<len; i++) {
            if (arr[i] % 2 != 0) {
                res[count] = arr[i];
                count++;
            }
        }
        for(int j = 0; j<len; j++){
                if(arr[j] % 2 == 0){
                    res[count1] = arr[j];
                    count1--;
                }
            }


        System.out.println(Arrays.toString(res));

    }

}
