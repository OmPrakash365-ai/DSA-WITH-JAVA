package LinkedList;
import java.util.*;
public class TwinMaxSum {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static int twinmaxsum(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondhalf = reverse(slow);

        Node firsthalf = head;
        int maxSum =0;
        while(secondhalf!=null){
            int sum = firsthalf.data + secondhalf.data;
            maxSum = Math.max(maxSum,sum);

            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return maxSum;
    }

    private static Node reverse(Node head){
        Node prev = null;
        Node current = head;

        while(current!=null){
            Node next = current.next;
            current.next=prev;

            prev = current ;
            current = next;
        }
        return prev;
    }
    public static void main(String args[]){
        TwinMaxSum ob = new TwinMaxSum();
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);

        int result = ob.twinmaxsum(head);

        System.out.println(result);
    }
    
}
