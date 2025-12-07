// problem - 15, leetcode 2461. Maximum Sum of Distinct Subarrays With Length K
// topics - arrays, fixed size sliding window, hashset

public long maximumSubarraySum(int[] a, int k) {
        int i=0;
        int j=0;
        long winSum=0;
        long maxSum=0;
        HashSet<Integer> set=new HashSet<>();

        while(j<a.length){
            while(set.contains(a[j])){
                winSum-=a[i];
                set.remove(a[i]);
                i++;
            }
            set.add(a[j]);
            winSum+=a[j];
            if(j-i+1==k){
                maxSum=Math.max(maxSum,winSum);
                winSum-=a[i];
                set.remove(a[i]);
                i++;
            }
            j++;
        }
        return maxSum;
}

