package Java8CodingExamples;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Double> randomSupplier = () -> Math.random();

        Stream.generate(randomSupplier)  // Infinite stream of random numbers
              .limit(5)                  // Take only first 5
              .forEach(System.out::println);  // Print each

	}

}
