// problem 8 : leetcode 2389 Longest Subsequence With Limited Sum

cpp code - 

class Solution {
public:
    vector<int> answerQueries(vector<int>& nums, vector<int>& queries) {
        sort(nums.begin(),nums.end());
        vector<int> res(queries.size());
        for(int i=1;i<nums.size();i++){
            nums[i]+=nums[i-1];
        }
        for(int k=0;k<queries.size();k++){
          int i=0,j=nums.size()-1;
          while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]>queries[k]) j=mid-1;
            else{
                res[k]=max(res[k],mid+1);
                i=mid+1;
            }
          }
        }
        return res;
    }
};


java code-

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
          Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        int[] res=new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int beg=0,end= nums.length-1;
            while (beg<=end){
                int mid=beg+(end-beg)/2;
                if (nums[mid]>queries[i]) end=mid-1;
                else {
                    res[i]=Math.max(res[i],mid+1);
                    beg=mid+1;
                }
            }
        }
        return res;
    }
}



