package StreamsQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveduplicatesSorting {

	public static void main(String[] args) {

		System.out.println("Task 1 Even numbers");
		List<Integer> number = Arrays.asList(2, 5, 3, 8, 5, 3, 9);
		number.stream().distinct().sorted().filter(n->n%2==0).forEach(System.out::println);
		
		System.out.println("Task 2 Second Highest number");
		int n=2;
		List<Integer> nums = Arrays.asList(10, 5, 12, 3, 12, 8);
        nums.stream().distinct().sorted(Comparator.reverseOrder())
        .skip(n-1).findFirst().ifPresent(System.out::println);
        
		System.out.println("Task 3 Count String Starts with Particular character");
        List<String> names = Arrays.asList("ram", "ravi", "kumar", "raj", "mani");
        char start = 'r';
        long count=names.stream().filter(name->name.charAt(0)==start).count();
        System.out.println(count);
        
       
        System.out.println("Task 4 String to UpperCase");
        List<String> list = Arrays.asList("apple", "ball", "cat");
        list.stream().map(s->s.toUpperCase()).forEach(System.out::println);
        
        System.out.println("Task 5 Sum of first three small numbers");
        List<Integer> numbers = Arrays.asList(11, 7, 5, 20, 1, 3);
        int sumofFirstThree=numbers.stream().sorted().limit(3)
        		            .mapToInt(Integer::intValue)
        		            .sum();
        System.out.println("Sum of First three:"+sumofFirstThree);

        System.out.println("Task 6 Find the longest String");
        List<String> lists = Arrays.asList("java", "springboot", "api", "microservices");
        lists.stream()
             .max(Comparator.comparingInt(String::length))
             .ifPresent(System.out::println);
        
        System.out.println("Task 7 Character frequency");
        String s = "banana";
        Map<Character,Long> freq = s.chars()
        		                    .mapToObj(c->(char)c)
        		                    .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(freq);
        
        System.out.println("Task 8 Find odd numbers and sort in descending order");
        List<Integer> numb = Arrays.asList(4, 9, 1, 3, 8, 5, 9);
        numb.stream().filter(num->num%2!=0).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
        System.out.println("Task 9");
        List<String> name = Arrays.asList("max", "rohan", "arun", "ajay", "teja");
        name.stream().filter(nam->nam.length()>4).forEach(System.out::println);
        
        System.out.println("Task 10 Average");
        List<Integer> num = Arrays.asList(10, 20, 30, 40);
         num.stream()
        		   .mapToInt(Integer::intValue)
        		   .average()
        		   .ifPresent(System.out::println);
         
         IntSummaryStatistics stat = num.stream().mapToInt(Integer::intValue).summaryStatistics();
         System.out.println(stat);
     


        
        


		
		/*
		 * System.out.println("Task 2"); List<String> word = Arrays.asList("spring",
		 * "java", "api", "boot", "code", "ai");
		 * 
		 * long n = word.stream() .filter(str -> str.length() >= 4 &&
		 * !"aeiou".contains(str.substring(0,1).toLowerCase())) .count();
		 * 
		 * System.out.println(n);
		 */

		
	}

}
