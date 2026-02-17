package Arrays;

public class MaxSubArraySumPrefix {
    public static void prefixSum(int num[]){
        int currentSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0]=num[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++) {
            prefix[i]=prefix[i-1]+num[i];
        }
        
        for(int i=0;i<num.length;i++) {
            int start=i;
            for(int j=i;j<num.length;j++){
                int end =j;
                currentSum= start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Max sum:"+maxSum);
    }
    public static void main(String args[]){
        int num []= {2,4,6,8,10};
        prefixSum(num);

    }
    
}
