package DSA75;
import java.util.*;
public class UniqueNumberOfOccu {
    public static boolean UniqueNumberOfOccurence(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();

        for(int num:map.values()){
            if(set.contains(num)){
                return false;
            }
            set.add(num);
        }
        return true;
    }
    public static void main(String args[]){
        int[] arr = {2,2,3,3};
        boolean result = UniqueNumberOfOccurence(arr);
        System.out.println(result);
    }
    
}
