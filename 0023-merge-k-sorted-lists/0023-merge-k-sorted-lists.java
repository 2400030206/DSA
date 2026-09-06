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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer>nums=new ArrayList<>();
        for(ListNode temp:lists){
            while(temp!=null){
            nums.add(temp.val);
            temp=temp.next;
        }
    }
      Collections.sort(nums);
      ListNode dummy=new ListNode(0);
    ListNode  cur=dummy;
      for(int num:nums){
        cur.next=new ListNode(num);
        cur=cur.next;
      }
        return dummy.next;
    }
}