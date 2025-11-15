package StreamsQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SumOfFirstTwoNumbers {

	public static void main(String[] args) {

        List<Integer>numbers = Arrays.asList(90,84,120,70,6);
		
		 int sumofFirstTwo= numbers.stream() 
				 .limit(2) 
				 .mapToInt(Integer::intValue)
		         .sum(); 
		 System.out.println(sumofFirstTwo);
		 
		 Optional<Integer> num = numbers.stream()
				                 .sorted()
				                 .limit(2)
				                 .reduce((a,b)->a*b);
		 num.ifPresent(System.out::println);
				                 

        
		
	}

}
