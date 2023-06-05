package queueUsingLinkedList;

public class QueueUsingLinkedList {
	SinglyLinkedList queue;
	
	//creation
	public void createQueue() {
		this.queue=new SinglyLinkedList();
		System.out.println("The queue has been successfully created");
	}
	
	//isEmpty
	public boolean isEmpty() {
		if(queue.head==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//enQueue
	public void enQueue(int value) {
		queue.insert(value, queue.size);
		System.out.println("The value "+value+" has been enqueued to the queue");
	}
	
	//deQueue
	public int deQueue() {
		int result=-1;
		if(isEmpty()) {
			System.out.println("The queue is empty");
		}
		else {
			result=queue.head.value;
			queue.deleteNodeAt(1);
		}
		return result;
	}
	
	//peek
	public int peek() {
		int result=-1;
		if(isEmpty()) {
			System.out.println("The queue is empty");
		}
		else {
			result=queue.head.value;
		}
		return result;
	}
	
	//deletion
	public void deleteQueue() {
		queue.head=null;
		queue.tail=null;
		queue.size=0;
		System.out.println("The queue has been deleted successfully");
	}
}












