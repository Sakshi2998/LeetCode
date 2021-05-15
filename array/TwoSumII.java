class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int front = 0;
        int back = numbers.length - 1;
        while (front < back) {
            int currentSum = numbers[front] + numbers[back];
            if (currentSum == target) {
                return new int[] {
                    front + 1, back + 1
                };
            }
            if (currentSum < target)
                front++;
            else
                back--;
        }
        return null;
    }
}
