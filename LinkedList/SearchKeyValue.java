package LinkedList;

public class SearchKeyValue {
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
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next = newNode;
    }

    int search(int key){
        Node temp = head;
        int idx =0;

        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }
    public static void main(String args[]){
        SearchKeyValue ll = new SearchKeyValue();

        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);

        System.out.println(ll.search(30));
        System.out.println(ll.search(50));

    }
    
}
