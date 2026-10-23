package LinkedList;

public class AddFirstPrc {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        AddFirstPrc ll = new AddFirstPrc();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.print();
    }
    
}
