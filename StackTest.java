package in.cdac.blr.pgdac.day7.batch2;

class StackUsingList {

	static Node top;
	private float f = 0.0f;

	public StackUsingList() {
		this.top = null;   // this indicates that the stack is empty
	}

	private class Node {
		int data;
		Node next;
	}

	// push operation: 
	// (a) create a new node with the data passed a parameter
	// (b) the new node's next points to head
	// (c) the head points to new node
	public void push(int data) {
		Node newnode = new Node();
		newnode.data = data;
		newnode.next = top;
		top = newnode; // by this new node becomes the first node
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow!!! or The Stack is Empty!!!");
//			return;
		} else {
			top = top.next;   // simply assign the first/head/top to point to the next(second) node
		}
		// which ultimately becomes the new first/head/top node
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack Underflow!!! or The Stack is Empty!!!");
			return;
		}
		System.out.println(top.data);
	}
	
	
	// minimum 2 threads: main thread, garbage collector thread (finalize)
	// Thread Scheduler
	
	public boolean isEmpty() {
		return top == null;   // it means head is null, meaning not nodes in the list
	}
	
}


public class StackTest {
	public static void main(String[] args) {

	}

}

