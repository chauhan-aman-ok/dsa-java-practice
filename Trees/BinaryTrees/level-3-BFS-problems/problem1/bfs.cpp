//leetcode 102. Binary Tree Level Order Traversal

class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> res;
        if(root==nullptr) return res;
        
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            int itr=q.size();
            vector<int> sub;
            for(int i=0;i<itr;i++){ // if we directly write condition i<q.size(), the size is changing everytime in the inner code, the q.size() is relative not fixed
                TreeNode* curr=q.front();
                sub.push_back(curr->val);
                q.pop();
                if(curr->left!=nullptr) q.push(curr->left);
                if(curr->right!=nullptr) q.push(curr->right);
            }
            res.push_back(sub);
        }
        return res;
    }
};
