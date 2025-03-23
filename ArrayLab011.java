/*
* Program to check the presence of number inside an array
 */
public class ArrayLab011 {
    public static void main(String[] args) {
        int[] array = {23, 65, 43, 76, 98};
        System.out.println(findInteger(array, 100));

    }
    public static boolean findInteger(int[] ints, int k){
        for(int num:ints){
            if (num == k) return true;
        }

        return false;
    }
}
