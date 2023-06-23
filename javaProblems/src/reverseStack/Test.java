package reverseStack;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		
		Stack<Integer> stk1=new Stack<Integer>();
		Stack<Integer> stk2=new Stack<Integer>();
		Stack<Integer> stk3=new Stack<Integer>();
		
		stk1.push(1);
		stk1.push(2);
		stk1.push(3);
		stk1.push(4);
		stk1.push(5);
		
		Solution sol=new Solution();
		
		sol.print(stk1);
		System.out.println("---------------");
		
		sol.print(sol.reverse(stk1));
		System.out.println("---------------");
		
		sol.print(sol.reverse(stk2));
		System.out.println("---------------");
		
		stk3.push(1);
		sol.print(sol.reverse(stk3));
		System.out.println("---------------");
		
	}

}
