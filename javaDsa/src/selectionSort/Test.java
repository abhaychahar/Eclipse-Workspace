package selectionSort;

import bubbleSort.BubbleSort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SelectionSort bsort=new SelectionSort();
		
		int[] arr1= {9,1,4,2,3,6};
		int[] arr2= {};
		int[] arr3= {4};
		int[] arr4= {4,2};
		int[] arr5= {9,1,4,1,2,3,2,4,6};
	
		//bubble sort
		bsort.selectionSort(arr1);
		bsort.selectionSort(arr2);
		bsort.selectionSort(arr3);
		bsort.selectionSort(arr4);
		bsort.selectionSort(arr5);
		
		//print
		bsort.print(arr1);
		bsort.print(arr2);
		bsort.print(arr3);
		bsort.print(arr4);
		bsort.print(arr5);
			
	}

}
