class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        return null;

    }
}
    /*As we go through each number in the array, we calculate the difference between the target and the current number. We then check if this difference already exists in the map.
        If the difference is not in the map, we store the current number as a key in the map and its index as the value.
        If the difference is in the map, it means we've found the two numbers that add up to the target. We return their indices: the index from the map (stored earlier) and the current index.*/