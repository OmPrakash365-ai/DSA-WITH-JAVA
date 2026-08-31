package Recursion;

public class PairProblem {
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        // int fnm1 = friendsPairing(n-1);

        // //pair
        // int fnm2 = friendsPairing(n-2);
        // int pairways = (n-1)*fnm2;

        // //totalWays
        // int totWays = fnm1 + pairways;
        // return totWays;
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }


        public static void printBinStrings(int n,int lastPlace,String str){
            //base case
            if(n == 0){
                System.out.println(str);
                return ;
            }

            //kaam
            printBinStrings(n-1,0,str+"0");
            if(lastPlace == 0){
                printBinStrings(n-1,1,str+"1");
            }
        }
    public static void main(String args[]){
      // System.out.println(friendsPairing(3));
       printBinStrings(3,0,"");

    }
    
}
