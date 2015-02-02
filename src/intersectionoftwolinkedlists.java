class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class intersectionoftwolinkedlists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA==null || headB==null){
			return null;
		}
		while(headA.next!=null){
			while(headB.next!=null){
				if(headA.val==headB.val){
					return headA;
				}
				else{
					headA=headA.next;
					headB=headB.next;
				}
			}
		}
		return null;
	}
}