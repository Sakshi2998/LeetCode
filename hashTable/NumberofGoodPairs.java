class Solution {

  public int numIdenticalPairs(int[] nums) {
    int[] hash = new int[101];
    int count = 0;
    for (int num: nums) {
      count += hash[num];
      hash[num]++;
    }
    return count;
  }

  //     public int numIdenticalPairs(int[] nums) {
  //         Map<Integer, Integer> map = new HashMap<>();
  //         int count = 0;
  //         for(int num : nums) {
  //             if(map.containsKey(num)){
  //                 count+= map.get(num);
  //             }
  //             map.put(num, map.getOrDefault(num,0)+1); 
  //         }
  //         return count;

  //     }
}
