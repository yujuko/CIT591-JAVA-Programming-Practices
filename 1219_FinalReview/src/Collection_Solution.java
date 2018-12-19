
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class InClassAssignment1And2Solution {
	
	public static void main(String[] args) {
		
		String[] wordArray = {"Hello", "Hello", "HelloWorld","World", "Java", "Program"};
				
		//ArrayList stores words in order
		ArrayList<String> wordArrayList = new ArrayList<>();		
		wordArrayList.addAll(Arrays.asList(wordArray));
		System.out.println("ArrayList "+wordArrayList);
		
		//LinkedList stores words in order
		LinkedList<String> wordLinkedList = new LinkedList<>();		
		wordLinkedList.addAll(Arrays.asList(wordArray));
		System.out.println("LinkedList "+wordLinkedList);
		
		//TreeSet stores data in sorted order
		//Duplicates are not added
		TreeSet<String> wordTreeSet = new TreeSet<>();
		wordTreeSet.addAll(Arrays.asList(wordArray));
		System.out.println("TreeSet "+wordTreeSet);
		
		//HashSet does not store data in order or in sorted order
		//Duplicates are not added
		HashSet<String> wordHashSet = new HashSet<>();
		wordHashSet.addAll(Arrays.asList(wordArray));
		System.out.println("HashSet "+wordHashSet);
		
		//HashMap stores key value pairs
		HashMap<String, Integer> wordHashMap = new HashMap<>();
		wordHashMap.put("Hello", 2);
		wordHashMap.put("HelloWorld", 1);
		wordHashMap.put("World", 1);
		wordHashMap.put("Java", 1);
		wordHashMap.put("Program", 1);
		
		TreeMap<String, Integer> wordTreeMap = new TreeMap<>();
		wordTreeMap.put("Hello", 2);
		wordTreeMap.put("HelloWorld", 1);
		wordTreeMap.put("World", 1);
		wordTreeMap.put("Java", 1);
		wordTreeMap.put("Program", 1);
		
		System.out.println("HashMap "+wordHashMap);
		System.out.println("TreeMap "+wordTreeMap);
		
		//In class assignment 2
		//In class assignment 2
		//add new values to ArrayList
		wordArrayList.add("HelloWorld");
		wordArrayList.add("Good Job");
				
		//iterate through the ArrayList checking the map for each String
		//if it exists, update the value
		for(String s: wordArrayList) {
			if(wordTreeMap.containsKey(s)) {
				wordTreeMap.put(s, wordTreeMap.get(s)+1);
			} else {
				wordTreeMap.put(s, 1);
			}
		}
				
		//Use the TreeMap to print the values sorted by key
		//TreeMap stores the keys in sorted order
		System.out.println("TreeMap "+wordTreeMap);	
	}
		
}
