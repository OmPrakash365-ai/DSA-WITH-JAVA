package LinkedList;
import java.util.*;
public class DeleteMiddleElement{
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
        this.val=val;
        }
        
    }
    public ListNode deleteMiddle(ListNode head){
        if(head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    } 
    public static void main(String args[]){
        
        DeleteMiddleElement ob = new DeleteMiddleElement();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = ob.deleteMiddle(head);
        ListNode current = head;

        while(current!=null){
            System.out.print(current.val+" ");
            current = current.next;
        }
        System.out.println();
    }
}