


public class StackUsingQueue {
	
	int size;
	QueueUsingArray q1;
	QueueUsingArray q2;
	public StackUsingQueue(int size) {
		this.size = size;
		q1 = new QueueUsingArray(size);
		q2 = new QueueUsingArray(size);
	}
	
	
	
	public void push(int data) throws Exception{
		if(q1.front == 0 && q1.last == this.size - 1) {
			throw new Exception("Stack Overflow!");
		} else {
			q2.Enqueue(data);
			while(!q1.isEmpty()) {
				q2.Enqueue(q1.Dequeue());
			}
			while(!q2.isEmpty()) {
				q1.Enqueue(q2.Dequeue());
			}
		}
	}
	
	public int pop() throws Exception{
		if(q1.isEmpty()) {
			throw new Exception("Stack is Empty!");
		} else {
			return q1.Dequeue();
		}
	}
	
	public int size() {
		return q1.size;
	}
	
	public boolean isEmpty() {
		return q1.isEmpty();
	}
	
	public void printStack() throws Exception{
		if(q1.isEmpty()) {
			throw new Exception("Stack is Empty");
		} else {
			while(!q1.isEmpty()) {
				System.out.print(q1.peek() + " ");
				q2.Enqueue(q1.Dequeue());
			}System.out.println();
			while(!q2.isEmpty()) {
				q1.Enqueue(q2.Dequeue());
			}
		}
	}
	
	
	
}
