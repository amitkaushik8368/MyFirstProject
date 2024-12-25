/*
*
* Program to find the second largest number from Array
*
 */
import java.util.Scanner;

public class ArrayLab001 {
    public static void main(String[] args) {
       // int[] arrNum = {4, 7, 6, 1, 9, 2};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] arrNum = new int[size];
        System.out.println("Enter the " + size + " Elements of array");
        for (int i = 0 ; i<size; i++){
            arrNum[i] = scanner.nextInt();
        }

        for(int i = 0; i<size; i++){
            int count = 0;
            for (int j=0; j<size; j++){
                if(arrNum[i] > arrNum[j]){
                    count++;
                }
                //System.out.println("i: " + i + " j: " + j + " Count: " + count);
            }
            if (count == size-2){
                System.out.println("Second largest number: " + arrNum[i]);
                System.exit(0);
            }
        }


    }
}
