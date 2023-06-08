package linearSearch;

public class LinearSearch {
	
	//linear search
	public int linearSearch(int[] arr, int val) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==val) {
				System.out.println("The value requested ("+val+") is found at the index "+i);
				return i;
			}
		}
		System.out.println("The value requested ("+val+") cannot be found in the array");
		return -1;
	}
}
