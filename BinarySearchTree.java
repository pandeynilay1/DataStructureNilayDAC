package in.cdac.blr.pgdac.day8.batch2;

class BinaryNode {
	int item;
	BinaryNode left, right;
	
	// constructor to allocate memory and create a node
	public BinaryNode(int item) {
		this.item = item;
		left = right = null;
	}
	
	// helper method to access the item value of a node
	public int getItem() {
		return item;
	}
}



public class BinarySearchTree {

	BinaryNode root;
	
	// inserting an element into the Binary Search Tree (BST)
	public void insert(BinaryNode currentnode, int item) {
		// if the tree is empty meaning no nodes present
		// if the tree is empty without any nodes, then we create a new node and make that node
		// as the root node
		if(currentnode == null) {
			currentnode = new BinaryNode(item);
			root = currentnode;
			return;
		}
		if(item < currentnode.getItem()) {
			if(currentnode.left == null) {   // if there was no left child present
				currentnode.left = new BinaryNode(item);
				return;
			} else {
				insert(currentnode.left, item);  // hop left and recursively call insert
			}
		} else {  // branching to the Right Sub-Tree (RST) if the item is larger than the current node's item value
			if(currentnode.right == null) { // if there was no right child present
				currentnode.right = new BinaryNode(item);
				return;
			} else {
				insert(currentnode.right, item);  // hop right and recursively call insert
			}
		}
	}
	
	// Searching an element in the Binary Search Tree (BST)
	public BinaryNode search(BinaryNode temproot, int f) {
		if(temproot != null) {  // meaning the tree is not empty
			if(f == temproot.getItem()) {  // current node contains the searched element
				return temproot;
			} else if(f < temproot.getItem()) {
				temproot = search(temproot.left, f);
			} else {
				temproot = search(temproot.right, f);
			}
		}
		return temproot;
	}
			
	
	// Finding the parent of a node
	public BinaryNode whoistheparent(BinaryNode temp, BinaryNode child) {
		BinaryNode parent = null;
//		int tempvalue, childvalue = child.getItem();
		while(temp != child) {
			parent = temp;
			if(temp.getItem() < child.getItem()) {
				temp = temp.right;
			} else {
				temp = temp.left;
			}
		}
		return parent;
	}
	
	public static void main(String[] args) {
		
	}
}
















