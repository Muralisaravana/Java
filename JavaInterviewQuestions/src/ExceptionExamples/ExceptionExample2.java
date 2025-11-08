package ExceptionExamples;

public class ExceptionExample2 {

	public static void main(String[] args) {
		try {
		    int[] arr = new int[3];
		    arr[5] = 10;  // ArrayIndexOutOfBoundsException
		} catch (ArithmeticException e) {
		    System.out.println("Math error");
		} catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("Array index issue");
		} catch (Exception e) {
		    System.out.println("Generic exception");
		}

	}

}
