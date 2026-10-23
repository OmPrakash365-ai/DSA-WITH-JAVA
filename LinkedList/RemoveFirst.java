package LinkedList;

public class RemoveFirst {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public void print(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        RemoveFirst ll = new RemoveFirst();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.print();

        ll.removeFirst();

        ll.print();

    }
    
}
