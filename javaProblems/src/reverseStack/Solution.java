package reverseStack;
import java.util.Stack;

public class Solution {
	
	public Stack<Integer> insert(Stack<Integer> stk, int k) {
		
		if(stk.size()==0) {
			stk.push(k);
			return stk;
		}
		
		int temp=stk.pop();
		insert(stk, k);
		stk.push(temp);
		return stk;
		
	}
	
	public Stack<Integer> reverse(Stack<Integer> stk) {
		
		if(stk.size()==0) {
			return stk;
		}
		
		int lastItem=stk.pop();
		reverse(stk);
		insert(stk, lastItem);
		return stk;
		
	}
	
	public void print(Stack<Integer> stk) {
		
		for(int i=0; i<stk.size(); i++) {
			System.out.print(stk.get(i));
		}
		System.out.println();
	
	}

}
