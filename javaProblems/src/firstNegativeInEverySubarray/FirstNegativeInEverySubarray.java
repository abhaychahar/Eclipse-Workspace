package firstNegativeInEverySubarray;
import java.util.Queue;
import java.util.LinkedList;

public class FirstNegativeInEverySubarray {
	
	//find first negative
	public void findFirstNeg(int[] arr, int k) {
		if(k>arr.length) {
			System.out.println("The window size exceeds the array size");
		}
		if(arr.length==0) {
			System.out.println("The array is empty");
		}
		
		
		Queue<Integer> queue=new LinkedList<>();
		int i=0;
		int j=0;
		
		//fixed sliding window
		while(j<arr.length) {
			if(arr[j]<0) {
				queue.add(arr[j]);
			}
			
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				if(queue.isEmpty()) {
					System.out.print(0+" ");
				}
				else if(arr[i]==queue.peek()) {
					System.out.print(queue.poll()+" ");
				}
				else {
					System.out.print(queue.peek()+" ");
				}
				j++;
				i++;
			}
		}
		System.out.println();
	}
}
