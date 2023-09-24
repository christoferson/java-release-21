package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SequencedCollection;

import demo.features.DemoSequencedCollection;

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
		
		DemoSequencedCollection.demoCollection();
		
	}


	
}
