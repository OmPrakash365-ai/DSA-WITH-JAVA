package Recursion;

public class sumofnum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int snm1=sum(n-1);
        int sn=n+snm1;
        return sn;
    }
    //fibonacci series
    public static int fib(int n){//O(2^n)TC and O(n)SC
        if(n==0 || n==1){
            return n;
        }
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        int fn = f1 + f2;
        return fn;

    }
    public static void main(String args[]){
        int n = 25;
       // System.out.println(sum(n));
       System.out.println(fib(n));

    }
    
}
