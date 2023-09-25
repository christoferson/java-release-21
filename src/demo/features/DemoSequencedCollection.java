package demo.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.SequencedCollection;

public class DemoSequencedCollection {

	public static void demoCollection() {
		SequencedCollection<String> collection = new ArrayList<String>(Arrays.asList("A", "B", "C"));
		System.out.println("GetFirst: " + collection.getFirst());
		System.out.println("GetLast: " + collection.getLast());
		collection.addFirst("1");
		collection.addLast("2");
		System.out.println(collection);
		
		// LinkedList
		Deque<String> deque = new LinkedList<String>();
		deque.add("5");deque.add("4");deque.add("3");deque.add("2");deque.add("1");
		collection = deque;
		System.out.println("GetFirst: " + collection.getFirst());
		System.out.println("GetLast: " + collection.getLast());
		collection.addFirst("A");
		collection.addLast("B");
		System.out.println(collection);
		System.out.println(deque.pop());
		System.out.println(collection);

	}
	
}
