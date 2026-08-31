package Function.Methods.FunctionPracticeQ;

public class checkPalindrome {
    public static void IsPalindrome(int n) { //121
        int num=n;
        int reverse=0;
        while(n!=0) {
            int lastdigit=n%10; //123
            reverse = lastdigit + reverse * 10;
            n/=10;
        }
        if(num==reverse){
            System.out.println("The number is Palindrome: "+reverse);
        }
        else{
            System.out.println("The number is not a palindrome: "+reverse);
        }
    }

    public static void main(String args[]) {
        IsPalindrome(122);
    }
}
