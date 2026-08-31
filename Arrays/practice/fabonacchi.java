package Arrays.practice;

public class fabonacchi {
    public static void fabonacchiSeries(int n){
        int first =0;
        int second =1;
        for(int i=0;i<n;i++){// 0 1 1 2 3 5 8 13 21 34 55
            System.out.print(first+" ");
            int next = first+second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        int n=11;
        fabonacchiSeries(n);

    }
    
}
