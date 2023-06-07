package bubbleSort;

public class BubbleSort {
	
	//bubble sort
	public int[] bubbleSort(int[] arr) {
		
		int j=0;
		int i=0;
		int temp=0;
		
		while(j<arr.length-1) {
			while(i<arr.length-1-j) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					i++;
				}
				else {
					i++;
				}
			}
			i=0;
			j++;
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
	
	//bubble sort using 'for' loop
	public int[] bubbleSortForLoop(int[] arr) {
		int temp=0;
		for(int j=0; j<arr.length-1; j++) {
			for(int i=0; i<arr.length-1-j; i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		return arr;
	}
}








