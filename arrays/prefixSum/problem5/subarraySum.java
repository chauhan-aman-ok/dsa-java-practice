// problem 5 : leetcode 560. Subarray Sum Equals K
// topic - prefix sum + hashmap

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k) count++;
            int rem=nums[i]-k;
            if(mp.containsKey(rem)) count+=mp.get(rem);
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }else mp.put(nums[i],1);
        }
        return count;
    }
}
