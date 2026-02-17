package Arrays.practice;

import java.util.HashSet;

public class DistinctElement {
    public static boolean containsDuplicate(int nums[]){//o(n)
        HashSet <Integer> set = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
    // public static boolean distinctElement(int nums[]){ // o(n^2)
    //     boolean result = false;
    //     for(int i=0;i<nums.length-1;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[j]==nums[i]){
    //                 result=true;
    //             }
    //         }
    //     }
    //     return result;
    // }
    public static void main(String args[]){
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        //System.out.println(distinctElement(nums));
        System.out.println(containsDuplicate(nums));

    }
}


