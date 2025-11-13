package StreamsQuestions;

import java.util.Arrays;

public class FindNSmallest {

	public static void main(String[] args) {

		int[] arr = {12,3,5,7,19,1,8};
		int n=3;
		
		Arrays.stream(arr)
		      .sorted()
		      .skip(n-1)
		      .findFirst()
		      .ifPresent(System.out::println);
		
	}

}
