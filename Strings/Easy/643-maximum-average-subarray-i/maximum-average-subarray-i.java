class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;               // Initialize sum to store the sum of the first 'k' elements  
        double maxAvgSum = 0;         // Initialize maxAvgSum to store the maximum average found  


        // Calculate the sum of the first 'k' elements  
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxAvgSum = sum / k;   // Calculate the initial average from the first 'k' elements  


        // Use a sliding window approach to find the maximum average  
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];                     // Update the sum by adding the next element and removing the first element of the previous window
            maxAvgSum = Math.max(maxAvgSum, sum / k);         // Update maxAvgSum if the new average is greater than the previous maximum  

        }
        return maxAvgSum;

    }
}