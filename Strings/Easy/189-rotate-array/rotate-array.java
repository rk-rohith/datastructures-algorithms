class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        int start = 0;
        int end = nums.length - 1;



        revArray(nums, start, end); // revArray = 6, 5, 4, 3, 2, 1
        revArray(nums, start, k - 1); // revArray of K Elements = 5, 6, 4, 3, 2, 1
        revArray(nums, k, end); // revArray from N-K to N = 5, 6, 1, 2, 3, 4


        System.out.println("Rotated array by " + k + " elements: " + Arrays.toString(nums));

    }

    private static void revArray(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}