/*Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false*/
package CodingBat;

public class Endsly {

	public static void main(String[] args) {
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));
		}

	private static boolean endsLy(String string) {
		return string.endsWith("ly");
	}

}
