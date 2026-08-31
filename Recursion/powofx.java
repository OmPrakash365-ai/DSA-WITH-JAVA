package Recursion;

public class powofx {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        // int xnm1=pow(x,n-1);
        // int xn=x*xnm1;
        int power=x*pow(x,n-1);
        return power;
    }
    //optimizied
    public static int optimizedPower(int x,int n){ 
        if(n==0){
            return 1;
        }
      // int halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);//O(N)
       int halfPower = optimizedPower(x,n/2);
       int halfPowerSq= halfPower * halfPower; //O(logn)
       //n is odd
       if(n % 2 != 0){
          halfPowerSq = x * halfPowerSq;
       }
       return halfPowerSq;

    }
    public static void main(String args[]){
        int x=2;
        int n=5;
        System.out.println(optimizedPower(x,n));
    }
    
}
