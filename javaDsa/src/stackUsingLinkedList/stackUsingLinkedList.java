package stackUsingLinkedList;

public class stackUsingLinkedList {
	
	singlyLinkedList sll;
	
	//creation
	public void createStack() {
		sll=new singlyLinkedList();
	}
	
	//push
	public void push(int value) {
		sll.insert(value,1);
		System.out.println("The value "+value+" has been pushed to the stack");
	}
	
	//pop
	public int pop() {
		if(sll.head==null) {
			System.out.println("The stack is already empty");
			return -1;
		}
		else {
			int poppedItem=sll.head.value;
			sll.deleteNodeAt(1);
			return poppedItem;
		}
	}
	
	//peek
	public int peek() {
		if(sll.head==null) {
			System.out.println("The stack is empty");
			return -1;
		}
		else {
			return sll.head.value;
		}
	}
	
	//isEmpty
	public boolean isEmpty() {
		if(sll.head==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//deletion of entire stack
	public void delete() {
		sll.head=null;
		sll.tail=null;
		System.out.println("The stack has been deleted");
	}
	
}





















