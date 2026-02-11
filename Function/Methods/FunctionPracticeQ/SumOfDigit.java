package Function.Methods.FunctionPracticeQ;

public class SumOfDigit{
    public static int sumofdigit(int n) {
        int sum=0;
        while(n>0) {
            int lastDigit=n%10;
            sum+=lastDigit;
            n/=10;
        }
        return sum;
    }
    public static void main(String args[]) {
        System.out.println(sumofdigit(12345));
    }
    
    
}
