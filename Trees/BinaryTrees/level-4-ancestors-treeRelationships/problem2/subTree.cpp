leetcode 572. Subtree of Another Tree

cpp code-


class Solution {
public:
    bool matched(TreeNode* root,TreeNode* sub){
        if(root==nullptr && sub==nullptr) return true;
        if(root==nullptr || sub==nullptr) return false;
        if(root->val != sub->val) return false;
        return matched(root->left,sub->left) && matched(root->right,sub->right);
    }
    bool isSubtree(TreeNode* root, TreeNode* subRoot) {
        if(root==nullptr) return false;
        if(matched(root,subRoot)) return true;
        return isSubtree(root->left,subRoot)||isSubtree(root->right,subRoot);
    }
};


Time complexity - O(N × M)
Space complexity - O(H₁ + H₂) 


