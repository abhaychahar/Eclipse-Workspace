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
		if(root==null) {
			System.out.println("The binary tree does not exist");
			return;
		}
		
		if(node==null) {
			return;
		}
		System.out.print(node.val+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	//inorder traversal
	public void inOrder(BinaryNode node) {
		if(root==null) {
			System.out.println("The binary tree does not exist");
			return;
		}
		
		if(node==null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.val+" ");
		inOrder(node.right);
	}
	
	//postorder traversal
	public void postOrder(BinaryNode node) {
		if(root==null) {
			System.out.println("The binary tree does not exist");
			return;
		}
		
		if(node==null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.val+" ");
	}
	
	//levelorder traversal
	public void levelOrder() {
		if(root==null) {
			System.out.println("The binary tree does not exist");
			return;
		}
		
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
	
	//search
	public void search(String val) {
		if(root==null) {
			System.out.println("The binary tree does not exist");
			return;
		}
		
		BinaryNode currentNode=null;
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			currentNode=queue.remove();
			if(currentNode.val==val) {
				System.out.println("The value "+val+" exists in the binary tree");
				return;
			}
			else {
				if(currentNode.left!=null) {
					queue.add(currentNode.left);
				}
				if(currentNode.right!=null) {
					queue.add(currentNode.right);
				}
			}
		}
		System.out.println("The value "+val+" does not exist in the binary tree");
	}
	
	//insertion
	public void insert(String val) {
		BinaryNode toInsert=new BinaryNode();
		toInsert.val=val;
		
		if(root==null) {
			root=toInsert;
			System.out.println("The value "+val+" has been successfully inserted at the root position");
		}
		
		BinaryNode currentNode=null;
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			currentNode=queue.remove();
			if(currentNode.left==null) {
				currentNode.left=toInsert;
				System.out.println("The value "+val+" has been successfully inserted in the binary tree as a left child");
				return;
			}
			else if(currentNode.right==null) {
				currentNode.right=toInsert;
				System.out.println("The value "+val+" has been successfully inserted in the binary tree as a right child");
				return;
			}
			else {
				queue.add(currentNode.left);
				queue.add(currentNode.right);
			}
		}
	}
	
	//get the last node with respect to level order traversal
	public BinaryNode findLast() {
		if(root==null) {
			System.out.println("The binary tree does not exist");
			return null;
		}
		
		BinaryNode currentNode=null;
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			currentNode=queue.remove();
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
		}
		return currentNode;
	}
	
	//get the last node's parent node with respect to level order traversal
	public BinaryNode findLastNodeParent() {
		BinaryNode lastNode=this.findLast();
		BinaryNode lastNodeParent=null;
		BinaryNode currentNode=null;
		
		if(lastNode==null) {
			return null;
		}
		
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			currentNode=queue.remove();
			if(currentNode.left==lastNode || currentNode.right==lastNode) {
				lastNodeParent=currentNode;
				break;
			}
			
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
		}
		
		return lastNodeParent;
	}
	
	//deletion of a given node
	public void deleteNode(String val) {
		if(root==null) {
			System.out.println("The binary tree does not exist");
			return;
		}
		
		BinaryNode lastNode=this.findLast();
		BinaryNode lastNodeParent=this.findLastNodeParent();
		String lastNodeVal=lastNode.val;
		
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode currentNode=null;
		
		while(!queue.isEmpty()) {
			currentNode=queue.remove();
			
			if(currentNode.val==val) {
				currentNode.val=lastNodeVal;
				System.out.println("The value "+val+" has been replaced with "+lastNodeVal+" successfully");
				
				if(lastNodeParent.left==lastNode) {
					lastNodeParent.left=null;
					lastNode=null;
				}
				else if(lastNodeParent.right==lastNode) {
					lastNodeParent.right=null;
					lastNode=null;
				}
				System.out.println("The deepest and rightmost left node has been deleted");
				return;
			}
			
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
		}
		
		System.out.println("The value "+val+" was not found in the binary tree");
	}
	
	//deletion of the entire binary tree
	public void deleteBinaryTree() {
		this.root=null;
		System.out.println("The binary tree has been deleted successfully");
	}
	
}




















