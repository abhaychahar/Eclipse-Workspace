package bubbleSort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BubbleSort bsort=new BubbleSort();
		
		int[] arr1= {9,1,4,2,3,6};
		int[] arr2= {};
		int[] arr3= {4};
		int[] arr4= {4,2};
	
		//bubble sort
		bsort.bubbleSort(arr1);
		bsort.bubbleSort(arr2);
		bsort.bubbleSort(arr3);
		bsort.bubbleSort(arr4);
		
		//print
		bsort.print(arr1);
		bsort.print(arr2);
		bsort.print(arr3);
		bsort.print(arr4);
		
		//bubble sort using 'for' loop
		bsort.bubbleSortForLoop(arr1);
		bsort.bubbleSortForLoop(arr2);
		bsort.bubbleSortForLoop(arr3);
		bsort.bubbleSortForLoop(arr4);
	
		//print
		bsort.print(arr1);
		bsort.print(arr2);
		bsort.print(arr3);
		bsort.print(arr4);
		
	}

}
