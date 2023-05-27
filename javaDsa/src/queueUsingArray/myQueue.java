package queueUsingArray;

public class myQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueUsingArray myQueue=new queueUsingArray();
		
		//creation
		myQueue.createQueue(4);
		
		//isEmpty
		System.out.println(myQueue.isEmpty());
		
		//isFull
		System.out.println(myQueue.isFull());
		
		//enQueue
		myQueue.enQueue(45);
		myQueue.enQueue(23);
		myQueue.enQueue(15);
		myQueue.enQueue(97);
		myQueue.enQueue(55);
		
		//deQueue
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.deQueue());
	
		//peek
		System.out.println(myQueue.peek());
	
		//delete
		myQueue.delete();
		
	}

}
