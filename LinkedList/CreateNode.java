package LinkedList;

public class CreateNode {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[]){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        n1.next = n2;
        System.out.println(n1.data);
        System.out.println(n1.next.data);
    }
    
}
