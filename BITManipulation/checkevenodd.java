package BITManipulation;

public class checkevenodd {
    public static void oddorEven(int n){
        int bitMask = 1;
        if((n & bitMask )==1){
            System.out.println("Odd Number ");
        }
        else{
            System.out.println("even number");
        }
    }
    public static void main(String args[]){
        oddorEven(3);
        oddorEven(4);
        oddorEven(11);

    }
    
}
