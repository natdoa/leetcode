
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
		
		sametree s = new sametree();
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
		System.out.println(s.isSameTree(a, e));
	}

}
