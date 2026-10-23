package DSA75;
import java.util.*;
public class DSAQues2 {
    public static String GCDOfString(String str1 , String str2){
        if(!(str1+str2).equals(str2+str1)){
            return "Strings are not Equals";
        }

        int gcdLength = gcd(str1.length(),str2.length());

        return str1.substring(0,gcdLength);
    }
    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the Second String: ");
        String str2 = sc.nextLine();
        String result = GCDOfString(str1,str2);
        System.out.println("GCD of String is "+result);


    }
    
}
