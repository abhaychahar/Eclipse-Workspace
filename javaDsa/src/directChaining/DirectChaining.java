package directChaining;
import java.util.LinkedList;

public class DirectChaining {
	public LinkedList<String> hashTable[];
	
	//creation of hash table
	public DirectChaining(int size) {
		hashTable=new LinkedList[size];
	}
	
	//hash function
	private int hashFunction(String val, int hashTableSize) {
		char ch[]=val.toCharArray();
		int sum=0;
		
		for(int i=0; i<val.length(); i++) {
			sum=sum+ch[i];
		}
		
		return sum%hashTableSize;
	}
	
	//insertion
	public void insertToHashTable(String val) {
		int indexOfInsertion=hashFunction(val,hashTable.length);
		
		if(hashTable[indexOfInsertion]==null) {
			hashTable[indexOfInsertion]=new LinkedList();
			hashTable[indexOfInsertion].add(val);
		}
		else {
			hashTable[indexOfInsertion].add(val);
		}
	}
	
	//print the hash table
	public void print() {
		if(hashTable==null) {
			System.out.println("The hash table does not exist");
		}
		else {
			for(int i=0; i<hashTable.length; i++) {
				System.out.println("Index: "+i+" Keys: "+hashTable[i]);
			}
		}
	}
	
	//search
	public boolean searchInHashTable(String val) {
		int possibleIndex=hashFunction(val, hashTable.length);
		
		if(hashTable[possibleIndex]!=null && hashTable[possibleIndex].contains(val)) {
			System.out.println("The String "+'"'+val+'"'+" is present at index "+possibleIndex);
			return true;
		}
		else  {
			System.out.println("The String "+'"'+val+'"'+" is not present in the hash table");
			return false;
		}
	}
	
	//deletion
	public void deleteFromHashTable(String val) {
		int possibleIndex=hashFunction(val, hashTable.length);
		boolean search=searchInHashTable(val);
		
		if(search==true) {
			hashTable[possibleIndex].remove(val);
			System.out.println("The String "+'"'+val+'"'+" has been removed from index "+possibleIndex);
		}
		else {
			System.out.println("The String "+'"'+val+'"'+" cannot be found in the hash tabel");
		}
	}
	
}





















