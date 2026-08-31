package Recursion;

public class tilingProblem {
    public static int tilingproblem(int n){ // 2*n (Floor size)

        //base case

        if(n==0 || n==1){
            return 1;
        }

        // kaam
        // vertical choice
        int fnm1 = tilingproblem(n-1);

        // horizontal
        int fnm2 = tilingproblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;

    }
    // removing duplicates
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        //base case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicates
            removeDuplicates(str,idx+1,newStr,map);
        }
        else{
            map[currChar - 'a'] =true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static void main(String args[]){
       // System.out.println(tilingproblem(2));
       String str = "appnnacollege";
       removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);

    }
    
}
