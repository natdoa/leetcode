import java.util.Stack;

class minstack {
	private Stack<Integer> min=new Stack<Integer>();
	private Stack<Integer> st=new Stack<Integer>();
    
	public void push(int x) {
		if(min.isEmpty() || x<=min.peek()){
			min.push(x);
		}
		st.push(x);
    }

    public void pop() {
        if(st.peek().equals(min.peek())){
        	min.pop();
        }
        st.pop();
    }

    public int top() {
		return st.peek();
    }

    public int getMin() {
    	return min.peek();
    }
}
