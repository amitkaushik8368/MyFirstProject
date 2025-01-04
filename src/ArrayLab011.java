/*
* Program to check the presence of number inside an array
 */
public class ArrayLab011 {
    public static void main(String[] args) {
        int[] array = {23, 65, 43, 76, 98};
        System.out.println(findInteger(array, 98));


    }
    public static boolean findInteger(int[] ints, int k){
        int halfLen = ints.length/2;
        System.out.println(halfLen);
        if (k == ints[halfLen]) return true;
        else if (k>ints[halfLen]){
            for (int i = halfLen+1; i<ints.length; i++){
                if(ints[i] == k) return true;
            }
        }else {
            for (int i = 0; i<halfLen; i++){
                if(ints[i] == k) return true;
            }
        }
        return false;
    }
}
