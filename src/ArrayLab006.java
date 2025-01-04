/*
*Program to find the largest element from the array
 */

public class ArrayLab006 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 4, 87, 87, 76, 99, 55};
        int j;
        int len = arr.length;
        for(int i=0; i<len; i++){
            for (j=0; j<len; j++){
                if (i==j) continue;
                else if (arr[i]<arr[j])break;
                }
            if (j == len) {
                System.out.println("Largest integer: " + arr[i]);
                System.exit(0);
            }
        }
    }
}
