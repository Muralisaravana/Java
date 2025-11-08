package Java8CodingExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
	        List<String> names = Arrays.asList("Murali", "Vijay", "Arun");

	        Function<String, String> toUpper = s -> s.toUpperCase();

	        names.stream()
	             .map(toUpper)       // apply Function<T, R>
	             .forEach(System.out::println);

	}

}
