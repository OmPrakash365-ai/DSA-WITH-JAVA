package LinkedList;
import java.util.*;
public class OddEvenLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    public Node OddEvenlinkedList(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node odd = head;
        Node even = head.next;

        Node evenhead = even;

        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd=odd.next;

            even.next = odd.next;
            even=even.next;
        }
        odd.next = evenhead;
        return head;
    }
    public static void main(String args[]){
        OddEvenLinkedList ob = new OddEvenLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = ob.OddEvenlinkedList(head);

        Node current = head;

        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }

        System.out.println();
    }
    
}
