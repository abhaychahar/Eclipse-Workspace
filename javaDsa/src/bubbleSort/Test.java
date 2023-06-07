package bubbleSort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BubbleSort bsort=new BubbleSort();
		
		int[] arr1= {9,1,4,2,3,6};
		int[] arr2= {};
		int[] arr3= {4};
		int[] arr4= {4,2};
		int[] arr5= {9,1,4,1,2,3,2,4,6};
	
		//bubble sort
		bsort.bubbleSort(arr1);
		bsort.bubbleSort(arr2);
		bsort.bubbleSort(arr3);
		bsort.bubbleSort(arr4);
		bsort.bubbleSort(arr5);
		
		//print
		bsort.print(arr1);
		bsort.print(arr2);
		bsort.print(arr3);
		bsort.print(arr4);
		bsort.print(arr5);
		
		//bubble sort using 'for' loop
		bsort.bubbleSortForLoop(arr1);
		bsort.bubbleSortForLoop(arr2);
		bsort.bubbleSortForLoop(arr3);
		bsort.bubbleSortForLoop(arr4);
		bsort.bubbleSortForLoop(arr5);
	
		//print
		bsort.print(arr1);
		bsort.print(arr2);
		bsort.print(arr3);
		bsort.print(arr4);
		bsort.print(arr5);
		
	}

}
