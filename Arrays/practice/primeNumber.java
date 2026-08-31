package Arrays.practice;

public class primeNumber {
    public static void PrimeNumber(int n){
        if(n<=1){
            System.out.println("Not a prime number");
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(n + " is Not a prime number");
                return ;
            }
        }
        System.out.println(n + " is a prime number");
    }
    public static void main(String args[]){
        int n=81;
        PrimeNumber(n);
    }
    
}
