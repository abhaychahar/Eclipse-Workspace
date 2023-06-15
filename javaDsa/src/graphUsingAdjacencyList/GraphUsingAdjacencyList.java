package graphUsingAdjacencyList;
import java.util.ArrayList;

public class GraphUsingAdjacencyList {
	public ArrayList<GraphNode> nodeList;
	
	public GraphUsingAdjacencyList(ArrayList<GraphNode> nodeList) {
		this.nodeList=nodeList;
	}
	
	//creation of edges
	public void addUndirectedEdge(int i, int j) {
		(nodeList.get(i).neighbors).add(nodeList.get(j));
		(nodeList.get(j).neighbors).add(nodeList.get(i));
	}
	
	//print the adjacency list
	public String toString() {
		StringBuilder s=new StringBuilder();
		for (int i=0; i<nodeList.size(); i++) {
			s.append(nodeList.get(i).val+": ");
			for (int j=0; j<nodeList.get(i).neighbors.size(); j++) {
				if (j==nodeList.get(i).neighbors.size()-1) {
					s.append((nodeList.get(i).neighbors.get(j).val));
				} 
				else {
					s.append((nodeList.get(i).neighbors.get(j).val)+" -> ");
				}
			}
			s.append("\n");
		}
		return s.toString();
	}
}
