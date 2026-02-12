leetcode 112, Path sum

cpp code-
class Solution {
public:
    bool helper(TreeNode* &root,int& target,int& sum){
     if(root==nullptr ) return false;
     sum+=root->val;
    if(root->left==nullptr && root->right==nullptr && sum==target) return true;
    bool left=helper(root->left,target,sum);
    bool right=helper(root->right,target,sum);
     sum-=root->val;
     return left||right;
    }
    bool hasPathSum(TreeNode* root, int targetSum) {
        int sum=0;
        return helper(root,targetSum,sum);
    }
};

