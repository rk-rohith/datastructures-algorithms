class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;
        double maxAvgSum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxAvgSum = sum / k;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxAvgSum = Math.max(maxAvgSum, sum / k);
        }
        return maxAvgSum;

        // double maxAvg = Integer.MIN_VALUE; // Initialize maxAvg to store the maximum
        // average found

        // // Iterate through the array to find all possible k-length subarrays
        // for (int i = 0; i <= nums.length - k; i++) {
        // double winDowAvg = 0;
        // // Calculate the sum of the current k-length subarray
        // for (int j = i; j < i + k; j++) {
        // winDowAvg += nums[j];
        // }
        // // Update maxAvg if the current window's average is greater
        // maxAvg = Math.max(maxAvg, winDowAvg / k);
        // }
        // return maxAvg;
    }
}