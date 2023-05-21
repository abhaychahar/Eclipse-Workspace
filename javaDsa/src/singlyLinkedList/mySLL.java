package singlyLinkedList;

public class mySLL {
	public static void main(String[] args) {
		singlyLinkedList mySLL=new singlyLinkedList();
		mySLL.createSinglyLinkedList(10);
		System.out.println(mySLL.head.value);
		
		//insertion
		mySLL.insert(2,2);
		mySLL.insert(13,3);
		mySLL.insert(6,4);
		mySLL.insert(19,5);
		mySLL.insert(97,6);
		System.out.println(mySLL.head.value);
		System.out.println(mySLL.head.next.value);
		System.out.println(mySLL.tail.value);
		
		//traversal
		mySLL.traverse();
		System.out.println(mySLL.size);
		mySLL.insert(103,7);
		mySLL.traverse();
		
		//search
		mySLL.search(97);
		mySLL.search(117);
		
		//deletion of a node
		mySLL.deleteNodeAt(0);
		mySLL.deleteNodeAt(1);
		mySLL.traverse();
		mySLL.insert(10,1);
		mySLL.traverse();
		
		mySLL.deleteNodeAt(24);
		mySLL.deleteNodeAt(6);
		mySLL.traverse();
		mySLL.insert(97,6);
		mySLL.traverse();
		
		mySLL.deleteNodeAt(7);
		mySLL.deleteNodeAt(4);
		mySLL.traverse();
		mySLL.insert(6,4);
		mySLL.traverse();
		
		//deletion of entire linked list
		mySLL.deleteList();
		mySLL.traverse();
		
		
	}
}











