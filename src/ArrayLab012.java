import java.util.Arrays;

/*
* Program to sort an array with bubble sort method
 */
public class ArrayLab012 {
    public static void main(String[] args) {
        int[] array = {54, 65, 34, 76, 12, 34, 9};
        int len=array.length;
        int temp = 0;
        for (int i=0; i<len; i++)
        {
            //i=1,j<5 array = {54, 34, 65, 12, 34, 9, 76}
            for (int j=0; j<len-i-1; j++)
            {
                if(array[j]>array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
