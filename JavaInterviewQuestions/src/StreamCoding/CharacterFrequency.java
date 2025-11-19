package StreamCoding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CharacterFrequency {

	public static void main(String[] args) {
		
        System.out.println("Before Java8");
		String name = "My Name is Murali";
		name = name.toLowerCase().replace(" ",""); //change to lowercase,remove spaces
		Map<Character,Integer> freqMap = new LinkedHashMap<>();// Map Declarations
		for(int i =0 ;i < name.length();i++) { //iterating through String length
			char ch = name.charAt(i);          //get Character  from each Position by increments it
			
			if(freqMap.containsKey(ch)) {      //check if map already contains that character
				freqMap.put(ch, freqMap.get(ch)+1); //if already present add 1
			}
			else {
				freqMap.put(ch, 1); //if not already present just add 1
			}
		}
		
		Set<Map.Entry<Character,Integer>> entries = freqMap.entrySet();//entrySet used to get key value pair
		for(Map.Entry<Character, Integer> entry : entries) {//iterate through each entries
			System.out.println(entry.getKey()+" : "+ entry.getValue()); //display result
		}
		
        System.out.println("Using Java8");
        Map<Character,Long> frequencyMap = name.chars()
        		                                  .mapToObj(ch -> (char)ch)
        		                                  .collect(Collectors.groupingBy(c -> c,
        		                                		                         LinkedHashMap::new,
        		                                		                         Collectors.counting()));
        frequencyMap.forEach((k,v)->
        System.out.println(k +" : "+ v));

		
	}

}
