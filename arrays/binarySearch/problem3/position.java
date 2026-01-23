// problem 3 : leetcode 34. Find First and Last Position of Element in Sorted Array
// topic - binary search

// Approach 1 : Recursive approach
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first=binaryFirst(nums,0,nums.length-1,target);
        int second=binarySecond(nums,0,nums.length-1,target);
        return new int[]{first,second};
    }
    public int binaryFirst(int[] a,int l,int r,int t){
        
        if(l>r) return -1;
        int mid=l+(r-l)/2;
        if(a[mid]==t){
            if(mid>0 && a[mid-1]==t) return binaryFirst(a,l,mid-1,t);
            else return mid;
        }
        if(a[mid]>t) return binaryFirst(a,l,mid-1,t);
        else return binaryFirst(a,mid+1,r,t);
    }
    public int binarySecond(int[] a,int l,int r,int t){
        
        if(l>r) return -1;
        int mid=l+(r-l)/2;
        if(a[mid]==t){
            if(mid<a.length-1 && a[mid+1]==t) return binarySecond(a,mid+1,r,t);
            else return mid;
        }
        if(a[mid]>t) return binarySecond(a,l,mid-1,t);
        else return binarySecond(a,mid+1,r,t);
    }
}


// Approach 2 : Iterative approach
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first=binaryFirst(nums,0,nums.length-1,target);
        int second=binarySecond(nums,0,nums.length-1,target);
        return new int[]{first,second};
    }
    public int binaryFirst(int[] a,int l,int r,int t){
        
        while(l<=r){
           int mid=l+(r-l)/2;
        if(a[mid]==t){
            if(mid>0 && a[mid-1]==t)  r=mid-1;
            else return mid;
        }else if(a[mid]>t) r=mid-1;
        else l=mid+1;
        }
        return -1;
        
    }
    public int binarySecond(int[] a,int l,int r,int t){
        
        while(l<=r){
           int mid=l+(r-l)/2;
        if(a[mid]==t){
            if(mid<a.length-1 && a[mid+1]==t)  l=mid+1;
            else return mid;
        }else if(a[mid]>t) r=mid-1;
        else l=mid+1;
        }
        return -1;
    }
}


