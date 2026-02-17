package Arrays;

public class MaxSubArraySum {
    public static void maxsubarraysum(int num[]) {
        int currentsum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currentsum=0;
                for(int k=start;k<=end;k++){
                    //System.out.println(num[k]+" ");
                    //subArraySum
                    currentsum+=num[k];
                }
                System.out.println(currentsum);
                if(maxSum<currentsum){
                    maxSum=currentsum;
                }
            }
        }
        System.out.println("Max sum = "+maxSum);
    }
    public static void main(String args[]) {
        int num[] = {1,-2,3 };
        maxsubarraysum(num);
    }
    
}
