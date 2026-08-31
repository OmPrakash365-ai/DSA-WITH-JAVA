package Function.Methods;

public class deciToBin {
    public static void decitobin(int deciNum) {
        int myNum=deciNum;
        int pow =0;
        int binNum=0;

        while(deciNum>0) {
            int rem = deciNum%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));

            pow++;
            deciNum/=2;
        }
        System.out.println("Binary Number of "+myNum+" = "+binNum);
    }

    public static void main(String args[]) {
       decitobin(7); 
    }
    
}
