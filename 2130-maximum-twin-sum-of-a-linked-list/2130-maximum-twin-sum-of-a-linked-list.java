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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode pre=null;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
         while(slow!=null){
            ListNode temp1=slow.next;
            slow.next=pre;
            pre=slow;
            slow=temp1;
         }
         int max=0;
         while(pre!=null){
            max=Math.max(max,head.val+pre.val);
            head=head.next;
            pre=pre.next;
         }
         return max;
    }
}