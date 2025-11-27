/*Identify numbers that occur more than once
Remove duplicates (so each number appears only once)
Sort them in ascending order
Print them

Expected Output:
3
5
7
*/

package StreamCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DayEleven_FindMaximumOccurrence {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, 5, 7, 3, 9, 5, 11, 13, 7, 7, 15);
		nums.stream()
		    .collect(Collectors.groupingBy(n -> n, Collectors.counting()))  // freq map
		    .entrySet().stream()                                            // convert to stream
		    .filter(e -> e.getValue() > 1)                                  // repeated numbers
		    .map(Map.Entry::getKey)                                         // get the number
		    .sorted()                                                       // sort ascending
		    .forEach(System.out::println);                                  // print


	}

}
