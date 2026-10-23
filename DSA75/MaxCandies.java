package DSA75;
import java.util.*;
public class MaxCandies {
    public  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();

        int maxcandies =0;
        for(int candy:candies){
            if(candy>maxcandies){
                maxcandies = candy;
            }
        }
        for(int candy:candies){
            if(candy+extraCandies>=maxcandies){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String args[]){
        int[] arr = {2,3,5,1,3};
        int extraCandies = 3 ;
        List<Boolean>  result = kidsWithCandies(arr,extraCandies);
        System.out.println(result);

    }
    
}
