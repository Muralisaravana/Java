package StreamsQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDecimalReverseOrder {

	public static void main(String[] args) {
        List<Double> decimals = Arrays.asList(3.14,1.59,2.65,4.89,8.77);
        decimals.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
