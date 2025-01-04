/*
*
* Given two Strings str1 and str2
* One string should be the concat sequence of the other
* We have to find the greatest common divisor that will divide both the strings
*
*
 */

import java.util.Scanner;

public class GreatestStringDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first String below: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second String below: ");
        String str2 = scanner.nextLine();
        int len1 = str1.length(), len2 = str2.length();
        for (int i=Math.min(len1,len2); i>0; i--){
            if(logicCalc(str1, str2, i)){
                String base = str1.substring(0, i);
                System.out.println("Greatest Common Divisor: " + base);
                System.exit(0);
            }
        }
        System.out.println("No common divisor present");


    }
    public static boolean logicCalc(String str1, String str2, int k){
        int len1 = str1.length(), len2 = str2.length();
        if(len1 % k > 0 || len2 % k >0){
            return false;
        }else {
            String base = str1.substring(0,k);
            return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
        }

    }
}
