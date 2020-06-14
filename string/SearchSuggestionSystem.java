package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;



//By using binary serch

public class SearchSuggestionSystem {

	public List<List<String>> suggestedProducts(String[] products, String searchWord) {

		Arrays.sort(products);

		String searchString = new String();
		List<List<String>> op = new ArrayList<List<String>>();
		List<String> prodList = Arrays.asList(products);
		TreeMap<String, Integer> map = new TreeMap<>();
		for (int i = 0; i < prodList.size(); i++)
			map.put(prodList.get(i), i);

		for (char ch : searchWord.toCharArray()) {
			searchString += ch;
			int firstString = 0;
			int lastString = -1;
			try {
				firstString = map.ceilingEntry(searchString).getValue();
				lastString = map.floorEntry(searchString + '~').getValue();
			} catch (Exception e) {
			}
			List<String> temp = new ArrayList<>();
			for (int i = firstString; i <= Math.min(2 + firstString, lastString); i++) {
				temp.add(products[i]);
			}
			op.add(temp);
		}

		return op;
	}

}


// By using Trie

//public class SearchSuggestionSystem {
//	public List<List<String>> suggestedProducts(String[] products, String searchWord) {
//
//		Trie trie = new Trie();
//		for (String s : products)
//			trie.insert(s);
//
//		List<List<String>> op = new ArrayList<>();
//
//		String ss = new String();
//		List<String> temp = new ArrayList<>();
//		for (char ch : searchWord.toCharArray()) {
//			
//			temp= new ArrayList<String>();
//			TNode trav = trie.find(ss+ch);
//			System.out.println(trav);
//			trie.dfs(trav,ss, temp);
//			op.add(temp);
//			ss += ch;
//		}
//
//		return op;
//	}
//
//}
//
//class Trie {
//
//	TNode root;
//
//	Trie() {
//		root = new TNode();
//		root.wordEnd = 0;
//	}
//
//	
//	TNode find(String str) {
//		TNode trav = root;
//		for(char ch : str.toCharArray()) {
//			if(trav.children[ch-'a']!=null) {
//				trav = trav.children[ch-'a'];
//			}
//			else {
//				return null;
//			}
//		}
//		return trav;
//		
//	}
//	
//	void insert(String str) {
//		TNode trav = root;
//		for (char ch : str.toCharArray()) {
//			if (trav.children[ch - 'a'] == null) {
//				trav.children[ch - 'a'] = new TNode();
//				trav.children[ch - 'a'].data = ch;
//			}
//
//			trav = trav.children[ch - 'a'];
//		}
//		trav.wordEnd++;
//	}
//
//	void dfs(TNode start, String prefix, List<String> op) {
//		if (start == null||op.size()>3)
//			return;
//
//		prefix += start.data;
//		if(start.wordEnd>0)
//		op.add(prefix);
//		for (int i = 0; i < 26; i++) {
//			if (start.children[i] != null) {
//				dfs(start.children[i], prefix, op);
//			}
//		}
//	}
//
//}
//
//class TNode {
//	char data;
//	TNode[] children;
//	int wordEnd;
//
//	TNode() {
//		children = new TNode[26];
//	}
//
//	@Override
//	public String toString() {
//		return "TNode [data=" + data + ", children=" + Arrays.toString(children) + ", wordEnd=" + wordEnd + "]";
//	}
//
//}
