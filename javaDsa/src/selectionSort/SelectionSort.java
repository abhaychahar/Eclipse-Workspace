package selectionSort;

public class SelectionSort {
	
	//selection sort
	public int[] selectionSort(int[] arr) {
		
		int min=Integer.MAX_VALUE;
		int k=0;
		
		for(int j=0; j<arr.length-1; j++) {
			for(int i=j; i<arr.length; i++) {
				if(arr[i]<min) {
					min=arr[i];
					k=i;
				}
			}
			if(k!=j) {
				arr[k]=arr[j];
				arr[j]=min;
			}
			min=Integer.MAX_VALUE;
		}
		
		return arr;
	}
	
	//print
	public void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("---------------");
	}
	
	//selection sort with rotation (less efficient)
	public int[] selectionSortByRotation(int[] arr) {
		
		int min=Integer.MAX_VALUE;
		int k=0;
		
		for(int j=0; j<arr.length-1; j++) {
			for(int i=j; i<arr.length; i++) {
				if(arr[i]<min) {
					min=arr[i];
					k=i;
				}
			}
			while(k>j) {
				arr[k]=arr[k-1];
				arr[k-1]=min;
				k--;
			}
			min=Integer.MAX_VALUE;
		}
		
		return arr;
	}
}












