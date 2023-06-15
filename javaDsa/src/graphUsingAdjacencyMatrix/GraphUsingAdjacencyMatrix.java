package graphUsingAdjacencyMatrix;
import java.util.ArrayList;

public class GraphUsingAdjacencyMatrix {
	public int[][] adjacencyMatrix;
	public ArrayList<GraphNode> nodeList;
	
	//creation of adjacency matrix
	public GraphUsingAdjacencyMatrix(ArrayList<GraphNode> nodeList) {
		this.nodeList=nodeList;
		adjacencyMatrix=new int[nodeList.size()][nodeList.size()];
		System.out.println("An adjacency matrix of size "+nodeList.size()+"*"+nodeList.size()+" has been created");
	}
	
	//creation of edges 
	public void addUndirectedEdge(int i, int j) {
		adjacencyMatrix[i][j]=1;
		adjacencyMatrix[j][i]=1;
	}
	
	//print the adjacency matrix
	public String toString() {
		StringBuilder s=new StringBuilder();
		s.append("   ");
		for (int i=0; i<nodeList.size(); i++) {
			s.append(nodeList.get(i).val+" ");
		}
		s.append("\n");
		for (int i=0; i<nodeList.size(); i++) {
			s.append(nodeList.get(i).val +": ");
			for (int j: adjacencyMatrix[i]) {
				s.append((j)+" ");
			}
			s.append("\n");
		}
		return s.toString();
    }
}
