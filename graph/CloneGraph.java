package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class CloneGraph {
	public Node cloneGraph(Node node) {

		if (node == null)
			return null;
		
		Map<Integer, Node> map = new HashMap<Integer, Node>();
		Set<Integer> seen = new HashSet<>();
		Stack<Node> stack = new Stack<>();
		stack.push(node);

		while (!stack.isEmpty()) {
			Node temp = stack.pop();
			if (seen.contains(temp.val)) {
				if (!stack.isEmpty())
					temp = stack.pop();
			} else {
				seen.add(temp.val);
				if (!map.containsKey(temp.val))
					map.put(temp.val, new Node(temp.val));
				Node newNode = map.get(temp.val);
				for (Node n : temp.neighbors) {
					if (!map.containsKey(n.val)) {
						map.put(n.val, new Node(n.val));
					}
					newNode.neighbors.add(map.get(n.val));
					if (!seen.contains(n.val))
						stack.push(n);
				}
			}
		}
		return map.get(1);
	}
}
