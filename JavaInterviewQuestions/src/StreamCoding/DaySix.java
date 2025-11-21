/*Using Streams:
Keep only the strings whose length is a prime number
Convert them to lowercase
Sort in ascending order
Print them

Expected Output:
	apple
	fig
	mango*/


package StreamCoding;

import java.util.Arrays;
import java.util.List;

public class DaySix {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Apple","Mango","Kiwi","Banana","Grapes","Fig","Date");
		words.stream()
			 .filter(DaySix :: isPrime)
			 .map(String :: toLowerCase)
			 .sorted()
			 .forEach(System.out::println);

	}
	
	public static boolean isPrime(String input) {
		int length = input.length();
		if(length < 2)
		{
			return false;
		}
		for(int i =2 ; i <= Math.sqrt(length);i++)
		{
			if(length % i ==0)
				return false;
		}
		return true;
	}

}
