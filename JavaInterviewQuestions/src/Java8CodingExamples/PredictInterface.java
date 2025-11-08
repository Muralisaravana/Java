package Java8CodingExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredictInterface {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Murali", "Saravanan", "Selva", "Karthik");

        Predicate<String> startsWithS = s -> s.startsWith("S");
        
         names.stream()
        .filter(s -> s.startsWith("S"))  // Predicate (select)
        .map(s -> s.toUpperCase())        // Function (transform)
        .forEach(System.out::println);
        
      
    

		/*
		 * names.stream() .filter(s -> s.startsWith("S")) .forEach(System.out::println);
		 */}

}
