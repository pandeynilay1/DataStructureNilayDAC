package in.cdac.blr.pgdac.day4.batch1;

public class HeapSort {
	
	static public int complexity=0;
	
	public static void main(String args[]) {
		int arr[] = { 56, 89, 23, 78, 20, 83, 94 };

		HeapSort hs = new HeapSort();
		hs.sortbyheap(arr);

		display(arr);
	}
	
	public void sortbyheap(int arr[]) {
		int n = arr.length;

		// building the Heap (iteration for each trio)
		for (int i = n/2 - 1; i >= 0; i--) {
			complexity++;
			heapify(arr, n, i);
		}

		// swap the root element with the last leaf element and resume heapifying by calling heapify
		for (int i = n - 1; i > 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			complexity++;
			// perform max heapify on a heap which is now one element smaller in size
			heapify(arr, i, 0);
		}
	}

	// "i" is the present root of the subtree (trio)
	// at the end of the method ensure that the trio is max heapified
	void heapify(int arr[], int n, int i) {
		int largest = i; // Initialize ith element as as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// left child is greater than root
		if (l < n && arr[l] > arr[largest])
			largest = l;

		// right child is greater than root/largest till now
		if (r < n && arr[r] > arr[largest])
			largest = r;

		// If largest is not the index of root then swap to do so and recursively call heapify for the next subtree (trio)
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			complexity++;
			// Recursively heapify the affected sub-tree
			heapify(arr, n, largest);
		}
	}

	// print sorted array
	static void display(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + "  ");
		System.out.println();
		System.out.println("complexity: "+complexity);
	}

}

