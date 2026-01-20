/*Given a string, return a string length 1 from its front, unless front is false, 
 * in which case return a string length 1 from its back. The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"*/
package CodingBat;

public class TheEnd {

	public static void main(String[] args) {
		System.out.println(theEnd("Hello", true));
		System.out.println(theEnd("Hello", false));
		System.out.println(theEnd("oh", true));
		}

	private static String theEnd(String string, boolean bFlag) {
		if(bFlag) {
			return string.substring(0, 1);
		}
		return string.substring(string.length()-1);
	}
}
