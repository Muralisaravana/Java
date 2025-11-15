/*Question:
You are given a list of integers:
[3, 10, 6, 1, 7, 5]

Using Java Streams, perform the following operations in a single stream pipeline:
Filter numbers greater than 5
Multiply each remaining number by 2
Sort them in descending order
Collect the result into a list

Expected Output:

[20, 14, 12]*/
package StreamCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DayOne {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(3, 10, 6, 1, 7, 5);
		numList.stream()
		       .filter(n -> n > 5)					//used to filter number greater than 5
		       .map(n -> n*2)					    // multiply the filtered result by 2
		       .sorted(Comparator.reverseOrder())   //sort them in descending order
               .forEach(System.out::println);       //collect them in list and print
	}

}
