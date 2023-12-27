package demo.features;

public class DemoRecordPatterns {

	enum Status {
		NEW, IN_PROGRESS, COMPLETE
	}

	record Task(String name, Status status) {
	}

	public static void demo() {

		Task t = new Task("Try Record Paterns", Status.IN_PROGRESS);

		Object obj = t;

		if (obj instanceof Task(String name, Status status)) {
			System.out.print(name + " " + status);
		}

	}
}
