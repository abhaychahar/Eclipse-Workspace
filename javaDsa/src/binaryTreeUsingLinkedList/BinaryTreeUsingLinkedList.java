package binaryTreeUsingLinkedList;
import java.util.*;

public class BinaryTreeUsingLinkedList {
	public BinaryNode root;
	
	//creation
	public BinaryTreeUsingLinkedList() {
		this.root=null;
	}
	
	//preorder traversal
	public void preOrder(BinaryNode node) {
		if(node==null) {
			return;
		}
		System.out.print(node.val+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	//inorder traversal
	public void inOrder(BinaryNode node) {
		if(node==null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.val+" ");
		inOrder(node.right);
	}
	
	//postorder traversal
	public void postOrder(BinaryNode node) {
		if(node==null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.val+" ");
	}
	
	//levelorder traversal
	void levelOrder() {
		BinaryNode currentNode=null;
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			currentNode=queue.remove();
			System.out.print(currentNode.val+" ");
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
		}
	}
	
}




















