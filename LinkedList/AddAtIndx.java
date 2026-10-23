package LinkedList;

public class AddAtIndx {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
    }
   
    public void print(){
        if(head==null){
            System.out.println("LinkedList is empty");

        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void AddAtAnyIdx(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public static void main(String args[]){
        AddAtIndx ll = new AddAtIndx();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);

        ll.AddAtAnyIdx(1,99);

        ll.print();

    }
    
}
