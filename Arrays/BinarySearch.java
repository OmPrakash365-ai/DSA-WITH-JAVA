package Arrays;

public class BinarySearch {
    public static int binarysearch(int num[],int key) {
        int start=0;
        int end=num.length -1;
        while(start<=end) {
            int mid = (start+end)/2;

            // comparisions
            if(num[mid]==key) { //found
                return mid;
            }
            if(num[mid]<key) {
                start=mid+1; //right
            }
            else{
                end = mid-1; //left
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int num[] = {2,4,6,8,10,12,14};
        int key =10;
        System.out.println("index of key value is : "+binarysearch(num, key));
    }
    
}
