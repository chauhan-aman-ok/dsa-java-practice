// leetcode 103. Binary Tree Zigzag Level Order Traversal


class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> res;
        if(root==nullptr) return res;
        
        queue<TreeNode*> q;
        q.push(root);
        int x=1;
        while(!q.empty()){
            int itr=q.size();
            vector<int> sub;
            while(itr--){ 
                TreeNode* curr=q.front();
                sub.push_back(curr->val);
                q.pop();
                if(curr->left!=nullptr) q.push(curr->left);
                if(curr->right!=nullptr) q.push(curr->right); 
            }
            if(x%2==0){
                reverse(sub.begin(),sub.end());
            }
            x++;
            res.push_back(sub);
        }
        return res;
    }
};
