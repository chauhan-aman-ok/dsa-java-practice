// leetcode - 42
// Trapping Rain Water
// topics - opposite direction two pointer


class Solution {
    public int trap(int[] a) {
        int lefMax=0, rightMax=0;
        int i=0,j=a.length-1;
        int water=0;
        while(i<j){
            if(a[i]<=a[j]){
                if(lefMax<=a[i]){
                    lefMax=a[i];
                }else{
                    water+=lefMax-a[i];
                }
                i++;
            }else{
                if(rightMax<=a[j]){
                    rightMax=a[j];
                }else{
                    water+=rightMax-a[j];
                }
                j--;
            }
        }
        return water;
    }
}


