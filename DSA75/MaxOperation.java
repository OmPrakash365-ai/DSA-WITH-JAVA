package DSA75;
import java.util.*;
public class MaxOperation {
    public static int maxOperations(int[] arr,int k){
        Arrays.sort(arr);
        int left =0;
        int right =arr.length -1;
    
        int count = 0;
        while(left < right){
            if(arr[left] + arr[right] == k){
                count++;
                left++;
                right--;
            }
            else if(arr[left] + arr[right] < k){
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 9;
        int result = maxOperations(arr,k);
        System.out.println(result);
    }
    
}
