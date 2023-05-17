package singleDimensionArray;

public class myArray {

	public static void main(String[] args) {
		
		//creation
		singleDimensionArray sda=new singleDimensionArray(10);
		for(int i=0; i<sda.arr.length; i++) {
			System.out.print(sda.arr[i]+" ");
		}
		System.out.println();
		
		//insertion
		sda.insert(0,2);
		sda.insert(1,4);
		sda.insert(2,6);
		sda.insert(1,5);
		sda.insert(10,5);
		for(int i=0; i<sda.arr.length; i++) {
			System.out.print(sda.arr[i]+" ");
		}
		System.out.println();
		
		//traversal
		sda.traverse();
		
		//search
		sda.search(6);
		sda.search(Integer.MIN_VALUE);
		sda.search(10);
		
		//delete
		sda.delete(2);
		sda.delete(6);
		sda.delete(10);
		sda.traverse();
	}

}
