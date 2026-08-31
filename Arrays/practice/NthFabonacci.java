package Arrays.practice;

public class NthFabonacci {
    public static void nthfabonacci(int n){//0 1 1 2 3
        int first = 0;
        int second = 1;
        if(n==0){
            System.out.println("0th fibonacci number is 0");
        }
        if(n==1){
            System.out.println("1st fibonacci number is 1");
        }
        int next =0;
        for(int i=2;i<=n;i++){
            next =first+second;
            first=second;
            second=next;
        }
        System.out.println(n+"th fibonacci number is "+next);
    }
    public static void main(String args[]){
        int n=4;
        nthfabonacci(n);
    }
    
}
