package Function.Methods.FunctionPracticeQ;

public class MathClass {
    public static void main(String args[]) {
        int a= 4;
        int b = 6;
        double c = 25;

        int min = Math.min(a,b);
        int max = Math.max(a,b);
        double result = Math.sqrt(c);
        System.out.println("Minimum value: "+min);
        System.out.println("Maximum vallue: "+max);
        System.out.println("Square root of "+c+" = "+result);

        double base = 2;
        double exponent = 3;
        
        double result1 = Math.pow(base,exponent);
        System.out.println(("Power of the number is : "+result1));

        int num1=10;
        int num2=10;

        double avg= (num1+num2)/2.0;
        System.out.println("Avg of the number: "+avg);


        int num3 = -15;
        int result2= Math.abs(num3);
        System.out.println("Absolute value: "+result2);
    }
    
}
