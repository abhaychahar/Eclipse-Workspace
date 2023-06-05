package queueUsingLinkedList;

public class SinglyLinkedList {
	public Node head;
	public Node tail;
	public int size;
	
	//creation
	public Node createSinglyLinkedList(int nodeValue) {
		Node node=new Node();
		node.value=nodeValue;
		node.next=null;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	
	//insertion
	public void insert(int nodeValue, int nodeLocation) {
		Node node=new Node();
		node.value=nodeValue;
		
		if(head==null) {
			createSinglyLinkedList(nodeValue);
		}
		else if(nodeLocation==1) {
			node.next=head;
			head=node;
		}
		else if(nodeLocation<1) {
			System.out.println("Error: Please enter a location greater than 1");
		}
		else if(nodeLocation>size) {
			tail.next=node;
			node.next=null;
			tail=node;
		}
		else {
			int i=0;
			Node temp=head;
			while(i<nodeLocation-2) {
				temp=temp.next;
				i++;
			}
			Node tempnext=temp.next;
			temp.next=node;
			node.next=tempnext;
		}
		size++;
	}
	
	//traversal
	public void traverse() {
		if(head!=null) {
			Node tempNode=head;
			for(int i=0; i<size; i++) {
				System.out.print(tempNode.value);
				if(i!=size-1) {
					System.out.print("-->");
				}
				tempNode=tempNode.next;
			}
			System.out.println();
		}
		else {
			System.out.println("The linked list does not exist");
		}
	}
	
	//search
	public void search(int nodeValue) {
		if(head==null) {
			System.out.println("The linked list does not exist");
		}
		else {
			Node tempNode=head;
			for(int i=0; i<size; i++) {
				if(tempNode.value==nodeValue) {
					System.out.println("The "+nodeValue+" is found at the node "+(i+1));
					return;
				}
				tempNode=tempNode.next;
			}
			System.out.println("The "+nodeValue+" was not found in the linked list");
		}
	}
	
	//deletion of a node (through location)
	public void deleteNodeAt(int nodeLocation) {
		if(head==null) {
			System.out.println("The linked list does not exist");
		}
		else {
			if(nodeLocation<1) {
				System.out.println("Error: Please enter a location greater than 1");
			}
			else if(nodeLocation==1) {
				size--;
				if(size==0) {
					tail=null;
					head=null;
				}
				else {
					head=head.next;
				}
			}
			else if(nodeLocation==size) {
				if(size==0) {
					tail=null;
					head=null;
				}
				else {
					Node tempNode=head;
					for(int i=0; i<size-1; i++) {
						if(i<size-2) {
							tempNode=tempNode.next;
						}
						else {
							tail=tempNode;
							tempNode.next=null;
						}
					}
				}
				size--;
			}
			else if(nodeLocation>size) {
				System.out.println("The specified location exceeds the size of the linked list");
			}
			else {
				size--;
				Node tempNode=head;
				for(int i=0; i<nodeLocation-2; i++) {
					tempNode=tempNode.next;
				}
				tempNode.next=tempNode.next.next;
			}
		}
	}
	
	//deletion of entire linked list
	public void deleteList() {
		head=null;
		tail=null;
		size=0;
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

