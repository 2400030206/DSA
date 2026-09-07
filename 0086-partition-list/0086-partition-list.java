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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        List<Integer>list=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();
         while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
         }
         for(int i=0;i<list.size();i++ ){
            if(list.get(i)<x){
                list1.add(list.get(i));
            }
         }
 for(int i=0;i<list.size();i++ ){
            if(list.get(i)>=x){
                list1.add(list.get(i));
            }
         }
         temp=head;
         int k=0;
         while(temp!=null){
            temp.val=list1.get(k);
            k++;
            temp=temp.next;
         }
        
         return head;
    }
}