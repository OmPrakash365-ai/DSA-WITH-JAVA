package LinkedList;

public class InsertAtAnyIndex {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void add(int idx,int data){
        //if we want to inser at first postion
        if(idx ==0){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return ;
        }

        //create new node
        Node newNode = new Node(data);

        //start from head
        Node temp = head;

        //reach the node before the required index
        for(int i=0;i<idx-1;i++){
            temp = temp.next;
        }
        //
        newNode.next = temp.next;
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
        InsertAtAnyIndex ll = new InsertAtAnyIndex();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);

        ll.print();
        ll.add(2,25);
        ll.print();

    }
    
}
