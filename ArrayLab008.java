/*
* Program to find the second largest integer inside an array
 */
public class ArrayLab008 {
    public static void main(String[] args) {
        int[] array = {34, 54, 23, 76, 56, 76};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;
        for(int num: array) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num !=firstLargest) secondLargest = num;
            System.out.println("First Largest: " + firstLargest + " Second Largest: " + secondLargest);
        }


    }
}
