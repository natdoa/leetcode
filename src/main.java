
public class main {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
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
		
		removenthnodefromendoflist s = new removenthnodefromendoflist();
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
		s.print(a);
	}

}
