package _10_CollectionDataTypes;

import java.util.TreeSet;

public class _4_TreeSetDemo {
	public static void main(String[] args) {
		// Creating a TreeSet
		TreeSet<String> set = new TreeSet<>();

		// Adding elements
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");

		// Removing an element
		set.remove("Banana");

		// Checking if an element is present
		boolean containsOrange = set.contains("Orange");
		System.out.println("Contains Orange: " + containsOrange);

		// Checking size
		int size = set.size();
		System.out.println("Size: " + size);

		// Checking if empty
		boolean isEmpty = set.isEmpty();
		System.out.println("Is empty: " + isEmpty);
	}
}

//add(E e) - adds the specified element to the set
//remove(Object o) - removes the specified element from the set
//contains(Object o) - checks if the set contains the specified element
//size() - returns the number of elements in the set
//isEmpty() - checks if the set is empty
//clear() - removes all elements from the set
//first() - returns the first (lowest) element in the set
//last() - returns the last (highest) element in the set
//lower(E e) - returns the greatest element in the set strictly less than the given element
//higher(E e) - returns the least element in the set strictly greater than the given element
