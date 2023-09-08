package in.cdac.blr.pgdac.day3.batch1;

public class InsertionSort {

	// the complexity of an insertion sort is O(n^2), 
	// best case of insertion sort is O(n), where only the outer loop executes 
	// because the input array is already sorted
	public static void main(String[] args) {
//		int arr[] = {45, 23, 78, 10, 75, 24};//, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24, 45, 23, 78, 10, 75, 24};
		int arr[] = {10, 23, 24, 45, 75, 78};
		System.out.println("arr.length: "+arr.length);
		int complexity = 0;
		// loop to control the traversal
		int j=0;
		for(int i=0; i<arr.length; i++) {
			int temp = arr[i];
			// it is such that the array is sorted till the ith element so j starts from ith index
			for(j=i; (j>0 && arr[j-1]>temp); j--) {
				complexity++;
				arr[j] = arr[j-1];
			}
			arr[j] = temp;
			for(int k=0; k<arr.length; k++) {
				System.out.print(arr[k]+", ");
			}
			System.out.println();
			System.out.println("****************************");
		}
		System.out.println();
		System.out.println("complexity : "+complexity);
	}

}
