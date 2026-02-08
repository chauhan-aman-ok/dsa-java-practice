problem 1: https://www.geeksforgeeks.org/problems/last-index-of-a-character-in-the-string4516/1

cpp code-

class Solution {
  public:
  
    void helper(string &s,char p, int idx, int &ans){
        if(idx==s.length()) return;
        if(s[idx]==p){
            ans=idx;
        }
        helper(s,p,idx+1,ans);
    }

    int LastIndex(string s, char p) {
        // complete the function here
        int ans=-1;
        helper(s,p,0,ans);
        return ans;
    }
};

