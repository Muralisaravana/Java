package StreamCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmails {
    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "murali@gmail.com",
                "john@yahoo.com",
                "sara@gmail.com",
                "alex@apple.com"
        );

        List<String> gmailUsers =
                emails.stream()
                      .filter(email -> email.endsWith("@gmail.com"))   // pick only gmail IDs
                      .map(email -> email.substring(0, email.indexOf("@"))) // extract username
                      .collect(Collectors.toList());

        System.out.println(gmailUsers);
    }
}
