package Java8CodingExamples;

import java.util.List;
import java.util.Optional;

public class OptionalExample {
	public static Optional<String> findUser(String username) {
	    List<String> users = List.of("Murali", "Saravanan", "Selva");
	    return users.stream()
	                .filter(u -> u.equalsIgnoreCase(username))
	                .findFirst(); // returns Optional<String>
	}

	public static void main(String[] args) {
		Optional<String> user = findUser("Murali");

	    user.ifPresentOrElse(
	        u -> System.out.println("User found: " + u),
	        () -> System.out.println("User not found")
	    );
	}

}


