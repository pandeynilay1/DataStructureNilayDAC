package in.cdac.blr.pgdac.day7.batch2;

public class QueueUsingArray {

	static final int n = 10;
	static int[] ar = new int[n];
	static int front = -1;
	static int rear = -1;
	
	// Precondition: check for overflow
	public static void enqueue(int item) {
		if(rear == n-1) {
			System.out.println("Queue Overflow!!!");
			return;
		}
		if(front == -1 && rear == -1) {
			front = 0;
			rear = 0;
		} else {
			rear++;
		}
		ar[rear] = item;
	}
	
	// Precondition: check for underflow
	public void dequeue() {
		if(front == -1 || front > rear) {
			System.out.println("Queue Underflow !!! OR Empty Queue!!!");
			return;
		}
		if(front == rear) {   // only one element in the queue
			front = -1;
			rear = -1;
		} else {   // there exists more than one element in the queue
			front++;
		}
	}
	
	public static void main(String[] args) {

	}

}
