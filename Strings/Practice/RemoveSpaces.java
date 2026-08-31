package Strings.Practice;

public class RemoveSpaces {
    public static void removespace(String str,String result){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
    public static void main(String args[]){
        String str = "hello world java";
        String result = "";
        removespace(str,result);

    }
    
}
