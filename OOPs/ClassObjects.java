package OOPs;

public class ClassObjects {
    public static void main(String args[]){
        Pen p1 = new Pen();// created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());


        BankAccount myAcc = new BankAccount();
        myAcc.username = "Om Prakash";
        myAcc.setPassword("abcdefg");
        System.out.println(myAcc.username);
        System.out.println(myAcc.getPassword());
    }
    
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
    public String getPassword(){
        return password;
    }
}

class Pen {
    private String  color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}

class Student {
    String name;
    int age ;
    float percentage ;

    void calPercentage(int phy,int chem,int math){
        percentage = (phy+chem+math)/3;
    }
}
