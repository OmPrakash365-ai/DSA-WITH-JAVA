package ArrayList;
import java.util.*;
public class ArrayListBasic {
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add Element
        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9); //O(n)

        System.out.println(list);

        //get Operation - O(1)

        int element = list.get(2);
        System.out.println(element);

        //delete
        list.remove(2);
        System.out.println(list);

        //Set 
        list.set(2,10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));


        System.out.println(list.size());

        //print theArrayList

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    } 
}
