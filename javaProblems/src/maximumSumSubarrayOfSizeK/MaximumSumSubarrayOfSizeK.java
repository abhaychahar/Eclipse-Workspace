package maximumSumSubarrayOfSizeK;

public class MaximumSumSubarrayOfSizeK {
	
	//calculation of the maximum sum
	public int calcMax(int[] arr, int k) {
		if(k>arr.length) {
			System.out.println("The window size exceeds the array size");
			return -1;
		}
		
		
		int i=0;
		int j=0;
		int sum=0;
		int max=Integer.MIN_VALUE;
		
		while(j<arr.length) {
			sum=sum+arr[j];
			
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				if(max<sum) {
					max=sum;
				}
				sum=sum-arr[i];
				j++;
				i++;
			}
		}
		
		return max;
	}
}
