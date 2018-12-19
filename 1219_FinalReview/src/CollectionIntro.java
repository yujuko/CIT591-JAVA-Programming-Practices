import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionIntro {
	
	public static void main(String[] args) {
		
		//Lists, Sets and Maps all have similar syntax
		//First we declare the Collection class type and then we declare the
		//data type to store in this collection in brackets <>
		//Lists - stores Strings in order 
		ArrayList<String> family = new ArrayList<>();
		LinkedList<String> dogs = new LinkedList<>();
		//add objects with the add method
		family.add("Kathleen");
		family.add("Steve");
		family.add("John");
		family.add("Pat");
		//insert Michelle at index 3
		family.add(3,"Michelle");
		//change Pat's name to Patrick
		//use set to overwrite the value that is at that index place
		family.set(4, "Patrick");
		System.out.println(family);
		
		//dogs is a LinkedList
		//it has the same methods as the ArrayList
		dogs.add("Boomer");
		 
		//Sets
		HashSet<Integer> intSet = new HashSet<>();
		TreeSet<Integer> tSet = new TreeSet<>(); //stores integers in sorted order
		//Sets have many of the same methods as Lists
		//They do not have an insert method or set method.
		//Why?
		intSet.add(500);
		tSet.add(80);
		
		//Maps
		HashMap<String, Double> productsHash = new HashMap<>();
		TreeMap<String, Double> productsTree = new TreeMap<>();
		//Maps associate keys with values
		//The first data type is the key and the second is the value
		//put a product and its cost in the Map
		productsHash.put("Tide", 11.99);
		productsTree.put("Gain", 12.99);
		
		double price = productsHash.get("Tide");
		System.out.println("The price of Tide is "+price);
	}

}
