package Arrays;

public class PairsInArray {

    public static void pairsinarray(int num[]) {
        int tp=0;
        
        for(int i=0;i<num.length;i++) {
            int current=num[i]; //2,4,6,8,10,12
            for(int j=i+1;j<num.length;j++) {
                System.out.print("(" + current + "," + num[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs: "+tp);
    }
    public static void main(String args[]) {
        int num[] = {2,4,6,8,10,12};
        pairsinarray(num);

    }
    
}
