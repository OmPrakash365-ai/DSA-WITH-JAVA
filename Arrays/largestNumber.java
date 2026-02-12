package Arrays;

public class largestNumber {
    public static int largestnumber(int num[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity
        for(int i=0;i<num.length;i++) {
            if(largest<num[i]) {
                largest = num[i];
            }
            if(smallest>num[i]){
                smallest = num[i];
            }
        }
        System.out.println("Smallest value in the array: "+smallest);
        return largest;
    }
    public static void main(String args[]) {
        int num[] = {1,2,6,3,5};
        System.out.println("Largest value in the array: "+largestnumber(num));
    }
    
}
