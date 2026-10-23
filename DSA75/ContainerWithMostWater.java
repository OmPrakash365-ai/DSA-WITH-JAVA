package DSA75;
import java.util.*;
public class ContainerWithMostWater {
    public static int MostWaterContainer(int[] arr){
        int left = 0;
        int right = arr.length -1;

        int maxWater = 0;

        while(left < right){
            int width = right -left;
            int minHeight = Math.min(arr[left],arr[right]);
            int currArea = width * minHeight;

            maxWater = Math.max(maxWater,currArea);

            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int result = MostWaterContainer(arr);
        System.out.println(result);
    }
    
}
