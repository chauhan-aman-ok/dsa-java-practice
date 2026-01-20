// leetcode - 53. Maximum subarray
// topic - kadanes algorithm

class Solution {
    public int maxSubArray(int[] a) {
        int i=0;
        int currSum=a[i];
        int maxSum=a[i];
        i++;
        while(i<a.length){
            currSum=Math.max(a[i],currSum+a[i]);
            maxSum=Math.max(currSum,maxSum);
            i++;
        }
        return maxSum;
    }
}

