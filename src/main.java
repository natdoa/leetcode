
public class main {

	public static void main(final String[] args) {
		
		//compareversionnumbers s=new compareversionnumbers();
		//System.out.println(s.compareVersion("0.3", "1.1"));
		
		//factorialleadingzeros s=new factorialleadingzeros();
		//System.out.println(s.trailingZeroes(120));
		
		//romantointeger s=new romantointeger();
		//System.out.println(s.romanToInt("VI"));
		
		//implementstrstr s= new implementstrstr();
		//System.out.println(s.strStr("cokuzunbircumle", "bir"));
		
		//excelsheetcolumnnumber s= new excelsheetcolumnnumber();
		//System.out.println(s.titleToNumber("BA"));
		
		//majorityelement s = new majorityelement();
		//System.out.println(s.majorityElement(new int[]{1,2,3,2,5,2,6,6,6,6,6,6}));
		
		//validpalindrome s = new validpalindrome();
		//System.out.println(s.isPalindrome("A man, a plan, a canal: Panama"));
		
		//palindromenumber s = new palindromenumber();
		//System.out.println(s.isPalindrome(1234321));
		
		//addbinary s = new addbinary();
		//System.out.println(s.addBinary("11", "1"));
		
		//validparanthesis s = new validparanthesis();
		//System.out.println(s.isValid("()[]{}"));
		
		//excelcolumnsheettitle s= new excelcolumnsheettitle();
		//System.out.println(s.convertToTitle(52));
		
		/*removenthnodefromendoflist s = new removenthnodefromendoflist();
		ListNode a= new ListNode(1);
		ListNode b= new ListNode(2);
		a.next=b;
		ListNode c= new ListNode(3);
		b.next=c;
		ListNode d= new ListNode(4);
		c.next=d;
		ListNode e= new ListNode(5);
		d.next=e;
		s.removeNthFromEnd(a, 2);
		s.print(a);*/
		
		/*mergesortedarray s = new mergesortedarray();
		int[] A={1,3,5,7};
		int[] B={2,4,6,8};
		s.merge(A, A.length, B, B.length);
		s.print(A);*/
		
		/*minstack s = new minstack();
		s.push(5);
		s.push(3);
		s.push(7);
		System.out.println(s.getMin());*/
		
		/*sametree s = new sametree();
		TreeNode a=new TreeNode(1);
		TreeNode b=new TreeNode(2);
		a.left=b;
		TreeNode c=new TreeNode(3);
		a.right=c;
		TreeNode d=new TreeNode(4);
		b.left=d;
		TreeNode e=new TreeNode(1);
		TreeNode f=new TreeNode(2);
		e.left=f;
		TreeNode g=new TreeNode(3);
		e.right=g;
		TreeNode h=new TreeNode(4);
		f.left=h;
		System.out.println(s.isSameTree(a, e));*/
		
		/*removeelement s = new removeelement();
		System.out.println(s.removeElement(new int[]{1,1,2}, 1));*/
		
		/*intersectionoftwolinkedlists s = new intersectionoftwolinkedlists();
		ListNode a1=new ListNode(1);
		ListNode a2=new ListNode(2);
		a1.next=a2;
		ListNode a3=new ListNode(3);
		a2.next=a3;
		
		ListNode b1=new ListNode(4);
		ListNode b2=new ListNode(5);
		b1.next=b2;
		ListNode b3=new ListNode(6);
		b2.next=b3;
		
		ListNode a4=new ListNode(7);
		a3.next=a4;
		ListNode a5=new ListNode(8);
		a4.next=a5;
		ListNode b4=new ListNode(7);
		b3.next=b4;
		ListNode b5=new ListNode(8);
		b4.next=b5;
		System.out.println(s.getIntersectionNode(a1, b1).val);*/
		
		/*stringtointeger s= new stringtointeger();
		System.out.println(s.atoi("  do  ga  "));*/
		
		/*pascalstriangle s= new pascalstriangle();
		System.out.println(s.generate(5));*/
		
		/*mergetwosortedlists s= new mergetwosortedlists();
		System.out.println(s.mergeTwoLists(l1, l2));*/
		
		/*lengthoflastword s= new lengthoflastword();
		System.out.println(s.lengthOfLastWord("hello world"));*/
		
		/*singlenumber s =new singlenumber();
		System.out.println(s.singleNumber(new int[] {1}));*/
		
		/*linkedlistcycle s= new linkedlistcycle();
		ListNode a1=new ListNode(1);
		ListNode a2=new ListNode(2);
		a1.next=a2;
		ListNode a3=new ListNode(3);
		a2.next=a3;
		ListNode a4=new ListNode(4);
		a3.next=a4;
		a4.next=a1;
		System.out.println(s.hasCycle(a1));*/
		
		/*removeduplicatesfromsortedarray s= new removeduplicatesfromsortedarray();
		System.out.println(s.removeDuplicates(new int[] {1,1,2}));*/
		
		removeduplicatesfromsortedlist s = new removeduplicatesfromsortedlist();
		ListNode a1=new ListNode(1);
		ListNode a2=new ListNode(1);
		a1.next=a2;
		ListNode a3=new ListNode(2);
		a2.next=a3;
		ListNode a4=new ListNode(3);
		a3.next=a4;
		ListNode a5=new ListNode(3);
		a4.next=a5;
		
		System.out.println(s.deleteDuplicates(a1));
		s.printListNode(a1);
	}

}
