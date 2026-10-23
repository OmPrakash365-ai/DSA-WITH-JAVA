package DSA75;

public class Increasingtriplatenumber {
    public static boolean Sequencetriplate(int[] arr){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int num:arr){
            if(num<=first){
                first = num;
            }
            else if(num<=second){
                second = num;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[] arr = {5,4,3,2,1};
        boolean result = Sequencetriplate(arr);
        System.out.println(result);

    }
    
}
