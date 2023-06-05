package rotate2dArray;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		Rotate2dArray arr=new Rotate2dArray();
		arr.rotate(arr1);
		arr.rotate(arr2);
		
		arr.print(arr1);
		arr.print(arr2);
		
	}
}
