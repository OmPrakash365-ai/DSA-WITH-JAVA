package DSA75;

public class LongestSubArrayof1AfterDeletingOneElement {
    public static int AfterDeletingOneElement(int[] arr){
        int left = 0;
        int zeroCount=0;
        int maxLength = 0;

        for(int right = 0;right<arr.length;right++){
            if(arr[right]==0){
                zeroCount++;
            }
            while(zeroCount>1){
                if(arr[left] ==0){
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength,right-left);
        }
        return maxLength;
    }
    public static void main(String args[]){
        int[] arr = {1,1,0,1};
        int result = AfterDeletingOneElement(arr);
        System.out.println(result);

    }
    
}
