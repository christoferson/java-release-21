package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SequencedCollection;

public class TryJava21 {

	public static void main(String[] args) {
		
		System.out.println("FooBar");
		
		String cities = """
			    New York   \s
			    Paris      \s
			    Bangalore  \s
			    Singapore  \s
			    Tokyo      \s
			    """;

		cities.lines().map(line -> "|" + line + "|").forEach(System.out::println);
		
		demoSequencedCollection();
		
	}

	private static void demoSequencedCollection() {
		SequencedCollection<String> collection = new ArrayList<String>(Arrays.asList("A", "B", "C"));
		System.out.println("GetFirst: " + collection.getFirst());
		System.out.println("GetFirst: " + collection.getLast());
		collection.addFirst("1");
		collection.addLast("2");
		System.out.println(collection);
	}
	
}
