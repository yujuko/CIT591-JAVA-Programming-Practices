import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Assignment4Solution {
	
	/*
	 * Method accepts an array of Strings as a parameter 
	 * and returns a count of the number of unique words in the array. 
	 * Do not worry about capitalization and punctuation; for example, "Hello" and "hello" and 
	 * "hello!!"
	 *  are different words for this problem. 
	 *  Hint: Use a TreeSet as auxiliary storage.
	 */
		
	public static int wordCountInTree(String[] words) {
	
		TreeSet<String> ts = new TreeSet<>();
		ts.addAll(Arrays.asList(words));
		return ts.size();

	}
		
	/*
	 * Write a method named removeDuplicates that accepts as a parameter an 
	 * ArrayList of integers, and modifies it by removing any duplicates. 
	 * Note that the elements of the list are not in any particular order, so the 
	 * duplicates might not occur consecutively. You should retain the original 
	 * relative order of the elements. Use a TreeSet as auxiliary storage to help 
	 * you solve this problem. For example, if a list named v stores 
	 * {4, 0, 2, 9, 4, 7, 2, 0, 0, 9, 6, 6}, the call of removeDuplicates(v); 
	 * should modify it to store {4, 0, 2, 9, 7, 6}.
	 * 
	 */
		
	public static void removeDuplicates(ArrayList<Integer> list) {
		
		TreeSet<Integer> ts = new TreeSet<>();
	    Iterator<Integer> it = list.iterator();
	    while(it.hasNext()) {
	    	if(!ts.add(it.next())) 
   		           it.remove();
	    }			
	}
		
	/*
	 * Given a map of food keys and topping values, modify and return the map as follows: 
	 * if the key "ice cream" is present, set its value to "cherry". 
	 * In all cases, set the key "bread" to have the value "butter".
	 * 
	 * topping1({"ice cream": "peanuts"})  {"bread": "butter", "ice cream": "cherry"}
	   topping1({})  {"bread": "butter"}
	   topping1({"pancake": "syrup"})  {"bread": "butter", "pancake": "syrup"}
	 */
		
	public static HashMap<String, String> topping1(HashMap<String, String> map) {
	
		 if(map.containsKey("ice cream")) {
		      map.put("ice cream", "cherry");
		    }
		    map.put("bread","butter");
		    
		  return map;
			 
	}
			
	public static void main(String[] args) {
		
		/*wordCountInTrees test 
		 * should print 4*/
		String [] addStar = {"*", "the", "*", "quick", "*", "brown", "*", "fox", "*"};
		System.out.println("wordCountInTrees expected "+ 5);
		System.out.println("wordCountInTrees actual   "+wordCountInTree(addStar));
		System.out.println();
		
		/*removeDuplicates test
		 * should return {4, 0, 2, 9, 7, 6}
		 */
		Integer[] removeDuplicates = {4, 0, 2, 9, 4, 7, 2, 0, 0, 9, 6, 6};	
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.addAll(Arrays.asList(removeDuplicates));
		removeDuplicates(list2);
		System.out.println("removeDuplicates expected [4, 0, 2, 9, 7, 6]");
		System.out.println("removeDuplicates actual   "+list2);
		System.out.println();
		
		/*
		 * test topping1 should print
		 * topping1({"ice cream": "peanuts"})  {"bread": "butter", "ice cream": "cherry"}
		 */
		HashMap<String, String> food = new HashMap<String, String>();
		food.put("ice cream", "peanuts");
		HashMap<String, String> m = topping1(food);
		System.out.println("topping1 expected "+ "{bread=butter, ice cream=cherry}");
		System.out.println("topping1 actual   "+m);
		System.out.println();				
	}


}
