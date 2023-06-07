package insertionSort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InsertionSort isort=new InsertionSort();
		
		int[] arr1= {9,1,4,2,3,6};
		int[] arr2= {};
		int[] arr3= {4};
		int[] arr4= {4,2};
		int[] arr5= {9,1,4,1,2,3,2,4,6};
		
		//insertion sort
		isort.insertionSort(arr1);
		isort.insertionSort(arr2);
		isort.insertionSort(arr3);
		isort.insertionSort(arr4);
		isort.insertionSort(arr5);
		
		//print
		isort.print(arr1);
		isort.print(arr2);
		isort.print(arr3);
		isort.print(arr4);
		isort.print(arr5);
		
	}

}
