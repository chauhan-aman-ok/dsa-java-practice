// problem 1 - Two Sum in Sorted Array
// avail on gfg - https://www.geeksforgeeks.org/problems/two-sum-in-sorted-array/1
// topics - arrays, two pointer approach

public ArrayList<Integer> twoSum(int[] a, int target) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int i=0;
        int j=a.length-1;
        while(i<=j){
            int sum=a[i]+a[j];
            if(sum==target){
                res.add(i+1);
                res.add(j+1);
                return res;
            }
            if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        if(res.isEmpty()){
            res.add(-1);
            res.add(-1);
        }
        return res;
}
