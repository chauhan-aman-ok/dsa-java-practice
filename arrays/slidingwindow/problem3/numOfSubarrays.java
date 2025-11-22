// Leetcode - 1343
// Problem3 - Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
// Topic - Fixed-Size Sliding Window


class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int currSum=0;
        double currAvg=0;

        for(int l=0;l<k;l++) currSum+=arr[l];

        currAvg=(double)currSum/k;
        int i=0;
        int j=k-1;

        while(j<arr.length){
            if(currAvg>=threshold){
                count++;
            }
            i++;j++;
            if(j<arr.length){
                currSum=currSum-arr[i-1]+arr[j];
                currAvg=(double)currSum/k;
            }
        }
        return count;
    }
}
