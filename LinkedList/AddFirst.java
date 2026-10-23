package LinkedList;

public class AddFirst {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;  

    public void addFirst(int data){
        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }

    public void removelast(){
        if(head == null){
            System.out.println("List is empty");
            return ;
        }
        if(head.next==null){
            head = null;
            return ;
        }

        Node temp = head;
        while(temp.next.next !=null){
            temp=temp.next;
        }
        temp.next = null;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        AddFirst ll = new AddFirst();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);

        ll.print();

        ll.removelast();

        ll.print();

    }
}
