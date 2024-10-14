package _10_CollectionDataTypes;

import java.util.HashMap;

public class _5_HashMapDemo {
	public static void main(String[] args) {
		// Creating a HashMap
		HashMap<String, Integer> map = new HashMap<>();

		// Adding key-value pairs
		map.put("Alice", 25);
		map.put("Bob", 30);
		map.put("Charlie", 35);

		// Removing a key
		map.remove("Bob");

		// Getting the value for a key
		int age = map.get("Alice");
		System.out.println("Alice's age: " + age);

		// Checking if a key is present
		boolean containsBob = map.containsKey("Bob");
		System.out.println("Contains Bob: " + containsBob);

		// Checking size
		int size = map.size();
		System.out.println("Size: " + size);

		// Checking if empty
		boolean isEmpty = map.isEmpty();
		System.out.println("Is empty: " + isEmpty);
	}
}

//put(K key, V value) - associates the specified value with the specified key in the map
//get(Object key) - returns the value to which the specified key is mapped, or null if the map contains no mapping for the key
//remove(Object key) - removes the mapping for the specified key from the map if present
//containsKey(Object key) - returns true if the map contains a mapping for the specified key
//keySet() - returns a set view of the keys contained in the map
//values() - returns a collection view of the values contained in the map
//entrySet() - returns a set view of the mappings contained in the map
//size() - returns the number of key-value mappings in the map
//isEmpty() - returns true if the map contains no key-value mappings
//clear() - removes all of the mappings from the map
