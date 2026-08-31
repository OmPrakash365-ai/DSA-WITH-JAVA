package Strings;
import java.util.*;
public class Strings {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
    char arr[] = {'a','b','c','d'};
    String str ="abcd";
    String str2 = new String("xyz");

    //string are immutable in java, we cannot change the value of string on runtime, we can only create new string and assign it to the variable

    // Scanner sc = new Scanner(System.in);
    // String name;
    // name = sc.nextLine();
    // System.out.println(name);

    String FullName = "Om Prakash";
    System.out.println(FullName.length());
    System.out.println(FullName.toLowerCase());
    System.out.println(FullName.toUpperCase());
    System.out.println(FullName.trim()); //removes leading and trailing spaces
    System.out.println(FullName.substring(3)); //returns substring from index 3 to 6
    System.out.println(FullName.substring(3, 7)); //returns substring from index 3 to 6

    //String concatenation
    String firstName = "Om";
    String lastName ="Prakash";
    String fullName = firstName + " " + lastName;
    System.out.println("fullName: "+fullName);


    System.out.println(fullName.charAt(1)); //returns the character at index 1
    System.out.println(fullName.indexOf('a')); //returns the index of first occurrence of 'a'
    System.out.println(fullName.indexOf('a', fullName.indexOf('a')+1)); //returns the index of second occurrence of 'a'
    System.out.println(fullName.indexOf("Prakash")); //returns the index of first occurrence
    

    printLetters(fullName);
    }
    
}

