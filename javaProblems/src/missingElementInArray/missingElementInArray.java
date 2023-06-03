package missingElementInArray;

public class missingElementInArray {
	
	//missing element check
	public int findMissing(int[] arr) {
		
		//empty array or single element array
		if(arr.length==0 || arr.length==1) {
			System.out.println("Invalid input. The array must have more than 1 element");
			return -1;
		}
		
		int min=arr[0];
		int sum=0;
		boolean prob=false;
		
		//can zero be the missing element?
		if(arr[0]>0) {
			for(int i=1; i<arr.length; i++) {
				if(arr[i]<0) {
					prob=true;
					break;
				}
				else {
					prob=false;
				}
			}
		}
		else if(arr[0]<0) {
			for(int i=1; i<arr.length; i++) {
				if(arr[i]>0) {
					prob=true;
					break;
				}
				else {
					prob=false;
				}
			}
		}
		else {
			prob=false;
		}
		
		//minimum element and sum
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
			
			if(arr[i]>min) {
				continue;
			}
			else {
				min=arr[i];
			}
		}
		
		System.out.println("Minimum element in the array : "+min);
		System.out.println("Sum of array elements : "+sum);
		
		//missing element
		int result=(((arr.length+1)*((2*min)+arr.length))/2)-sum;
		if(prob==true) {
			if(result==0) {
				return 0;
			}
			else {
				return result;
			}
		}
		else {
			return result;
		}
		
	}
}















