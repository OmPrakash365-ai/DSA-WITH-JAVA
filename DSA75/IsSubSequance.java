package DSA75;
import java.util.*;
public class IsSubSequance {
    public static boolean findSubsequance(String str1,String str2){
        int i = 0;
        int j = 0;
        while(i < str1.length() && j < str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
            }
            j++;
        }
        return i == str1.length();
    }
    public static void main(String args[]){
        String str1 = "abcd";
        String str2 = "axybmnc";
        boolean result = findSubsequance(str1,str2);
        System.out.println(result);

    }
    
}
