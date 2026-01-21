package arrays.slidingwindow;
// problem1 - find the maximum possible sum of any contiguous subarray of size k.
// topic - fixed-size sliding window
public class subarraySum {
    public static int subarraySum(int[] a, int k) {
        int sum=0;
        int max=0;
        for(int l=0;l<k;l++) sum+=a[l];
        int j=k;
        int i=1;
        max=sum;
        while(j<a.length){
            
            sum=sum+a[j]-a[i-1];
            max=Math.max(sum,max);
            j++;i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a={1,0,0,1,2,3,0,1,1,0};
        System.out.println(subarraySum(a,3));
    }
}
