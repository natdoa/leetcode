import java.util.Stack;

public class validparanthesis {
	public boolean isValid(String s) {
		Stack<Character> stack=new Stack<Character>();
		char[] arr=s.toCharArray();
		for(char c : arr){
			if(c == '{' || c == '[' || c == '('){
				stack.push(c);
			}
			else{
				if(stack.isEmpty())return false;
				if(c == '{' && stack.peek() != '}')return false;
				if(c == '[' && stack.peek() != ']')return false;
				if(c == ')' && stack.peek() != '(')return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}