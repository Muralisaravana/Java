/*Find all strings that are palindromes (same forward and backward), convert them to uppercase, sort them, and print.
 Expected Output
LEVEL
MADAM
NOON
RADAR
*/
package StreamCoding;

import java.util.Arrays;
import java.util.List;

public class DayEight_PalindromeCheck {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("level", "world","radar","java","madam","hello","noon","code","habch");
		words.stream().filter(n->isPalindrome(n))
		              .map(n -> n.toUpperCase())
		              .sorted()
		              .forEach(System.out::println);
		              
		              
		

	}
	
	public static boolean isPalindrome(String word) {
		int len = word.length();
		for(int i = 0; i < len/2 ; i++) {
			if(word.charAt(i)!=word.charAt(word.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

}
