package DSA75;

public class CanPlaceFlower {
    public static Boolean canplaceflower(int[] flowerbed,int n){
        if(n==0){
            return true;
        }
        for(int i=0;i<flowerbed.length;i++){

            if(flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i-1] == 0) && 
                (i == flowerbed.length -1  || flowerbed[i+1] == 0)){
                    flowerbed[i] = 1;
                    n--;

                    if(n==0){
                        return true;
                    }
                }
        }
        return false;
    }
    public static void main(String args[]){
        int[] flowerbed = {1,0,1,0,1,0,1};
        int n = 0;
        Boolean result = canplaceflower(flowerbed,n);
        System.out.println(result);

    }
    
}
