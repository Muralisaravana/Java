package StreamsQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
	List <String> list = Arrays.asList("Apple","Banana","Orange","Banana");
	//Method 1:
	list.stream().distinct().forEach(System.out::println);
	//Method 2:
	list.stream().collect(Collectors.toSet()).forEach(System.out::println);
    //Method 3:
	new HashSet<>(list).forEach(System.out::println);

	}

}
