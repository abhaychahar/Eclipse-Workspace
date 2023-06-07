package insertionSort;

public class InsertionSort {
	
	//insertion sort
	public int[] insertionSort(int[] arr) {
		
		int i=0;
		int j=1;
		int temp=0;
		
		while(i<arr.length-1) {
			while(j>0) {
				if(arr[j]<arr[j-1]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					j--;
				}
				else {
					j--;
				}
			}
			i++;
			j=i+1;
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
	
}
