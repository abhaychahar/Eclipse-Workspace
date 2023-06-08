package binarySearch;

public class BinarySearch {
	
	//binary search
	public int binarySearch(int[] arr, int val) {
		
		if(arr.length==0) {
			System.out.println("The array is empty");
			return -1;
		}
		
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		
		while(low<=high && arr[mid]!=val) {
			if(arr[mid]>val) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			mid=(low+high)/2;
		}
		
		if(arr[mid]==val) {
			System.out.println("The element is found at the index: "+mid);
			return mid;
		}
		else {
			System.out.println("The element "+val+" not found.");
			return -1;
		}
		
	}
}
