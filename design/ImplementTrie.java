class TrieNode {
	boolean endsHere;
	TrieNode[] children;

	public TrieNode() {
		endsHere = false;
		children = new TrieNode[26];
	}
}
class Trie {

	TrieNode root;

	/** Initialize your data structure here. */
	public Trie() {
		root = new TrieNode();
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		TrieNode pointer = root;
		for (char ch: word.toCharArray()) {
			if (pointer.children[ch - 'a'] == null) pointer.children[ch - 'a'] = new TrieNode();
			pointer = pointer.children[ch - 'a'];
		}
		pointer.endsHere = true;
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		TrieNode pointer = root;
		for (char ch: word.toCharArray()) {
			if (pointer.children[ch - 'a'] == null) return false;
			pointer = pointer.children[ch - 'a'];
		}
		if (pointer.endsHere) return true;
		return false;
	}

	/** Returns if there is any word in the trie that starts with the given prefix. */
	public boolean startsWith(String prefix) {
		TrieNode pointer = root;
		for (char ch: prefix.toCharArray()) {
			if (pointer.children[ch - 'a'] == null) return false;
			pointer = pointer.children[ch - 'a'];
		}
		return true;
	}

}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
