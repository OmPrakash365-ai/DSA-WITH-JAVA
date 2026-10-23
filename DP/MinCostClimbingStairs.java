package DP;
import java.util.*;
public class MinCostClimbingStairs {
    public static int mincostclimbingstairs(int[] cost){
        int n = cost.length;

        int prev2 = 0;
        int prev1 = 0;

        for(int i=0;i<n;i++){
            int current = cost[i] + Math.min(prev1,prev2);
            prev2=prev1;
            prev1=current;
        }

        return Math.min(prev1,prev2);
    }
    public static void main(String args[]){
        int[] cost = {10,15,20};
        int result = mincostclimbingstairs(cost);
        System.out.println(result);

    }
    
}
