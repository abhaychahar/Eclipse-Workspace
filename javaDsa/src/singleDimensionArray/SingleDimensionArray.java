package singleDimensionArray;

public class SingleDimensionArray {
	int arr[]=null;
	
	public SingleDimensionArray(int sizeOfArray) {
		arr=new int[sizeOfArray];
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	//insertion
	public void insert(int insertionIndex, int insertionValue) {
		try {	
			if(arr[insertionIndex]==Integer.MIN_VALUE) {
				arr[insertionIndex]=insertionValue;
				System.out.println("The value has been inserted");
			}
			else {
				System.out.println("A value at index "+insertionIndex+" is already present");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index "+insertionIndex+" does not exist");
		}
	}
	
	//traversal
	public void traverse() {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	//search
	public void search(int valueToSearchFor) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==valueToSearchFor) {
				System.out.println("The specified value is present at index "+i);
				return;
			}
		}
		System.out.println("The specified value is not found");
	}
	
	//deletion
	public void delete(int deletionIndex) {
		try {
			if(arr[deletionIndex]!=Integer.MIN_VALUE) {
				arr[deletionIndex]=Integer.MIN_VALUE;
			}
			else {
				System.out.println("No value to be deleted at index "+deletionIndex);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index "+deletionIndex+" does not exist");
		}
	}
}
