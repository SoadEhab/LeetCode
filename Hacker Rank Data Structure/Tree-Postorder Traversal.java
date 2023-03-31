void postOrder(Node *root) {
        if(root==NULL)
            return;
        if(root->left!=NULL)
            postOrder(root->left);
        postOrder(root->right);
        cout<<root->data<<" ";
}