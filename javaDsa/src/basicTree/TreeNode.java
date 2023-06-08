package basicTree;
import java.util.ArrayList;

public class TreeNode {
	
	String data;
	ArrayList<TreeNode> child;
	
	//creation of tree node
	public TreeNode(String data) {
		this.data=data;
		this.child=new ArrayList<TreeNode>();
	}
	
	//link child to parent
	public void addChild(TreeNode node) {
		this.child.add(node);
	}
	
	//print
	public String print(int level) {
	    String ret = "  ".repeat(level)+data+"\n";
	    for (TreeNode node : this.child) {
	      ret += node.print(level+1);
	    }
	    return ret;
	}
	
}
