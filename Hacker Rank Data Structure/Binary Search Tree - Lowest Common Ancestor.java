Node *lowestcommonAncestor(Node *root, int v1,int v2) {
        Node*curr=root;
        if(curr){
            if(curr->data>v1&&curr->data>v2)
                return lca(curr->left,v1,v2);
            else if(curr->data<v1&&curr->data<v2)
                return lca(curr->right,v1,v2);
            else
                return curr;
        }
        return NULL;
}