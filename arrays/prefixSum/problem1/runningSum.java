// problem 1 : leetcode 1480. Running Sum of 1d Array
// topic - prefix sum

class Solution {
    public int[] runningSum(int[] nums) {
        int[] pre=new int[nums.length];
        pre[0]=nums[0];
        if(nums.length==1) return pre;
        for(int i=1;i<nums.length;i++){
            pre[i]=nums[i]+pre[i-1];
        }
        return pre;
    }
}
