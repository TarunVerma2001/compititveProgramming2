
public class StackByArray {
	int stack[];
	int top = -1;
	int size;
	
	public StackByArray(int size) {
		this.size = size;
		stack = new int[size];
	}
	
	public void push(int data) throws Exception{
		if(top == size-1) {
			throw new Exception("Stack OverFlow!");
		} else {
			stack[++top] = data;
		}
	}
	
	public int pop() throws Exception{
		if(top < 0) {
			throw new Exception("Stack is Empty!");
		} else {
			int toShow = top;
			top--;
			return stack[toShow];
		}
	}
	
	public int peek() throws Exception{
		if(top < 0) {
			throw new Exception("Stack is Empty");
		} else {
			return stack[top];
		}
	}
	
	public boolean isEmpty(){
		if(top < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return top + 1;
	}
	
	public void printStack() throws Exception {
		if(top < 0) {
			throw new Exception("Stack is Empty!");
		} else {
			for(int i =0;i<top+1;i++) {
				System.out.print(stack[i] + " ");
			}System.out.println();
		}
	}
	
	
}
