package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		if (stones.length == 0)
			return 0;
		PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : stones)
			heap.add(i);
		while (heap.size() > 1) {
			System.out.println(heap);
			int stone1 = heap.remove();
			int stone2 = heap.remove();
			if (stone1 > stone2)
				heap.add(stone1 - stone2);
			else if (stone2 > stone1)
				heap.add(stone2 - stone1);
			else if (heap.isEmpty())
				return 0;
		}
		return heap.peek();
	}
}
