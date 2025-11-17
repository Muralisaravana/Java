package JavaPracticeQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FindCharacterFrequency {

	public static void main(String[] args) {
     
		List<String> list = Arrays.asList("Murali","Jumbo");
		list.forEach(word ->
		{
			Long wordlength = word.chars()
			.count();
			
			System.out.println("Word : " + word + " Count :" + wordlength);
			
			
			
		});
		
		System.out.println("For Each Word:");

		list.forEach(word -> {
		    System.out.println("Word: " + word);

		    word.chars()
		        .mapToObj(c -> (char) c)
		        .collect(Collectors.groupingBy(c -> c,LinkedHashMap::new, Collectors.counting()))
		        .forEach((ch, freq) -> 
		            System.out.println(ch + " -> " + freq)
		        );

		    System.out.println("------------------");
		});
		
		System.out.println("Count Vowels:");
		
		list.forEach(word ->{
			 List<Character> vowelList =word.chars()
			    .mapToObj(c -> (char)c)
			    .filter( s -> "aeiou".indexOf(s)!=-1) 
			    .toList();
			 
			 long vowelCount = vowelList.size();
			
			 System.out.println(word + " → Vowels: " + vowelList + ", Count: " + vowelCount);
		});		


	}

}
