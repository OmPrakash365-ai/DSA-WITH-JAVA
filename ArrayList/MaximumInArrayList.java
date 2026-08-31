package ArrayList;
import java.util.*;
public class MaximumInArrayList {
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<list.size();i++){
            // if(list.get(i)>max){
            //     max=list.get(i);

            // }
            max = Math.max(max,list.get(i));
        }
           for(int i=0;i<list.size();i++){
            // if(list.get(i)<min){
            //     min=list.get(i);

            // }
            min = Math.min(min,list.get(i));
        }
        
        System.out.println(max);
        System.out.println(min);

    }
    
}
