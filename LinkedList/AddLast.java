package LinkedList;

public class AddLast {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
   
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }
        Node temp = head;

        while(temp.next != null){
            temp=temp.next;
        }
        temp.next = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        AddLast ll = new AddLast();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();

    }
    
}
