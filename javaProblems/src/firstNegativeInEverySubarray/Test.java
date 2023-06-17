package firstNegativeInEverySubarray;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {};
		int[] arr2= {1};
		int[] arr3= {2,-3,-1,7,-6,5,8,-9,-1,7,5,6};
		int[] arr4= {2,3,4,5,1,2,4,6};
		
		FirstNegativeInEverySubarray arr=new FirstNegativeInEverySubarray();
		arr.findFirstNeg(arr1, 3);
		arr.findFirstNeg(arr2, 3);
		arr.findFirstNeg(arr3, 3);
		arr.findFirstNeg(arr3, 5);
		arr.findFirstNeg(arr3, 12);
		arr.findFirstNeg(arr4, 3);
	
	}
}
