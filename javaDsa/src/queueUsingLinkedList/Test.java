package queueUsingLinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkedList myQueue=new QueueUsingLinkedList();
		
		//creation
		myQueue.createQueue();
		
		//isEmpty
		System.out.println(myQueue.isEmpty());
		
		//enQueue
		myQueue.enQueue(10);
		myQueue.enQueue(20);
		myQueue.enQueue(30);
		myQueue.enQueue(40);
		System.out.println(myQueue.isEmpty());
		
		//deQueue
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.deQueue());
		
		//peek
		System.out.println(myQueue.peek());
		System.out.println(myQueue.peek());
		System.out.println(myQueue.isEmpty());
		
		//deletion
		myQueue.enQueue(10);
		myQueue.enQueue(20);
		myQueue.deleteQueue();
		
	}
}
