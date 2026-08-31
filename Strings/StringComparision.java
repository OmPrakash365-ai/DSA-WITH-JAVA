package Strings;

public class StringComparision {
    public static void main(String args[]){
        String s1="Tony";
        String s2="Tony";
        String s3= new String("Tony");

        if(s1==s2){
            System.out.println("s1 and s2 are same");
        }
        else{
            System.out.println("s1 and s2 are different");
        }

        if(s1==s3){
            System.out.println("s1 and s3 are same");
        }
        else{
            System.out.println("s1 and s3 are different");
        }
        if(s1.equals(s3)){
            System.out.println("s1 and s3 are same");
        }
        else{
            System.out.println("s1 and s3 are different");
        }
    }
    
}
