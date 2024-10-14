package _10_CollectionDataTypes;

import java.util.LinkedList;

public class _2_LinkedListDemo {
	public static void main(String[] args) {
		// Creating a LinkedList
		LinkedList<String> list = new LinkedList<>();

		// Adding elements
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		// Adding elements at the beginning and end
		list.addFirst("Strawberry");
		list.addLast("Grapes");

		// Removing elements
		list.removeFirst();
		list.removeLast();

		// Getting elements
		String firstFruit = list.getFirst();
		String lastFruit = list.getLast();
		System.out.println("First fruit: " + firstFruit);
		System.out.println("Last fruit: " + lastFruit);

		// Checking size
		int size = list.size();
		System.out.println("Size: " + size);

		// Checking if empty
		boolean isEmpty = list.isEmpty();
		System.out.println("Is empty: " + isEmpty);
	}
}

//add(E e) - adds an element to the end of the list
//addFirst(E e) - adds an element to the beginning of the list
//addLast(E e) - adds an element to the end of the list
//remove() - removes and returns the first element in the list
//removeFirst() - removes and returns the first element in the list
//removeLast() - removes and returns the last element in the list
//getFirst() - returns the first element in the list
//getLast() - returns the last element in the list
//size() - returns the number of elements in the list
//clear() - removes all elements from the list

