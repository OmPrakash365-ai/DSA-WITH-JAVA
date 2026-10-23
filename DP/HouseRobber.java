package DP;

public class HouseRobber {
    public static int houseRobber(int[] arr){
        int prev2 = 0;
        int prev1 = 0;

        for(int i=0;i<arr.length;i++){
            int current = Math.max(prev1,prev2+arr[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,1}; // 4
        int result = houseRobber(arr);
        System.out.println(result);

    }
    
}
