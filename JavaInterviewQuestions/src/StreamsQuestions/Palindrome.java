package StreamsQuestions;

import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {

		String input ="malayalam";
		boolean isPalindrome =IntStream.range(0, input.length()/2)
		.allMatch(i -> input.charAt(i)==input.charAt(input.length()-1-i));
		System.out.println(isPalindrome);
	}

}
