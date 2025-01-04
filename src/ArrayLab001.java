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

/* From Chat gpt
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Check for valid array size
        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the second largest element
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                // Update largest and second largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // Update second largest if it's smaller than the largest
                secondLargest = num;
            }
        }

        // Check if second largest exists
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements are equal).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}

 */