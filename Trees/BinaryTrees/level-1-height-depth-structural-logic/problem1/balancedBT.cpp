problem 1 : leetcode - 110. Balanced Binary Tree

class Solution {
public:
    int level(TreeNode* &root){
        if(root==nullptr) return 0;
        return 1+max(level(root->left),level(root->right));
    }
    bool isBalanced(TreeNode* root) {
        if(root==nullptr) return true;
        int left=level(root->left);
        int right=level(root->right);
        if(abs(left-right)>=2) return false;
        return isBalanced(root->left) && isBalanced(root->right);
    }
};
