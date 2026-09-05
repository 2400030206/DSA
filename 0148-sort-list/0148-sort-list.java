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
    public ListNode sortList(ListNode head) {

    if (head == null || head.next == null) {
            return head;
        }
        ListNode slow=head;
    ListNode fast=head.next;
    while(fast!=null&&fast.next!=null){
         slow=slow.next;
        fast=fast.next.next;
    }    

    ListNode right=slow.next;
       slow.next=null;
     ListNode left=head;
           

        left=sortList(left);
       right= sortList(right);
return merge(left,right);

    }
public static ListNode merge(ListNode list1,ListNode list2){
            ListNode dummy=new ListNode(0);
            ListNode cur=dummy;
           while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                cur.next=list1;
                list1=list1.next;
            }
            else{
               cur.next=list2;
               list2=list2.next;
            }
            cur=cur.next;
           }
while(list1!=null){
    cur.next=list1;
    list1=list1.next;
    cur=cur.next;
}
    while(list2!=null){
    cur.next=list2;
    list2=list2.next;
    cur=cur.next;
}   
return dummy.next;
 }

   


}