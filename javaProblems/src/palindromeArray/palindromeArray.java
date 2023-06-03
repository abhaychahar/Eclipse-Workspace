package palindromeArray;

public class palindromeArray {
	
	//palindrome check
	public int isPalindrome(int[] arr) {
		
		if(arr.length==0) {
			System.out.println("This array is empty");
			return -1;
		}
		//single pointer approach
		int i=arr[0];
		
		while(i<=(arr.length/2)) {
			if(arr[i]!=arr[arr.length-1-i]) {
				System.out.println("This array is not palindromic");
				return -1;
			}
			else {
				i++;
			}
		}
		System.out.println("This array is palindromic");
		return 1;
	}
}
