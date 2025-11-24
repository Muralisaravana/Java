/*Keep only numbers where the sum of digits is even
Remove duplicates
Sort in descending order
Print them

Expected Output:
44
19
28*/

package StreamCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DaySeven_SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Method One:");
		List<Integer> nums = Arrays.asList(12,5,44,32,19,28,44,50,7);
		nums.stream().filter(n -> sumOfDigits(n))
		             .distinct()
		             .sorted(Comparator.reverseOrder())
		             .forEach(System.out::println);
		}
	
	public static boolean sumOfDigits(int num) {
		int sum = 0;
		int n = num;
		while(n > 0) {
			sum += n%10;
			n=n/10;
		}
		if(sum % 2 ==0) {
			return true;
       }
		return false;
		
	}

}
