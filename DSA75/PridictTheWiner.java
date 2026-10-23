package DSA75;

public class PridictTheWiner {
    public static boolean pridictTheWiner(int[] nums){
        int n = nums.length;

        int[] dp = new int[n];

        for(int i=0;i<n;i++){
            dp[i] = nums[i];
        }

        for(int len=2;len<=n;len++){
            for(int i=0;i+len<=n;i++){
                int j = i+len-1;
                dp[i] = Math.max(nums[i] - dp[i+1],nums[j] - dp[i]);
            }
        }
        return dp[0] >= 0;
    }
    public static void main(String args[]){
        int[] nums = {1,5,2};
        boolean result = pridictTheWiner(nums);
        System.out.println(result);

    }
    
}
