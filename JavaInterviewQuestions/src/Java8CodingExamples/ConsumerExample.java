package Java8CodingExamples;

import java.util.List;

public class ConsumerExample {

	public static void main(String[] args) {
		List<String> names = List.of("Murali", "Saravanan", "Selva");

		names.stream()
		     .map(s->s.toLowerCase())
		     .filter(s->s.length()<=5)
		     .forEach(System.out::println);  

	}

}
