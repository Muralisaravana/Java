package JavaPracticeQuestions;

public class ReverseString {

	public static void main(String[] args) {
    
    StringBuffer sb = new StringBuffer("Hello");
    sb.reverse();
    System.out.println("Reversed String:"+ sb);
    
    System.out.println("Using Streams");
    String input = "Hello";
    String reversed = input.chars()                     // IntStream of characters
            .mapToObj(c -> (char) c)                    // convert int → Character
            .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
    System.out.println(reversed);

	}

}
