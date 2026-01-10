/*Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
 * The string length will be at least 2
Test cases to test:
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
*/
package CodingBat;

public class extraEnd {

	public static void main(String[] args) {
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("ab"));
		System.out.println(extraEnd("Hi"));
	}
    public static String extraEnd(String str) {
    	String s = str.substring(str.length()-2);
    	return s+s+s;
    }
}
