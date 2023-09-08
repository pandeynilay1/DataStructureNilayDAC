package in.cdac.blr.pgdac.day7.batch2;

class Node {
	String data;
	Node next;
	public Node(String data) {
		this.data = data;
		this.next = null;
	}
}

class QueueList {
	
	public Node rear=null, front=null;
	
	public void enqueue(String item) {
		Node newnode = new Node(item);
		if(front == null) {  // meaning an empty queue
			front = newnode;
			rear = newnode;
		} else {
			rear.next = newnode;
			rear = newnode;
		}
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Underflow!!! OR Empty Queue!!!");
			return;
		}
		front = front.next;
		// when a single node is present in the queue/list, the rear also needs to be made null
		if(front == null) {
			rear = null;
		}
	}
	
	
	
	public boolean isEmpty() {
		return rear==null && front==null;
	}
}





public class QueueUsingList {

	public static void main(String[] args) {

	}

}
