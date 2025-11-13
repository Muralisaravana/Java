package StreamsQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SumOfFirstTwoNumbers {

	public static void main(String[] args) {

        List<Integer>numbers = Arrays.asList(90,84,120,70,6);
		/*
		 * int sumofFirstTwo= numbers.stream() .limit(2) .mapToInt(Integer::intValue)
		 * .sum(); System.out.println(sumofFirstTwo);
		 */
        
        numbers.stream()
        .sorted(Comparator.reverseOrder())
        .findFirst()
        .ifPresent(System.out::println);
		
	}

}
