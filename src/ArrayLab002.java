/*
*Program to find the largest and smallest number in any nums
*
 */

public class ArrayLab002 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2,2, 3, 3, 3,3, 3, 4, 4, 4};
        int length = nums.length;
        int min = 0, max = 0;
        for (int i = 0; i<length; i++){
            int count = 0;
            int count1 = 0;
            for (int j=0 ; j<length; j++){
                if (i == j)
                    continue;
                else if (nums[i]>nums[j])
                    count++;
                else if (nums[i] == nums[j]) {
                    count1++;

                }
            }
            if (count ==0)   min = nums[i];
            else if(count == (length-1) || count == (length - count1 -1)) max = nums[i];
        }
        System.out.println("Min: " + min + " Max: " + max);

    }
}
