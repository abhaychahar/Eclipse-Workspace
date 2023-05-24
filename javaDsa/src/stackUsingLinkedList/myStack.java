package stackUsingLinkedList;

public class myStack {

	public static void main(String[] args) {
		stackUsingLinkedList mS=new stackUsingLinkedList();
		
		//creation
		mS.createStack();
		
		//push
		mS.push(1);
		mS.push(2);
		mS.push(3);
		mS.push(4);
		
		//pop
		mS.pop();
		mS.pop();
		
		//peek
		System.out.println(mS.peek());
		
		//isEmpty
		System.out.println(mS.isEmpty());
		mS.pop();
		mS.pop();
		System.out.println(mS.isEmpty());
		
		//deletion
		mS.delete();
		
	}
}
