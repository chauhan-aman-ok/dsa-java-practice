//problem - Longest Subarray With Sum ≤ K

//Given an array of positive integers and an integer K, find the length of the longest contiguous subarray whose sum is less than or equal to K.

//topics - variable size sliding window

public static int longestSubarray(int[] a,int n,int k){
        int sum=0;
        int i=0;
        int j=0;
        int len=0;
        while(j<n){
            sum+=a[j];
            while(sum>k && i<j){
                sum-=a[i++];
            }
            len=Math.max(len,j-i+1);
            j++;
        }

        return len;
}

// input-  int[] a={2, 5, 1, 7, 10}; n=a.length, k=14
// output - 3
