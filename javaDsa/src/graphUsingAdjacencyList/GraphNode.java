package graphUsingAdjacencyList;
import java.util.ArrayList;

public class GraphNode {
	public String val;
	public ArrayList<GraphNode> neighbors;
	
	//creation of vertex with adjacency list
	public GraphNode(String val) {
		this.val=val;
		neighbors=new ArrayList<GraphNode>();
	}
	
}
