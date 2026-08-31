package Arrays.practice;

class RangeOfPrimeNum {
    public static boolean isPrime(int n){
        int count =0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>0){
            return false;
        }
        return true;
    }
    public static int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }  
        int count = 0;
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int n = 10;
        System.out.println(countPrimes(n));
    }
}