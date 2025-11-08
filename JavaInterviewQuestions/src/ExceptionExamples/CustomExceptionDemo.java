package ExceptionExamples;

public class CustomExceptionDemo {

	public static void main(String[] args) {

		try {
            validateAge(56);
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
	}
	
	static void validateAge(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Age must be 18 or above");
        else
            System.out.println("Access granted");
    }

}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

