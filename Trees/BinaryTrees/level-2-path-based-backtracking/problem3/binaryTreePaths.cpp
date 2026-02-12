leetcode 257, Binary Tree Paths
//using backtracking
//cpp code - 
class Solution {
public:
    void helper(TreeNode* root,string &sub,vector<string> &res){
        if(root==nullptr) return;
        sub+=to_string(root->val);
        if(root->left==nullptr && root->right==nullptr) res.push_back(sub);
        else{
            sub+="->";
            helper(root->left,sub,res);
            helper(root->right,sub,res);
            sub.resize(sub.size()-2); // to remove string - "->" from the 1->2->5->, after this line  1->2->5
        }
        sub.resize(sub.size()-to_string(root->val).size());
    }
    vector<string> binaryTreePaths(TreeNode* root) {
        string s="";
        vector<string> res;
        helper(root,s,res);
        return res;
    }
};

