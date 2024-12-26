/*
*Program to find the largest and smallest number in any array
*
 */

public class ArrayLab002 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2,2, 3, 3, 3,3, 3, 4, 4, 4};
        int length = array.length;
        int min = 0, max = 0;
        for (int i = 0; i<length; i++){
            int count = 0;
            int count1 = 0;
            for (int j=0 ; j<length; j++){
                if (i == j)
                    continue;
                else if (array[i]>array[j])
                    count++;
                else if (array[i] == array[j]) {
                    count1++;

                }
            }
            if (count ==0)   min = array[i];
            else if(count == (length-1) || count == (length - count1 -1)) max = array[i];
        }
        System.out.println("Min: " + min + " Max: " + max);

    }
}
