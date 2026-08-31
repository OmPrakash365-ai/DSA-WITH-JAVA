package Arrays.practice;

public class ArmstrongNumber {
    public static void armstrongnumber(int n){
        int num=n;
        int sum=0;
        int count = String.valueOf(n).length();
        while(n>0){
            int r=n%10;
            sum+=Math.pow(r,count);
            n=n/10;
            
        }
        if(sum==num){
            System.out.println(num+ " ArmStrongNumber");
        }
        else{
            System.out.println(num+" Not a armstrong number");
        }

    }
    public static void main(String args[]){
        int n =9;
        armstrongnumber(n);

    }
    
}
