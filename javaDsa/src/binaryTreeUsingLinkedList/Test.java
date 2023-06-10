package binaryTreeUsingLinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation of tree
		BinaryTreeUsingLinkedList btll= new BinaryTreeUsingLinkedList();
		
		//creation of nodes
		BinaryNode n1=new BinaryNode();
		n1.val="n1";
		BinaryNode n2=new BinaryNode();
		n2.val="n2";
		BinaryNode n3=new BinaryNode();
		n3.val="n3";
		BinaryNode n4=new BinaryNode();
		n4.val="n4";
		BinaryNode n5=new BinaryNode();
		n5.val="n5";
		BinaryNode n6=new BinaryNode();
		n6.val="n6";
		BinaryNode n7=new BinaryNode();
		n7.val="n7";
		BinaryNode n8=new BinaryNode();
		n8.val="n8";
		
		//link creation
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n4.left=n7;
		n4.right=n8;
		n3.right=n6;
		btll.root=n1;
		
		//preorder traversal
		btll.preOrder(n1);
		System.out.println();
		System.out.println("---------------");
		
		//inorder traversal
		btll.inOrder(n1);
		System.out.println();
		System.out.println("---------------");
		
		//postorder traversal
		btll.postOrder(n1);
		System.out.println();
		System.out.println("---------------");
		
		//levelorder traversal
		btll.levelOrder();
		System.out.println();
		System.out.println("---------------");
		
	}
}

























