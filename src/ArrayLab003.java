import java.util.Arrays;

public class ArrayLab003 {
    public static void main(String[] args) {
        int[] array = {4, 5, 6};
        System.out.println("The array  is : " + Arrays.toString(array));
        System.out.println("Greater common divisor of both max and min number in array is : " + findGCD(array));
    }
    public static int findGCD(int[] nums) {
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
        if(max%min == 0) return min;
        else{
            int gcdNum = min;
            while(max % gcdNum !=0 || min % gcdNum !=0){
                gcdNum--;
            }
            return gcdNum;
        }


    }
}
