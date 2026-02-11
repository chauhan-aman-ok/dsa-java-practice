problem 2 : leetcode 111. Minimum Depth of Binary Tree

class Solution {
public:
    int level(TreeNode* root){
        if(root==nullptr) return 0;
        if(root->left==nullptr) return 1+level(root->right);
        if(root->right==nullptr) return 1+level(root->left);
        return 1+min(level(root->left),level(root->right));
    }
    int minDepth(TreeNode* root) {
        if(root==nullptr) return 0;
        return level(root);
    }
};
