package queueUsingArray;

public class QueueUsingArray {
	int arr[];
	int topOfQueue;
	int beginningOfQueue;
	
	//creation
	public void createQueue(int size) {
		this.arr=new int[size];
		this.topOfQueue=-1;
		this.beginningOfQueue=-1;
		System.out.println("The queue of size "+size+" has been created");
	}
	
	//isFull
	public boolean isFull() {
		if(topOfQueue==arr.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//isEmpty
	public boolean isEmpty() {
		if(beginningOfQueue==-1 || beginningOfQueue==arr.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//enQueue
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("The queue is full");
		}
		else if(isEmpty()) {
			beginningOfQueue=0;
			topOfQueue++;
			arr[topOfQueue]=value;
			System.out.println("The value "+value+" has been enqueued to the queue");
		}
		else {
			topOfQueue++;
			arr[topOfQueue]=value;
			System.out.println("The value "+value+" has been enqueued to the queue");
		}
	}
	
	//deQueue
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("The queue is empty");
			return -1;
		}
		else {
			int result=arr[beginningOfQueue];
			beginningOfQueue++;
			if(beginningOfQueue>topOfQueue) {
				System.out.println("The queue is now empty");
				beginningOfQueue=-1;
				topOfQueue=-1;
			}
			return result;
		}
	}
	
	//peek
	public int peek() {
		if(isEmpty()) {
			System.out.println("The queue is empty");
			return -1;
		}
		else {
			return arr[beginningOfQueue];
		}
	}
	
	//deletion
	public void delete() {
		arr=null;
		System.out.println("The queue has been deleted");
	}
	
}
