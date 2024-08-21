class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int i = 1; // 'i' will keep track of the position to insert the next unique element

        // Iterate through the array starting from the second element
        for (int j = 1; j < nums.length; j++) {
            // Check if the current element is different from the last unique element
            if (nums[j] != nums[i - 1]) {
                // If it's unique, place it at index 'i'
                nums[i] = nums[j];
                // Move the index 'i' forward for the next potential unique element
                i++;
            }
        }

        return i;
    }
}