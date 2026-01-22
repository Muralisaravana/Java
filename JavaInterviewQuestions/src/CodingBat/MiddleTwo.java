/*Given a string of even length, return a string made of the middle two chars, 
so the string "string" yields "ri". The string length will be at least 2.
middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"*/
package CodingBat;

public class MiddleTwo {

	public static void main(String[] args) {
		System.out.println(middleTwo("string"));
		System.out.println(middleTwo("code"));
		System.out.println(middleTwo("Practice"));

	}

	private static String middleTwo(String str) {
		int mid = str.length()/2;
		return str.substring(mid - 1, mid +1);
	}

}
