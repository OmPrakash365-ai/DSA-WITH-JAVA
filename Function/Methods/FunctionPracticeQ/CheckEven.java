package Function.Methods.FunctionPracticeQ;

public class CheckEven {
    public static boolean isEven(int n) {
        boolean Even = true;
        if(n%2!=0) {
            Even = false;
        }
        return Even;
    }
    public static void main(String args[]) {
        System.out.println(isEven(4));
    }
    
}
