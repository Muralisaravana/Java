/*Question:
Given the list of strings:
["apple", "banana", "apricot", "mango", "avocado"]
Using Java Streams, perform the following in a single pipeline:
Keep only strings that start with "a"
Convert each string to uppercase
Sort them in ascending alphabetical order
Collect the result into a list
Expected Output:
["APPLE", "APRICOT", "AVOCADO"]*/
package StreamCoding;

import java.util.Arrays;
import java.util.List;

public class DayTwo {

	public static void main(String[] args) {
		List<String> fruitsList =Arrays.asList("apple", "banana", "apricot", "mango", "avocado");
		fruitsList.stream()
		          .filter(s -> s.startsWith("a")) //Filtered String starts with 'a'
		          .map(String :: toUpperCase)     //Convert them to UpperCase
		          .sorted()                       //Sort in Ascending Order
		          .forEach(System.out::println);  //Print the list

	}

}
