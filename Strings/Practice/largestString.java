package Strings.Practice;

public class largestString {
    public static void largeststring(String fruits[],String largest){
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        String fruits[] = {"apple","banana","mango","grapes"};
        String largest = fruits[0];
        largeststring(fruits,largest);
    }
    
}
