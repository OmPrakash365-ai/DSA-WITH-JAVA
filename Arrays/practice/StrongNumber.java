package Arrays.practice;

public class StrongNumber {
    public static int factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void strongnumber(int n){
        int num=n;
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum+= factorial(lastdigit);
            n/=10;

        }
        if(sum==num){
            System.out.println("Strong number: "+num);
        }
        else{
            System.out.println("Not Strong Number: "+num);
        }
    }
    public static void main(String args[]){
        int n=145;
        strongnumber(n);
    }
    
}
