// Leetcode - 643
// problem2 - find the maximum possible average of any contiguous subarray of size k.
// topic - fixed-size sliding window

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currAvg = 0;
        int currSum = 0;
        double maxAvg = Integer.MIN_VALUE;

        for (int l = 0; l < k; l++)
            currSum += nums[l];
        currAvg = (double) currSum / k;
        // maxAvg = currAvg;
        int i = 0, j = k - 1;

        while (j < nums.length) {
            if (maxAvg < currAvg)
                maxAvg = currAvg;
            i++;
            j++;
            if (j < nums.length) {
                currSum = currSum - nums[i - 1] + nums[j];
                currAvg = (double) currSum / k;
            }
        }
        return maxAvg;
    }
}
