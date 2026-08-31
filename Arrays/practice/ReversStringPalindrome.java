package Arrays.practice;

public class ReversStringPalindrome {
    public static void reversestringpalindrome(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("String is Palindrome: "+reverse);
        }
        else{
            System.out.println("String is not Palindrome: "+reverse);
        }
    }
    public static void main(String args[]){
        String str = "racacar";
        reversestringpalindrome(str);
    }
    
}
