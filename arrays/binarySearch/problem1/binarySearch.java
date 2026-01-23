// problem 1 : Simple binary Search
// leetcode - 704
// topic - binary search

// Recursive approach ->
class Solution {
    public int search(int[] nums, int target) {
        return binary(nums,0,nums.length-1,target);
    }
    public int binary(int[] a, int l, int r, int t){
         if(l>r) return -1;
         
         int mid=l+(r-l)/2;

         if(a[mid]==t) return mid;
         if(a[mid]>t) return binary(a,l,mid-1,t);
         else return binary(a,mid+1,r,t);
    }
}

// Iterative approach ->
public int search(int[] nums, int target) {

        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) r=mid-1;
            else l=mid+1;
        }
        return -1;
}

