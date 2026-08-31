package Strings.Practice;

public class CheckPalindrome {
    public static void isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)== str.charAt(str.length()-1-i)){
                System.out.println("Palindrome");
                break;
            }
            else{
                System.out.println("Not a Palindrome");
                break;
            }
        }
    }
    public static void main(String args[]){
        String str = "hello";
        isPalindrome(str);

    }
    
}
