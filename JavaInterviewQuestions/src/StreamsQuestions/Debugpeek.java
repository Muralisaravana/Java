package StreamsQuestions;

import java.util.Arrays;
import java.util.List;

public class Debugpeek {

	public static void main(String[] args) {
      List<String> words = Arrays.asList("apple","grapes","banana","mango","blueberry");
      List<String> result = words.stream()
    		                 .peek(s->System.out.println("Original: "+s))
    		  			 	 .filter(s->s.startsWith("b"))
   		                     .peek(s->System.out.println("after filter: "+s))
   		                     .map(String::toUpperCase)
   		                     .peek(s->System.out.println("after case: "+s))
   		                     .toList();
      System.out.println(result);
 
	}

}
