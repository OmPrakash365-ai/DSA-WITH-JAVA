package DSA75;

public class VowelsCount {
    public static boolean isVowels(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u';
    }
    public static int CountVowels(String str, int k){
        int vowelsCount = 0;
        for(int i=0;i<k;i++){
            if(isVowels(str.charAt(i))){
                vowelsCount++;
            }
        }
        int maxVowels = vowelsCount;

        for(int i=k;i<str.length();i++){
            if(isVowels(str.charAt(i-k))){
                vowelsCount--;
            }
            if(isVowels(str.charAt(i))){
                vowelsCount++;
            }
            maxVowels = Math.max(maxVowels,vowelsCount);
        }
        return maxVowels;
    }
    public static void main(String args[]){
        String str = "abedieofu";
        int k = 9;
        int result = CountVowels(str,k);
        System.out.println(result);
    }
    
}
