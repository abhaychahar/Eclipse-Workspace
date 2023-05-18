package singlyLinkedList;

public class mySLL {
	public static void main(String[] args) {
		singlyLinkedList mySLL=new singlyLinkedList();
		mySLL.createSinglyLinkedList(10);
		System.out.println(mySLL.head.value);
		
		//insertion
		mySLL.insert(2,1);
		System.out.println(mySLL.head.value);
		System.out.println(mySLL.head.next.value);
		System.out.println(mySLL.tail.value);
		
	}
}
