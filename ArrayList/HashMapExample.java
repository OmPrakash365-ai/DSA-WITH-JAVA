package ArrayList;
import java.util.*;
public class HashMapExample {
    public static void main(String args[]){
        //Creating Empty hashMap 
        HashMap<Integer, String> students = new HashMap<>();

        // 1. put(key,value)
        // add data to the HashMap
        System.out.println("1. put()");

        students.put(101,"Alice");
        students.put(102,"Bob");
        students.put(103,"Aman");

        System.out.println(students);

        // 2. get(key)
        //Gets the value associated with a key

        System.out.println("\n2. get()");

        System.out.println("Student with ID 101: "+students.get(101));

        // 3. remove(key)
        //removes the key-value pair
        System.out.println("\n3. remove()");

        students.remove(103);
        System.out.println(students);

        //4. containsKey(key)
        //check whether a particular key exists
        System.out.println("\n4. containsKey()");
        
        System.out.println("Does ID 103 exist ? "+students.containsKey(103));

        //5. containsValue(value)
        //check whether a particular value exist
        System.out.println("\n5. containsValue()");

        System.out.println("Does Alice Exist ? "+students.containsValue("Alice"));
        System.out.println("Does Aman Exits ? "+students.containsValue("Aman"));

        //6. size()
        // Returns the number of key-value pairs
        System.out.println("\n6. size()");

        System.out.println("Number of students: "+students.size());

        //7. isEmpty()
        // checks whether HashMap is empty
        System.out.println("\n7. isEmpty()");
        System.out.println("Is HashMap empty ? "+students.isEmpty());

        //8. clear()
        //Removes All key-value pairs
        System.out.println("\n8. clear()");
        students.clear();

        System.out.println("HashMap after clear: "+students);

        //check isEmpty() again

        System.out.println("Is HashMap is Empty now? "+students.isEmpty());

    }
    
}
