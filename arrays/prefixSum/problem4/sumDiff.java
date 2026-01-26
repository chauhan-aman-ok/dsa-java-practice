// problem 4 : leetcode 2574. Left and Right Sum Differences
// topic- prefix sum and suffix sum

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] pre=new int[nums.length];
        int[] suff=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                 pre[i]=0;continue;
            }
            pre[i]=pre[i-1]+nums[i-1];
        }
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                 suff[i]=0;continue;
            }
            suff[i]=suff[i+1]+nums[i+1];
        }
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=Math.abs(pre[i]-suff[i]);
        }
        return res;
    }
}
