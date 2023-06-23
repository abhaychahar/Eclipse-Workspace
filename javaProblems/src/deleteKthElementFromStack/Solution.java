package deleteKthElementFromStack;
import java.util.Stack;

public class Solution {
	
	public Stack<Integer> deleteRecur(Stack<Integer> stk, int k) {
		
		if(k==1) {
			stk.pop();
			return stk;
		}
		
		int temp=stk.pop();
		deleteRecur(stk, k-1);
		stk.push(temp);
		return stk;
		
	}
	
	public void print(Stack<Integer> stk) {
		
		for(int i=0; i<stk.size(); i++) {
			System.out.print(stk.get(i));
		}
		System.out.println();
	
	}

}
