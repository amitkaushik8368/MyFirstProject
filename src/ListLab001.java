import java.util.ArrayList;
import java.util.List;

public class ListLab001 {
    public static void main(String[] args) {
        int[] candies = {2,3,6,2,1, 2};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();
        int kids = candies.length, j;
        for(int i=0; i<kids; i++){
            int temp = candies[i] + extraCandies;
            for ( j=0; j<kids; j++){
                if(i==j) continue;
                else if(temp<candies[j]) {
                    result.add(false);
                    break;
                }
            }
            if(j == kids) result.add(true);
        }
        return result;
    }
}
