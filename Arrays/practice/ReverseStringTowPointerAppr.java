package Arrays.practice;

public class ReverseStringTowPointerAppr {
    public static void ReverseString(String str){
        char[] arr = str.toCharArray();
        
        int left =0;
        int right= arr.length-1;

        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;

            left++;
            right--;
        }

        System.out.println("Reversed: " + new String(arr));
        
    }
    public static void main(String args[]){
        String str = "Om Prakash";
        ReverseString(str);
    }
    
}
