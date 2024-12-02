class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // To store number and its index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }
            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If there is no solution, we can return an empty array or throw an exception
        return new int[] {}; // This line should not be reached if we assume one solution
    }
}