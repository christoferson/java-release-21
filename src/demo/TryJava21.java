package demo;

import demo.features.DemoSequencedCollection;
import demo.features.DemoVirtualThreads;

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
		
		DemoSequencedCollection.demoSequencedCollection();
		DemoSequencedCollection.demoSequencedSet();
		DemoSequencedCollection.demoSequencedMap();
		
		DemoVirtualThreads.demoVirtualThreads();
		
	}


	
}
