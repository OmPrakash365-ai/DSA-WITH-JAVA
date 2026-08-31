package Strings;
import java.util.*;
public class StringBuilderExample {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<'z';ch++){
            sb.append(ch);
        }//abcdefghijklmnopqrstuvwxy
        //sb.delete(2, 5);//abfghijklmnopqrstuvwxy
        //sb.reverse();
        //sb.insert(2, "hello");//abhellofghijklmnopqrstuvwxy
        //sb.replace(2, 5, "hello");//abhellolmnopqrstuvwxy
        //System.out.println(sb.charAt(2));
        //O(n) time complexity 
        //sb.length() returns the length of the string builder
        //sb.capacity() returns the total capacity of the string builder
        //sb.setCharAt(2, 'z');//abzdefghijklmnopqrstuvwxy
        //sb.trimToSize();//trims the capacity to the current length of the string builder
    
        System.out.println(sb);
    }
    
}
