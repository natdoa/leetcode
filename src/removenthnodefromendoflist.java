
/*class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}*/

public class removenthnodefromendoflist {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode cur = head, prev = head;
        while(n-- > 0) {
            cur = cur.next;
        }
        if (cur == null) 
            return head.next;
        while (cur.next != null) {
            cur = cur.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
	}
	
	public void print(ListNode head){
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}
}