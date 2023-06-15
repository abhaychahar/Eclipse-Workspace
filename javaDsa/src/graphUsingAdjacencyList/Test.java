package graphUsingAdjacencyList;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation of node list
		ArrayList<GraphNode> nodeList=new ArrayList<GraphNode>();
		
		//creation of nodes and insertion to node list
		nodeList.add(new GraphNode("A"));
		nodeList.add(new GraphNode("B"));
		nodeList.add(new GraphNode("C"));
		nodeList.add(new GraphNode("D"));
		nodeList.add(new GraphNode("E"));
		
		//creation of adjacency list
		GraphUsingAdjacencyList graph=new GraphUsingAdjacencyList(nodeList);
		
		//creation of edges
		graph.addUndirectedEdge(0, 1);
		graph.addUndirectedEdge(0, 2);
		graph.addUndirectedEdge(0, 3);
		graph.addUndirectedEdge(1, 3);
		graph.addUndirectedEdge(2, 4);
		graph.addUndirectedEdge(3, 4);
		
		//print the adjacency matrix
		System.out.println(graph.toString());
		
	}
}

















