package OOPs;

public class Inheritance {
    public static void main(String args[]){
        // fish shark = new fish();
        // shark.eat();
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs=4;
        Mammals cow = new Mammals();
        cow.walk();
        //System.out.println(dobby.legs);

    }
    
}
//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breaths");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}





// class Mammals extends Animal{
//     int legs;
// }


// class Dog extends Mammals{
//     String breed;
// }

//derived class
// class fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swim in water");
//     }
// }
