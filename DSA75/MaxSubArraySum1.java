package DSA75;
import java.util.*;
public class MaxSubArraySum1 {
    public static double MaxSubArraysSum(int[] arr,int k){
        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        int maxSum = windowSum;

        for(int i=k;i<arr.length;i++){
            windowSum = windowSum - arr[i-k] + arr[i];
            maxSum = Math.max(windowSum,maxSum);
        }
        return (double) maxSum/k;
    }
    public static void main(String args[]){
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        double result = MaxSubArraysSum(arr,k);
        System.out.println(result);
    }
    
}
