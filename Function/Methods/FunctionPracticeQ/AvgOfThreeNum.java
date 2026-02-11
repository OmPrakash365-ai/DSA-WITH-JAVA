package Function.Methods.FunctionPracticeQ;

public class AvgOfThreeNum {
    public static int avgofthreenum(int a,int b,int c) {
        int avg=(a+b+c)/3;
        return avg;
    }

    public static void main(String args[]) {
        int avg = avgofthreenum(122,34,57);
        System.out.println(avg);
    }
}
