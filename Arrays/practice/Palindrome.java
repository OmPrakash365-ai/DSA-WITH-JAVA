package Arrays.practice;

public class Palindrome {
    public static boolean isPalindrome(int n){
        int num=n;
        int reversed=0;
        if(n<0){
            return false;
        }
        while(n>0){//O(logn)
            int lastdigit=n%10;
            reversed=reversed*10+lastdigit;
            n/=10;
        }
        return num==reversed;

    }
    public static void main(String args[]){
        int n=121;
        if(isPalindrome(n)){
            System.out.println("Palindrome: "+n);
        }
        else{
            System.out.println("Not Palindrome: "+n);
        }
    }
    
}
