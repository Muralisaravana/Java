package StreamsQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
      List<Integer> numbers =  Arrays.asList(4,6,8,9,11,15,23,53,37);
      boolean containsAnyPrime= numbers.stream()
    		                   .anyMatch(PrimeNumber::isPrime);
      System.out.println(containsAnyPrime);
      
      numbers.stream().filter(PrimeNumber::isPrime)
                       .forEach(System.out::println);
      
      boolean containsAnyPrimeAnotherMethod= numbers.stream()
              .anyMatch(PrimeNumber::isPrimeAnotherMethod);
              System.out.println(containsAnyPrimeAnotherMethod);

      
    		                   
    		                   
	}
	
	public static boolean isPrime(int num) {
		if(num<=1)
		{
			return false;
        }
		for (int n =2; n<=Math.sqrt(num);n++) {
			if(num % n ==0) {
				return false;

			}
		}
		return true;
	}
	
	public static boolean isPrimeAnotherMethod(int num) {
		if(num<=1)
		{
			return false;
        }
	
		return IntStream.rangeClosed(2, (int) Math.sqrt(num))
				.noneMatch(n->num%n==0);
	}

}
