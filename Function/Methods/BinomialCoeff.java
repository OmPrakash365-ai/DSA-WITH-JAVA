package Function.Methods;
import java.util.*;
public class BinomialCoeff {
    public static int factorial(int f) {
        int fact=1;
        for(int i=1;i<=f;i++) {
            fact*=i;
        }
        return fact;
    }
    public static int binCoeff(int n,int r) {
        int n_factorial = factorial(n);
        int r_factorial = factorial(r);
        int nmr_factorial = factorial(n-r);
        int bc = n_factorial/(r_factorial*nmr_factorial);
        return bc;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int BinomialCoeff = binCoeff(n, r);
        binCoeff(n ,r);
        System.out.println("Binomial Coefficient: "+BinomialCoeff);
    }
    
}
