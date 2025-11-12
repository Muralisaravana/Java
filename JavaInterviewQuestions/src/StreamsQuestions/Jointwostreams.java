package StreamsQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Jointwostreams {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1,4,8);
		List<Integer> list2 = Arrays.asList(3,7,5);
		
		Stream<Integer> combinedStream = Stream.concat(list1.stream(), list2.stream());
		combinedStream.forEach(System.out::println);
	}

}
