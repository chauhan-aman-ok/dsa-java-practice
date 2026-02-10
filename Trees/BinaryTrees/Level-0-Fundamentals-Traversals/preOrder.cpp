Preorder traversal in binary tree (DFS)

using recursion-
class Solution {
public:
   void helper(TreeNode* root,vector<int>& res){
    if(root==nullptr) return;
    res.push_back(root->val);
    helper(root->left,res);
    helper(root->right,res);
   }
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> res;
        helper(root,res);
        return res;
    }
};


iterative approach-

vector<int> preorderTraversal(TreeNode* root) {
        vector<int> res;
        if(root==nullptr) return res;
        stack<TreeNode*> st;
        st.push(root);
        while(!st.empty()){
         TreeNode* temp=st.top();
         st.pop();
         res.push_back(temp->val);
         if(temp->right!=nullptr) st.push(temp->right);
         if(temp->left!=nullptr) st.push(temp->left);
        }
        return res;
}

 


