package Function.Methods.FunctionPracticeQ;

public class checkPalindrome {
    public static int IsPalindrome(int n) { //121
        int num=n;
        int reverse=0;
        while(n!=0) {
            int lastdigit=n%10; //123
            reverse = lastdigit + reverse * 10;
            n/=10;
        }
        return reverse;
    }

    public static void main(String args[]) {
        System.out.println(IsPalindrome(121));
    }
}
