package DP;

public class StairsProblem {
    public static int climbsStairs(int n){
        if(n<=2){
            return n;
        }
        int prev2 = 1;
        int prev1 = 2;

        for(int i=3;i<=n;i++){
            int current = prev1+prev2;

            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static void main(String args[]){
        int n = 4;
        int result = climbsStairs(n);
        System.out.println(result);

    }
    
}
