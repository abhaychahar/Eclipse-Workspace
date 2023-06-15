package graphUsingAdjacencyMatrix;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation of node list
		ArrayList<GraphNode> nodeList=new ArrayList<GraphNode>();
		
		//creation of nodes and insertion to node list
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		nodeList.add(new GraphNode("E", 4));
		
		//creation of adjacency matrix
		GraphUsingAdjacencyMatrix graph=new GraphUsingAdjacencyMatrix(nodeList);
		
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

















