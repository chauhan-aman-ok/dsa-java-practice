// Leetcode - 643
// problem2 - find the maximum possible average of any contiguous subarray of size k.
// topic - fixed-size sliding window
class Solution {
    public double findMaxAverage(int[] a, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        double avg=(double)sum/k;
        double maxAvg=avg;
        int i=1;
        int j=k;
        while(j<a.length){
            sum=sum+a[j]-a[i-1];
            avg=(double)sum/k;
            maxAvg=Math.max(maxAvg,avg);
            i++;j++;
        }
        return maxAvg;
    }
}
