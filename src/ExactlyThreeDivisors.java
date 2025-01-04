import java.util.ArrayList;

/*
*Program to return true only if the number has exactly three positive divisors otherwise return false
* example 5 has 1, 5 only two positive divisors so program should return false
* ex- 9 has 1, 3, 9 three positive divisors so the program should return true
 */
public class ExactlyThreeDivisors {
    public static void main(String[] args) {
        System.out.println(threeDivisors(9));
    }
    public static boolean threeDivisors(int number){
        int divisor = number;
        int count = 0;
        ArrayList<Integer> divisors = new ArrayList<>();
        while(divisor>0){
            if (number%divisor == 0)
            {
                divisors.add(divisor);
                count++;
            }
            divisor--;
        }

        if (count ==3)
        {
            System.out.println("The list of divisors for input " + number + " are exactly 3 : " + divisors);
            return true;
        }
        else if (count <3){
            System.out.println("The list of divisors for input " + number + " are less than 3: " + divisors);
            return false;
        } else {
            System.out.println("The list of divisors for input " + number + " are more than 3: " + divisors);
            return false;
        }
    }
}
