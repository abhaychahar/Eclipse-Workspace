package binaryTreeUsingLinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation of tree
		BinaryTreeUsingLinkedList btll= new BinaryTreeUsingLinkedList();
		
		//creation of nodes and link creation
		btll.root=new BinaryNode("n1");
		btll.root.left=new BinaryNode("n2");
		btll.root.right=new BinaryNode("n3");
		btll.root.left.left=new BinaryNode("n4");
		btll.root.left.right=new BinaryNode("n5");
		btll.root.right.right=new BinaryNode("n6");
		btll.root.left.left.left=new BinaryNode("n7");
		btll.root.left.left.right=new BinaryNode("n8");
		
		//preorder traversal
		btll.preOrder(btll.root);
		System.out.println();
		System.out.println("---------------");
		
		//inorder traversal
		btll.inOrder(btll.root);
		System.out.println();
		System.out.println("---------------");
		
		//postorder traversal
		btll.postOrder(btll.root);
		System.out.println();
		System.out.println("---------------");
		
		//levelorder traversal
		btll.levelOrder();
		System.out.println();
		System.out.println("---------------");
		
		//search
		btll.search("n5");
		btll.search("n10");
		
		//insertion
		btll.insert("n9");
		btll.levelOrder();
		System.out.println();
		System.out.println("---------------");
		btll.insert("n10");
		btll.levelOrder();
		System.out.println();
		System.out.println("---------------");
				
		//deletion of a given node
		btll.deleteNode("n2");
		btll.levelOrder();
		System.out.println();
		System.out.println("---------------");
		btll.deleteNode("n10");
		btll.levelOrder();
		System.out.println();
		System.out.println("---------------");
		
		//deletion of the entire binary tree
		btll.deleteBinaryTree();
		btll.preOrder(btll.root);
		System.out.println();
		System.out.println("---------------");
		btll.inOrder(btll.root);
		System.out.println();
		System.out.println("---------------");
		btll.levelOrder();
		System.out.println();
		System.out.println("---------------");
		btll.search("n1");
		btll.deleteNode("n1");
		
	}
}

























