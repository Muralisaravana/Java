package StreamsQuestions;

import java.util.Arrays;
import java.util.List;

//Find numbers starting with one
public class FindNumberStarting {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,21,13,41,15,2,1,100,23);
		//Start with one
		 numbers.stream().filter(num->String.valueOf(num).startsWith("1")).forEach(System.out::println);
		
		//Not Start with one
		 numbers.stream().filter(num->!String.valueOf(num).startsWith("1")).forEach(System.out::println);
		


	}

}
