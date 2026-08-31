package Strings;

public class StringCompression {
    public static String compress(String str){
        String newstr =" ";
        for(int i=0;i<str.length();i++){//O(n)
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count>1){
                newstr += count.toString();
            }
        }
        return newstr;
    }
    public static void main(String args[]){
        String str = "aaabbcccd";
        System.out.println(compress(str));
        
    }

    
}
// do it again with string builder and compare the time taken by both the methods.