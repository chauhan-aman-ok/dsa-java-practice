// problem - leetcode 209
// topic - variable size sliding window, arrays
//Given an array of positive integers nums and a positive integer target, 4
//return the minimal length of a subarray whose sum is greater than or equal to target. 
//If there is no such subarray, return 0 instead.

 public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j];
            
            while (sum >= target && i <= j) {
                len = Math.min(len, j - i + 1);
                sum -= nums[i++];
            }
            j++;
        }
        return (len == Integer.MAX_VALUE) ? 0 : len;
 }

