/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class mergetwosortedlists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode root = new ListNode(0);
        ListNode tail = root;
        while(l1 != null || l2 != null){
            if (l1 == null) {
                tail.next = l2;
                l2 = null;
            } else if (l2 == null){
                tail.next = l1;
                l1 = null;
            } else {
                if (l1.val < l2.val) {
                    tail.next = l1;
                    l1 = l1.next;
                } else {
                    tail.next = l2;
                    l2 = l2.next;
                }
                tail = tail.next;
            }
        }
        return root.next;
    }
}