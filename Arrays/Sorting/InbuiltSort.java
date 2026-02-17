package Arrays.Sorting;
import java.util.*;
//import java.util.Arrays;
public class InbuiltSort {
    public static void printArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int comparetor(int a, int b){
        // a<b -ve
        //a===b 0
        //a>b +ve
        return b-a;
    }
    public static void main(String args[]){
        //int arr[] = {5,4,1,3,2};
        Integer arr[] = {5,4,1,3,2}; // object 
        //Arrays.sort(arr); sort all the element
        //Arrays.sort(arr,0,3); // sorrt only specific element

        //import java.util.collections;
        //Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr);

    }
    
}
