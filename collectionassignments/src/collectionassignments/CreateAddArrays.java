package collectionassignments;
import java.util.*;

public class CreateAddArrays {
	
	public static void main(String[] args) {



// to create and arraylist and add elements to it.

// public createListArray()

	 ArrayList<String> arstr=new ArrayList<String>();	 
	 
	 //to add values to arrayList
	 
	 arstr.add("Diya");
	 arstr.add("Jiya");
	 arstr.add("Kiya");
	 arstr.add("Piya");
	 arstr.add("Riya");
 
	 //to print elements of list using Iterator
	 
	 
	 Iterator itr=arstr.iterator();
	 
	 while(itr.hasNext())
		 
	 {
		 System.out.println(itr.next()+" ");
		 
	 }
	 
	 //to search for an element in the list.
	 
 String st="Piya";
 
 for(String lst: arstr)
 {
 if(st.contains(lst))
 {
 System.out.println(st+"is here!");
 break;
 }
 else
 {
 System.out.println("OOps search can't find!");
 break;
 }
 }
 
 
 
 //to print the elements in reverse oreder using ListIterator
 
 
 
 
 ListIterator iter = arstr.listIterator(arstr.size());
 
 System.out.println("After Sorting");

 while (iter.hasPrevious()) {
   System.out.println(iter.previous());
 }
 
	}
}



	 
 
 
 














	// TODO Auto-generated method st	
	


