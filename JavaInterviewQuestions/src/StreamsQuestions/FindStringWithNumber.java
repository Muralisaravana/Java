package StreamsQuestions;

import java.util.Arrays;
import java.util.List;

public class FindStringWithNumber {

	public static void main(String[] args) {
     List<String> list = Arrays.asList("1apple","banana","cat","4dog","egg");
	
     list.stream().filter(str ->!str.isEmpty() && Character.isDigit(str.charAt(0)))
             .forEach(System.out::println);
	}

}
