/*Given 2 strings, return their concatenation, except omit the first char of each. 
 * The strings will be at least length 1.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"*/
package CodingBat;

public class NonStart {

	public static void main(String[] args) {
		System.out.println(nonStart("Hello", "There"));
		System.out.println(nonStart("java", "code"));
		System.out.println(nonStart("shotl", "java"));

	}

	private static String nonStart(String string, String string2) {
		String a = string.substring(1,string.length());
		String b = string2.substring(1,string2.length());
		return a+b;
	}

}
