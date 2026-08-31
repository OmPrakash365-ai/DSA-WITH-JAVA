package Stack;
import java.util.*;
import java.util.Stack;

public class ReverseString {
     public static int ReverseTheNum(int num){
        Stack<Integer> s = new Stack<>();
        while(num>0){
            int digit = num%10;
            s.push(digit);
            num/=10;
        }

        StringBuilder result = new StringBuilder("");

        while(!s.isEmpty()){
            int value = s.remove(0);
            result.append(value);
        }
        return Integer.parseInt(result.toString());
    }

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
       
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }

       return result.toString();
    }
    public static void main(String args[]){
        String str ="abc";
        int num = 12345;
      //ReverseString obj = new ReverseString();
        String result = reverseString(str);
        int result1 = ReverseTheNum(num);
        System.out.println(result1);

    }
    
}
