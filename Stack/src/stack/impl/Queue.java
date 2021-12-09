package stack.impl;

public class Queue<T> {
	
	private int maxSize;
	private int front;
	private int back;
	private int currentSize;
	private T [] array;
	
	@SuppressWarnings("unchecked")
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		front = 0;
		back = -1;
		currentSize = 0;
		array = (T[]) new Object[maxSize];
	}
	
	//empty
	//full
	//top
	//enqueue
	//dequeue
	
	public boolean isEmpty() {
		return currentSize == 0;
	}
	
	public boolean isFull() {
		return currentSize == maxSize;
	}
	
	public T top() {
        return array[front];
    }
	
	public void enqueue(T value) {
	    if (isFull())
	       return;
	    back = (back + 1) % maxSize; //to keep the index in range
	    array[back] = value;
	    currentSize++;
	}
	
	public T dequeue() {
        if (isEmpty())
            return null;

        T temp = array[front];
        front = (front + 1) % maxSize; //to keep the index in range
        currentSize--;

        return temp;
    }
	
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>(5);
		//equeue 2 4 6 8 10 at the end
        queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(6);
		queue.enqueue(8);
		queue.enqueue(10);
        //dequeue 2 elements from the start
		queue.dequeue();
		queue.dequeue();
		//enqueue 12 and 14 at the end
        queue.enqueue(12);
        queue.enqueue(14);

        System.out.println("Queue:");
        while(!queue.isEmpty()){
                System.out.print(queue.dequeue()+" ");
            }
	}

}
