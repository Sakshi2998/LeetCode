package heap;

import java.util.List;
import java.util.PriorityQueue;

public class MinCosttoConnectRopes {
	public int minCost(List<Integer> ropes) {
		PriorityQueue<Integer> heap = new PriorityQueue<>(ropes);
		int total = 0;
		while (heap.size() > 1) {
			int newRope = heap.poll() + heap.poll();
			total += newRope;
			heap.add(newRope);
		}
		return total;
	}
}
