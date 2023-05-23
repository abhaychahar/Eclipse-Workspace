package stackUsingArray;

public class myStack {
	public static void main(String[] args) {
		stackUsingArray mS=new stackUsingArray();
		
		//creation
		mS.createStack(4);
		mS.traverse();
		
		//push
		mS.push(1);
		mS.push(2);
		mS.push(3);
		mS.traverse();
		mS.push(4);
		mS.traverse();
		
		//pop
		mS.pop();
		mS.pop();
		mS.traverse();
		
		//peek
		System.out.println(mS.peek());
		
		//isEmpty
		System.out.println(mS.isEmpty());
		mS.pop();
		mS.pop();
		System.out.println(mS.isEmpty());
		
		//isFull
		System.out.println(mS.isFull());
		mS.push(1);
		mS.push(1);
		mS.push(1);
		mS.push(1);
		System.out.println(mS.isFull());
		
		//deletion
		mS.delete();
		
	}
}









