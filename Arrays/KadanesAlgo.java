package Arrays;

public class KadanesAlgo {
    public static void KadanesSubArraySum(int num[]){
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;

        for(int i=0;i<num.length;i++){
            cursum=Math.max(cursum+num[i],num[i]);
            maxsum=Math.max(cursum,maxsum);
        }
        System.out.println(("Max sum of subArray: "+maxsum));

    }
    public static void main(String args[]){
        int num[] = {-2,3,4,-1,2,8,-3};
        KadanesSubArraySum(num);

    }
    
}
