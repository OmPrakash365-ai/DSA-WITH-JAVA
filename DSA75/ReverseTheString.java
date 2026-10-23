package DSA75;

public class ReverseTheString {
    public static String ReversetheString(String s){
        String[] words = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for(int i=words.length -1 ;i>=0;i--){
            result.append(words[i]+" ");
        }
        return result.toString();

    }
    public static void main(String args[]){
        String str = "  the sky is blue  ";
        String result = ReversetheString(str);
        System.out.println(result);

    }
    
}
