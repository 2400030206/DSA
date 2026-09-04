class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Linked List 1 → ArrayList
        ListNode temp1 = list1;
        List<Integer> arr1 = new ArrayList<>();

        while(temp1 != null) {
            arr1.add(temp1.val);
            temp1 = temp1.next;
        }

        // Linked List 2 → ArrayList
        ListNode temp2 = list2;
        List<Integer> arr2 = new ArrayList<>();

        while(temp2 != null) {
            arr2.add(temp2.val);
            temp2 = temp2.next;
        }

        int n = arr1.size();
        int m = arr2.size();

        int i = 0;
        int j = 0;

        List<Integer> result = new ArrayList<>();

        
        while(i < n && j < m) {

            if(arr1.get(i) <= arr2.get(j)) {
                result.add(arr1.get(i));
                i++;
            }
            else {
                result.add(arr2.get(j));
                j++;
            }
        }

        
        while(i < n) {
            result.add(arr1.get(i));
            i++;
        }

        
        while(j < m) {
            result.add(arr2.get(j));
            j++;
        }

        
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for(int x : result) {
            temp.next = new ListNode(x);
            temp = temp.next;
        }

        return dummy.next;
    }
}