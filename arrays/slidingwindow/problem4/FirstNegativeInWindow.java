// problem 4 - First Negative Number in Every Window of Size K, available on gfg
// topics - fixed size sliding window + queue
// we can use normal queue also here



class Solution {
    static List<Integer> firstNegInt(int a[], int k) {
        // write code here
        Deque<Integer> q = new ArrayDeque<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<k;i++){
             if(a[i]<0) q.add(i);
        }
        if(q.isEmpty()) res.add(0);
        else res.add(a[q.peek()]);
        int i=1,j=k;
        while(j<a.length){
            
            while(!q.isEmpty() && q.peek()<i){
                q.poll();
            }
            if(a[j]<0) q.add(j);
            
            if(q.isEmpty()) res.add(0);
            else res.add(a[q.peek()]);
            
            i++;j++;
        }
        return res;
    }
}
