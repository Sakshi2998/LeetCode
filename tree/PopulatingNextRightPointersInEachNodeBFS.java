/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null)
            return root;
        Queue < Node > q = new LinkedList < Node > ();
        q.add(root);
        Node node = null;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                size--;
                node = q.poll();
                node.next = size == 0 ? null : q.peek();
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }
        return root;
    }
}
