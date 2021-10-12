
public class QueueUsingArray {
	int queue[];
	int size;
	int front = -1;
	int last = -1;
	
	public QueueUsingArray(int size) {
		this.size = size;
		queue = new int[size];
	}
	
	public void Enqueue(int data) throws Exception{
		if(front == -1 && last == -1) {
			front = 0;
			last = 0;
			queue[last] = data;
		} else if(front == 0 && last == size -1) {
			throw new Exception("Queue is Full!");
		} else {
			queue[++last] = data;
		}
	}
	
	public int Dequeue() throws Exception{
		if(front == -1 && last == -1) {
			throw new Exception("Queue is Empty!");
		} else {
			int frontElement = queue[front];
			front ++;
			if(front > last) {
				front = -1;
				last = -1;
			} else {
				for(int i = front;i<= last;i++) {
					queue[i-1] = queue[i];
				}
				front--;
				last--;
			}
			return frontElement;
		}
	}
	
	public boolean isEmpty() {
		if(front == -1 && last == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public int peek() throws Exception{
		if(front == -1 && last == -1) {
			throw new Exception("Queue is Empty!");
		} else {
			return queue[front];
		}
	}
	
	public void printQueue() throws Exception{
		if(front == -1 && last == -1) {
			throw new Exception("Queue is Empty!");
		} else {
			for(int i = front;i<=last;i++) {
				System.out.print(queue[i] + " ");
			}System.out.println();
		}
	}
	
}
