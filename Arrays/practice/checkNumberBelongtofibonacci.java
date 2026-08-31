package Arrays.practice;

public class checkNumberBelongtofibonacci {
    public static void NumberBelongtofibo(int num,int target){
        int first =0;
        int second = 1;
        if(target == first || target == second){
            System.out.println(target+ " belongs to fibonacci seroes");
            return ;
        }

        for(int i=2;i<num;i++){// 0 1 1 2 3 5 8 13
            int next = first + second;
            if(next==target){
                System.out.println(target+" belongs to fibonacci series");
                return;
            }
            first = second;
            second = next;
        }
        System.out.println(target+ " does not belong to fibonacci series");
    }
    public static void main(String args[]){
        int num=10;
        int target=13;
        NumberBelongtofibo(num,target);
    }
    
}
