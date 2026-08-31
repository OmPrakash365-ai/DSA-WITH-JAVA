package Strings.Practice;
import java.util.*;
public class CheckAnagram {
    public static void main(String args[]){
        String s1 = "listen";
        String s2 = "silent";

        char a1[] = s1.toCharArray();//string convert into character in array
        char a2[] = s2.toCharArray();

        Arrays.sort(a1);//O(nlogn)
        Arrays.sort(a2);

        if(Arrays.equals(a1,a2)){//O(n)
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not a Anagram");
        }
    }
    //O(n log n)
}
