package StreamsQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringPrefix {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple","banana","cherry");
		
		String result =words.stream().map(word->"["+word+"]")
		      .collect(Collectors.joining(","));
		
		System.out.println(result);
		
		String wholeBracket =words.stream()
			      .collect(Collectors.joining(",","[","]"));
		
		System.out.println(wholeBracket);

	}

}
