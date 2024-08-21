class Solution {

    // 2 pointers
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int target = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            // Only consider non-duplicate elements for i
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    // Calculate the sum of the triplet and Check if the sum equals the target(zero)
                    if (nums[i] + nums[left] + nums[right] == target) {
                        result.add(List.of(nums[i], nums[left], nums[right])); // list for the found triplet and add it to the result

                        while (left < right && nums[left] == nums[left + 1])
                            left++; // Skip duplicates for the left pointer
                        while (left < right && nums[right] == nums[right - 1])
                            right--; // Skip duplicates for the right pointer

                        // Move both pointers to find new pairs
                        left++;
                        right--;

                    } else if (nums[i] + nums[left] + nums[right] < target) {
                        // If the sum is less than zero, move the left pointer to increase the sum
                        left++;
                    } else {
                        // If the sum is greater than zero, move the right pointer to decrease the sum
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
