// leetcode - 53. Maximum subarray
// topic - kadanes algorithm

class Solution {
    public int maxSubArray(int[] a) {
        int i=0;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        while(i<a.length){
          currSum+=a[i];
          maxSum=Math.max(currSum,maxSum);
          if(currSum<0) currSum=0;
          i++;
        }
        return maxSum;
    }
}
