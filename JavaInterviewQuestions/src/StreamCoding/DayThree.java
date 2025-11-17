/*Filter names that end with a vowel (a, e, i, o, u)
Convert them to uppercase
Sort alphabetically
Print them
Expected Output
MEENA
SONU
TEJA*/


package StreamCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DayThree {

	public static void main(String[] args) {
		System.out.println("last character vowel");
		List<String> names = Arrays.asList("arjun", "meena", "ram", "teja", "sonu", "rahul");
		names.stream()
		.filter(n->"aeiou".contains(Character.toString(n.charAt(n.length()-1)).toLowerCase()))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("first character vowel");
		names.stream()
		.filter(n->"aeiou".contains(Character.toString(n.charAt(0)).toLowerCase()))
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		System.out.println("first and last character not vowel middle");
		names.stream().filter(n -> !"aeiou".contains(Character.toString(n.charAt(n.length()-1)).toLowerCase())
				               && !"aeiou".contains(Character.toString(n.charAt(0)).toLowerCase())
				               && n.substring(1,n.length()-1).matches(".*[aeiou].*"))
		              .sorted(Comparator.reverseOrder())
		              .forEach(System.out::println);
	 }

}
