package Strings.Practice;

public class capitalizeFirstLetter {
    public static void CapitalizeFirstLetter(String str){
        String result =" ";
        result = result+Character.toUpperCase(str.charAt(0));

        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==' '){
                result = result + Character.toUpperCase(str.charAt(i));
            }
            else{
                result = result+str.charAt(i);
            }
        }
        System.out.println(result);
    }
    public static void main(String args[]){
        String str = "hello world java";
        CapitalizeFirstLetter(str);

    }
    
}
