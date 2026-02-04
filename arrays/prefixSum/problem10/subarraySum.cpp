// problem 10 : leetcode 560. Subarray Sum Equals K
// topics - prefix sum + hashmap

cpp code-

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> mp;

        for(int i = 1; i < nums.size(); i++){
            nums[i] += nums[i - 1];
        }

        int count = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] == k) count++;

            int rem = nums[i] - k;
            if(mp.find(rem) != mp.end())
                count += mp[rem];

            if(mp.find(nums[i]) != mp.end()){
                mp[nums[i]] = mp[nums[i]] + 1;
            } else {
                mp[nums[i]] = 1;
            }
        }
        return count;
    }
};


java code-

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



