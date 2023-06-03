package arrayReversal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={};
		int[] arr2={1,2,3,2,1};
		int[] arr3={1,2,3,4,5,6};
		
		arrayReversal arr=new arrayReversal();
		arr.reverse(arr1);
		arr.print(arr1);
		
		arr.reverse(arr2);
		arr.print(arr2);
		
		arr.reverse(arr3);
		arr.print(arr3);
		
	}

}
