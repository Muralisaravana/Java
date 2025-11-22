//Find all strings that contain at least one uppercase character, convert them to lowercase, remove duplicates, sort them, and print.
/*Expected Output
api
data
hello
java*/

package StreamCoding;

import java.util.Arrays;
import java.util.List;

public class FindUpperCase {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java","spring","API","microservices","HELLO","world","HeLLo","DATA");
		words.stream()
		     .filter(n -> n.matches(".*[A-Z].*"))
		     .map(String :: toLowerCase)
		     .distinct()
		     .sorted()
		     .forEach(System.out::println);

	}

}
