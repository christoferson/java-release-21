package demo.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSequencedCollection {

	public static void demoSequencedCollection() {

		{ // ArrayList
			SequencedCollection<String> collection = new ArrayList<String>(Arrays.asList("A", "B", "C"));
			System.out.println("GetFirst: " + collection.getFirst());
			System.out.println("GetLast: " + collection.getLast());
			collection.addFirst("1");
			collection.addLast("2");
			System.out.println(collection);
		}
		
		{ // LinkedList
			Deque<String> deque = new LinkedList<String>();
			deque.add("5");deque.add("4");deque.add("3");deque.add("2");deque.add("1");
			
			SequencedCollection<String> collection = deque;
			System.out.println("GetFirst: " + collection.getFirst());
			System.out.println("GetLast: " + collection.getLast());
			collection.addFirst("A");
			collection.addLast("B");
			System.out.println(collection);
			System.out.println(deque.pop());
			System.out.println(collection);
		}

	}
	
	public static void demoSequencedSet() {
		{ // LinkedHashSet
			SequencedSet<String> set = new LinkedHashSet<String>(Arrays.asList("A", "B", "C"));
			System.out.println("GetFirst: " + set.getFirst());
			System.out.println("GetLast: " + set.getLast());
			set.addFirst("1");
			set.addLast("2");
			System.out.println(set);
		}
		{ // TreeSet
			TreeSet<String> treeset = new TreeSet<>(Arrays.asList("C", "B", "A"));
			NavigableSet<String> navset = treeset;
			SortedSet<String> sortedset = navset;
			SequencedSet<String> set = sortedset;
			System.out.println("GetFirst: " + set.getFirst());
			System.out.println("GetLast: " + set.getLast());
			//set.addFirst("1");//Unsupported
			//set.addLast("2");//Unsupported
			treeset.add("1");
			System.out.println(set);			
		}
	}
	
	public static void demoSequencedMap() {
		System.out.println("-".repeat(12));
		{ // LinkedHashMap
			SequencedMap<String, String> map = new LinkedHashMap<>(Map.of("3", "C", "2", "B", "1", "A"));
			System.out.println(map);
			System.out.println("GetFirst: " + map.pollFirstEntry());
			System.out.println("GetLast: " + map.pollLastEntry());
			map.putFirst("5", "E");
			map.putLast("6", "F");
			System.out.println(map);
		}
	}
	
}
