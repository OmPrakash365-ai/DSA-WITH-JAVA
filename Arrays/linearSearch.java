package Arrays;

public class linearSearch {
    public static int linearsearch(int numbers[],int key) {
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static void StringSearch(String menu[],String item) {
        for(int i=0;i<menu.length;i++) {
            if(menu[i]==item) {
                System.out.println("index at: "+i+"\nitem: "+item);
            }
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        String menu[]= {"dosa","Samosa","bhatura"};
        String item = "dosa";
        int key=10;
        int index = linearsearch(numbers,key);
        StringSearch(menu, item);
        System.out.println("Key is at index "+index);
    }
}
