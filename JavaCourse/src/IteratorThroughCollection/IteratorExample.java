package IteratorThroughCollection;

	import java.util.*;

	public class IteratorExample {
		public static void main(String[] args) {
			List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

			Iterator<String> it = names.iterator();

			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}


	}


