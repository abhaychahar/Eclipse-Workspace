package stackUsingArray;

public class stackUsingArray {
	int arr[];
	int topIndex;
	
	//creation
	public void createStack(int size) {
		this.arr=new int[size];
		this.topIndex=-1;
		System.out.println("The stack has been created with size "+size);
	}
	
	//push
	public void push(int value) {
		if(topIndex==arr.length-1) {
			System.out.println("Overflow condition encountered");
		}
		else {
			arr[topIndex+1]=value;
			topIndex++;
		}
	}
	
	//pop
	public int pop() {
		if(topIndex==-1) {
			System.out.println("Underflow condition encountered");
			return -1;
		}
		else {
			int temp=arr[topIndex];
			arr[topIndex]=Integer.MIN_VALUE;
			topIndex--;
			return temp;
		}
	}
	
	//peek
	public int peek() {
		if(topIndex==-1) {
			System.out.println("The stack is empty");
			return -1;
		}
		else {
			return arr[topIndex];
		}
	}
	
	//isEmpty
	public boolean isEmpty() {
		if(topIndex==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//isFull
	public boolean isFull() {
		if(topIndex==arr.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//deletion
	public void delete() {
		arr=null;
		System.out.println("The stack has been deleted");
	}
	
	//traversal
	public void traverse() {
		if(topIndex==-1) {
			System.out.println("The stack is empty");
		}
		else {
			int i=0;
			while(i<=topIndex) {
				System.out.println(arr[i]);
				i++;
			}
		}
	}
	
}



















