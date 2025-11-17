package JavaPracticeQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

	  public static String revWord(String w){
		    return new StringBuilder(w).reverse().toString();
		  }
		  public static void main(String[] args){
		    String s = "Hello World";
		    String out = Arrays.stream(s.split(" "))
		                       .map(ReverseEachWord::revWord)
		                       .collect(Collectors.joining(" "));
		    System.out.println(out); // olleH dlroW
		  }

}
