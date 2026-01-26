// problem 3 : leetcode 1732. Find the Highest Altitude
// topic - prefix sum

class Solution {
    public int largestAltitude(int[] gain) {
        int[] pre=new int[gain.length];
        int max=0;
        pre[0]=gain[0];
        for(int i=1;i<gain.length;i++){
            pre[i]=pre[i-1]+gain[i];
        }
        for(int i=0;i<gain.length;i++){
            if(max<pre[i]) max=pre[i];
        }
        return max;
    }
}

