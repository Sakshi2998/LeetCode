package hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> op = new ArrayList<List<String>>();
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		
		for(int i=0;i<strs.length;i++) {
			char[] temp =strs[i].toCharArray();
			Arrays.sort(temp);
			String s = new String(temp);
			
			if(map.containsKey(s)) {
				map.get(s).add(strs[i]);
				
			}
			else
			{
				ArrayList<String> l =new ArrayList<String>();
				l.add(strs[i]);
				map.put(s,l );
			}
			
		}
		
		for(Object key : map.keySet()) {
			op.add((List<String>)map.get(key));
		}
		
		
		
		return op;
	}
}
