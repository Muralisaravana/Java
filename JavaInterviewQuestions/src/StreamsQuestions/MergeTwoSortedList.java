package StreamsQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2,4,6);
		List<Integer> list2 = Arrays.asList(3,7,9);
		
		List<Integer> mergedSortedList = Stream.concat(list1.stream(),list2.stream())
				                         .sorted().toList();
		mergedSortedList.forEach(System.out::println);
		
	}

}
