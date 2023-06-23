package deleteKthElementFromStack;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stk1=new Stack<Integer>();
		
		stk1.push(1);
		stk1.push(2);
		stk1.push(3);
		stk1.push(4);
		stk1.push(5);
		
		Solution sol=new Solution();
		
		sol.print(stk1);
		System.out.println("---------------");
		
		sol.print(sol.deleteRecur(stk1, (stk1.size()/2)+1));
		
	}

}
