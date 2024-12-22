import java.util.Scanner;

public class StringAlternateMerge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String str1 = scan.nextLine();
        System.out.println("Enter Second String : ");
        String str2 = scan.nextLine();               //String inputs

        int l1 = str1.length();
        int l2 = str2.length();
        int i = 0;
        int j = 0;
        StringBuilder result = new StringBuilder();
        while (i<l1 || j<l2){
            if (i<l1){
                result.append(str1.charAt(i++));
            }
            if (j<l2){
                result.append(str2.charAt(j++));
            }
        }
        System.out.println("Output: " + result);

    }
}
