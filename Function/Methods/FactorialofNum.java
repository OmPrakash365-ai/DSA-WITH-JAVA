package Function.Methods;
import java.util.*;
public class FactorialofNum {
    public static int factorial(int a) {
        int fact = 1;
        for(int i=1;i<=a ;i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int Factorial = factorial(a);
        factorial(a);
        System.out.println("Factorial of number is : "+Factorial); 

    }
}
