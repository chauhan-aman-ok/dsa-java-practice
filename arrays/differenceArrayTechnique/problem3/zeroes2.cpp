problem 3 : leetcode 3356. Zero Array Transformation II

cpp code-
class Solution {
public:
    bool checkwithDiff(vector<int>& n, vector<vector<int>>& q,int i){
        vector<int> diff(n.size(),0);
        for(int j=0;j<=i;j++){   // O(q)
             int l=q[j][0];
             int r=q[j][1];
             int val=q[j][2];
             diff[l]+=val;
             if(r+1<n.size()) diff[r+1]-=val;
        }
        for(int j=1;j<n.size();j++){  // O(n)
           diff[j]+=diff[j-1];
        }
        for(int j=0;j<n.size();j++){  // O(n)
           if(n[j]-diff[j]>0) return false;
        }
         return true;

    }
    int minZeroArray(vector<int>& nums, vector<vector<int>>& queries) {
        auto lambda=[](int val){
            return val==0;
        };
        if(all_of(begin(nums),end(nums),lambda)) return 0; // no query required bcz all are already zero
        for(int i=0;i<queries.size();i++){  // O(q)
            if(checkwithDiff(nums,queries,i)==true){
                return i+1;
            }
        }
        return -1;
    }
};

//time complexity of the above code - O(q*(q+n+n)) -> very bad, can be optimized by binary search


//the time complexity of the above code is high, so it will give time limit exceeded error in large test case, we need to improve it by binary search, 
//if you did not understand this code then you can visit this youtube channel - "https://www.youtube.com/watch?v=8xHewtmPULs&list=PLpIkg8OmuX-Kqkb8DqDe_4-Tiav6ilS_L&index=11"

//here is the improved version of the code-
class Solution {
public:
    bool checkwithDiff(vector<int>& n, vector<vector<int>>& q, int i) {
        vector<int> diff(n.size(), 0);          // O(n) -> diff array

        for (int j = 0; j <= i; j++) {           // O(i) -> worst case O(q)
            int l = q[j][0];
            int r = q[j][1];
            int val = q[j][2];

            diff[l] += val;
            if (r + 1 < n.size()) diff[r + 1] -= val;
        }

        for (int j = 1; j < n.size(); j++) {     // O(n) -> prefix sum
            diff[j] += diff[j - 1];
        }

        for (int j = 0; j < n.size(); j++) {     // O(n) -> final validation
            if (n[j] - diff[j] > 0) return false;
        }

        return true;
    }

    int minZeroArray(vector<int>& nums, vector<vector<int>>& queries) {
        auto lambda = [](int val) {
            return val == 0;
        };

        if (all_of(begin(nums), end(nums), lambda)) // O(n)
            return 0; // no query required bcz all are already zero

        int l = 0, r = queries.size() - 1;
        int res = -1;

        while (l <= r) {                          // O(log q)
            int mid = l + (r - l) / 2;

            if (checkwithDiff(nums, queries, mid)) { // O(n + q)
                res = mid + 1; 
                // mid+1 because we need to return the count not index,
                // mid -> index not count

                // shyd mera answer left half me ho,
                // shyd saare 0 left part me phle se ho gye ho isiliye ->
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return res;
    }
};


t.c. -> O(log(q)*(n+q))
