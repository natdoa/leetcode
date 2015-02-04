public class removeduplicatesfromsortedlist {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode res=head;
		while(res!=null){
			if(res.next!=null && res.val==res.next.val){
				res.next=res.next.next;
			}
			else{
				res=res.next;
			}	
		}
		return head;
	}
	
	public void printListNode(ListNode head){
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}
}