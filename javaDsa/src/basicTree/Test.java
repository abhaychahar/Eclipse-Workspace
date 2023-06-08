package basicTree;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation
		TreeNode n1=new TreeNode("node 1");
		TreeNode n2=new TreeNode("node 2");
		TreeNode n3=new TreeNode("node 3");
		TreeNode n4=new TreeNode("node 4");
		TreeNode n5=new TreeNode("node 5");
		
		//link
		n1.addChild(n2);
		n1.addChild(n3);
		n2.addChild(n4);
		n3.addChild(n5);
		
		//print
		System.out.println(n1.print(0));
		
	}
}
