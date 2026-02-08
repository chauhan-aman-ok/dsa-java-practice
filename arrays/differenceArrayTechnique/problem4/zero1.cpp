problem 4 : leetcode 3355. Zero Array Transformation I

topic - difference array technique

brute force - 
class Solution {
public:
    bool isZeroArray(vector<int>& n, vector<vector<int>>& q) {
        for(auto Q:q){
            int l=Q[0];
            int r=Q[1];
            for(int i=l;i<=r;i++){
                n[i]-=1;
            }
        }
        auto lambda=[](int val){
            return val<=0;
        };
        if(all_of(begin(n),end(n),lambda)) return true;
        else return false;
    }
};

time complexity of the code - O(q*n)
space complexity of the above code - O(1), no extra array is used

here is the optimized version of the code using the difference array technique
time complexity - O(q+n+n+n) -> O(q+n)
space complexity -O(n)

class Solution {
public:
    bool isZeroArray(vector<int>& n, vector<vector<int>>& q) {
        vector<int> diff(n.size(),0);
        for(auto Q:q){
            int l=Q[0];
            int r=Q[1];
            diff[l]+=1;
            if(r+1<n.size()) diff[r+1]-=1;
        }
        for(int i=1;i<n.size();i++){
            diff[i]+=diff[i-1];
        }
        for(int i=0;i<n.size();i++){
            diff[i]=n[i]-diff[i];
        }
        auto lambda=[](int val){
            return val<=0;
        };
        if(all_of(begin(diff),end(diff),lambda)) return true;
        else return false;
    }
};
