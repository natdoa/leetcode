class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class linkedlistcycle {
	public boolean hasCycle(ListNode head) {
		ListNode back=head;
		ListNode front=head;
		
		if(head==null){
			return false;
		}
		
		if(head.next==null){
			return false;
		}
		
		while(front!=null && front.next!=null){
			back=back.next;
			front=front.next.next;
			
			if(back==front){
				return true;
			}
		}
		
		return false;
	}
}