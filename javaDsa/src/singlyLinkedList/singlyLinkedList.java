package singlyLinkedList;

public class singlyLinkedList {
	public node head;
	public node tail;
	public int size;
	
	//creation
	public node createSinglyLinkedList(int nodeValue) {
		head=new node();
		node node=new node();
		node.value=nodeValue;
		node.next=null;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	
	//insertion
	public void insert(int nodeValue, int nodeLocation) {
		node node=new node();
		node.value=nodeValue;
		
		if(head==null) {
			createSinglyLinkedList(nodeValue);
		}
		else if(nodeLocation==0) {
			node.next=head;
			head=node;
		}
		else if(nodeLocation>=size) {
			tail.next=node;
			node.next=null;
			tail=node;
		}
		else {
			int i=0;
			node temp=head;
			while(i<nodeLocation-1) {
				temp=temp.next;
				i++;
			}
			node tempnext=temp.next;
			temp.next=node;
			node.next=tempnext;
		}
		size++;
	}
}
