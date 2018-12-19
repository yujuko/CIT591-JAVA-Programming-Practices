import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElements {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++) {
		    list.add(2 * i);         // [2, 4, 6, 8, 10]
		}
		for (int i = 0; i < list.size(); i++) {
		    list.remove(i);
			
		}		
		//Seems like this would remove the entire list
		//Look at contents of list after the remove calls
		System.out.println(list); // [4,8]
		//This misses the removal of elements that are shifted left
		
		//This code has the same problem
		ArrayList<Integer> duplicates = new ArrayList<Integer>();
		duplicates.add(2);
		duplicates.add(2);
		duplicates.add(2);
		duplicates.add(4);
		duplicates.add(4);
		
		for (int i = 0; i < list.size(); i++) {
		    if(duplicates.get(i)==2) {
		    	duplicates.remove(i);
		    }
		}
		//this misses the removal of elements shifted left
		//[2,4,4]
		
		System.out.println(duplicates);
		//we can fix this by decrementing i after remove call
		//by decrementing i we re-check the index where we just removed an element
		//there is a new element there now to check
		for (int i = 0; i < duplicates.size(); i++) {
		    if(duplicates.get(i)==4) {
		    	duplicates.remove(i);
		    	i--;
		    }		    
		}
		System.out.println(duplicates); //[2]
		
	    //Or we can use the Iterator to add or remove elements
		//The iterator is recommended
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			if(it.next()==4) {
				it.remove();
			}
						
		}
		System.out.println(list); //[8]
	}

}
