package in.cdac.blr.pgdac.day3.batch1;

public class BubbleSorting {

	// the complexity of a bubble sort is O(n^2)
	// if the array is sorted and a flag is used to track swapping them the complexity is O(n)
	public static void main(String[] args) {
		int arr[] = {45, 23, 78, 10, 75, 24};//, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24};
		System.out.println("arr.length: "+arr.length);
//		int arr[] = {10, 23, 24, 45, 75, 78};
		int complexity = 0;
		boolean swap = false;
		// modified bubble sort: 
		// (a) flag approach for an already sorted array
		// (b) reduce inner loop by cutting down "i" number of iterations
		for(int i=0; i<arr.length-1; i++) {   // outer loop   0...n
			for(int j=1; j<arr.length-i; j++) {  // inner loop   0...n-i
				//for(int i=0; i<arr.length; i++) {   // outer loop   0...n
					//for(int j=1; j<arr.length; j++) {  // inner loop   0...n-i
				complexity++;
				// there are various ways to perform a swap (5 way)
				// swap happens if the (n-1)th element is greater than nth element
				// for a non-descending order
				if(arr[j-1] > arr[j]) {
					swap = true;  // flag to check if the array is already sorted
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			/*for(int k=0; k<arr.length; k++) {
				System.out.print(arr[k]+", ");
			}*/
			System.out.println();
			System.out.println("*****************************");
			if(swap) {
				continue;
			} else {
				break;
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		System.out.println("complexity : "+complexity);
	}

}
