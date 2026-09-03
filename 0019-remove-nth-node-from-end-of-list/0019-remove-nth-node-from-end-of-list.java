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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int c=1;   
        while(temp.next!=null){
            temp=temp.next;
            c++;
        }
        if(n==c){
            return head.next;
        }
         temp=head; 
        int pos=c-n;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;    
}
}