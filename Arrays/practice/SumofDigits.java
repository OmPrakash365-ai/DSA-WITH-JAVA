package Arrays.practice;

public class SumofDigits {
    public static int sumofdigit(int n){
        int sum=0;
        while(n>0){//O(logn)
            int lastdigit=n%10;
            sum+=lastdigit;
            n/=10;
        }
        return sum;

    }
    public static void main(String args[]){
        int n=123456;
        System.out.println(sumofdigit(n));


    }
    
}
