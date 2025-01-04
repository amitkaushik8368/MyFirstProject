/*
*Program to sort an array without Arrays.sort method
 */

import java.util.Arrays;

public class ArrayLab010 {
    public static void main(String[] args) {
//        int[] array = {23, 19, 15, 15, 27};
//        int[] result = new int[array.length];
//
//        boolean[] used = new boolean [array.length];
//        System.out.println(Arrays.toString(used));
//
//        for(int i =0; i<array.length; i++){
//            int count =0;
//            for (int j = 0; j<array.length;j++){
//                if (i==j) continue;
//                else if (array[i]>array[j]){
//                    count++;
//                } else if(array[i] == array[j]) count++;

//            }
//            result[count] = array[i];
//        }
//        System.out.println(Arrays.toString(result));

        // Chargpt

        int[] array = {23, 15, 15,15,  19, 27};
        int[] result = new int[array.length];
        boolean[] used = new boolean[array.length]; // To track occupied indices

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (i == j) continue;
                else if (array[i] > array[j]) {
                    count++;
                }
            }

            // Handle duplicates
            while (used[count]) {
                count++; // Increment count to find the next available slot
            }
            result[count] = array[i];
            used[count] = true;
        }
        System.out.println(Arrays.toString(result));

    }
}
