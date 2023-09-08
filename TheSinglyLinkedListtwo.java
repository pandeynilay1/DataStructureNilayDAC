package in.cdac.blr.pgdac.day4.batch1;

import java.util.Scanner;

public class TheSinglyLinkedList {

	static SinglyLinkedListNode head;
	
	public static void main(String[] args) {
		TheSinglyLinkedList llist = new TheSinglyLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("input (data) for first node: ");
		int a = sc.nextInt();
		head = new SinglyLinkedListNode(a);
		
		System.out.println("the first element in the list is: "+head.data);
		
		// insertion, deletion, traversal (display)
		
	}

}

// Blueprint of the NODE of the singly linked list
class SinglyLinkedListNode {
	
	int data;  // data part of the node
	SinglyLinkedListNode next;   // pointer or link or next pointing to the next node in the list
	
	// the following constructor constructs a node with a passed data value and 
	// points to null location
	public SinglyLinkedListNode(int data) {
		this.data = data;
		next = null;
	}
}
