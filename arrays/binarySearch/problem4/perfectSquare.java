// problem : 4, leetcode - 367. Valid Perfect Square
// topic - binary search

// recursive approach ->
class Solution {
    public boolean isPerfectSquare(int num) {
        return binary(1,num,num);
    }
    public boolean binary(long l,long r,int num){
        if(l>r) return false;
        long mid=(l+r)/2;
        if(mid*mid==num) return true;
        if(mid*mid>num) return binary(l,mid-1,num);
        else return binary(mid+1,r,num);
    }
}

// iterative approach ->
public boolean isPerfectSquare(int num) {
        long low=1, high=num;
        while(low<=high){
            long mid=(low+high)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid>num){
                high=mid-1;
            }
            else if(mid*mid<num){
                low=mid+1;
            }
        }
        return false;
}



