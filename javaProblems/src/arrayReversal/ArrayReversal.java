package arrayReversal;

public class ArrayReversal {
	
	//reversal
	public int[] reverse(int[] arr) {
		int tempHolder=0;
		
		//empty array
		if(arr.length==0) {
			System.out.println("This array is empty");
			return arr;
		}
		
		//swap
		for(int i=0; i<(arr.length/2); i++) {
			tempHolder=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=tempHolder;
		}
		
		return arr;
	}
	
	//print
	public void print(int[] arr) {
		
		if(arr.length==0) {
			System.out.println("This array is empty");
			return;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
