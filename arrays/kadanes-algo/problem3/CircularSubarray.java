// leetcode - 918. Maximum Sum Circular Subarray
// topic- Kadane’s Algorithm (Maximum Subarray Sum – Circular Variant)

class Solution {
    public int maxSubarraySumCircular(int[] a) {
        int totalSum = 0;

        int currMax = 0, maxSum = Integer.MIN_VALUE;
        int currMin = 0, minSum = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {

            currMax += a[i];
            maxSum = Math.max(maxSum, currMax);
            if (currMax < 0)
                currMax = 0;

            currMin += a[i];
            minSum = Math.min(minSum, currMin);
            if (currMin > 0)
                currMin = 0;

            totalSum += a[i];
        }
        if (maxSum < 0)
            return maxSum;

        return Math.max(maxSum, totalSum - minSum);
    }
}
