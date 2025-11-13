package StreamsQuestions;

import java.util.Arrays;

public class FindLastElement {

	public static void main(String[] args) {
       int[] numbers = {10,20,30,40,50};
       Arrays.stream(numbers).skip(numbers.length-1)
              .findFirst().ifPresent(System.out::println);
	}

}
