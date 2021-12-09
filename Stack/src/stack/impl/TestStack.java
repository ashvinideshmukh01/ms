package stack.impl;

public class TestStack {
	
	public static void main(String[] args) {
	    
		Stack<Integer> s = new Stack<>(3);
		System.out.println(s.isEmpty());
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println(s.isFull());
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
		System.out.println(s.isEmpty());
		s.push(7);
		
		System.out.println(s.top());

	}//end of main 

}
