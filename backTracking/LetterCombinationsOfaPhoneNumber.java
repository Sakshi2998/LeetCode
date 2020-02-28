package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfaPhoneNumber {

	Map< Integer, List<Character>> map = new  HashMap<>();
	
	
	public List<String> letterCombinations(String digits) {
		if(digits.isEmpty())
			return null;
		
		map.put(2, Arrays.asList('a','b','c'));
		map.put(3, Arrays.asList('d','e','f'));
		map.put(4, Arrays.asList('g','h','i'));
		map.put(5, Arrays.asList('j','k','l'));
		map.put(6, Arrays.asList('m','n','o'));
		map.put(7, Arrays.asList('p','q','r','s'));
		map.put(8, Arrays.asList('t','u','v'));
		map.put(9, Arrays.asList('w','x','y','z'));
		return (combine(digits , "", new ArrayList<String>())); 
	
		
	}
	
	List<String> combine(String digits, String prev, List<String> op){
		if(digits.isEmpty()) {
			op.add(prev);
			return op;
		}
		
		for (Character ch : map.get(digits.charAt(0)-'0')) {
			op = combine(digits.substring(1),prev+ch,op);
		}
		return op;
	}
}
