package DSA75;
import java.util.*;
public class graycode{
    public static List<Integer> grayCode(int n){
        List<Integer> result = new ArrayList<>();
        int total = 1 << n;
        for(int i=0;i<total;i++){
            result.add(i ^ (i >> 1));
        }
        return result;
    }
    public static void main(String args[]){
        int n = 2;
        List<Integer> result = grayCode(n);
        System.out.println(result);

    }
    
}
