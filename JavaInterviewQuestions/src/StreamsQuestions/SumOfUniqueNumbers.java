package StreamsQuestions;

import java.util.Arrays;
import java.util.List;

public class SumOfUniqueNumbers {

	public static void main(String[] args) {
         List<Integer> numbers = Arrays.asList(1,2,3,4,2,5,6,6,7);
         int sumofUniquenumbers = numbers.stream()
          .distinct()
         .mapToInt(Integer::intValue)
         .sum();
         System.out.println(sumofUniquenumbers);
        
	}

}
