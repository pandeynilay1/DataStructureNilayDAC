package in.cdac.blr.pgdac.day7.batch2;

public class StackUsingArray {

	int arr[];
	int top = -1;   // top is -1 because its an invalid index location for Java
	int capacity = 5;
	
	public StackUsingArray(int capacity) {
		this.capacity = capacity;
		top = -1;
	}

	// The operation of adding elements to the top of the stack is called as PUSH
	// In a stack, PUSH always happens at the top, therefore increment top and push the value
	// Precondition: check the stack for overflow status
	public void push(int item) {
		if(isFull()) {
			System.out.println("Stack Overflow !!!");
			return;
		}
		arr[++top] = item;  // pre-increment
	}
	
	// precondition: check the stack for underflow status
	public void pop() {
		if(isEmpty()) {
			System.out.println("Empty Stack !!! OR Stack underflow!!!");
			return;
		}
		top--;
	}
	
	// peek is a verb related to Stack which implies print the top element of the stack
	public void peek() {
		if(isEmpty()) {
			System.out.println("Empty Stack !!! OR Stack underflow!!!");
			return;
		}
		System.out.println("top element is: "+arr[top]);
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == capacity-1;
	}

	public static void main(String[] args) {
		
	}

}
