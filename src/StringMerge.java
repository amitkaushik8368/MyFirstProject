/*
*
* Given a string which has only characters like a, b, c  ex abbacbaa
* Find minimum number of characters to be added to make the string valid
* valid string is concat of abc
*
*
 */

import java.util.Scanner;
public class StringMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String word = scanner.nextLine();
        char[] ch = word.toCharArray();
        for (char c: ch){
            if(c == 'a' || c == 'b' || c == 'c');
            else{
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        System.out.println("Minimum added letters: " + addMinimum(word));
    }

    public static int addMinimum(String word) {

        if(word.replace("abc", "").isEmpty())
        {
            return 0;
        }
        else
        {
            int k = 1, prev = word.charAt(0), n = word.length();
            for (int i = 1; i < n; ++i)
            {
                k += word.charAt(i) <= prev ? 1 : 0;
                prev = word.charAt(i);
            }
            return 3*k-n;
        }
    }

}
