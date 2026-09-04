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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        
        List<Integer>list=new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
           
        }
        int n=list.size();
        for(int i=0;i+k<=n;i+=k){
            int l=i;
            int r=i+k-1;
            while(l<r){
            int temp1=list.get(l);
            list.set(l,list.get(r));
            list.set(r,temp1);
l++;
r--;
            }
        }




        temp=head;
        int s=0;
        while(temp!=null){
            temp.val=list.get(s);
            s++;
            temp=temp.next;
        }
        return head;
    }
}