package stack.impl;

public class Stack<T> {
	
	private int size;
	private int topIndex;
	private T [] array;
	
	int [] arr = new int[8];
	
	@SuppressWarnings("unchecked")
	public Stack(int size) {
		this.size = size;
		topIndex = -1;
		array = (T[]) new Object[size];
	}
	
	//isEmpty()
	//isFull()
	//top()
	//push(T t)
	//pop()
	
	public boolean isEmpty() {
		return topIndex == -1;
	}
	
	public boolean isFull() {
		return topIndex == size - 1;
	}
	
	public T top() {
		if(isEmpty())
			return null;		
		return array[topIndex];		
	}
	
	public T pop() {
		if(isEmpty())
			return null;		
	    return array[topIndex--];
	}
	
	public void push(T e) {
		if(isFull()) {
			System.out.println("Stack is full...");
			return;
		}		
		array[++topIndex] = e;		
	}
}
