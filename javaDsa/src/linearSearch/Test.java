package linearSearch;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinearSearch lsrch=new LinearSearch();
		
		int[] arr1= {};
		int[] arr2= {1,2,3,4,5,6,7};
		int[] arr3= {9,1,4,2,3,6};
		int[] arr4= {1,2,2,6,6,6,4,5,3,2,2,1,8,8,9};
		int[] arr5= {0,1,3,2};
		
		//linear search
		lsrch.linearSearch(arr1, 4);
		lsrch.linearSearch(arr2, 4);
		lsrch.linearSearch(arr3, 6);
		lsrch.linearSearch(arr4, 8);
		lsrch.linearSearch(arr5, 5);
		
	}

}
