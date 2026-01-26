/*Given a string and an int n, return a string made of the first and last n chars from the string. 
 * The string length will be at least n.
Test cases:
nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"*/
package CodingBat;

public class NTwice {

	public static void main(String[] args) {
		System.out.println(nTwice("Hello", 2));
		System.out.println(nTwice("Chocolate", 3));
		System.out.println(nTwice("Chocolate", 1));
	}

	private static String nTwice(String str, int n) {
		String first = str.substring(0,n);
		String last = str.substring(str.length()-n);
		return first + last ;
	}

}
