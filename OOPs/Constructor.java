package OOPs;

public class Constructor {
    public static void main(String args[]){
        Student s1 = new Student();
        //System.out.println(s1.name);
        Student s2 = new Student("Om");
        Student s3 = new Student(1234);
    }

    
}

class Student {
    String name ;
    int roll;

    Student(){
        this.name = name;
        System.out.println("Constructor is called");
    }

    Student(String name){
        this.name = name;
        System.out.println(name);
    }
    Student(int roll){
        this.roll = roll;
        System.out.println(roll);
    }
}
