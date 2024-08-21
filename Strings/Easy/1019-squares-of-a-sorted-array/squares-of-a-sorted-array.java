class Solution {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        int[] result = new int[nums.length]; // Create an array to hold the result with the same length as nums.
        int resultIndex = nums.length - 1;

        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) { 
                result[resultIndex] = nums[left] * nums[left]; // If the left element squared is greater, place it in the result 
                resultIndex--; // Move to the next index for the result array.
                left++; // Increment the left pointer.
            } else {
                result[resultIndex] = nums[right] * nums[right];  // If the right element squared is greater or equal, place it in the result  
                resultIndex--; // Move to the next index for the result array.
                right--; // Decrement the right pointer.
            }

        }

        return result;
    }
}