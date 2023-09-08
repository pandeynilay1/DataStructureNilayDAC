package in.cdac.blr.pgdac.day3.batch1;

public class MergeSort1 {
	static int arr[] = {45, 23, 78, 10, 75, 24, 56};
	public static void main(String[] args) {
		divide(arr, 0, arr.length-1);
		for(int p=0; p<arr.length; p++) {
			System.out.print(arr[p]+", ");
		}
		System.out.println();
	}

	// divide and conquer
	// the low &N high variables are used to keep track of the present size of the array being 
	// used for execution of the algorithm
	static void divide(int arr[], int low, int high) {
		int mid = 0;
		// termination condition of the recursive call
		if(low < high) {
			mid = (low+high)/2;
			divide(arr, low, mid); // left half and this recursive call will execute first
			// only after the above recursive call pops out of stack the next line of code
			// will execute
			divide(arr, mid+1, high); // right half of the array
			mergeSort(arr, low, mid, high);
		}
	}


	// the following method conquers the divided array by merging them while performing sorting
	// "low" to "mid" is the first array, while "mid+1" to "high" is the second array
	static void mergeSort(int arr[], int low, int mid, int high) {
		int temp[] = new int[arr.length];
		int i=0, m=0, k=0, l=0;
		l = low;  // l is the starting index of the first array
		i= low;
		m = mid+1; // m is the starting index of the second array
		while((l<=mid) && (m<=high)) {
			// an element in the first array is compared with an element in the second array
			if(arr[l] <= arr[m]) {
				// element from first array is smaller and so added to the temporary resultant array
				temp[i] = arr[l];
				// incrementing count in the respective first array by one in order to move to the next element in the array
				l++;
			} else {
				// element from second array is smaller and so added to the temporary resultant array
				temp[i] = arr[m];
				// incrementing count in the respective second array by one in order to move to the next element in the array
				m++;
			}
			i++;
		}
		// either l>mid or m>high
		if(l>mid) {
			// the "low" had reached the "mid" may mean that few elements in the second array haven't been 
			// added to the resultant array, so we perform the following iteration to append the remaining
			// elements of the second array to the end of the resultant array
			for(k=m; k<=high; k++) {
				temp[i] = arr[k];
				i++;
			}
		} else {
			// the "low" is yet to reach "mid" may mean that few elements in the first array haven't been 
			// added to the resultant array, so we perform the following iteration to append the remaining
			// elements of the first array to the end of the resultant array
			for(k=l; k<=mid; k++) {
				temp[i] = arr[k];
				i++;
			}
		}
		for(k=low;k<=high;k++) {
			arr[k] = temp[k];
		}
	}

}









