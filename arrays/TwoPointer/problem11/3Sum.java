// leetcode 15, 3 Sum
// topic - three pointer

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i=0;
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        while(i<nums.length-1){
            int j=i+1,k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) {
                i++; continue;
            }
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[k]==nums[k-1]) k--;
                    j++;k--;
                }else if(sum<0) j++;
                else k--;
            }
            i++;
        }
        return res;
    }
}

