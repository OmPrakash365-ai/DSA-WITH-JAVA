package Function.Methods;
import java.util.*;
public class SumOfNum {

    //     public static void calculateSum(int a, int b) {//parameter/formal parameters a and b if i use num1 and num2 in place of a and b then it is correct
    //         int sum = a+b;
    //         System.out.println("Sum is "+sum);
    //     }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     calculateSum(a,b);
    // }
    



public static int calculateSum(int num1, int num2)
 {
    int sum = num1+num2;
    return sum;
 }
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = calculateSum(a, b);// arguments or actual parameters
    System.out.println("Sum is "+sum);
 }
}