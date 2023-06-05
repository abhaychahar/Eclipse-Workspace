package missingElementInArray;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {};
		int[] arr2= {3};
		int[] arr3= {3,4,8,7,9,6};
		int[] arr4= {2,4};
		int[] arr5= {-4,-2,-3,-1,1,4,2,3};
		int[] arr6= {-3,-1,0,3,1,2};
	
		MissingElementInArray arr=new MissingElementInArray();
		System.out.println(arr.findMissing(arr1));
		System.out.println(arr.findMissing(arr2));
		System.out.println(arr.findMissing(arr3));
		System.out.println(arr.findMissing(arr4));
		System.out.println(arr.findMissing(arr5));
		System.out.println(arr.findMissing(arr6));
		
	}
}
