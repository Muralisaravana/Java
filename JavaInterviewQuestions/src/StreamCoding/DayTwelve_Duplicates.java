/*From a list of product names, find all products that appear more than once (case-insensitive), 
convert them to lowercase, remove duplicates, sort them, and print.
Expected Output:
laptop
phone
watch*/


package StreamCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DayTwelve_Duplicates {

	public static void main(String[] args) {
		List<String> products = Arrays.asList("Laptop", "phone", "TV", "laptop", "Watch","PHONE", "tablet", "watch", "Speaker");
		products.stream()
        .map(String::toLowerCase)                                  // 1. normalize case
        .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
        .entrySet().stream()
        .filter(e -> e.getValue() > 1)                             // 2. repeated products
        .map(Map.Entry::getKey)                                    // 3. product names
        .sorted()                                                  // 4. sort alphabetically
        .forEach(System.out::println);                             // 5. print
	}

}
