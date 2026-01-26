// problem 6 : leetcode 278. First Bad Version
// topic - binary search


/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int beg=1,end=n;
        while(beg<=end){
            int mid=beg+(end-beg)/2;
            if(isBadVersion(mid)){
                if(isBadVersion(mid-1)){
                    end=mid-1;
                }else return mid;
            }
            if(!isBadVersion(mid)) beg=mid+1;
            else end=mid-1;
        }
        return 0;
    }
}
