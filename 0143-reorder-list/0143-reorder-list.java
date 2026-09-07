/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
       ListNode second=slow.next;
       slow.next=null;
//reverse
       ListNode temp=second;
       ListNode prev=null;
       while(temp!=null){
        ListNode temp1=temp.next;
        temp.next=prev;
        prev=temp;
        temp=temp1;
       }

    ListNode first=head;
      second =prev;
    while(second!=null){
       ListNode next1= first.next;
       ListNode next2=second.next;
       first.next=second;
       second.next=next1;
       
       first=next1;
       second=next2;

    }


    }
}