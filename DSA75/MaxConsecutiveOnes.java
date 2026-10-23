package DSA75;
import java.util.*;
public class MaxConsecutiveOnes {
    public static int ConsecutiveOnesMax(int[] arr, int k){
        int left = 0;
        int zeroCount=0;
        int maxLength = 0;

        for(int right = 0;right<arr.length;right++){
            if(arr[right] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(arr[left] == 0){
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    public static void main(String args[]){
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 1;
        int result = ConsecutiveOnesMax(arr,k);
        System.out.println(result);
    }
    
}
