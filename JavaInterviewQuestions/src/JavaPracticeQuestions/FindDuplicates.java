package JavaPracticeQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
          List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1);

          list.stream()
              .filter(n -> Collections.frequency(list, n) > 1)
              .distinct()
              .forEach(System.out::println);
          
          System.out.println("Using Map");
          Map<Integer, Long> countMap = list.stream()
        		    .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        		countMap.entrySet().stream()
        		    .filter(e -> e.getValue() > 1)
        		    .forEach(e -> System.out.println(e.getKey()));
               
         System.out.println("Using Set");

        		Set<Integer> seen = new HashSet<>();
        		Set<Integer> duplicates = list.stream()
        		        .filter(n -> !seen.add(n))
        		        .collect(Collectors.toSet());

        		System.out.println(duplicates);


	}

}
