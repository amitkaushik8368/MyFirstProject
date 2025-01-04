public class ThirdClass {
    public static void main(String[] args) {
        System.out.println("This is third sample class");
        String str = "abc";
        String str1 = "xyz";
        String output = "";

        if(str.length() == str1.length()){
            for (int i=0; i<str.length(); i++){
                output = output + str.charAt(i) + str1.charAt(i);
            }
            System.out.println(output);
        } else if (str.length() > str1.length()) {
            int i;
            for (i=0; i<str1.length(); i++){
                output = output + str.charAt(i) + str1.charAt(i);
            }
            output = output + str.substring(i);
            System.out.println(output);
        } else {
            int i;
            for (i=0; i<str.length(); i++){
                output = output + str.charAt(i) + str1.charAt(i);
            }
            output = output + str1.substring(i);
            System.out.println(output);
        }




    }
}
