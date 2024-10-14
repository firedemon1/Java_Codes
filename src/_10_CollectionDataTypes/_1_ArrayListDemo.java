package _10_CollectionDataTypes;

import java.util.ArrayList;

public class _1_ArrayListDemo {
	public static void main(String[] args) {
		// Creating an ArrayList
		ArrayList<String> list = new ArrayList<>();

		// Adding elements
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		// Removing an element
		list.remove("Banana");

		// Getting element at index
		String fruit = list.get(1);
		System.out.println(fruit);

		// Checking size
		int size = list.size();
		System.out.println("Size: " + size);

		// Checking if empty
		boolean isEmpty = list.isEmpty();
		System.out.println("Is empty: " + isEmpty);
	}
}

//add(E e) - adds an element to the end of the list
//add(int index, E element) - adds an element at a specific index
//remove(int index) - removes the element at the specified index
//get(int index) - retrieves the element at the specified index
//size() - returns the number of elements in the list
//clear() - removes all elements from the list
//isEmpty() - checks if the list is empty
//contains(Object o) - checks if the list contains a specific element
//indexOf(Object o) - returns the index of the first occurrence of the specified element
//set(int index, E element) - replaces the element at the specified index
