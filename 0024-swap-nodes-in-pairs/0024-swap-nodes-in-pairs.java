class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ArrayList<ListNode> list = new ArrayList<>();

        ListNode curr = head;

        // Store nodes
        while (curr != null) {
            list.add(curr);
            curr = curr.next;
        }

        // Swap nodes in pairs
        for (int i = 0; i < list.size() - 1; i += 2) {

            ListNode temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }

        // Reconnect nodes
        curr = list.get(0);

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }

        // Last node points to null
        list.get(list.size() - 1).next = null;

        return curr;
    }
}
