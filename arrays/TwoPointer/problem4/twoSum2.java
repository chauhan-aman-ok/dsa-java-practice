// problem 4 : Two Sum II - Input Array Is Sorted, leetcode 167
// topics - arrays, two pointer

public int[] twoSum(int[] a, int target) {
        int i=0;
        int j=a.length-1;
        int[] res=new int[2];
        while(i<j){
            if(a[i]+a[j]==target){
                res[0]=i+1;
                res[1]=j+1;
                return res;
            }
            if(a[i]+a[j]>target) j--;
            else i++;
        }
        return res;
}
