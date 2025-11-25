/*From a list of sentences, extract all unique words that have more than 3 letters,
 *  convert them to lowercase, sort them, and print.
 *  Expected Output:
 *  coding
 *  cool
 *  enjoyable
 *  functional
 *  java
 *  make
 *  powerful
 *  programming
 *  streams
*/
package StreamCoding;

import java.util.Arrays;
import java.util.List;

public class DayNine_UniqueWords {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList("Java is powerful","Streams make Java functional","Coding in Java is enjoyable","Functional programming is cool");
		sentences.stream().map(sentence -> sentence.split(" "))
		.flatMap(Arrays::stream)
		.map(String :: toLowerCase)
		.distinct()
		.filter(word -> word.length()>3)
		.sorted()
		.forEach(System.out::println);
		

	}

}
