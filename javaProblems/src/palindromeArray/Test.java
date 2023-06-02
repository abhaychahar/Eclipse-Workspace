package palindromeArray;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={};
		int[] arr2={1,2,3,2,1};
		int[] arr3={1,2,3,4,5,6};
		int[] arr4={1,2,4,4,2,1};
		int[] arr5={1,2,3,4,2,1};
		
		palindromeArray arr=new palindromeArray();
		arr.isPalindrome(arr1);
		arr.isPalindrome(arr2);
		arr.isPalindrome(arr3);
		arr.isPalindrome(arr4);
		arr.isPalindrome(arr5);
		
	}
}
