package maximumSumSubarrayOfSizeK;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation
		int[] arr1={};
		int[] arr2={10};
		int[] arr3={2,3,5,2,9,7,3};
		
		//calculation of maximum sum
		MaximumSumSubarrayOfSizeK arr=new MaximumSumSubarrayOfSizeK();
		System.out.println(arr.calcMax(arr1, 2));
		System.out.println(arr.calcMax(arr2, 2));
		System.out.println(arr.calcMax(arr2, 1));
		System.out.println(arr.calcMax(arr3, 3));
		System.out.println(arr.calcMax(arr3, 7));
	
	}
}
