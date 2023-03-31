void inOrder(Node *root) {
        if(root==NULL)
            return;
        if(root->left!=NULL)
            inOrder(root->left);
        cout<<root->data<<" ";
        inOrder(root->right);
}