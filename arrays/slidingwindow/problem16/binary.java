// problem 16 : leetcode 930. Binary Subarrays With Sum

// topic - variable size sliding window 

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    public int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;

        int sum = 0, count = 0;
        int i = 0, j = 0;

        while (j < nums.length) {
            sum += nums[j];

            while (sum > goal) {
                sum -= nums[i];
                i++;
            }

            count += (j - i + 1);
            j++;
        }
        return count;
    }
}

