// leetcode - 918. Maximum Sum Circular Subarray
// topic- Kadane’s Algorithm (Maximum Subarray Sum – Circular Variant)

class Solution {
    public int maxSubarraySumCircular(int[] a) {
       int currMax=a[0], currMin=a[0], maxSum=a[0], minSum=a[0];
       int totalSum=a[0];
       int i=1;
       while(i<a.length){
        currMax=Math.max(a[i],a[i]+currMax);
        maxSum=Math.max(maxSum,currMax);

        currMin=Math.min(a[i],a[i]+currMin);
        minSum=Math.min(currMin,minSum);
        totalSum+=a[i];
        i++;
       }
       if(maxSum<0) return maxSum;
       return Math.max(maxSum,totalSum-minSum);
    }
}

