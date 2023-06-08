package binarySearch;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearch lsrch=new BinarySearch();
		
		int[] arr1= {};
		int[] arr2= {1,2,3,4,5,6,7};
		int[] arr3= {1,2,3,4,6,9};
		int[] arr4= {1,1,2,2,2,2,3,4,5,6,6,6,8,8,9};
		int[] arr5= {0,1,2,3};
		
		//linear search
		lsrch.binarySearch(arr1, 4);
		lsrch.binarySearch(arr2, 4);
		lsrch.binarySearch(arr3, 6);
		lsrch.binarySearch(arr4, 8);
		lsrch.binarySearch(arr5, 5);
		
	}

}
