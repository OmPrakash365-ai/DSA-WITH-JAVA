package DSA75;
import java.util.*;
public class DSAQues1 {
    public static String MergeAlternately(String word1, String word2){

        StringBuilder result = new StringBuilder();

        int i = 0;
        int j = 0;

        while(i < word1.length() || j < word2.length()){
            
            if(i < word1.length()){
                result.append(word1.charAt(i));
                i++;
            }

            if(j < word2.length()){
                result.append(word2.charAt(j));
                j++;
            }
        }
        return result.toString();

    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String : ");
        String word1 = sc.nextLine();

        System.out.println("Enter the Second String : ");
        String word2 = sc.nextLine();

        String result = MergeAlternately(word1,word2);
        System.out.println(result);

    }
    
}
