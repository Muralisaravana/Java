/*Find the longest name that contains at least one digit inside it*/

package StreamCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day5 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ram","ravi2","arun123","meena","ajay7","rahul");
		names.stream().filter(n -> n.matches(".*[0-9].*"))
		.max(Comparator.comparingInt(String::length))
		.ifPresent(System.out::println);
	}

}
