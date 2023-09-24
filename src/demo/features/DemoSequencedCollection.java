package demo.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SequencedCollection;

public class DemoSequencedCollection {

	public static void demoCollection() {
		SequencedCollection<String> collection = new ArrayList<String>(Arrays.asList("A", "B", "C"));
		System.out.println("GetFirst: " + collection.getFirst());
		System.out.println("GetLast: " + collection.getLast());
		collection.addFirst("1");
		collection.addLast("2");
		System.out.println(collection);
	}
	
}
