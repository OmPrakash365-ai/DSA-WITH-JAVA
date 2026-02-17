package Arrays.Sorting;

public class bubbleSort {
    public static void BubbleSort(int arr[]){
        System.out.println("Total number of swaping: ");
        for(int turn=0; turn<arr.length-1;turn++){
            int swap=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]> arr[j+1]){
                    ///swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            System.out.println(swap);
        }
    }
    public static void printArr(int arr[]){
        System.out.print("Bubble sort: ");
        for(int i=0;i<arr.length;i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        BubbleSort(arr);
        printArr(arr);


    }
    
}
