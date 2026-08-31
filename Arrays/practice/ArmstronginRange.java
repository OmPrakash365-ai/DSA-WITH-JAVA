package Arrays.practice;

public class ArmstronginRange {
    public static boolean armstrongnumberinrange(int n){
        int num=n;
        int sum=0;
        
        int count =0;
        int temp=n;
        while(temp>0){
            count++;
            temp/=10;
        }
        while(n>0){
            int r = n%10;
            sum+=Math.pow(r,count);
            n/=10;
        }
        return sum==num;
    }
    public static void main(String args[]){
        int start =1;
        int end = 1000;
        int totalcount=0;
        for(int i=start;i<=end;i++){
            if(armstrongnumberinrange(i)){
                System.out.println(i + " ");
                totalcount++;
            }
        }
        System.out.println("Total number of count: "+totalcount);
    }
    
}
