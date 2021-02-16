class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(k);
        for(int n : nums){
            if(heap.size()<k)
            {
                heap.add(n);
            }
            else if(heap.peek()<n){
                heap.remove();
                heap.add(n);   
            }
        }
        return heap.peek();
    }
}
