/*
* Program to sort an array with bubble sort method
 */
public class ArrayLab012 {
    public static void main(String[] args) {
        int[] array = {54, 65, 34, 76, 12, 34, 9};
        int len=array.length;
        int temp = 0;
        for (int i=0; i<len; i++){
            for (int j=0; j<len-i; j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
