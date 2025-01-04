public class StringDivisor {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";


        String output = str1.substring(str2.length());
        System.out.println(output);
        int i = 10;
        int x = 10;
        int j = i--;
        int y = --x;
        System.out.println("j: " + j + "\ny: " + y);
    }

}
