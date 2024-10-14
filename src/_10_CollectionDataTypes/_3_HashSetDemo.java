package _10_CollectionDataTypes;

import java.util.HashSet;

public class _3_HashSetDemo {
	public static void main(String[] args) {
		// Creating a HashSet
		HashSet<String> set = new HashSet<>();

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
//iterator() - returns an iterator over the elements in the set
//addAll(Collection<? extends E> c) - adds all elements from a collection to the set
//removeAll(Collection<?> c) - removes all elements in the specified collection from the set
//retainAll(Collection<?> c) - retains only the elements in the set that are contained in the specified collection
