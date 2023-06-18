package directChaining;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation of hash table
		DirectChaining dc=new DirectChaining(10);
		
		//insertion
		dc.insertToHashTable("");
		dc.insertToHashTable(" ");
		dc.insertToHashTable("Resident Evil");
		dc.insertToHashTable("Resident Evil 2");
		dc.insertToHashTable("Resident Evil 3");
		dc.insertToHashTable("Saw");
		dc.insertToHashTable("The Evil Within");
		
		//print the hash table
		dc.print();
		
		//search
		dc.searchInHashTable("");
		dc.searchInHashTable("Resident Evil 4");
		dc.searchInHashTable(" ");
		
		//deletion
		dc.deleteFromHashTable("");
		dc.print();
		dc.deleteFromHashTable(" ");
		dc.print();
		
	}

}

















