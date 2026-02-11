package Function.Methods;

public class practice {
    public static void deciTobin(int deciNum) {
        int myNum=deciNum;
        int pow =0;
        int binNum=0;
        while(deciNum>0) {
            int rem = deciNum%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));

            pow++;
            deciNum/=2;
        }

        System.out.println("Binary form of "+ myNum + " = "+binNum);
    }

    public static void main(String args[]) {
        deciTobin(7);
    }
}
